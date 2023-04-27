
package View;

import Model.Cliente;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {
        
    ArrayList<Cliente> listaClientes;
    String modo;
    
    public void loadTableClientes(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF","Data Nascimento","Nome Cliente","Cidade","Estado","Email","Telefone"}, 0);
          

        for(int i = 0; i<listaClientes.size();i++){
                    Object linha[] = new Object[]{listaClientes.get(i).getCpf(),listaClientes.get(i).getDataNascimento(),listaClientes.get(i).getNome(),listaClientes.get(i).getCidade(),listaClientes.get(i).getEstado(),listaClientes.get(i).getEmail(),listaClientes.get(i).getTelefone()};
                    
                    modelo.addRow(linha);
       
               }

            tblCliente.setModel(modelo);
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(4).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(6).setPreferredWidth(500);

    }
    
    
    
    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
        listaClientes = new ArrayList<>();
        modo = "Navegar";
        manipulaInterfaceClientes();


    }
    
    
    public void manipulaInterfaceClientes(){
        switch(modo){
            
            case "Navegar":
                btnClienteEnviar.setEnabled(false);
                btnClienteLimpar.setEnabled(false);
                txtClienteCPF.setEnabled(false);
                txtDataNascimento.setEnabled(false);
                txtClienteNome.setEnabled(false);
                txtCidade.setEnabled(false);
                txtEstado.setEnabled(false);
                txtEmail.setEnabled(false);
                txtTelefone.setEnabled(false);
                btnClienteNovo.setEnabled(true);
                btnClienteEditar.setEnabled(false);
                btnClienteExcluir.setEnabled(false);
                
                break;
                
            case "Novo":
                btnClienteEnviar.setEnabled(true);
                btnClienteLimpar.setEnabled(true);
                txtClienteCPF.setEnabled(true);
                txtDataNascimento.setEnabled(true);
                txtClienteNome.setEnabled(true);
                txtCidade.setEnabled(true);
                txtEstado.setEnabled(true);
                txtEmail.setEnabled(true);
                txtTelefone.setEnabled(true);
                btnClienteNovo.setEnabled(false);
                btnClienteEditar.setEnabled(false);
                btnClienteExcluir.setEnabled(false);
                
                break;
                
            case "Editar":
                
               btnClienteEnviar.setEnabled(true);
                btnClienteLimpar.setEnabled(true);
                txtClienteCPF.setEnabled(true);
                txtDataNascimento.setEnabled(true);
                txtClienteNome.setEnabled(true);
                txtCidade.setEnabled(true);
                txtEstado.setEnabled(true);
                txtEmail.setEnabled(true);
                txtTelefone.setEnabled(true);
                btnClienteNovo.setEnabled(true);
                btnClienteEditar.setEnabled(false);
                btnClienteExcluir.setEnabled(false);
                
                break;
                
            case "Excluir":
                
                btnClienteEnviar.setEnabled(false);
                btnClienteLimpar.setEnabled(false);
                txtClienteCPF.setEnabled(false);
                txtDataNascimento.setEnabled(false);
                txtClienteNome.setEnabled(false);
                txtCidade.setEnabled(false);
                txtEstado.setEnabled(false);
                txtEmail.setEnabled(false);
                txtTelefone.setEnabled(false);
                btnClienteNovo.setEnabled(true);
                btnClienteEditar.setEnabled(false);
                btnClienteExcluir.setEnabled(false);
                
                break;
                
            case "Selecao":
                
                btnClienteEnviar.setEnabled(false);
                btnClienteLimpar.setEnabled(false);
                txtClienteCPF.setEnabled(false);
                txtDataNascimento.setEnabled(false);
                txtClienteNome.setEnabled(false);
                txtCidade.setEnabled(false);
                txtEstado.setEnabled(false);
                txtEmail.setEnabled(false);
                txtTelefone.setEnabled(false);
                btnClienteNovo.setEnabled(true);
                btnClienteEditar.setEnabled(true);
                btnClienteExcluir.setEnabled(true);
                
                break;
                
            default: System.out.println("Modo Invalido!");
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnClienteCarro = new javax.swing.JButton();
        btnClienteCliente = new javax.swing.JButton();
        btnClienteReserva = new javax.swing.JButton();
        btnClienteSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnClienteEnviar = new javax.swing.JButton();
        btnClienteLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnClienteNovo = new javax.swing.JButton();
        btnClienteEditar = new javax.swing.JButton();
        btnClienteExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Data Nascimento", "Nome Cliente", "Cidade", "Estado", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(4).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblCliente.getColumnModel().getColumn(6).setPreferredWidth(500);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnClienteCarro.setText("Cadastro Carro");
        btnClienteCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCarroActionPerformed(evt);
            }
        });

        btnClienteCliente.setText("Cadastro Cliente");
        btnClienteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteClienteActionPerformed(evt);
            }
        });

        btnClienteReserva.setText("Cadastro Reserva");
        btnClienteReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteReservaActionPerformed(evt);
            }
        });

        btnClienteSair.setText("Sair");
        btnClienteSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClienteCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClienteCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClienteReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClienteSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnClienteCarro)
                .addGap(27, 27, 27)
                .addComponent(btnClienteCliente)
                .addGap(30, 30, 30)
                .addComponent(btnClienteReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnClienteSair)
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnClienteEnviar.setText("Enviar");
        btnClienteEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEnviarActionPerformed(evt);
            }
        });

        btnClienteLimpar.setText("Limpar");
        btnClienteLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data Nascimento:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Email:");

        jLabel7.setText("Telefone:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnClienteEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClienteLimpar)
                .addGap(134, 134, 134))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteNome)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefone)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteEnviar)
                    .addComponent(btnClienteLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnClienteNovo.setText("Novo");
        btnClienteNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteNovoActionPerformed(evt);
            }
        });

        btnClienteEditar.setText("Editar");
        btnClienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditarActionPerformed(evt);
            }
        });

        btnClienteExcluir.setText("Excluir");
        btnClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClienteNovo)
                                .addGap(173, 173, 173)
                                .addComponent(btnClienteEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClienteExcluir))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteNovo)
                    .addComponent(btnClienteEditar)
                    .addComponent(btnClienteExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClienteSairActionPerformed

    private void btnClienteCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteCarroActionPerformed
        new Carro().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteCarroActionPerformed

    private void btnClienteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteClienteActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteClienteActionPerformed

    private void btnClienteReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteReservaActionPerformed
        new Reserva().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClienteReservaActionPerformed

    private void btnClienteLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteLimparActionPerformed
        txtClienteCPF.setText("");
        txtDataNascimento.setText("");
        txtClienteNome.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        
        
        modo = "Navegar";
        manipulaInterfaceClientes();

        
    }//GEN-LAST:event_btnClienteLimparActionPerformed

    private void btnClienteEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEnviarActionPerformed
        int cpf = Integer.parseInt(txtClienteCPF.getText()) ;
        
        if(modo.equals("Novo")){
        
            Cliente cliente = new Cliente(cpf,txtDataNascimento.getText(),txtClienteNome.getText(),txtCidade.getText(),txtEstado.getText(),txtEmail.getText(),txtTelefone.getText());

            listaClientes.add(cliente);
            
       } else if(modo.equals("Editar")){
           
           int index = tblCliente.getSelectedRow();
           
           listaClientes.get(index).setCpf(cpf);
           listaClientes.get(index).setDataNascimento(txtDataNascimento.getText());
           listaClientes.get(index).setNome(txtClienteNome.getText());
           listaClientes.get(index).setCidade(txtCidade.getText());
           listaClientes.get(index).setEstado(txtEstado.getText());
           listaClientes.get(index).setEmail(txtEmail.getText());
           listaClientes.get(index).setTelefone(txtTelefone.getText());
       }
        loadTableClientes();
        modo = "Navegar";
        manipulaInterfaceClientes();
        txtClienteCPF.setText("");
        txtDataNascimento.setText("");
        txtClienteNome.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        

       
    }//GEN-LAST:event_btnClienteEnviarActionPerformed

    private void btnClienteNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteNovoActionPerformed
        txtClienteCPF.setText("");
        txtDataNascimento.setText("");
        txtClienteNome.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        
        modo = "Novo";
        manipulaInterfaceClientes();
         
        
    }//GEN-LAST:event_btnClienteNovoActionPerformed

    private void btnClienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditarActionPerformed
        
        modo = "Editar";
        manipulaInterfaceClientes();

    }//GEN-LAST:event_btnClienteEditarActionPerformed

    private void btnClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteExcluirActionPerformed
        int index = tblCliente.getSelectedRow();
        
        if(index>=0 && index<listaClientes.size()){
            
                listaClientes.remove(index);       
        }  
        loadTableClientes();
        modo = "Navegar";
        manipulaInterfaceClientes();
        txtClienteCPF.setText("");
        txtDataNascimento.setText("");
        txtClienteNome.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");

    }//GEN-LAST:event_btnClienteExcluirActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        int index = tblCliente.getSelectedRow();
        
        if(index>=0 && index<listaClientes.size()){
            
                Cliente cliente = listaClientes.get(index);
                
                txtClienteCPF.setText(String.valueOf(cliente.getCpf()));
                txtDataNascimento.setText(cliente.getDataNascimento());
                txtClienteNome.setText(cliente.getNome());
                txtCidade.setText(cliente.getCidade());
                txtEstado.setText(cliente.getEstado());
                txtEmail.setText(cliente.getEmail());
                txtTelefone.setText(cliente.getTelefone());
               
                
                modo = "Selecao";
                manipulaInterfaceClientes();
        }

    }//GEN-LAST:event_tblClienteMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteCarro;
    private javax.swing.JButton btnClienteCliente;
    private javax.swing.JButton btnClienteEditar;
    private javax.swing.JButton btnClienteEnviar;
    private javax.swing.JButton btnClienteExcluir;
    private javax.swing.JButton btnClienteLimpar;
    private javax.swing.JButton btnClienteNovo;
    private javax.swing.JButton btnClienteReserva;
    private javax.swing.JButton btnClienteSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
