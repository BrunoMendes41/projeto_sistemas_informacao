/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela_gerenciar_contas;
import classes.ContaReceber;
import classes.Cliente;
import classes.ContaPagar;
import classesDAO.ClienteDAO;
import classesDAO.ContaPagarDAO;
import classesDAO.ContaReceberDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author bruno
 */
public class NovaContaPagar extends javax.swing.JFrame {
private ArrayList<Cliente> clientesArray;
JanelaPrincipal jan;

    /**
     * Creates new form NovaContaReceber
     */
    public NovaContaPagar(){
        initComponents();
        
        
    }
    
    public NovaContaPagar(JanelaPrincipal jan){
        initComponents();
        
        this.jan = jan;         
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorTotal1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnRegistrar1 = new javax.swing.JButton();
        numParcelas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtfDataVencimento = new javax.swing.JFormattedTextField();
        txtTitulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/file.png"))); // NOI18N
        jLabel1.setText("Registrar Conta a Pagar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 220, 90);

        jLabel2.setText("Titulo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 60, 30);

        jLabel3.setText("Valor total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 120, 30);

        jLabel4.setText("Parcelas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 220, 90, 30);
        getContentPane().add(txtValorTotal1);
        txtValorTotal1.setBounds(290, 160, 150, 30);

        jLabel5.setText("Data Vencimento:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 220, 130, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(280, 580, 140, 40);

        btnRegistrar1.setText("Cancelar");
        btnRegistrar1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar1);
        btnRegistrar1.setBounds(50, 580, 140, 40);
        getContentPane().add(numParcelas);
        numParcelas.setBounds(290, 250, 70, 30);

        taObs.setColumns(10);
        taObs.setLineWrap(true);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 410, 130);

        jLabel7.setText("Obs:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 330, 60, 30);

        txtfDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(txtfDataVencimento);
        txtfDataVencimento.setBounds(30, 250, 180, 30);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(30, 160, 160, 30);

        setSize(new java.awt.Dimension(483, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            ContaPagar pagamento = new ContaPagar();           
           
            pagamento.setTitulo(this.txtTitulo.getText());
            pagamento.setValor(Double.parseDouble(this.txtValorTotal1.getText()));
            pagamento.setParcela_total(Integer.parseInt(this.numParcelas.getText()));            
            pagamento.setData_vencimento(this.txtfDataVencimento.getText());
            pagamento.setObs(this.taObs.getText());
           ContaPagarDAO.inserirPagamento(pagamento );    
           
           JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
           
          //refresh tabela
          jan.refreshTablePagar(jan.getP_tabela());
          
        } catch (NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro: \n" + ex.getMessage());
        }    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public int procuraCliente(String nomeCliente){
        for (int i = 0; i < this.clientesArray.size(); i++) {
            if(nomeCliente == clientesArray.get(i).getNome()){
                return clientesArray.get(i).getCod();
            }
        }        
        return -1;
    }    
    
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
            java.util.logging.Logger.getLogger(NovaContaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaContaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaContaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaContaPagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaContaPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numParcelas;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtValorTotal1;
    private javax.swing.JFormattedTextField txtfDataVencimento;
    // End of variables declaration//GEN-END:variables
}