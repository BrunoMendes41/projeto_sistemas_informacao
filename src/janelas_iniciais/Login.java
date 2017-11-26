package janelas_iniciais;

import classesDAO.LoginDAO;
import classes.*;


import janela_gerenciar_contas.JanelaPrincipal;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
       initComponents();    
       
       //Carrega combo emails
        DefaultComboBoxModel cmbEmailModel = (DefaultComboBoxModel)l_txt_email.getModel() ;        
        ArrayList<String> emails = new ArrayList<>();
        emails = LoginDAO.retornaEmailsUsuarios();
        for (int i = 0; i < emails.size(); i++) {
            cmbEmailModel.addElement( emails.get(i) );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        l_txt_senha = new javax.swing.JPasswordField();
        l_txt_email = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 170, 50, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("E-Mail:  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 50, 30);

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(150, 230, 240, 40);

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/change.png"))); // NOI18N
        jLabel4.setText("Setor Financeiro Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 20, 340, 80);
        getContentPane().add(l_txt_senha);
        l_txt_senha.setBounds(150, 170, 240, 30);

        getContentPane().add(l_txt_email);
        l_txt_email.setBounds(150, 120, 240, 30);

        setSize(new java.awt.Dimension(556, 346));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // Botão Login
        String email  = l_txt_email.getItemAt( l_txt_email.getSelectedIndex() );
        String senha = l_txt_senha.getText();
        
        //evento login
        try{
             LoginDAO login = new LoginDAO(email, senha);
             //se confirmar o login
             if(login.logar()){
               
                Usuario usuario =  login.getUsuario();
               
                
                
                //abrindo janela menu e passando o usuário
                MenuPrincipal menu = new MenuPrincipal(usuario);
                menu.setVisible(true);
                //mostrando mensagem de boas vindas
                JOptionPane.showMessageDialog(null,"Bem vindo(a) " +  usuario.getNome() + " !");
                //fechando janela de login
                this.dispose();
             
             } else {
                 JOptionPane.showMessageDialog(null, "Email ou senha invalido");
                 
             }
             
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
       
    }//GEN-LAST:event_btn_loginActionPerformed

    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> l_txt_email;
    private javax.swing.JPasswordField l_txt_senha;
    // End of variables declaration//GEN-END:variables
}
