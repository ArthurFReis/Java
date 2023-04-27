
package View;

import Model.Carros;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import DAO.CarrosDAO;



public class Carro extends javax.swing.JFrame {
        ArrayList<Carros> listaCarros;
        String modo;
        ArrayList<CarrosDAO> listaCarro;
      
        
        public void loadTableCarros(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome Carro","Alugado","Marca","Ano","Placa","Categoria","Valor"}, 0);
          

        for(int i = 0; i<listaCarros.size();i++){
                    Object linha[] = new Object[]{listaCarros.get(i).getNome(),listaCarros.get(i).getAlugado(),listaCarros.get(i).getMarca(),listaCarros.get(i).getAno(),listaCarros.get(i).getPlaca(),listaCarros.get(i).getCategoria(),listaCarros.get(i).getPreco()};
                    
                    modelo.addRow(linha);
       
               }

            tblCarro.setModel(modelo);
            tblCarro.getColumnModel().getColumn(0).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblCarro.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(3).setPreferredWidth(400);
            tblCarro.getColumnModel().getColumn(4).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(6).setPreferredWidth(400);

        }
        
         

          

        


    public Carro() {
        initComponents();
        setLocationRelativeTo(null);
        listaCarros = new ArrayList<>();
        modo = "Navegar";
        manipulaInterfaceCarros();
        listaCarro = new ArrayList<>();
        

    }
    
    
    public void manipulaInterfaceCarros(){
        switch(modo){
            case "Navegar":
                
                btnCarroEnviar.setEnabled(false);
                btnCarroLimpar.setEnabled(false);
                txtNomeCarro.setEnabled(false);
                cmbAlugado.setEnabled(false);
                txtMarca.setEnabled(false);
                txtAno.setEnabled(false);
                txtPlaca.setEnabled(false);
                cmbCarroCategoria.setEnabled(false);
                txtCarroPreco.setEnabled(false);
                btnCarroNovo.setEnabled(true);
                btnCarroEditar.setEnabled(false);
                btnCarroExcluir.setEnabled(false);
                
                break;
            case "Novo":
                
                btnCarroEnviar.setEnabled(true);
                btnCarroLimpar.setEnabled(true);
                txtNomeCarro.setEnabled(true);
                cmbAlugado.setEnabled(true);
                txtMarca.setEnabled(true);
                txtAno.setEnabled(true);
                txtPlaca.setEnabled(true);
                cmbCarroCategoria.setEnabled(true);
                txtCarroPreco.setEnabled(true);
                btnCarroNovo.setEnabled(false);
                btnCarroEditar.setEnabled(false);
                btnCarroExcluir.setEnabled(false);
                
                break;
                
            case "Editar":
                
                btnCarroEnviar.setEnabled(true);
                btnCarroLimpar.setEnabled(true);
                txtNomeCarro.setEnabled(true);
                cmbAlugado.setEnabled(true);
                txtMarca.setEnabled(true);
                txtAno.setEnabled(true);
                txtPlaca.setEnabled(true);
                cmbCarroCategoria.setEnabled(true);
                txtCarroPreco.setEnabled(true);
                btnCarroNovo.setEnabled(true);
                btnCarroEditar.setEnabled(false);
                btnCarroExcluir.setEnabled(false);
                
                break;
                
            case "Excluir":
                
                btnCarroEnviar.setEnabled(false);
                btnCarroLimpar.setEnabled(false);
                txtNomeCarro.setEnabled(false);
                cmbAlugado.setEnabled(false);
                txtMarca.setEnabled(false);
                txtAno.setEnabled(false);
                txtPlaca.setEnabled(false);
                cmbCarroCategoria.setEnabled(false);
                txtCarroPreco.setEnabled(false);
                btnCarroNovo.setEnabled(true);
                btnCarroEditar.setEnabled(false);
                btnCarroExcluir.setEnabled(false);
                
                break;
                
            case "Selecao":
                
                 btnCarroEnviar.setEnabled(false);
                btnCarroLimpar.setEnabled(false);
                txtNomeCarro.setEnabled(false);
                cmbAlugado.setEnabled(false);
                txtMarca.setEnabled(false);
                txtAno.setEnabled(false);
                txtPlaca.setEnabled(false);
                cmbCarroCategoria.setEnabled(false);
                txtCarroPreco.setEnabled(false);
                btnCarroNovo.setEnabled(true);
                btnCarroEditar.setEnabled(true);
                btnCarroExcluir.setEnabled(true);
                
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
        tblCarro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCarroCarro = new javax.swing.JButton();
        btnCarroCliente = new javax.swing.JButton();
        btnCarroReserva = new javax.swing.JButton();
        btnCarroSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCarroEnviar = new javax.swing.JButton();
        btnCarroLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCarro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbAlugado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCarroCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtCarroPreco = new javax.swing.JTextField();
        btnCarroNovo = new javax.swing.JButton();
        btnCarroEditar = new javax.swing.JButton();
        btnCarroExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Carro", "Alugado", "Marca", "Ano", "Placa", "Categoria", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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
        tblCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarro);
        if (tblCarro.getColumnModel().getColumnCount() > 0) {
            tblCarro.getColumnModel().getColumn(0).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblCarro.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(3).setPreferredWidth(400);
            tblCarro.getColumnModel().getColumn(4).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(5).setPreferredWidth(500);
            tblCarro.getColumnModel().getColumn(6).setPreferredWidth(400);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCarroCarro.setText("Cadastro Carro");
        btnCarroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroCarroActionPerformed(evt);
            }
        });

        btnCarroCliente.setText("Cadastro Cliente");
        btnCarroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroClienteActionPerformed(evt);
            }
        });

        btnCarroReserva.setText("Cadastro Reserva");
        btnCarroReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroReservaActionPerformed(evt);
            }
        });

        btnCarroSair.setText("Sair");
        btnCarroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCarroSair, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnCarroCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarroCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarroReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCarroCarro)
                .addGap(18, 18, 18)
                .addComponent(btnCarroCliente)
                .addGap(18, 18, 18)
                .addComponent(btnCarroReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarroSair)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCarroEnviar.setText("Enviar");
        btnCarroEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroEnviarActionPerformed(evt);
            }
        });

        btnCarroLimpar.setText("Limpar");
        btnCarroLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Alugado:");

        cmbAlugado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Sim", "Não" }));

        jLabel3.setText("Marca:");

        jLabel4.setText("Ano:");

        jLabel5.setText("Placa:");

        jLabel6.setText("Categoria:");

        cmbCarroCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "A-Básico", "B-Semiluxuoso", "C-Luxuoso" }));

        jLabel7.setText("Valor:");

        txtCarroPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarroPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnCarroEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarroLimpar)
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlaca))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCarroCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCarroPreco))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbAlugado, 0, 179, Short.MAX_VALUE)
                    .addComponent(txtAno))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAlugado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCarroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCarroPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarroEnviar)
                    .addComponent(btnCarroLimpar))
                .addContainerGap())
        );

        btnCarroNovo.setText("Novo");
        btnCarroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroNovoActionPerformed(evt);
            }
        });

        btnCarroEditar.setText("Editar");
        btnCarroEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroEditarActionPerformed(evt);
            }
        });

        btnCarroExcluir.setText("Excluir");
        btnCarroExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarroExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarroNovo)
                                .addGap(181, 181, 181)
                                .addComponent(btnCarroEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCarroExcluir))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarroNovo)
                    .addComponent(btnCarroEditar)
                    .addComponent(btnCarroExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCarroSairActionPerformed

    private void btnCarroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroClienteActionPerformed
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarroClienteActionPerformed

    private void btnCarroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroCarroActionPerformed
        new Carro().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarroCarroActionPerformed

    private void btnCarroReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroReservaActionPerformed
        new Reserva().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarroReservaActionPerformed

    private void txtCarroPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarroPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarroPrecoActionPerformed

    private void btnCarroLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroLimparActionPerformed
        txtNomeCarro.setText("");
        cmbAlugado.setSelectedItem("Selecione");
        txtMarca.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        cmbCarroCategoria.setSelectedItem("Selecione");
        txtCarroPreco.setText("");
        
        modo = "Navegar";
        manipulaInterfaceCarros();

    }//GEN-LAST:event_btnCarroLimparActionPerformed

    private void btnCarroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroNovoActionPerformed
        txtNomeCarro.setText("");
        cmbAlugado.setSelectedItem("Selecione");
        txtMarca.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        cmbCarroCategoria.setSelectedItem("Selecione");
        txtCarroPreco.setText("");
        
        modo = "Novo";
        manipulaInterfaceCarros();
    }//GEN-LAST:event_btnCarroNovoActionPerformed

    private void tblCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarroMouseClicked
        
        int index = tblCarro.getSelectedRow();
        
        if(index>=0 && index<listaCarros.size()){
            
            
            
            
                Carros carros = listaCarros.get(index);
                  
                txtNomeCarro.setText(carros.getNome());
                cmbAlugado.setSelectedItem(String.valueOf(carros.getAlugado()));
                txtMarca.setText(carros.getMarca());
                txtAno.setText(String.valueOf(carros.getAno()));
                txtPlaca.setText(carros.getPlaca());
                cmbCarroCategoria.setSelectedItem(String.valueOf(carros.getCategoria()));
                txtCarroPreco.setText(String.valueOf(carros.getPreco()));
              
             
                modo = "Selecao";
                manipulaInterfaceCarros();
                
        
          
        }
    
        

    }//GEN-LAST:event_tblCarroMouseClicked

    private void btnCarroEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroEditarActionPerformed
                modo = "Editar";
                manipulaInterfaceCarros();

    }//GEN-LAST:event_btnCarroEditarActionPerformed

    private void btnCarroExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroExcluirActionPerformed
        int index = tblCarro.getSelectedRow();
        
        if(index>=0 && index<listaCarros.size()){
            
                listaCarros.remove(index);       
        }  
        loadTableCarros();
        modo = "Navegar";
        txtNomeCarro.setText("");
        cmbAlugado.setSelectedItem("Selecione");
        txtMarca.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        cmbCarroCategoria.setSelectedItem("Selecione");
        txtCarroPreco.setText("");

    }//GEN-LAST:event_btnCarroExcluirActionPerformed

    private void btnCarroEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarroEnviarActionPerformed
        String alugado = cmbAlugado.getSelectedItem().toString();
        int ano = Integer.parseInt(txtAno.getText());
        String categoria =  cmbCarroCategoria.getSelectedItem().toString();
        double preco = Double.parseDouble(txtCarroPreco.getText());
        
        
        if(modo.equals("Novo")){
        
            Carros carros = new Carros(txtNomeCarro.getText(),alugado,txtMarca.getText(),ano,txtPlaca.getText(),categoria,preco);

            listaCarros.add(carros);
       } else if(modo.equals("Editar")){
           int index = tblCarro.getSelectedRow();
           
           
           listaCarros.get(index).setNome(txtNomeCarro.getText());
           listaCarros.get(index).setAlugado(alugado);
           listaCarros.get(index).setMarca(txtMarca.getText());
           listaCarros.get(index).setAno(ano);
           listaCarros.get(index).setPlaca(txtPlaca.getText());
           listaCarros.get(index).setCategoria(categoria);
           listaCarros.get(index).setPreco(preco);
           
          
              
       }
        loadTableCarros();
        
        
        modo = "Navegar";
        manipulaInterfaceCarros();
        
        txtNomeCarro.setText("");
        cmbAlugado.setSelectedItem("Selecione");
        txtMarca.setText("");
        txtAno.setText("");
        txtPlaca.setText("");
        cmbCarroCategoria.setSelectedItem("Selecione");
        txtCarroPreco.setText("");


    }//GEN-LAST:event_btnCarroEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarroCarro;
    private javax.swing.JButton btnCarroCliente;
    private javax.swing.JButton btnCarroEditar;
    private javax.swing.JButton btnCarroEnviar;
    private javax.swing.JButton btnCarroExcluir;
    private javax.swing.JButton btnCarroLimpar;
    private javax.swing.JButton btnCarroNovo;
    private javax.swing.JButton btnCarroReserva;
    private javax.swing.JButton btnCarroSair;
    private javax.swing.JComboBox<String> cmbAlugado;
    private javax.swing.JComboBox<String> cmbCarroCategoria;
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
    private javax.swing.JTable tblCarro;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCarroPreco;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeCarro;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
