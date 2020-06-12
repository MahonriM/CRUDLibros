package app;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
/**
 *
 * @author chumo
 */
public class Coneccion {
    public static Connection getConexion(){
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Biblioteca;integratedSecurity=true;";
        try{
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        }
        catch(Exception ex){
            System.out.println("Ha ocurrido un error");
            return null;
        }
    }
}
