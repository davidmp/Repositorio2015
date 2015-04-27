
package pe.edu.upeu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mariadb.jdbc.Driver;
//import java.sql.*;

public class DBconn {
    public PreparedStatement ps;//Es para colocar o preparar la consulta SQL
    public ResultSet rs;//Recibir los resultados de la consulta ejecutada
    
    
    public Connection con=null;
    public String sql;
    
    public DBconn(){    
    }
    
    public void conexionDB() throws SQLException{
        DriverManager.registerDriver(new Driver());
        try {
            if(con==null){
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
                System.out.println("Conexion exitosa!");
            }
        } catch (SQLException e) { System.out.println("Error en conexion:"+e.getMessage());}
        catch(Exception ex){System.out.println("Error en conexion:"+ex.getMessage());}
    }
    
    public void cerrarConexionDB(){
        try {
            if(rs!=null){rs.close();}
            if(ps!=null){ps.close();}
            if(con!=null){con.close();}   
            System.out.println("Cerrando conexion!!!");
        } catch (Exception e) { System.out.println("Error al cerrar conexion:"+e.getMessage());
        }
    
    }
    
}
