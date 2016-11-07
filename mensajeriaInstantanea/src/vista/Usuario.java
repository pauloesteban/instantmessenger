package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.color.ColorSpace;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Erik Tirado
 * @version 0.1
 * @fecha 07/11/2016
 */
public class Usuario extends JPanel{
    String urlImagen, nombre, estado, urlEstado;
    int idUsuario, idEstado;
    GridBagConstraints conf;
    Color colorFondo;
    Dimension tam;
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
        
        setLayout(new GridBagLayout());
        conf = new GridBagConstraints();
        colorFondo = new Color(204,39,248);
//        colorFondo = Color.BLACK;
        tam = new Dimension(300, 100);
        setBackground(colorFondo);
        setSize(tam);
        setPreferredSize(tam);
    }

    private void cargarDatosUsuario() {
        lblFoto = new JLabel();
        lblFoto.setIcon(new ImageIcon(getClass().getResource(urlImagen)));
        conf.gridx = 0;
        conf.gridy = 0;
        conf.gridheight = 2;
        conf.weightx = 1;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.SOUTHWEST;
        conf.insets = new Insets(0,0,0,0);
        add(lblFoto,conf);
        
        lblNombre = new JLabel(nombre);
        conf.gridx = 1;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 20;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.SOUTHWEST;
        conf.insets = new Insets(0,0,0,0);
        add(lblNombre,conf);
        
        lblEstado = new JLabel(estado);
        conf.gridx = 1;
        conf.gridy = 1;
        conf.gridheight = 1;
        conf.weightx = 20;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.NORTHWEST;
        conf.insets = new Insets(0,0,0,0);
        add(lblEstado,conf);
        
        lblColorEstado = new JLabel();
        lblColorEstado.setIcon(new ImageIcon(getClass().getResource(urlEstado)));
        conf.gridx = 2;
        conf.gridy = 0;
        conf.gridheight = 2;
        conf.weightx = 1;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.NORTHEAST;
        conf.insets = new Insets(0,0,0,0);
        add(lblColorEstado,conf);
    }
}
