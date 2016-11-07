package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Erik Tirado
 * @version 0.1
 * @fecha 06/11/2016
 */
public class Principal extends JFrame{
    String estadoMy;
    int anchoT = 900, altoT = 560;
    int anchoL = anchoT - 600, altoTop = 120;
    Dimension tamVentana = new Dimension(anchoT+6,altoT+28);
    Dimension tamTop = new Dimension(anchoT,altoTop);
    Dimension tamList = new Dimension(anchoL,altoT - altoTop);
    Dimension tamChat = new Dimension(anchoT-anchoL,altoT - altoTop);
    Dimension tamPnlMyPerfil = new Dimension(anchoL,altoTop);
    Dimension tamPnlPerfilChat = new Dimension(anchoT-anchoL,altoTop);
    Dimension tamBtnPeque = new Dimension(24,24);
    Color moradoTop = new Color(204,153,255);
    Color moradoList = new Color(204,39,248);
    Color moradoChat = new Color(232,183,231);
    JPanel pnlTop, pnlList, pnlChat, pnlMyPerfil, pnlPerfilChat;
    
    String[] nombres = {"Aleja", "Bryan", "Meche", "Junio"};
    String[] estados = {"Full vacaciones", "Camellando", "Disfrutando de la vida", "Aki estudiando"};
    int[] estadoColor = {1,2,1,3};
    
    public Principal(String usuario, String estadoMy){
        super("3AR-CHAT " + usuario);
        this.estadoMy = estadoMy;
        iniciarPanels();
        iniciarConponentes();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        setBackground(Color.yellow);
//        setForeground(Color.red);
        setSize(tamVentana);
        setPreferredSize(tamVentana);
        setMinimumSize(tamVentana);
        setMaximumSize(tamVentana);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private void iniciarPanels() {
        //Layout
        GridBagLayout layoutPrincipal = new GridBagLayout();
        GridBagConstraints conf = new GridBagConstraints();
        setLayout(layoutPrincipal);

    //Configuracion paneles principales
        //Inicio del panel TOP
        conf.gridx = 0;
        conf.gridy = 0;
        conf.anchor = GridBagConstraints.NORTHWEST;
        conf.gridwidth = 2;
        pnlTop = new JPanel();
        pnlTop.setBackground(moradoTop);
        pnlTop.setSize(tamTop);
        pnlTop.setPreferredSize(tamTop);
        pnlTop.setMinimumSize(tamTop);
        pnlTop.setMaximumSize(tamTop);
        add(pnlTop,conf);
        //Inicio del panel List
        conf.gridx = 0;
        conf.gridy = 1;
        conf.anchor = GridBagConstraints.WEST;
        conf.gridwidth = 1;
        pnlList = new JPanel();
        pnlList.setBackground(moradoList);
        pnlList.setSize(tamList);
        pnlList.setPreferredSize(tamList);
        pnlList.setMinimumSize(tamList);
        pnlList.setMaximumSize(tamList);
        add(pnlList,conf);
        //inicio del panel Chat
        conf.gridx = 1;
        conf.gridy = 1;
        conf.anchor = GridBagConstraints.WEST;
        conf.gridwidth = 1;
        pnlChat = new JPanel();
        pnlChat.setBackground(moradoChat);
        pnlChat.setSize(tamChat);
        pnlChat.setPreferredSize(tamChat);
        pnlChat.setMinimumSize(tamChat);
        pnlChat.setMaximumSize(tamChat);
        add(pnlChat,conf);
        
    //Configuracion paneles secundarios
    //Paneles internos PanelTop 
        pnlTop.setLayout(new GridBagLayout());
        //Panel my Perfil
        conf.gridx = 0;
        conf.gridy = 0;
        conf.anchor = GridBagConstraints.WEST;
        conf.gridwidth = 1;
        pnlMyPerfil = new JPanel();
        pnlMyPerfil.setBackground(moradoTop);
        pnlMyPerfil.setSize(tamPnlMyPerfil);
        pnlMyPerfil.setPreferredSize(tamPnlMyPerfil);
        pnlMyPerfil.setMinimumSize(tamPnlMyPerfil);
        pnlMyPerfil.setMaximumSize(tamPnlMyPerfil);
        pnlTop.add(pnlMyPerfil,conf);
        
        //Panel perfil Chat
        conf.gridx = 1;
        conf.gridy = 0;
        conf.anchor = GridBagConstraints.EAST;
        conf.gridwidth = 1;
        pnlPerfilChat = new JPanel();
        pnlPerfilChat.setBackground(moradoTop);
        pnlPerfilChat.setSize(tamPnlPerfilChat);
        pnlPerfilChat.setPreferredSize(tamPnlPerfilChat);
        pnlPerfilChat.setMinimumSize(tamPnlPerfilChat);
        pnlPerfilChat.setMaximumSize(tamPnlPerfilChat);
        pnlTop.add(pnlPerfilChat,conf);
        
    }

    private void iniciarConponentes() {
        JButton btnConfiguracion, btnColorEstado;
        JLabel lblEstado, lblEstadoChat, lblFotoChat, lblMyFoto, lblNombreChat;
        //Iniciando layouts
        pnlMyPerfil.setLayout(new GridBagLayout());
        pnlPerfilChat.setLayout(new GridBagLayout());
        GridBagConstraints conf = new GridBagConstraints();
        
        //My foto
        lblMyFoto = new JLabel();
        lblMyFoto.setIcon(new ImageIcon(getClass().getResource("/myperfil.jpg")));
        conf.gridx = 0;
        conf.gridy = 0;
        conf.gridheight = 3;
        conf.weightx = 0.01;
        conf.anchor = GridBagConstraints.WEST;
        conf.insets = new Insets(0,10,0,10);
        pnlMyPerfil.add(lblMyFoto,conf);
        //Boton de configuracion
        btnConfiguracion = new JButton();
        btnConfiguracion.setIcon(new ImageIcon(getClass().getResource("/Configuracion.png")));
        btnConfiguracion.setBackground(moradoTop);
        btnConfiguracion.setSize(tamBtnPeque);
        btnConfiguracion.setPreferredSize(tamBtnPeque);
        btnConfiguracion.setMinimumSize(tamBtnPeque);
        btnConfiguracion.setMaximumSize(tamBtnPeque);
        conf.gridx = 1;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 0.9;
        conf.weighty = 0.5;
        conf.insets = new Insets(0,0,0,0);
        pnlMyPerfil.add(btnConfiguracion,conf);
        //Boton de Color estado
        btnColorEstado = new JButton();
        btnColorEstado.setIcon(new ImageIcon(getClass().getResource("/EstadoVerde.png")));
        btnColorEstado.setBackground(moradoTop);
        btnColorEstado.setSize(tamBtnPeque);
        btnColorEstado.setPreferredSize(tamBtnPeque);
        btnColorEstado.setMinimumSize(tamBtnPeque);
        btnColorEstado.setMaximumSize(tamBtnPeque);
        conf.gridx = 1;
        conf.gridy = 1;
        conf.gridheight = 1;
        conf.weightx = 0.9;
        conf.weighty = 0.5;
        conf.insets = new Insets(0,0,0,0);
        pnlMyPerfil.add(btnColorEstado,conf);
        
        //Texto estado
        lblEstado = new JLabel(estadoMy);
        lblEstado.setForeground(Color.black);
        conf.gridx = 1;
        conf.gridy = 2;
        conf.gridheight = 1;
        conf.weightx = 0.9;
        conf.weighty = 0.5;
        conf.insets = new Insets(0,0,0,0);
        pnlMyPerfil.add(lblEstado,conf);
        
        
    //Perfil con quien Chat
        lblFotoChat = new JLabel();
        lblFotoChat.setIcon(new ImageIcon(getClass().getResource("/renzo.png")));
        conf.gridx = 1;
        conf.gridy = 0;
        conf.gridheight = 2;
        conf.weightx = 1;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.SOUTHEAST;
        conf.insets = new Insets(0,0,10,10);
        pnlPerfilChat.add(lblFotoChat,conf);
        
        //Nombre con quien Chat
        lblNombreChat = new JLabel("Renzo");
        lblNombreChat.setForeground(Color.black);
        conf.gridx = 0;
        conf.gridy = 0;
        conf.gridheight = 1;
        conf.weightx = 10;
        conf.weighty = 12;
        conf.anchor = GridBagConstraints.SOUTHEAST;
        conf.insets = new Insets(0,0,10,0);
        pnlPerfilChat.add(lblNombreChat,conf);
        
        //Texto estado con quien Chat
        lblEstadoChat = new JLabel("Estudiando para pasar de año");
        lblEstadoChat.setForeground(Color.black);
        conf.gridx = 0;
        conf.gridy = 1;
        conf.gridheight = 1;
        conf.weightx = 10;
        conf.weighty = 1;
        conf.anchor = GridBagConstraints.SOUTHEAST;
        conf.insets = new Insets(0,0,10,0);
        pnlPerfilChat.add(lblEstadoChat,conf);
        
        iniciarListaContactos();
    }

    private void iniciarListaContactos() {
        pnlList.setLayout(new FlowLayout());
        for (int i = 0; i < 4; i++) {
            Usuario user = new Usuario(i+1,nombres[i],estados[i],estadoColor[i]);
            pnlList.add(user);
        }
        
        
//        JOptionPane.showMessageDialog(this,"Cargado");
    }
}
