package control;

import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import vista.Usuario;
import vista.VistaLogin;
import vista.VistaPrincipal;
import vista.crear_usuario;

/**
 *
 * @author Erik Tirado
 */
public class ControlPrincipal implements ActionListener, KeyListener{
    Conexion conec;
    VistaPrincipal vista;
    modelo.Usuario usser;
    
    public ControlPrincipal(Conexion conec, VistaPrincipal vista){
        this.conec = conec;
        this.vista = vista;
        usser = new modelo.Usuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Login":
                VistaLogin ventanaLogin = new VistaLogin(vista);
                ControlLogin controlVentanaLogin = new ControlLogin(ventanaLogin, conec, usser);
                ventanaLogin.setControl(controlVentanaLogin);
                ventanaLogin.setVisible(true);
                if(usser.isLog()){
                    vista.setVisible(false);
                    vista.logear();
                    vista.setVisible(true);
                }
                break;
            case "UnLogin":
                break;
            case "CrearNuevo":
                crear_usuario ventanaNuevoUsuario = new crear_usuario(conec);
                ventanaNuevoUsuario.setVisible(true);
                break;
            case "Salir":
                vista.dispose();
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
