package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.color.ColorSpace;
import javax.swing.JPanel;

/**
 *
 * @author Erik Tirado
 * @version 0.1
 * @fecha 07/11/2016
 */
public class Usuario extends JPanel{
    GridBagConstraints conf;
    Color colorFondo;
    Dimension tam;
    
    public Usuario(int idUsuario){
        super();
        cargarDatosBasicos();
    }

    private void cargarDatosBasicos() {
//        setLayout(new GridBagLayout());
//        conf = new GridBagConstraints();
//        colorFondo = new Color(204,39,248);
        colorFondo = Color.BLACK;
        tam = new Dimension(300, 100);
        setBackground(Color.black);
        setSize(tam);
        setPreferredSize(tam);
    }
}
