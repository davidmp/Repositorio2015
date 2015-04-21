/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.ArrayList;
import pe.edu.upeu.to.Personas;
import pe.edu.upeu.util.DBconn;

/**
 *
 * @author Intel
 */
public class PersonaDAO extends DBconn{
    
    public void reportarPersonas(){
        try {
            sql="select * from personas; ";//escribiendo la consulta 
            conexionDB();//conexion a base de datos
            ps=con.prepareStatement(sql);//preparando la consulta
            rs=ps.executeQuery();//Ejecutando la consulta y almacena los resultados en rs
            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("nombre")+"\t id: "+rs.getInt("id")+"\tCelular: "+rs.getString("celular"));                
            }
            
        } catch (Exception e) { System.out.println("Error al Reportar: "+e.getMessage());
        }
        
        finally{
        cerrarConexionDB();
        }
    }
    
    public ArrayList reportarPersonasDos(){
        
        ArrayList<Personas> data=new ArrayList<>();
        Personas persona;
        try {
            sql="select * from personas; ";//escribiendo la consulta 
            conexionDB();//conexion a base de datos
            ps=con.prepareStatement(sql);//preparando la consulta
            rs=ps.executeQuery();//Ejecutando la consulta y almacena los resultados en rs
            while (rs.next()) {
                persona=new Personas();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setCelular(rs.getString("celular"));
                data.add(persona);                
               // System.out.println("Nombre: "+rs.getString("nombre")+"\t id: "+rs.getInt("id")+"\tCelular: "+rs.getString("celular"));                
            }
            
        } catch (Exception e) { System.out.println("Error al Reportar: "+e.getMessage());
        }
        
        finally{
        cerrarConexionDB();
        }
       return null;
    }    
    
    
    
    public static void main(String[] a){
    PersonaDAO per=new PersonaDAO();
    per.reportarPersonas();
    
    }
    
}
