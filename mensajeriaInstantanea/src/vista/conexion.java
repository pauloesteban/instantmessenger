import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {

Connection co;
Statement stm;
public conexion()
{
 try {

   Class.forName ("com.mysql.jdbc.Driver");
   Connection co = DriverManager.getConnection("jdbc:mysql://localhost/hola?user=root&password=");//el nombre de la base de datos es llamada hola-el usuario es root-y la contraseña
   Statement stm = co.createStatement();
     }

   catch(ClassNotFoundException exc) 
      {
        exc.printStackTrace();
      }

   catch (SQLException ex)
    {
       Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,ex);

    }

      }

}