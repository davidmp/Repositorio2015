/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import pe.edu.upeu.util.DBconn;

/**
 *
 * @author Intel
 */
public class PersonaDAO extends DBconn{
    
    public void reportarPersonas(){
        try {
            sql="select * from personas "; 
            conexionDB();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println("Nombre: "+rs.getString("nombre")+" id: "+rs.getInt("id"));                
            }
            
        } catch (Exception e) { System.out.println("Error al Reportar: "+e.getMessage());
        }
        finally{
        cerrarConexionDB();
        }
    }
    
    public static void main(String[] a){
    PersonaDAO per=new PersonaDAO();
    per.reportarPersonas();
    
    }
    
}
