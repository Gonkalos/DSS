/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Business.MediaCenter_Facade;
import Exceptions.UtilizadorJaExistenteException;
import Exceptions.AdministradorNaoAutenticadoException;
import Exceptions.PasswordsIncompativeisException;
import java.awt.Image;
import java.nio.file.FileSystems;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author goncaloalmeida
 */
public class RegistarUtilizador extends javax.swing.JFrame {

    /**
     * Creates new form RegistarUtilizador
     */
    public RegistarUtilizador() {
        initComponents();
    }
    
    
    public RegistarUtilizador(MediaCenter_Facade facade){
        initComponents();
        
        String str = FileSystems.getDefault().getPath("").toAbsolutePath().toString() + "/Imagens/logo5.jpeg";
        ImageIcon logo = new ImageIcon(str);       
        Image img1 = logo.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        
        this.facade = facade;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 47, 48));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 800));
        jPanel1.setSize(new java.awt.Dimension(1000, 800));

        jLabel2.setFont(new java.awt.Font("Gotham", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Registar Utilizador");

        jComboBox1.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jComboBox1.setForeground(java.awt.Color.lightGray);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residente", "Administrador" }));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.lightGray);
        jButton1.setText("Registar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jButton2.setForeground(java.awt.Color.lightGray);
        jButton2.setText("Reset");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jButton3.setForeground(java.awt.Color.lightGray);
        jButton3.setText("Voltar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Password");

        jLabel5.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Tipo de utilizador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(jPasswordField1))
                            .addComponent(jLabel5))))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Button Voltar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuAdministrador window = new MenuAdministrador(this.facade);
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Button Registar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String email = jTextField1.getText();
        String nome = jTextField2.getText();
        String password = new String(jPasswordField1.getPassword());
        int tipoUtilizador;
        if (jComboBox1.getSelectedItem().toString().equals("Residente")) tipoUtilizador = 2;
        else tipoUtilizador = 1;
        
        JFrame frame = new JFrame("Aviso");
        if (email.equals("") || nome.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(frame, "Insira todos os dados!");
        }
        else {
            
            try {
                String passwordLogado = JOptionPane.showInputDialog("Insira a sua password para confirmar operação!");
                if (this.facade.validaOperacao(passwordLogado)){
                    this.facade.criarUtilizador(email, password, nome, tipoUtilizador);
                    JOptionPane.showMessageDialog(frame, "Utilizador registado com sucesso!");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jPasswordField1.setText("");
                    jComboBox1.setSelectedItem("Residente");
                }
            }
            catch(PasswordsIncompativeisException e){
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
            catch(UtilizadorJaExistenteException e){
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
            catch(AdministradorNaoAutenticadoException e){
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Button Reset
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jPasswordField1.setText("");
        jComboBox1.setSelectedItem("Residente");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarUtilizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarUtilizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private MediaCenter_Facade facade;
}
