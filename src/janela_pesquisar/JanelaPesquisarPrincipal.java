/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela_pesquisar;

import classes.ContaPagar;
import classes.ContaReceber;
import classesDAO.ContaPagarDAO;
import classesDAO.ContaReceberDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class JanelaPesquisarPrincipal extends javax.swing.JFrame {
 ContaReceber receber = new ContaReceber();
 ContaPagar pagar   = new ContaPagar();
    /**
     * Creates new form JanelaPesquisarPrincipal
     */
    public JanelaPesquisarPrincipal() {
        initComponents();
        
       receber.todosRecebimentosTabela(this.r_tabela);
       pagar .todosPagamentosTabela(this.p_tabela);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        r_txtMesDe = new javax.swing.JTextField();
        r_txtMesAte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        r_txtAno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        r_txtData = new javax.swing.JTextField();
        r_txtMes = new javax.swing.JTextField();
        r_cbDataExata = new javax.swing.JRadioButton();
        r_cbEntreMeses = new javax.swing.JRadioButton();
        r_cbMes = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        r_cbStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        r_cbCliente = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        r_tabela = new javax.swing.JTable();
        r_btnPesquisa = new javax.swing.JButton();
        r_btnLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        p_cbStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        p_txtTitulo = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        p_txtMesDe = new javax.swing.JTextField();
        p_txtMesAte = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        p_txtAno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        p_txtData = new javax.swing.JTextField();
        p_txtMes = new javax.swing.JTextField();
        p_cbDataExata = new javax.swing.JRadioButton();
        r_cbEntreMeses1 = new javax.swing.JRadioButton();
        p_cbMes = new javax.swing.JRadioButton();
        p_btnLimpar = new javax.swing.JButton();
        p_btnPesquisa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        p_tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Por Datas"));
        jPanel3.setLayout(null);
        jPanel3.add(r_txtMesDe);
        r_txtMesDe.setBounds(230, 140, 82, 30);
        jPanel3.add(r_txtMesAte);
        r_txtMesAte.setBounds(340, 140, 74, 30);

        jLabel3.setText("e");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel3);
        jLabel3.setBounds(320, 140, 20, 28);
        jPanel3.add(r_txtAno);
        r_txtAno.setBounds(30, 50, 110, 30);

        jLabel6.setText("Ano: ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 20, 120, 30);
        jPanel3.add(r_txtData);
        r_txtData.setBounds(230, 50, 130, 30);
        jPanel3.add(r_txtMes);
        r_txtMes.setBounds(30, 140, 130, 30);

        buttonGroup1.add(r_cbDataExata);
        r_cbDataExata.setText("Data Exata");
        r_cbDataExata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cbDataExataActionPerformed(evt);
            }
        });
        jPanel3.add(r_cbDataExata);
        r_cbDataExata.setBounds(230, 20, 200, 30);

        buttonGroup1.add(r_cbEntreMeses);
        r_cbEntreMeses.setText("Entre Meses");
        r_cbEntreMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cbEntreMesesActionPerformed(evt);
            }
        });
        jPanel3.add(r_cbEntreMeses);
        r_cbEntreMeses.setBounds(230, 110, 220, 30);

        buttonGroup1.add(r_cbMes);
        r_cbMes.setSelected(true);
        r_cbMes.setText("Mês");
        r_cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cbMesActionPerformed(evt);
            }
        });
        jPanel3.add(r_cbMes);
        r_cbMes.setBounds(30, 110, 120, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 40, 520, 210);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("filtros Adicionais"));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(null);

        jLabel4.setText("Status:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(18, 29, 88, 28);

        r_cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pendente", "Confirmado", "Cancelado", "Atrasado" }));
        jPanel4.add(r_cbStatus);
        r_cbStatus.setBounds(18, 63, 123, 27);

        jLabel5.setText("Cliente:");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(18, 102, 63, 26);

        jPanel4.add(r_cbCliente);
        r_cbCliente.setBounds(18, 134, 123, 27);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(560, 40, 390, 210);

        r_tabela.setAutoCreateRowSorter(true);
        r_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código", "Cliente", "Valor", "Vencimento", "Parcelas", "modo pagamento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(r_tabela);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 320, 940, 270);

        r_btnPesquisa.setText("pesquisar");
        r_btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_btnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(r_btnPesquisa);
        r_btnPesquisa.setBounds(10, 270, 130, 30);

        r_btnLimpar.setText("Limpar");
        r_btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(r_btnLimpar);
        r_btnLimpar.setBounds(160, 270, 130, 30);

        jTabbedPane1.addTab("Pesquisar Recebimentos", jPanel1);

        jPanel2.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("filtros Adicionais"));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(null);

        jLabel7.setText("Status:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(18, 29, 88, 28);

        p_cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pendente", "Confirmado", "Cancelado", "Atrasado" }));
        jPanel5.add(p_cbStatus);
        p_cbStatus.setBounds(18, 63, 123, 27);

        jLabel8.setText("Titulo:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(18, 102, 63, 26);
        jPanel5.add(p_txtTitulo);
        p_txtTitulo.setBounds(20, 140, 120, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(560, 40, 390, 210);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Por Datas"));
        jPanel6.setLayout(null);
        jPanel6.add(p_txtMesDe);
        p_txtMesDe.setBounds(230, 140, 82, 30);
        jPanel6.add(p_txtMesAte);
        p_txtMesAte.setBounds(340, 140, 74, 30);

        jLabel9.setText("e");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel9);
        jLabel9.setBounds(320, 140, 20, 28);
        jPanel6.add(p_txtAno);
        p_txtAno.setBounds(30, 50, 110, 30);

        jLabel10.setText("Ano: ");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(30, 20, 120, 30);
        jPanel6.add(p_txtData);
        p_txtData.setBounds(230, 50, 130, 30);
        jPanel6.add(p_txtMes);
        p_txtMes.setBounds(30, 140, 130, 30);

        buttonGroup1.add(p_cbDataExata);
        p_cbDataExata.setText("Data Exata");
        p_cbDataExata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_cbDataExataActionPerformed(evt);
            }
        });
        jPanel6.add(p_cbDataExata);
        p_cbDataExata.setBounds(230, 20, 200, 30);

        buttonGroup1.add(r_cbEntreMeses1);
        r_cbEntreMeses1.setText("Entre Meses");
        r_cbEntreMeses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cbEntreMeses1ActionPerformed(evt);
            }
        });
        jPanel6.add(r_cbEntreMeses1);
        r_cbEntreMeses1.setBounds(230, 110, 220, 30);

        buttonGroup1.add(p_cbMes);
        p_cbMes.setText("Mês");
        p_cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_cbMesActionPerformed(evt);
            }
        });
        jPanel6.add(p_cbMes);
        p_cbMes.setBounds(30, 110, 120, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 40, 520, 210);

        p_btnLimpar.setText("Limpar");
        p_btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(p_btnLimpar);
        p_btnLimpar.setBounds(160, 270, 130, 30);

        p_btnPesquisa.setText("pesquisar");
        p_btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_btnPesquisaActionPerformed(evt);
            }
        });
        jPanel2.add(p_btnPesquisa);
        p_btnPesquisa.setBounds(10, 270, 130, 30);

        p_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código", "Título", "Valor", "Vencimento", "Parcelas", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p_tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(p_tabela);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 320, 940, 280);

        jTabbedPane1.addTab("pesquisar Pagamentos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(976, 665));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r_btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_btnPesquisaActionPerformed
        
        
      ArrayList<ContaReceber> contasArray = new ArrayList<>(); 
        try {
           contasArray  = ContaReceberDAO.pesquisaAvancada( this.montarWhereRecebimento() );
           receber.makeTable(this.r_tabela,  contasArray);
           JOptionPane.showMessageDialog(null, contasArray.toString());
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  ex);
        }
         
    }//GEN-LAST:event_r_btnPesquisaActionPerformed

    private void r_cbDataExataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cbDataExataActionPerformed
        //habilitando campos necessários
        this.r_txtData.setEnabled(true);
        //desabilitando outros campos
        this.r_txtMes.setEnabled(false);
        this.r_txtMesDe.setEnabled(false);
        this.r_txtMesAte.setEnabled(false);
        this.r_txtAno.setEnabled(false);
    }//GEN-LAST:event_r_cbDataExataActionPerformed

    private void r_cbEntreMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cbEntreMesesActionPerformed
        //habilitando campos necessários
        this.r_txtMesDe.setEnabled(true);
        this.r_txtMesAte.setEnabled(true);
        this.r_txtAno.setEnabled(true);
        //desabilitando outros campos
        this.r_txtData.setEnabled(false);
        this.r_txtMes.setEnabled(false);
        
    }//GEN-LAST:event_r_cbEntreMesesActionPerformed

    private void r_cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cbMesActionPerformed
        //habilitando campos necessários
        this.r_txtMes.setEnabled(true);
        this.r_txtAno.setEnabled(true);        
        //desabilitando outros campos
        this.r_txtData.setEnabled(false); 
        this.r_txtMesDe.setEnabled(false);
        this.r_txtMesAte.setEnabled(false);
        
    }//GEN-LAST:event_r_cbMesActionPerformed

    private void r_btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_btnLimparActionPerformed
        receber.todosRecebimentosTabela(this.r_tabela);
    }//GEN-LAST:event_r_btnLimparActionPerformed

    private void p_cbDataExataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_cbDataExataActionPerformed
        //habilitando campos necessários
        this.p_txtData.setEnabled(true);
        //desabilitando outros campos
        this.p_txtMes.setEnabled(false);
        this.p_txtMesDe.setEnabled(false);
        this.p_txtMesAte.setEnabled(false);
        this.p_txtAno.setEnabled(false);
    }//GEN-LAST:event_p_cbDataExataActionPerformed

    private void r_cbEntreMeses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cbEntreMeses1ActionPerformed
         //habilitando campos necessários
        this.p_txtMesDe.setEnabled(true);
        this.p_txtMesAte.setEnabled(true);
        this.p_txtAno.setEnabled(true);
        //desabilitando outros campos
        this.p_txtData.setEnabled(false);
        this.p_txtMes.setEnabled(false);
    }//GEN-LAST:event_r_cbEntreMeses1ActionPerformed

    private void p_cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_cbMesActionPerformed
        //habilitando campos necessários
        this.p_txtMes.setEnabled(true);
        this.p_txtAno.setEnabled(true);
        
        //desabilitando outros campos
        this.p_txtData.setEnabled(false); 
        this.p_txtMesDe.setEnabled(false);
        this.p_txtMesAte.setEnabled(false);
    }//GEN-LAST:event_p_cbMesActionPerformed

    private void p_btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_btnLimparActionPerformed
        pagar .todosPagamentosTabela(this.p_tabela);
    }//GEN-LAST:event_p_btnLimparActionPerformed

    private void p_btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_btnPesquisaActionPerformed
        ArrayList<ContaPagar> pagarArray = new ArrayList<>(); 
        try {
           pagarArray  = ContaPagarDAO.pesquisaAvancada( this.montarWherePagamento() );
           pagar.makeTable(this.p_tabela,  pagarArray);
           JOptionPane.showMessageDialog(null, pagarArray.toString());
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  ex);
        }
    }//GEN-LAST:event_p_btnPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPesquisarPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisarPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisarPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPesquisarPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPesquisarPrincipal().setVisible(true);
            }
        });
    }
    
   public String montarWhereRecebimento(){
       String whereArguments = "";
       
       //pegando os campos
        String ano = this.r_txtAno.getText();
        String mes = this.r_txtMes.getText();
        String mesDe = this.r_txtMesDe.getText();
        String mesAte = this.r_cbCliente.getItemAt( this.r_cbCliente.getSelectedIndex() );
        String  dataExata = this.r_txtData.getText();
        
        String where = null;
        //montando where Data Exata
        if(this.r_txtData.isEnabled() && !dataExata.isEmpty()){
            JOptionPane.showMessageDialog(null , dataExata);
            where =  " r.data_vencimento = '" + dataExata+ "'";
        }
        
        //where Mes
        if(this.r_cbMes.isSelected() && !mes.isEmpty()){            
            if(ano.isEmpty()){
              where =  " r.data_vencimento LIKE '___" + mes + "_____'";
            }
            
            else {
                where =  " r.data_vencimento LIKE '___" + mes + "_" + ano + "' ";
            }           
        }
        
        //adicionando filtros extras
        if(this.r_cbStatus.getSelectedIndex()  >  0){
            if(where != null)
                where += " AND r.status = '" + this.r_cbStatus.getItemAt(this.r_cbStatus.getSelectedIndex()) + "' ";
            else
                where = " r.status = '"  +  this.r_cbStatus.getItemAt(this.r_cbStatus.getSelectedIndex()) + "' ";
        }
        
        if(this.r_cbCliente.getSelectedIndex() >  0) {
            if(where != null)
                where += " AND c.nome = " + this.r_cbStatus.getItemAt(this.r_cbStatus.getSelectedIndex());
            else
                where = " c.nome= "  +  this.r_cbCliente.getItemAt(this.r_cbCliente.getSelectedIndex());
        }
              
       return where;
   }

   public String montarWherePagamento(){
       String whereArguments = "";
       
       //pegando os campos
        String ano = this.p_txtAno.getText();
        String mes = this.p_txtMes.getText();
        String mesDe = this.p_txtMesDe.getText();
        String mesAte = this.p_txtTitulo.getText();
        String  dataExata = this.p_txtData.getText();
        String titulo = this.p_txtTitulo.getText();
        
        String where = null;
        //montando where Data Exata
        if(this.p_txtData.isEnabled() && !dataExata.isEmpty()){
            JOptionPane.showMessageDialog(null , dataExata);
            where =  " p.data_vencimento = '" + dataExata+ "'";
        }
        
        //where Mes
        if(this.p_cbMes.isSelected() && !mes.isEmpty()){            
            if(ano.isEmpty()){
              where =  " p.data_vencimento LIKE '___" + mes + "_____'";
            }
            
            else {
                where =  " p.data_vencimento LIKE '___" + mes + "_" + ano + "' ";
            }           
        }
        
        //adicionando filtros extras
        if(this.p_cbStatus.getSelectedIndex()  >  0){
            if(where != null)
                where += " AND p.status = '" + this.p_cbStatus.getItemAt(this.p_cbStatus.getSelectedIndex()) + "' ";
            else
                where = " p.status = '"  +  this.p_cbStatus.getItemAt(this.p_cbStatus.getSelectedIndex()) + "' ";
        }
        
        if( !titulo.isEmpty() ) {
            if(where != null)
                where += " AND p.titulo = '" +  titulo + "'" ;
            else
                where = "p.titulo = '" +  titulo + "'" ;
        }
              
       return where;
   }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton p_btnLimpar;
    private javax.swing.JButton p_btnPesquisa;
    private javax.swing.JRadioButton p_cbDataExata;
    private javax.swing.JRadioButton p_cbMes;
    private javax.swing.JComboBox<String> p_cbStatus;
    private javax.swing.JTable p_tabela;
    private javax.swing.JTextField p_txtAno;
    private javax.swing.JTextField p_txtData;
    private javax.swing.JTextField p_txtMes;
    private javax.swing.JTextField p_txtMesAte;
    private javax.swing.JTextField p_txtMesDe;
    private javax.swing.JTextField p_txtTitulo;
    private javax.swing.JButton r_btnLimpar;
    private javax.swing.JButton r_btnPesquisa;
    private javax.swing.JComboBox<String> r_cbCliente;
    private javax.swing.JRadioButton r_cbDataExata;
    private javax.swing.JRadioButton r_cbEntreMeses;
    private javax.swing.JRadioButton r_cbEntreMeses1;
    private javax.swing.JRadioButton r_cbMes;
    private javax.swing.JComboBox<String> r_cbStatus;
    private javax.swing.JTable r_tabela;
    private javax.swing.JTextField r_txtAno;
    private javax.swing.JTextField r_txtData;
    private javax.swing.JTextField r_txtMes;
    private javax.swing.JTextField r_txtMesAte;
    private javax.swing.JTextField r_txtMesDe;
    // End of variables declaration//GEN-END:variables
}
