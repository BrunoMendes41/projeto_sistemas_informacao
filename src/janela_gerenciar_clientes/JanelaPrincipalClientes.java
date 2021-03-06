/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela_gerenciar_clientes;

import classes.Cliente;
import classesDAO.ClienteDAO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lusca
 */
public class JanelaPrincipalClientes extends javax.swing.JFrame {
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    
    
    /**
     * Creates new form JanelaPrincipalClientes
     */
    public JanelaPrincipalClientes() {
        initComponents();
        
        carregaTabelaClientes(this.tabelaClientes);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnRegistrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        panelAjuda = new javax.swing.JPanel();
        lblAjuda = new javax.swing.JLabel();
        lblAjuda1 = new javax.swing.JLabel();
        lblAjuda2 = new javax.swing.JLabel();
        lblAjuda3 = new javax.swing.JLabel();
        lblAjuda0 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cmbCampos = new javax.swing.JComboBox<>();
        lblNumResultados = new javax.swing.JLabel();
        txtBuscaCliente = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "E-mail", "CNPJ", "Endereço", "Telefone", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setToolTipText("");
        tabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaClientes.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tabelaClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaClientes.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabelaClientes.getTableHeader().setReorderingAllowed(false);
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/businessman.png"))); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE CLIENTES");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jToolBar1.setBackground(new java.awt.Color(224, 224, 224));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manipular registros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jToolBar1.setRollover(true);

        btnRegistrar.setBackground(new java.awt.Color(224, 224, 224));
        btnRegistrar.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/man.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setFocusable(false);
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegistrar);

        btnAlterar.setBackground(new java.awt.Color(224, 224, 224));
        btnAlterar.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/contract.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setFocusable(false);
        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlterar);

        btnExcluir.setBackground(new java.awt.Color(224, 224, 224));
        btnExcluir.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/trash.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluir);

        btnAtualizar.setBackground(new java.awt.Color(227, 227, 227));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/refresh.png"))); // NOI18N
        btnAtualizar.setFocusable(false);
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizar);

        lblAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/idea.png"))); // NOI18N
        lblAjuda.setToolTipText("\"Dica\"");
        lblAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAjudaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAjudaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblAjudaMouseReleased(evt);
            }
        });

        lblAjuda1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAjuda1.setForeground(new java.awt.Color(0, 153, 153));

        lblAjuda2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAjuda2.setForeground(new java.awt.Color(0, 153, 153));

        lblAjuda3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAjuda3.setForeground(new java.awt.Color(0, 153, 153));

        lblAjuda0.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblAjuda0.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelAjudaLayout = new javax.swing.GroupLayout(panelAjuda);
        panelAjuda.setLayout(panelAjudaLayout);
        panelAjudaLayout.setHorizontalGroup(
            panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjudaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAjuda0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAjuda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(lblAjuda2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAjuda3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAjuda))
        );
        panelAjudaLayout.setVerticalGroup(
            panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjudaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblAjuda0, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblAjuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAjuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjudaLayout.createSequentialGroup()
                        .addComponent(lblAjuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAjuda3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Informações")));

        lblCodigo.setText("Código : ");

        lblNome.setText("Nome: ");

        lblEmail.setText("E-mail:");

        lblCnpj.setText("CNPJ:");

        lblEndereco.setText("Endereço: ");

        lblTelefone.setText("Telefone:");

        lblCep.setText("CEP: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCep, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCnpj)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEndereco)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        cmbCampos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nome", "E-mail", "CNPJ", "Endereço", "Telefone", "CEP" }));

        lblNumResultados.setText("Registros retornados na ultima pesquisa: ");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/research.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(lblNumResultados)
                .addGap(61, 61, 61))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(990, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Inserir cliente
        JanelaNovoCliente janNovoCliente = new JanelaNovoCliente();
        janNovoCliente.setTabelaClientes(this.tabelaClientes);
        janNovoCliente.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void lblAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMouseClicked
        
    }//GEN-LAST:event_lblAjudaMouseClicked

    private void lblAjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMousePressed
        panelAjuda.setBackground(new Color(226,226,226));
        lblAjuda0.setText("Excluir mais de um registro");
        lblAjuda1.setText("Use CTRL para um intervalo múltiplo de seleção");        
        lblAjuda2.setText("Use SHIFT para um intervalo único de seleção");        
        lblAjuda3.setText("Use CTRL para remover uma seleção");        
        
    }//GEN-LAST:event_lblAjudaMousePressed

    private void lblAjudaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAjudaMouseReleased
        panelAjuda.setBackground(new Color(240,240,240));
        lblAjuda0.setText("");
        lblAjuda1.setText("");        
        lblAjuda2.setText("");        
        lblAjuda3.setText("");        
    }//GEN-LAST:event_lblAjudaMouseReleased

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        // Exibe infos                
        lblCodigo.setText("Código: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0)));
        lblNome.setText("Nome: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1)));
        lblEmail.setText("E-mail: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 2)));
        lblCnpj.setText("CNPJ: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 3)));                     
        lblEndereco.setText("Endereço: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 4)));        
        lblTelefone.setText("Telefone: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 5)));
        lblCep.setText("CEP: "+(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 6)));
        
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Btn pesquisar
        
        if ( txtBuscaCliente.getText() != " " ) {                    
            String campoPesquisa = txtBuscaCliente.getText();
            String filtroDeBusca = cmbCampos.getSelectedItem().toString();
            switch(filtroDeBusca){
                case "Todos": filtroDeBusca = "todos"; 
                    break;
                case "Código": filtroDeBusca = "id";
                    break;
                case "Nome": filtroDeBusca = "nome";     
                    break;    
                case "E-mail": filtroDeBusca = "email";
                    break;
                case "CNPJ": filtroDeBusca = "cnpj";
                    break;    
                case "Endereço": filtroDeBusca = "endereco";
                    break;   
                case "Telefone": filtroDeBusca = "telefone";
                    break;    
                case "Cep": filtroDeBusca = "cep";
                    break;                     
        }         
        ArrayList<Cliente> clientesPesquisa = new ArrayList<>();
        clientesPesquisa = ClienteDAO.selectClientes(filtroDeBusca, campoPesquisa);
        carregaTabelaClientes(this.tabelaClientes, clientesPesquisa);        
                lblNumResultados.setText("Registros retornados na ultima pesquisa: " + clientesPesquisa.size());
            
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // alterar cliente   
        if ( this.tabelaClientes.getSelectedRow() < 0 ) {            
            JOptionPane.showMessageDialog(null,"Selecione um registro para alterar!");
        }else{
        String codCliente = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow() , 0).toString();
        String nome = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 1).toString();
        String email = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 2).toString();
        String cnpj = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 3).toString();
        String endereco = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 4).toString();
        String telefone = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 5).toString();
        String cep = tabelaClientes.getValueAt(this.tabelaClientes.getSelectedRow(), 6).toString();
        JanelaAlteraCliente janAlterarCLiente = new JanelaAlteraCliente(Integer.parseInt(codCliente), telefone, cep, nome, email, endereco, cnpj);
        janAlterarCLiente.setTabelaClientes(this.tabelaClientes);        
        janAlterarCLiente.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // btn atualizar
        carregaTabelaClientes(this.tabelaClientes);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // btn excluir                
        int[] codInt = this.tabelaClientes.getSelectedRows();
        ArrayList<Cliente> clientes = new ArrayList<>();        
        for (int i = 0; i < codInt.length; i++) {
            //clientes[i].setCod((int) this.tabelaClientes.getValueAt(codInt[i], 0));
            Cliente cliente = new Cliente();
            cliente.setCod( (int) this.tabelaClientes.getValueAt(codInt[i], 0) );
            clientes.add(cliente);
        }
                            
        if(codInt.length > 0){
           if ( codInt != null ) {
                 int dialogResult;
                //Cliente cliente = new Cliente( Integer.parseInt(this.tabelaClientes.getValueAt(codInt[i], 0).toString()) );                
                if ( codInt.length > 1 ) {
                    dialogResult = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover mais de um registro?");
                }else{
                    dialogResult = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este registro?");
                }
                
                if ( dialogResult == JOptionPane.YES_OPTION ) {
                    if ( ClienteDAO.delete(clientes) ) {
                        carregaTabelaClientes(this.tabelaClientes);
                        JOptionPane.showMessageDialog(null,"Registros deletados: "+clientes.size());                        
                    }//tratamento de exceção no ClienteDAO
                }
                
            }
             
            }else{
                  JOptionPane.showMessageDialog(null,"Selecione um registro para excluir!");                    
            }
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipalClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipalClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipalClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipalClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipalClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblAjuda;
    private javax.swing.JLabel lblAjuda0;
    private javax.swing.JLabel lblAjuda1;
    private javax.swing.JLabel lblAjuda2;
    private javax.swing.JLabel lblAjuda3;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumResultados;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel panelAjuda;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtBuscaCliente;
    // End of variables declaration//GEN-END:variables

    
    //Funções
    public static void carregaTabelaClientes(JTable tabelaClientes, ArrayList<Cliente> clientes){                      
        if (   clientes != null) {            
            DefaultTableModel defTableModel = (DefaultTableModel)tabelaClientes.getModel();
            defTableModel.setRowCount(0);
            if ( defTableModel.getRowCount() > 0 ) {
                for (int i = 0; i < tabelaClientes.getModel().getRowCount(); i++) {
                    defTableModel.removeRow(i);
                }
            }
            for (int i = 0; i < clientes.size(); i++) {
                Cliente indiceCliente = clientes.get(i);                                                                                                      
                Object[] dados = {
                    indiceCliente.getCod(),
                    indiceCliente.getNome(),
                    indiceCliente.getEmail(),
                    indiceCliente.getCnpj(),                                    
                    indiceCliente.getEndereco(),
                    indiceCliente.getTelefone(),                    
                   indiceCliente.getCep()                    
                };
                
                defTableModel.addRow(dados);
            }
            
        }else{
            DefaultTableModel defTableModel = (DefaultTableModel)tabelaClientes.getModel();
            defTableModel.setRowCount(0);
            if ( defTableModel.getRowCount() > 0 ) {
                for (int i = 0; i < tabelaClientes.getModel().getRowCount(); i++) {
                    defTableModel.removeRow(i);
                }
            }
        }
    }
    
    public static void carregaTabelaClientes(JTable tabelaClientes){        
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes = ClienteDAO.retornarTodosClientes();        
        if (  clientes != null || clientes.size() > 0 ) {
            DefaultTableModel defTableModel = (DefaultTableModel)tabelaClientes.getModel();
            defTableModel.setRowCount(0);
            if ( defTableModel.getRowCount() > 0 ) {
                for (int i = 0; i < tabelaClientes.getModel().getRowCount(); i++) {
                    defTableModel.removeRow(i);
                }
            }
            for (int i = 0; i < clientes.size(); i++) {
                Cliente indiceCliente = clientes.get(i);                                                                                                      
                Object[] dados = {
                    indiceCliente.getCod(),
                    indiceCliente.getNome(),
                    indiceCliente.getEmail(),
                    indiceCliente.getCnpj(),                                    
                    indiceCliente.getEndereco(),
                    indiceCliente.getTelefone(),                    
                   indiceCliente.getCep()                    
                };
                
                defTableModel.addRow(dados);
            }
            
        }else if(clientes == null){            
            DefaultTableModel defTableModel = (DefaultTableModel)tabelaClientes.getModel();
            defTableModel.setRowCount(0);
            if ( defTableModel.getRowCount() > 0 ) {
                for (int i = 0; i < tabelaClientes.getModel().getRowCount(); i++) {
                    defTableModel.removeRow(i);
                }
            }    
        }
    }
    
    //Getters e Setters
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    
       
}
