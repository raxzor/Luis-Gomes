package gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import eventos.ButtonHandlerLogin;
import eventos.ButtonHandlerRegistroPonto;
import eventos.RegistrarSaidaHandler;
import eventos.TextFieldHandler;

import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author Gilmar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JOptionPane.setRootFrame(this);
        setLocationRelativeTo(null);
        TextFieldHandler handler = new TextFieldHandler();
        jTextField1.addActionListener(handler);
        ButtonHandlerLogin buttonHandler = new ButtonHandlerLogin(this);
        jButton3.addActionListener(buttonHandler);
        ButtonHandlerRegistroPonto buttonHandlerRegistroPonto = new ButtonHandlerRegistroPonto(this);
        jButton2.addActionListener(buttonHandlerRegistroPonto);
        RegistrarSaidaHandler registrarSaidaHandler = new RegistrarSaidaHandler(this);
        btnNewButton.addActionListener(registrarSaidaHandler);
       
    }
    public String getLogin(){
        return jTextField1.getText();
    }
    
    public String getSenha(){
        return new String(jPasswordField1.getPassword());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton3.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/login.png")));
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/1397708340_radio-button_on.png")));
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisPD");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setName("Principal"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Administrador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(436, 519, 216, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(436, 347, 216, 27);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(436, 329, 48, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(436, 389, 40, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Controle de Acesso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(475, 174, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SisPD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(508, 152, 51, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Copyright © 2014 Virtua Softwares. Todos os direitos reservados.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 630, 410, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(436, 408, 216, 27);
        
        btnNewButton = new JButton("Saída");
        btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/gui/images/1397708174_exit.png")));
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(552, 462, 97, 30);
        getContentPane().add(btnNewButton);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Entrada");
        jButton2.setActionCommand("jButton3");
        getContentPane().add(jButton2);
        jButton2.setBounds(435, 462, 97, 30);
        
        JLabel lblPrefeituraDePoo = new JLabel("Prefeitura Municipal de Poço Dantas - PB");
        lblPrefeituraDePoo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblPrefeituraDePoo.setForeground(Color.WHITE);
        lblPrefeituraDePoo.setBounds(368, 80, 356, 20);
        getContentPane().add(lblPrefeituraDePoo);
        
        JLabel lblSecretariaMunicipalDe = new JLabel("Secretaria Municipal de Saúde");
        lblSecretariaMunicipalDe.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblSecretariaMunicipalDe.setForeground(Color.WHITE);
        lblSecretariaMunicipalDe.setBounds(412, 116, 266, 20);
        getContentPane().add(lblSecretariaMunicipalDe);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/1394264445_Login.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(527, 244, 48, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/lightblue.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(379, 228, 323, 353);
        jLabel4 = new javax.swing.JLabel();
        
                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/backgroundBlue.jpg"))); // NOI18N
                getContentPane().add(jLabel4);
                jLabel4.setBounds(0, 0, 1050, 691);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton btnNewButton;
}
