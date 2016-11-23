package conexion;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Erik Tirado
 */
public class Conexion {
    Connection conBD = null;
    CallableStatement proced = null;
    Statement st = null;
    public Conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro Exitoso");
            crearConexion();
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
            System.out.println("Registro Driver Fallido");
        }
    }
    private void crearConexion(){
        try {
            conBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajeria.database?" + "user=root&password=telematica");
            st = conBD.createStatement();
            System.out.println("Conexion a la Base de Datos Completa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos: "+ e.getMessage());
        }
    }
    
    public ResultSet obtenerTabla(String codigo){
        ResultSet tabla = null;
        try {
            tabla = st.executeQuery(codigo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al obtener datos:  "+ e.getMessage());
            System.out.println(codigo);
        }
        return tabla;
    }
    public boolean ejecutarProcedimineto(String codigo){
        try {
            proced = conBD.prepareCall(codigo);
            proced.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ejecutar procedimiento: "+e.getMessage());
            System.out.println(codigo);
            return false;
        }
    }
    public ResultSet ejecutarProcediminetoTabla(String codigo){
        ResultSet tabla = null;
        try {
            proced = conBD.prepareCall(codigo);
            proced.execute();
            tabla = proced.getResultSet();
            return tabla;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ejecutar procedimiento: "+e.getMessage());
            System.out.println(codigo);
            return null;
        }
    }
    public Object ejecutarFuncion(String codigo, Object[] parametros){
        try {
            Object salida;
            proced = conBD.prepareCall(codigo);
            if(parametros != null){
                for(int i = 0; i < parametros.length; i++) {
                    Object parametro = parametros[i];
                    if(i==0){
                        proced.registerOutParameter(1, obtenerTipo(parametro));
                    }else{
                        proced.setObject(i + 1, parametro, obtenerTipo(parametro));
                    }
                }
            }
            proced.execute();
            salida = proced.getObject(1);
//            JOptionPane.showMessageDialog(null, "Funcion ejecutada correctamente: ");
            return salida;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Ejecutar Funcion: ");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    private static int obtenerTipo(Object parametro){
        int sqlType = Types.VARCHAR;
        Class parametroClase = parametro.getClass();
        if(parametro == null){
            sqlType = Types.NULL;
        }else{
            if(parametro instanceof String){
                sqlType = Types.VARCHAR;
            }else if(parametroClase.equals(double.class) || parametro instanceof Double){
                sqlType = Types.DOUBLE;
            }else if(parametro instanceof BigDecimal) {
                sqlType = Types.NUMERIC;
            }else if(parametro instanceof Calendar || parametro instanceof java.sql.Date) {
                sqlType = Types.DATE;
            }else if(parametro instanceof java.sql.Time){
                sqlType = Types.TIME;
            }else if(parametroClase.equals(int.class) || parametro instanceof Integer) {
                sqlType = Types.INTEGER;
            }else if(parametroClase.equals(long.class) || parametro instanceof Long) {
                sqlType = Types.BIGINT;
            }else if(parametroClase.equals("BIT")){
                sqlType = Types.BIT;
            }else if(parametroClase.equals(float.class) || parametro instanceof Float) {
                sqlType = Types.REAL;
            }
        }
        return sqlType;
    }
    
}
