/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.util.ArrayList;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

/**
 *
 * @author Henry
 */
public class Listar {
    private String sigla;
    private String materia;
    private String nota;

    public Listar(String sigla, String materia, String nota) {
        this.sigla = sigla;
        this.materia = materia;
        this.nota = nota;
    }

    public Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ObservableList<Listar> getServicios(int ci){
        ObservableList<Listar> obs = FXCollections.observableArrayList();
      try{
           List<String> resultados = new ArrayList<String>();
            resultados=operation(ci);
       
            // recorro los resultados
            while (resultados.isEmpty()) {

                // Cojo los datos
                String sigla = resultados.get(0);
                String materia = resultados.get(1);
                String nota = resultados.get(2);
                
               
                // Creo el servicio
             Listar l = new Listar(sigla,materia,nota);

                obs.add(l);

            }

            // Cierro la conexion
            
       }
      catch(Exception e){
           System.out.println("ERROR");
      }
      return obs;
    }

    private static java.util.List<java.lang.String> operation(int ci) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.operation(ci);
    }
}
