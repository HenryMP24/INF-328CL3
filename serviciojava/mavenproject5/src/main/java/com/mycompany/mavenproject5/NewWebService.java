/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henry
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "operation")
    public List<String> operation(@WebParam(name = "ci") int ci) {

        Connection conexion=null;
        String pass="123456";
        String user="postgres";
        List<String> datos = new ArrayList<String>();

      try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registro",user,pass);
          java.sql.Statement st=conexion.createStatement();
          String sql="select C.ID_MATERIA,M.Nombre,N.Calificacion\n" +
                    "from nota N,clase C,materia M,alumno Al\n" +
                    "where Al.CI="+ci+"\n" +
                    "and Al.ID_ALUMNO=N.ID_ALUMNO\n" +
                    "and C.ID_CLASE=N.ID_CLASE\n" +
                    "and C.ID_MATERIA=M.ID_MATERIA";
          ResultSet res=st.executeQuery(sql);
          while(res.next()){
                datos.add(res.getString("ID_MATERIA"));
                datos.add(res.getString("Nombre"));
                datos.add(res.getString("Calificacion"));
           }
          res.close();
          st.close();
          conexion.close();
           
       }
      catch(Exception e){
         System.err.println( e.getMessage() );
      }
      return datos;
   }
     @WebMethod(operationName = "devuelve")
    public List<String> devuelve(@WebParam(name = "ci") int ci) {
        Connection conexion=null;
        String pass="123456";
        String user="postgres";
        List<String> datos = new ArrayList<String>();

      try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registro",user,pass);
          java.sql.Statement st=conexion.createStatement();
          String sql="select ID_ALUMNO,Nombre,ApellidoP,ApellidoM\n" +
                     "from alumno\n" +
                    "where CI="+ci;
          ResultSet res=st.executeQuery(sql);
          while(res.next()){
                datos.add(res.getString("ID_ALUMNO"));
                datos.add(res.getString("Nombre"));
                datos.add(res.getString("ApellidoP"));
                datos.add(res.getString("ApellidoM"));
           }
          res.close();
          st.close();
          conexion.close();
           
       }
      catch(Exception e){
         System.err.println( e.getMessage() );
      }
      return datos;
    }
    
      /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiaremos")
    public List<String> cambiaremos(@WebParam(name = "idalumno") String idalumno, @WebParam(name = "ci") int ci) {
        Connection conexion=null;
        String pass="123456";
        String user="postgres";
        List<String> datos = new ArrayList<String>();

      try{
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registro",user,pass);
          java.sql.Statement st=conexion.createStatement();
          String sql="UPDATE alumno\n" +
                        "SET ci="+ci+"\n" +
                        "WHERE id_alumno='"+idalumno+"'";
          ResultSet res=st.executeQuery(sql);
          while(res.next()){
                datos.add(res.getString("ID_ALUMNO"));
                datos.add(res.getString("Nombre"));
                datos.add(res.getString("ApellidoP"));
                datos.add(res.getString("ApellidoM"));
           }
          res.close();
          st.close();
          conexion.close();
           
       }
      catch(Exception e){
         System.err.println( e.getMessage() );
      }
      return datos;
    }
}
