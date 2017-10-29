/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas_iniciais;

import classes.Usuario;
import janela_gerenciar_contas.JanelaPrincipal;
import janela_gerenciar_usuarios.JanelaPrincipalUsuarios;
import janela_gerenciar_clientes.JanelaPrincipalClientes;
import janela_pesquisar.JanelaPesquisarPrincipal;

/**
 *
 * @author bruno
 */
public class MenuPrincipal extends javax.swing.JFrame {
private Usuario usuario;
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }
    
    public MenuPrincipal(Usuario user) {
        initComponents();
        this.usuario = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEstatisticas = new javax.swing.JButton();
        btnGerenciarContas = new javax.swing.JButton();
        btnGerenciarClientes = new javax.swing.JButton();
        btnAprovacoes = new javax.swing.JButton();
        btnGerenciarUsuarios = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnEstatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/presentation.png"))); // NOI18N
        btnEstatisticas.setText("Estatisticas");
        btnEstatisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstatisticas.setIconTextGap(10);
        getContentPane().add(btnEstatisticas);
        btnEstatisticas.setBounds(49, 110, 205, 60);

        btnGerenciarContas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/check.png"))); // NOI18N
        btnGerenciarContas.setText("Gerenciar Contas");
        btnGerenciarContas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerenciarContas.setIconTextGap(10);
        btnGerenciarContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarContasActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerenciarContas);
        btnGerenciarContas.setBounds(50, 270, 205, 60);

        btnGerenciarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/deal.png"))); // NOI18N
        btnGerenciarClientes.setText("Gerenciar Clientes");
        btnGerenciarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerenciarClientes.setIconTextGap(10);
        btnGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerenciarClientes);
        btnGerenciarClientes.setBounds(330, 270, 205, 60);

        btnAprovacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/list.png"))); // NOI18N
        btnAprovacoes.setText("Aprovações");
        btnAprovacoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAprovacoes.setIconTextGap(10);
        getContentPane().add(btnAprovacoes);
        btnAprovacoes.setBounds(328, 110, 205, 60);

        btnGerenciarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user.png"))); // NOI18N
        btnGerenciarUsuarios.setText("Gerenciar Usuários");
        btnGerenciarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGerenciarUsuarios.setIconTextGap(10);
        btnGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerenciarUsuarios);
        btnGerenciarUsuarios.setBounds(328, 188, 205, 60);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPesquisar.setIconTextGap(10);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(50, 190, 205, 60);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 30, 190, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs_background/accountant-accounting-adviser-advisor-159804.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-210, -30, 820, 440);

        setSize(new java.awt.Dimension(605, 403));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        JanelaPesquisarPrincipal jan = new JanelaPesquisarPrincipal();
        jan.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnGerenciarContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarContasActionPerformed
        JanelaPrincipal gerenConta = new JanelaPrincipal(this.usuario);
        gerenConta.setVisible(true);
    }//GEN-LAST:event_btnGerenciarContasActionPerformed

    private void btnGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarUsuariosActionPerformed
        JanelaPrincipalUsuarios  jan = new JanelaPrincipalUsuarios();
        jan.setVisible(true);
    }//GEN-LAST:event_btnGerenciarUsuariosActionPerformed

    private void btnGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarClientesActionPerformed
        JanelaPrincipalClientes jan = new JanelaPrincipalClientes();
        jan.setVisible(true);
    }//GEN-LAST:event_btnGerenciarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprovacoes;
    private javax.swing.JButton btnEstatisticas;
    private javax.swing.JButton btnGerenciarClientes;
    private javax.swing.JButton btnGerenciarContas;
    private javax.swing.JButton btnGerenciarUsuarios;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}