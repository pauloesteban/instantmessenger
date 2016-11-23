package vista;

import control.ControlLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Erik Tirado
 */
public class VistaLogin extends JDialog{
    JPanel pnlUsuario, pnlPassword, pnlBotones;
    JLabel lblUsuario, lblPassword;
    JTextField txtUsuario;
    JPasswordField txtPassword;
    JButton btnAceptar, btnCancelar;
    
    public VistaLogin(JFrame dependiente){
        super(dependiente, "Login", true);
        iniciarComponentes();
	nombresEventos();
        GridBagConstraints conf = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        
        conf.gridx = 0;
        conf.gridy = 0;
        conf.insets = new Insets(10, 10, 0, 10);
        this.add(pnlUsuario, conf);
        conf.gridx = 0;
        conf.gridy = 1;
        conf.insets = new Insets(0, 10, 0, 10);
        this.add(pnlPassword, conf);
        conf.gridx = 0;
        conf.gridy = 2;
        conf.insets = new Insets(0, 10, 10, 10);
        this.add(pnlBotones, conf);
        this.getContentPane().setBackground(Color.BLACK);
        this.setUndecorated(true);
	this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void iniciarComponentes(){
        Dimension tamPanel = new Dimension(400, 50);
        Dimension tamTexto = new Dimension(200, 20);
        Dimension tamBoton = new Dimension(200, 82);
        Color colFondo2 = Color.RED;
        pnlUsuario = new JPanel();
        pnlUsuario.setBackground(colFondo2);
        pnlUsuario.setPreferredSize(tamPanel);
        pnlUsuario.setMinimumSize(tamPanel);
        pnlUsuario.setSize(tamPanel);
	pnlUsuario.setLayout(new BoxLayout(pnlUsuario, BoxLayout.X_AXIS));
        pnlPassword = new JPanel();
        pnlPassword.setBackground(colFondo2);
        pnlPassword.setPreferredSize(tamPanel);
        pnlPassword.setMinimumSize(tamPanel);
        pnlPassword.setSize(tamPanel);
	pnlPassword.setLayout(new BoxLayout(pnlPassword, BoxLayout.X_AXIS));
        pnlBotones = new JPanel();
        pnlBotones.setBackground(colFondo2);
        pnlBotones.setPreferredSize(tamPanel);
        pnlBotones.setMinimumSize(tamPanel);
        pnlBotones.setSize(tamPanel);
	pnlBotones.setLayout(new BoxLayout(pnlBotones, BoxLayout.X_AXIS));
        lblUsuario =  new JLabel("Usuario: ", SwingConstants.RIGHT);
        lblUsuario.setPreferredSize(tamTexto);
        lblUsuario.setMinimumSize(tamTexto);
        lblUsuario.setMaximumSize(tamTexto);
        lblUsuario.setSize(tamTexto);
        lblPassword =  new JLabel("Contraseña: ", SwingConstants.RIGHT);
        lblPassword.setPreferredSize(tamTexto);
        lblPassword.setMinimumSize(tamTexto);
        lblPassword.setMaximumSize(tamTexto);
        lblPassword.setSize(tamTexto);
        txtUsuario = new JTextField();
        txtUsuario.setPreferredSize(tamTexto);
        txtUsuario.setMinimumSize(tamTexto);
        txtUsuario.setMaximumSize(tamTexto);
        txtUsuario.setSize(tamTexto);
        txtPassword = new JPasswordField();
        txtPassword.setPreferredSize(tamTexto);
        txtPassword.setMinimumSize(tamTexto);
        txtPassword.setMaximumSize(tamTexto);
        txtPassword.setSize(tamTexto);
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        pnlUsuario.add(lblUsuario);
        pnlUsuario.add(txtUsuario);
        pnlPassword.add(lblPassword);
        pnlPassword.add(txtPassword);
        pnlBotones.add(Box.createHorizontalGlue());
        pnlBotones.add(btnAceptar);
        pnlBotones.add(btnCancelar);
    }
    
    private void nombresEventos(){
        btnAceptar.setActionCommand("Aceptar");
        btnCancelar.setActionCommand("Cancelar");
    }
    public void setControl(ControlLogin control){
        btnAceptar.addActionListener(control);
        btnCancelar.addActionListener(control);
    }
    
    public void setFocoPassword(){
        txtPassword.requestFocus();
    }
    
    public String getUsuario(){
        if(!txtUsuario.getText().isEmpty()){
            return txtUsuario.getText();
        }else{
            return null;
        }
    }
    public String getPassword(){
        if(!(txtPassword.getPassword().length == 0)){
            return new String(txtPassword.getPassword());
        }else{
            return null;
        }
    }
}
