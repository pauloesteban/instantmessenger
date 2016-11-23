package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erik Tirado
 * @version 0.1
 * @fecha 07/11/2016
 */
public class Usuario extends JButton{
    String urlImagen, nombre, estado, urlEstado;
    int idUsuario, idEstado;
    GridBagConstraints conf;
    Color colorFondo;
    Dimension tamButton, tamPanel, tamPanelEstado;
    JPanel pnlPrincipal, pnlEstado;
    JLabel lblFoto, lblNombre, lblEstado, lblColorEstado;
    
    
    public Usuario(int idUsuario, String nombre, String estado, int idEstado){
        super();
        this.idUsuario = idUsuario;
        this.idEstado = idEstado;
        urlImagen = "/" + idUsuario + ".jpg";
        urlEstado = "/e" + idEstado + ".png";
        this.nombre = nombre;
        this.estado = estado;
        cargarDatosBasicos(idUsuario, nombre, estado, idEstado);
        cargarDatosUsuario();
    }

    private void cargarDatosBasicos(int idUsuario, String nombre, String estado, int idEstado) {
        pnlPrincipal = new JPanel();
        pnlEstado = new JPanel();
        pnlEstado.setLayout(new GridLayout(2,1));
        setLayout(new GridBagLayout());
        conf = new GridBagConstraints();
        colorFondo = new Color(204,39,248);
//        colorFondo = Color.BLACK;
        tamButton = new Dimension(275, 100);
        tamPanel = new Dimension(273, 90);
        tamPanelEstado = new Dimension(147,30);
        
        pnlPrincipal.setOpaque(false);
        pnlPrincipal.setSize(tamPanel);
        pnlPrincipal.setPreferredSize(tamPanel);
        pnlPrincipal.setMinimumSize(tamPanel);
        pnlPrincipal.setMaximumSize(tamPanel);
        pnlPrincipal.setLayout(new GridBagLayout());
        
        pnlEstado.setOpaque(false);
        pnlEstado.setSize(tamPanelEstado);
        pnlEstado.setPreferredSize(tamPanelEstado);
        pnlEstado.setMinimumSize(tamPanelEstado);
        pnlEstado.setMaximumSize(tamPanelEstado);
        
        
        setBackground(colorFondo);
        setSize(tamButton);
        setPreferredSize(tamButton);
    }

    private void cargarDatosUsuario() {
        lblFoto = new JLabel();
        lblFoto.setIcon(new ImageIcon(getClass().getResource(urlImagen)));
        conf.gridx = 0;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 0;
        conf.weighty = 0;
        conf.anchor = GridBagConstraints.WEST;
        conf.insets = new Insets(0,0,0,0);
        pnlPrincipal.add(lblFoto,conf);
        
        lblNombre = new JLabel(nombre);
        pnlEstado.add(lblNombre);
        
        lblEstado = new JLabel(estado);
        pnlEstado.add(lblEstado);
        
        conf.gridx = 1;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 0;
        conf.weighty = 0;
        conf.anchor = GridBagConstraints.WEST;
        conf.insets = new Insets(0,5,0,0);
        pnlPrincipal.add(pnlEstado,conf);
        
        lblColorEstado = new JLabel();
        lblColorEstado.setIcon(new ImageIcon(getClass().getResource(urlEstado)));
        conf.gridx = 2;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 0;
        conf.weighty = 0;
        conf.anchor = GridBagConstraints.NORTHEAST;
        conf.insets = new Insets(10,0,0,0);
        pnlPrincipal.add(lblColorEstado,conf);
        add(pnlPrincipal);
    }
}
