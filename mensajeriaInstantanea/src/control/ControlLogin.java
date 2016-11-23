package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import vista.VistaLogin;
import conexion.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Erik Tirado
 * @version 1.0
 * @fecha 15/11/2016
 */
public class ControlLogin implements ActionListener{
    VistaLogin vista;
    Conexion conec;
    ResultSet result;
    Usuario usser;
    
    public ControlLogin(VistaLogin vista, Conexion conec, Usuario usser){
        this.vista = vista;
        this.conec = conec;
        this.usser = usser;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cancelar":
                vista.dispose();
                break;
            case "Aceptar":
                eventoAceptar();
                break;
        }
    }

    private void eventoAceptar() {
        Object[] parametros;
        ResultSet datosLogin = null;
        parametros = new Object[3];
        parametros[0] = "BIT";
        parametros[1] = vista.getUsuario();
        parametros[2] = vista.getPassword();
        
        Object retorno = conec.ejecutarFuncion("{? = call verificar_login(?,?)}", parametros);
        
//        JOptionPane.showMessageDialog(vista, "Validacion: "+retorno);
        if(retorno.equals("1")){
            try {
                datosLogin = conec.ejecutarProcediminetoTabla("{call obtenerDatosLogin(\""+vista.getUsuario()+"\")}");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(vista, "Error al ontener datos de login");
            }
            
            if(datosLogin != null){
                try {
                    datosLogin.next();
                    usser.setNombre(datosLogin.getString(2));
                    usser.logear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vista, "Error al Logear: "+e.getMessage());
                }
                
                vista.dispose();
            }
            
        }
    }
}
