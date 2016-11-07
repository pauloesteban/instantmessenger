/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package control;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.*;
/**
 *
 * @author ochoa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Conexion conec = new Conexion();
            conec.conectar();
            login ventanaLogin = new login(conec);
            ventanaLogin.setLocationRelativeTo(null);
            ventanaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventanaLogin.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inicio "+e.getMessage());
        }
        
//        Conexion conec = new Conexion();
//        conec.conectar();
//        Principal ventanaPrincipal = new Principal("Harry","Programando",conec);
        
    }
    

}