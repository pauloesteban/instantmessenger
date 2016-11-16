package control;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik Tirado
 * @version 0.1
 * @fecha 7/11/2016
 */
public class Conexion{
    Connection con;

    
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al cargar la conexion " + e.toString());
        }
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajeria.database?user=root&password=telematica");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error de conexion con la base de datos "+ e.getMessage());
        }
    }
    
    public ArrayList<String> login() throws SQLException {
//      Tarea tarea = null;
      ArrayList<String> datos = new ArrayList<>();
      try{
            PreparedStatement consulta = con.prepareStatement("SELECT nick,contraseña FROM tb_usuarios;" );
//            consulta.setInt(1, id_tarea);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                datos.add(resultado.getString("nick"));
                datos.add(resultado.getString("contraseña"));
            }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return datos;
   }
    
    public void insertar(String nombre,String correo,String contraseña) throws SQLException
    {
    PreparedStatement ingreso = con.prepareStatement("INSERT INTO tb_usuarios(nick,correo,contraseña,idActivo)"+" values(?,?,?,?)");
    
    ingreso.setString(1, nombre);
    ingreso.setString(2, correo);
    ingreso.setString(3, contraseña);
    ingreso.setString(4,"1" );
    ingreso.executeUpdate();
        try {
            con.commit();
        } catch (SQLException e) {
            System.out.println("Autocomit: "+e.getMessage());
        }
    
    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
    
    }
     

    

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
    
    
}
