/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author ochoa
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        bntContactos = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        pnlContactos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUser1Disponible = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        lblMyFoto = new javax.swing.JLabel();
        btnDisponible = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jblMyEstado = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblEstadoContac = new javax.swing.JLabel();
        lblNickContac = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        pnlChat = new javax.swing.JPanel();
        pnlHistrialChat = new javax.swing.JPanel();
        txtCHAT = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        pnlIconos = new javax.swing.JPanel();
        btnEmoticones = new javax.swing.JButton();
        btnAdjuntos = new javax.swing.JButton();
        btnImagenes = new javax.swing.JButton();
        btnMusica = new javax.swing.JButton();
        btnZumbido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("3ARChat");
        setName("3ARChat"); // NOI18N

        pnlLeft.setBackground(new java.awt.Color(255, 255, 255));

        bntContactos.setBackground(new java.awt.Color(255, 255, 255));
        bntContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contacto.png"))); // NOI18N
        bntContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntContactosActionPerformed(evt);
            }
        });

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busqueda.png"))); // NOI18N

        btnTodos.setBackground(new java.awt.Color(255, 204, 255));
        btnTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/listas.png"))); // NOI18N
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        pnlContactos.setBackground(new java.awt.Color(255, 255, 255));
        pnlContactos.setForeground(new java.awt.Color(204, 0, 153));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setText("Amo a los gatos");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("Alejandra");

        lblUser1Disponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoDispobible.png"))); // NOI18N

        javax.swing.GroupLayout pnlContactosLayout = new javax.swing.GroupLayout(pnlContactos);
        pnlContactos.setLayout(pnlContactosLayout);
        pnlContactosLayout.setHorizontalGroup(
            pnlContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(pnlContactosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUser1Disponible)))
                .addGap(85, 85, 85))
        );
        pnlContactosLayout.setVerticalGroup(
            pnlContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUser1Disponible)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLeftLayout.createSequentialGroup()
                                .addComponent(bntContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addComponent(pnlContactos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTop.setBackground(new java.awt.Color(204, 153, 255));
        pnlTop.setName(""); // NOI18N

        lblMyFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotomyperfil.jpg"))); // NOI18N

        btnDisponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LED ESTADO VERDE.png"))); // NOI18N
        btnDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibleActionPerformed(evt);
            }
        });

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Configuracion.png"))); // NOI18N

        jblMyEstado.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jblMyEstado.setText("Escuchando musica");

        jTextField1.setBackground(new java.awt.Color(204, 153, 255));
        jTextField1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jTextField1.setText("Mi Perfil");
        jTextField1.setBorder(null);

        lblEstadoContac.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblEstadoContac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotoContacto (2).png"))); // NOI18N

        lblNickContac.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblNickContac.setText("Renzo");
        lblNickContac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField2.setBackground(new java.awt.Color(204, 153, 255));
        jTextField2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jTextField2.setText("Estudiando");
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblMyFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblMyEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNickContac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoContac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnConfiguracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisponible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblMyEstado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMyFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoContac, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addComponent(lblNickContac, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlChat.setBackground(new java.awt.Color(255, 255, 255));

        pnlHistrialChat.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlHistrialChatLayout = new javax.swing.GroupLayout(pnlHistrialChat);
        pnlHistrialChat.setLayout(pnlHistrialChatLayout);
        pnlHistrialChatLayout.setHorizontalGroup(
            pnlHistrialChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHistrialChatLayout.setVerticalGroup(
            pnlHistrialChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        txtCHAT.setText("QUE VAS HACER");
        txtCHAT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 2, true));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enviar.png"))); // NOI18N

        pnlIconos.setBackground(new java.awt.Color(255, 255, 255));
        pnlIconos.setForeground(new java.awt.Color(153, 0, 153));

        btnEmoticones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoticones.png"))); // NOI18N
        btnEmoticones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmoticonesActionPerformed(evt);
            }
        });

        btnAdjuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adjuntar.png"))); // NOI18N

        btnImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes.png"))); // NOI18N

        btnMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musica.png"))); // NOI18N

        btnZumbido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zumbido.png"))); // NOI18N

        javax.swing.GroupLayout pnlIconosLayout = new javax.swing.GroupLayout(pnlIconos);
        pnlIconos.setLayout(pnlIconosLayout);
        pnlIconosLayout.setHorizontalGroup(
            pnlIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconosLayout.createSequentialGroup()
                .addComponent(btnEmoticones, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnAdjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnZumbido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        pnlIconosLayout.setVerticalGroup(
            pnlIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIconosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnZumbido, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlIconosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdjuntos)
                        .addComponent(btnImagenes)
                        .addComponent(btnMusica)
                        .addComponent(btnEmoticones)))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlChatLayout = new javax.swing.GroupLayout(pnlChat);
        pnlChat.setLayout(pnlChatLayout);
        pnlChatLayout.setHorizontalGroup(
            pnlChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHistrialChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlChatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCHAT, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlChatLayout.createSequentialGroup()
                .addComponent(pnlIconos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlChatLayout.setVerticalGroup(
            pnlChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChatLayout.createSequentialGroup()
                .addGroup(pnlChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlChatLayout.createSequentialGroup()
                        .addComponent(pnlHistrialChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCHAT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(btnEnviar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlIconos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pnlChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnlChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisponibleActionPerformed

    private void bntContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntContactosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntContactosActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnEmoticonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmoticonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmoticonesActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntContactos;
    private javax.swing.JButton btnAdjuntos;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnDisponible;
    private javax.swing.JButton btnEmoticones;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnImagenes;
    private javax.swing.JButton btnMusica;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnZumbido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jblMyEstado;
    private javax.swing.JLabel lblEstadoContac;
    private javax.swing.JLabel lblMyFoto;
    private javax.swing.JLabel lblNickContac;
    private javax.swing.JLabel lblUser1Disponible;
    private javax.swing.JPanel pnlChat;
    private javax.swing.JPanel pnlContactos;
    private javax.swing.JPanel pnlHistrialChat;
    private javax.swing.JPanel pnlIconos;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtCHAT;
    // End of variables declaration//GEN-END:variables
}
