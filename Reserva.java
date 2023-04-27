
package View;

import Model.Reservas;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Reserva extends javax.swing.JFrame {

    ArrayList<Reservas> listaReservas;
    String modo;
    
    public void loadTableReservas(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF","Nome","Categoria","Nome Carro","Data Reserva","Hora Reserva","Data Entrega","Hora Entrega","Valor","Tipo Reserva","Valor Total"}, 0);
          

        for(int i = 0; i<listaReservas.size();i++){
                    Object linha[] = new Object[]{listaReservas.get(i).getCpf(),listaReservas.get(i).getNomeCliente(),listaReservas.get(i).getCarroCategoria(),listaReservas.get(i).getNomeCarro(),listaReservas.get(i).getDataReserva(),listaReservas.get(i).getHoraReserva(),listaReservas.get(i).getDataEntrega(),listaReservas.get(i).getHoraEntrega(),listaReservas.get(i).getPreco(),listaReservas.get(i).getTipoReserva(),listaReservas.get(i).getPrecoTotal()};
                    
                    modelo.addRow(linha);
       
               }

            tblReserva.setModel(modelo);
            tblReserva.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(1).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(4).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(5).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(6).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(7).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(9).setPreferredWidth(300);
            tblReserva.getColumnModel().getColumn(8).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(10).setPreferredWidth(300);

}

    public Reserva() {
        initComponents();
        setLocationRelativeTo(null);
        listaReservas = new ArrayList<>();
        modo = "Navegar";
        manipulaInterfaceReserva();
       

    }
    
    public void manipulaInterfaceReserva(){
        switch(modo){
            case "Navegar":
                btnReservaEnviar.setEnabled(false);
                btnReservaLimpar.setEnabled(false);
                txtCPF.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                cmbCategoria.setEnabled(false);
                cmbNomeCarro.setEnabled(false);
                txtDataReserva.setEnabled(false);
                txtHoraReserva.setEnabled(false);
                txtDataEntrega.setEnabled(false);
                txtHoraEntrega.setEnabled(false);
                txtPreco.setEnabled(false);
                cmbTipoReserva.setEnabled(false);
                txtPrecoTotal.setEnabled(false);
                btnReservaNovo.setEnabled(true);
                btnReservaEditar.setEnabled(false);
                btnReservaExcluir.setEnabled(false);
                
                break;
            case "Novo":
                btnReservaEnviar.setEnabled(true);
                btnReservaLimpar.setEnabled(true);
                txtCPF.setEnabled(true);
                txtNomeCliente.setEnabled(true);
                cmbCategoria.setEnabled(true);
                cmbNomeCarro.setEnabled(true);
                txtDataReserva.setEnabled(true);
                txtHoraReserva.setEnabled(true);
                txtDataEntrega.setEnabled(true);
                txtHoraEntrega.setEnabled(true);
                txtPreco.setEnabled(true);
                cmbTipoReserva.setEnabled(true);
                txtPrecoTotal.setEnabled(true);
                btnReservaNovo.setEnabled(false);
                btnReservaEditar.setEnabled(false);
                btnReservaExcluir.setEnabled(false);
                
                break;
                
            case "Editar":
                btnReservaEnviar.setEnabled(true);
                btnReservaLimpar.setEnabled(true);
                txtCPF.setEnabled(true);
                txtNomeCliente.setEnabled(true);
                cmbCategoria.setEnabled(true);
                cmbNomeCarro.setEnabled(true);
                txtDataReserva.setEnabled(true);
                txtHoraReserva.setEnabled(true);
                txtDataEntrega.setEnabled(true);
                txtHoraEntrega.setEnabled(true); 
                txtPreco.setEnabled(true);
                cmbTipoReserva.setEnabled(true);
                txtPrecoTotal.setEnabled(true);
                btnReservaNovo.setEnabled(true);
                btnReservaEditar.setEnabled(false);
                btnReservaExcluir.setEnabled(false);
                
                break;
                
            case "Excluir":
                btnReservaEnviar.setEnabled(false);
                btnReservaLimpar.setEnabled(false);
                txtCPF.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                cmbCategoria.setEnabled(false);
                cmbNomeCarro.setEnabled(false);
                txtDataReserva.setEnabled(false);
                txtHoraReserva.setEnabled(false);
                txtDataEntrega.setEnabled(false);
                txtHoraEntrega.setEnabled(false);
                txtPreco.setEnabled(false);
                cmbTipoReserva.setEnabled(false);
                txtPrecoTotal.setEnabled(false);
                btnReservaNovo.setEnabled(true);
                btnReservaEditar.setEnabled(false);
                btnReservaExcluir.setEnabled(false);
                
                break;
                
            case "Selecao":
                btnReservaEnviar.setEnabled(false);
                btnReservaLimpar.setEnabled(false);
                txtCPF.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                cmbCategoria.setEnabled(false);
                cmbNomeCarro.setEnabled(false);
                txtDataReserva.setEnabled(false);
                txtHoraReserva.setEnabled(false);
                txtDataEntrega.setEnabled(false);
                txtHoraEntrega.setEnabled(false);
                txtPreco.setEnabled(false);
                cmbTipoReserva.setEnabled(false);
                txtPrecoTotal.setEnabled(false);
                btnReservaNovo.setEnabled(true);
                btnReservaEditar.setEnabled(true);
                btnReservaExcluir.setEnabled(true);
                
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
        tblReserva = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnReservaReserva = new javax.swing.JButton();
        btnReservaCliente = new javax.swing.JButton();
        btnReservaCarro = new javax.swing.JButton();
        btnReservaSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbNomeCarro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbTipoReserva = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnReservaEnviar = new javax.swing.JButton();
        btnReservaLimpar = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        txtPrecoTotal = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataReserva = new javax.swing.JTextField();
        txtDataEntrega = new javax.swing.JTextField();
        txtHoraReserva = new javax.swing.JTextField();
        txtHoraEntrega = new javax.swing.JTextField();
        btnReservaNovo = new javax.swing.JButton();
        btnReservaEditar = new javax.swing.JButton();
        btnReservaExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome Cliente", "Categoria", "Nome Carro", "Data Reserva", "Hora Reserva", "Data Entrega", "Hora Entrega", "Valor", "Tipo Reserva", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReserva);
        if (tblReserva.getColumnModel().getColumnCount() > 0) {
            tblReserva.getColumnModel().getColumn(0).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(1).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(2).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(3).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(4).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(5).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(6).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(7).setPreferredWidth(400);
            tblReserva.getColumnModel().getColumn(8).setPreferredWidth(300);
            tblReserva.getColumnModel().getColumn(9).setPreferredWidth(500);
            tblReserva.getColumnModel().getColumn(10).setPreferredWidth(300);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnReservaReserva.setText("Cadastro Reserva");
        btnReservaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaReservaActionPerformed(evt);
            }
        });

        btnReservaCliente.setText("Cadastro Cliente");
        btnReservaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaClienteActionPerformed(evt);
            }
        });

        btnReservaCarro.setText("Cadastro Carro");
        btnReservaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaCarroActionPerformed(evt);
            }
        });

        btnReservaSair.setText("Sair");
        btnReservaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnReservaCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservaReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservaSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnReservaCarro)
                .addGap(18, 18, 18)
                .addComponent(btnReservaCliente)
                .addGap(18, 18, 18)
                .addComponent(btnReservaReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(btnReservaSair)
                .addGap(23, 23, 23))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome Cliente:");

        jLabel3.setText("Categoria:");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "A-Básico", "B-Semiluxo", "C-Luxuoso" }));

        jLabel4.setText("Nome Carro:");

        cmbNomeCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "x", "y", "z" }));

        jLabel5.setText("Data Reserva:");

        jLabel6.setText("Hora Reserva:");

        jLabel7.setText("Data Entrega: ");

        jLabel8.setText("Hora Entrega:");

        jLabel9.setText("Tipo Reserva:");

        cmbTipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "RI", "RPA" }));
        cmbTipoReserva.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoReservaItemStateChanged(evt);
            }
        });
        cmbTipoReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTipoReservaMouseClicked(evt);
            }
        });
        cmbTipoReserva.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbTipoReservaPropertyChange(evt);
            }
        });

        jLabel10.setText("Valor:");

        jLabel11.setText("Valor Total:");

        btnReservaEnviar.setText("Enviar");
        btnReservaEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaEnviarActionPerformed(evt);
            }
        });

        btnReservaLimpar.setText("Limpar");
        btnReservaLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaLimparActionPerformed(evt);
            }
        });

        txtPrecoTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoTotalFocusGained(evt);
            }
        });
        txtPrecoTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecoTotalMouseClicked(evt);
            }
        });
        txtPrecoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(btnReservaEnviar)
                                .addGap(176, 176, 176)
                                .addComponent(btnReservaLimpar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbNomeCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHoraEntrega))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHoraReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(50, 50, 50)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cmbNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtDataReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoraReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtHoraEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservaLimpar)
                    .addComponent(btnReservaEnviar))
                .addGap(29, 29, 29))
        );

        btnReservaNovo.setText("Novo");
        btnReservaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaNovoActionPerformed(evt);
            }
        });

        btnReservaEditar.setText("Editar");
        btnReservaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaEditarActionPerformed(evt);
            }
        });

        btnReservaExcluir.setText("Excluir");
        btnReservaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaExcluirActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReservaNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReservaEditar)
                                .addGap(341, 341, 341)
                                .addComponent(btnReservaExcluir)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReservaNovo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReservaEditar)
                        .addComponent(btnReservaExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnReservaSairActionPerformed

    private void btnReservaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaCarroActionPerformed
        new Carro().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReservaCarroActionPerformed

    private void btnReservaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaClienteActionPerformed
         new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReservaClienteActionPerformed

    private void btnReservaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaReservaActionPerformed
        new Reserva().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReservaReservaActionPerformed

    private void btnReservaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaNovoActionPerformed
        txtCPF.setText("");
        txtNomeCliente.setText("");
        cmbCategoria.setSelectedItem("Selecione");
        cmbNomeCarro.setSelectedItem("Selecione");
        txtDataReserva.setText("");
        txtHoraReserva.setText("");
        txtDataEntrega.setText("");
        txtHoraEntrega.setText("");
        txtPreco.setText("");
        cmbTipoReserva.setSelectedItem("Selecione");
        txtPrecoTotal.setText("");
        
        modo = "Novo";
       manipulaInterfaceReserva();
    }//GEN-LAST:event_btnReservaNovoActionPerformed

    private void btnReservaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaEditarActionPerformed
        modo = "Editar";
        manipulaInterfaceReserva();
    }//GEN-LAST:event_btnReservaEditarActionPerformed

    private void btnReservaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaExcluirActionPerformed
        int index = tblReserva.getSelectedRow();
        
        if(index>=0 && index<listaReservas.size()){
            
                listaReservas.remove(index);       
        }  
        loadTableReservas();
        modo = "Navegar";
        manipulaInterfaceReserva();
        txtCPF.setText("");
        txtNomeCliente.setText("");
        cmbCategoria.setSelectedItem("Selecione");
        cmbNomeCarro.setSelectedItem("Selecione");
        txtDataReserva.setText("");
        txtHoraReserva.setText("");
        txtDataEntrega.setText("");
        txtHoraEntrega.setText("");
        txtPreco.setText("");
        cmbTipoReserva.setSelectedItem("Selecione");
        txtPrecoTotal.setText("");
    }//GEN-LAST:event_btnReservaExcluirActionPerformed

    private void tblReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservaMouseClicked
        int index = tblReserva.getSelectedRow();
        
        if(index>=0 && index<listaReservas.size()){
            
                Reservas reservas = listaReservas.get(index);
                
                txtCPF.setText(String.valueOf(reservas.getCpf()));
                txtNomeCliente.setText(reservas.getNomeCliente());
                cmbCategoria.setSelectedItem(String.valueOf(reservas.getCarroCategoria()));
                cmbNomeCarro.setSelectedItem(String.valueOf(reservas.getNomeCarro()));
                txtDataReserva.setText(reservas.getDataReserva());
                txtHoraReserva.setText(reservas.getHoraReserva());
                txtDataEntrega.setText(reservas.getDataEntrega());
                txtHoraEntrega.setText(reservas.getHoraEntrega());
                txtPreco.setText(String.valueOf(reservas.getPreco()));
                cmbTipoReserva.setSelectedItem(String.valueOf(reservas.getTipoReserva()));
                txtPrecoTotal.setText(String.valueOf(reservas.getPrecoTotal()));
                
                modo = "Selecao";
                manipulaInterfaceReserva();
        
        }  
    }//GEN-LAST:event_tblReservaMouseClicked

    private void txtPrecoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoTotalActionPerformed

    private void txtPrecoTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoTotalMouseClicked

    }//GEN-LAST:event_txtPrecoTotalMouseClicked

    private void txtPrecoTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoTotalFocusGained

    }//GEN-LAST:event_txtPrecoTotalFocusGained

    private void btnReservaLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaLimparActionPerformed
        txtCPF.setText("");
        txtNomeCliente.setText("");
        cmbCategoria.setSelectedItem("Selecione");
        cmbNomeCarro.setSelectedItem("Selecione");
        txtDataReserva.setText("");
        txtHoraReserva.setText("");
        txtDataEntrega.setText("");
        txtHoraEntrega.setText("");
        txtPreco.setText("");
        cmbTipoReserva.setSelectedItem("Selecione");
        txtPrecoTotal.setText("");

        modo = "Navegar";
        manipulaInterfaceReserva();
    }//GEN-LAST:event_btnReservaLimparActionPerformed

    private void btnReservaEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaEnviarActionPerformed
        int cpf = Integer.parseInt(txtCPF.getText()) ;
        String categoria =  cmbCategoria.getSelectedItem().toString();
        String nomeCarro = cmbNomeCarro.getSelectedItem().toString();
        double preco = Double.parseDouble(txtPreco.getText());
        String tipoReserva = cmbTipoReserva.getSelectedItem().toString();
        double precoTotal = Double.parseDouble(txtPrecoTotal.getText());

        if(modo.equals("Novo")){

            Reservas reservas = new Reservas(cpf,txtNomeCliente.getText(),categoria,nomeCarro,txtDataReserva.getText(), txtHoraReserva.getText(), txtDataEntrega.getText(),txtHoraEntrega.getText(), preco,tipoReserva,precoTotal);

            listaReservas.add(reservas);
        } else if(modo.equals("Editar")){
            int index = tblReserva.getSelectedRow();

            listaReservas.get(index).setCpf(cpf);
            listaReservas.get(index).setNomeCliente(txtNomeCliente.getText());
            listaReservas.get(index).setNomeCliente(categoria);
            listaReservas.get(index).setNomeCarro(nomeCarro);
            listaReservas.get(index).setDataReserva(txtDataReserva.getText());
            listaReservas.get(index).setHoraReserva(txtHoraReserva.getText());
            listaReservas.get(index).setDataEntrega(txtDataEntrega.getText());
            listaReservas.get(index).setHoraEntrega(txtHoraEntrega.getText());
            listaReservas.get(index).setPreco(preco);
            listaReservas.get(index).setTipoReserva(tipoReserva);
            listaReservas.get(index).setPrecoTotal(precoTotal);
        }
        loadTableReservas();
        modo = "Navegar";
        manipulaInterfaceReserva();
        txtCPF.setText("");
        txtNomeCliente.setText("");
        cmbCategoria.setSelectedItem("Selecione");
        cmbNomeCarro.setSelectedItem("Selecione");
        txtDataReserva.setText("");
        txtHoraReserva.setText("");
        txtDataEntrega.setText("");
        txtHoraEntrega.setText("");
        txtPreco.setText("");
        cmbTipoReserva.setSelectedItem("Selecione");
        txtPrecoTotal.setText("");
    }//GEN-LAST:event_btnReservaEnviarActionPerformed

    private void cmbTipoReservaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbTipoReservaPropertyChange

    }//GEN-LAST:event_cmbTipoReservaPropertyChange

    private void cmbTipoReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTipoReservaMouseClicked

    }//GEN-LAST:event_cmbTipoReservaMouseClicked

    private void cmbTipoReservaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoReservaItemStateChanged
        if(txtPreco.getText().length()>0){
        double preco = Double.parseDouble(txtPreco.getText());
        String tipoReserva = cmbTipoReserva.getSelectedItem().toString();

        if(tipoReserva.equals("RPA")){
            txtPrecoTotal.setText(Double.toString(preco * 0.95));

        } else if(tipoReserva.equals("RI")){
            txtPrecoTotal.setText(Double.toString(preco));

        }else {
            txtPrecoTotal.setText(Double.toString(preco));

        }
        }
    }//GEN-LAST:event_cmbTipoReservaItemStateChanged

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservaCarro;
    private javax.swing.JButton btnReservaCliente;
    private javax.swing.JButton btnReservaEditar;
    private javax.swing.JButton btnReservaEnviar;
    private javax.swing.JButton btnReservaExcluir;
    private javax.swing.JButton btnReservaLimpar;
    private javax.swing.JButton btnReservaNovo;
    private javax.swing.JButton btnReservaReserva;
    private javax.swing.JButton btnReservaSair;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbNomeCarro;
    private javax.swing.JComboBox<String> cmbTipoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReserva;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataEntrega;
    private javax.swing.JTextField txtDataReserva;
    private javax.swing.JTextField txtHoraEntrega;
    private javax.swing.JTextField txtHoraReserva;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoTotal;
    // End of variables declaration//GEN-END:variables
}
