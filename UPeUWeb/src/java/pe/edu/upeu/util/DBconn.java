
package pe.edu.upeu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconn {
    public PreparedStatement ps;
    public ResultSet rs;
    public Connection con=null;
    public String sql;
    
    public DBconn(){    
    }
    
    public void conexionDB() throws SQLException{
        try {
            if(con==null){
            con= DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "123456");
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
