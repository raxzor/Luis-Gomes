/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import eventos.ButtonHandlerNovoUsuario;
import eventos.ProcurarUsuarioFrequenciaHandler;
import eventos.ProcurarUsuarioHandler;
import eventos.TelaGerarRelatoriosHandler;
import negocio.UsuarioLogado;

/**
 *
 * @author Gilmar
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
        ButtonHandlerNovoUsuario buttonHandlerNovoUsuario = new ButtonHandlerNovoUsuario(this);
        jButton7.addActionListener(buttonHandlerNovoUsuario);
        ProcurarUsuarioHandler procurarUsuarioHandler = new ProcurarUsuarioHandler(this);
        jButton2.addActionListener(procurarUsuarioHandler);
        jButton4.addActionListener(procurarUsuarioHandler);
        jButton5.addActionListener(procurarUsuarioHandler);
        jLabel5.setText("Bem vindo, " + UsuarioLogado.getInstancia().getUsuarioLogado().getNome().toUpperCase());
        ProcurarUsuarioFrequenciaHandler procurarUsuarioFrequenciaHandler = new ProcurarUsuarioFrequenciaHandler(this);
        jButton3.addActionListener(procurarUsuarioFrequenciaHandler);
        TelaGerarRelatoriosHandler gerarRelatoriosHandler = new TelaGerarRelatoriosHandler(this);
        jButton6.addActionListener(gerarRelatoriosHandler);
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setName("Administrador"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright © 2014 Virtua Softwares. Todos os direitos reservados.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 630, 420, 15);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PrucrarUsuaio.png"))); // NOI18N
        jButton2.setText("Procurar Usuário");
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 380, 170, 80);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1394248144_product-sales-report.png"))); // NOI18N
        jButton3.setText("Emitir Frequência");
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 270, 170, 80);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RemoverUsuario.png"))); // NOI18N
        jButton4.setText("Remover Usuário");
        getContentPane().add(jButton4);
        jButton4.setBounds(640, 270, 170, 80);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editarUsuario.png"))); // NOI18N
        jButton5.setText("Editar Usuário");
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 380, 170, 80);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditarFrequencia.png"))); // NOI18N
        jButton6.setText("Relatório Geral");
        getContentPane().add(jButton6);
        jButton6.setBounds(640, 380, 170, 80);

        jLabel7.setAutoscrolls(true);
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 0, 750);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1394247732_Add-Male-User.png"))); // NOI18N
        jButton7.setText("Novo Usuário");
        getContentPane().add(jButton7);
        jButton7.setBounds(220, 270, 170, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tarjaGovernoAzul.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1020, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Painel do Administrador");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 100, 230, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Bem vindo Viviano");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(650, 160, 160, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundBlueClaro3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 140, 800, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundBlue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -10, 1060, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
