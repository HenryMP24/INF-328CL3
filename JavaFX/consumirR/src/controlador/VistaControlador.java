/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Listar;

/**
 * FXML Controller class
 *
 * @author Henry
 */
public class VistaControlador implements Initializable {

    @FXML
    private Button btnbuscar;
    @FXML
    private TextField txtci;
    
     private ObservableList<String> based;
    @FXML
    private TextField txtresultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click(ActionEvent event) {
        int ci=Integer.parseInt(txtci.getText());
        List<String> resultados = new ArrayList<String>();
        resultados=operation(ci);
      
      
      txtresultado.setText(resultados+"");
         
           
    }

    private static java.util.List<java.lang.String> operation(int ci) {
        ws.NewWebService_Service service = new ws.NewWebService_Service();
        ws.NewWebService port = service.getNewWebServicePort();
        return port.operation(ci);
    }
    
}
