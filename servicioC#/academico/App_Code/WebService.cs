using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data;
using Npgsql;

/// <summary>
/// Descripción breve de WebService
/// </summary>
[WebService(Namespace = "http://tempuri.org/")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
// [System.Web.Script.Services.ScriptService]
public class WebService : System.Web.Services.WebService
{

    public WebService()
    {

    }

  
    [WebMethod]
    public DataSet listar()
    {
        NpgsqlConnection con = new NpgsqlConnection();
        con.ConnectionString = "server=localhost;User Id=postgres;Password=123456;database=registro";
        NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
        ada.SelectCommand = new NpgsqlCommand();
        ada.SelectCommand.Connection = con;
        ada.SelectCommand.CommandText = "Select * from materia";
        ada.SelectCommand.CommandType = CommandType.Text; 
             
        DataSet ds = new DataSet();
        ada.Fill(ds);
        return ds;
    }

    [WebMethod]
    public DataSet agregar(String sigla,string nombre)
    {
        NpgsqlConnection con = new NpgsqlConnection();
        con.ConnectionString = "server=localhost;User Id=postgres;Password=123456;database=registro";
        NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
        ada.SelectCommand = new NpgsqlCommand();
        ada.SelectCommand.Connection = con;
        ada.SelectCommand.CommandText = "INSERT INTO materia(ID_MATERIA,Nombre) VALUES ('"+sigla+"','"+nombre+"')";
        ada.SelectCommand.CommandType = CommandType.Text;

        DataSet ds = new DataSet();
        ada.Fill(ds);
        return ds;
    }
    [WebMethod]
    public DataSet Alumnoci(int ci)
    {
        NpgsqlConnection con = new NpgsqlConnection();
        con.ConnectionString = "server=localhost;User Id=postgres;Password=123456;database=registro";
        NpgsqlDataAdapter ada = new NpgsqlDataAdapter();
        ada.SelectCommand = new NpgsqlCommand();
        ada.SelectCommand.Connection = con;
        ada.SelectCommand.CommandText = "select C.ID_MATERIA,M.Nombre,N.Calificacion from nota N,clase C, materia M,alumno Al where'"+ci+"' = Al.CI and Al.ID_ALUMNO = N.ID_ALUMNO and C.ID_CLASE = N.ID_CLASE and C.ID_MATERIA = M.ID_MATERIA";
        ada.SelectCommand.CommandType = CommandType.Text;

        DataSet ds = new DataSet();
        ada.Fill(ds);
        return ds;
    }

}
