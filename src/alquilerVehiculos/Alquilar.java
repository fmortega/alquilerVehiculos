package alquilerVehiculos;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Alquilar extends javax.swing.JPanel {

    static int dias;
    String matricula;
    double preciovehiculo;
    DefaultTableModel model;
    String tipo;
    Vehiculo vehiculo;
    double preciofinal;
    double preciomicrobus = 2;

    public Alquilar() {

        initComponents();
        model = (DefaultTableModel) tablaReporte.getModel();

        btnGuardar.setEnabled(false);
    }

    public void limpiar() {
        txtDias.setText("");
        txtMatricula.setText("");
        combo.setSelectedIndex(0);
    }

    public boolean validacion() {
        return !(txtDias.getText().isEmpty() || txtMatricula.getText().isEmpty());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        lblerror = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setName("alquila"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alquiler de vehiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setAlignmentY(5.0F);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Coche", "Microbus", "Furgoneta Carga", "Camion" }));
        combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMouseClicked(evt);
            }
        });

        jLabel1.setText("Tipo Vehiculo");

        btnGuardar.setText("Guargar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Matricula");

        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaKeyTyped(evt);
            }
        });

        jLabel3.setText("Dias");

        txtDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tablaReporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehiculo", "Matricula", "Dias", "Precio"
            }
        ));
        tablaReporte.setAlignmentX(10.0F);
        tablaReporte.setAlignmentY(5.0F);
        tablaReporte.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tablaReporte.setEnabled(false);
        tablaReporte.setRowHeight(25);
        tablaReporte.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaReporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        matricula = txtMatricula.getText();
        dias = Integer.parseInt(txtDias.getText());
        tipo = (String) combo.getSelectedItem();

        switch (tipo) {
            case "Coche":
                vehiculo = new Coche(matricula, tipo, dias, 1.5);
                vehiculo.setTipoVehiculo("Coche");
                preciofinal = vehiculo.calculaPrecio(1.5, dias);
                break;
            case "Microbus":
                vehiculo = new Microbus(2, matricula, tipo, dias);
                vehiculo.setTipoVehiculo("Microbus");
                preciofinal = vehiculo.calculaPrecio(1.5 + preciomicrobus, dias);

                break;
            case "Furgoneta Carga":
                vehiculo.setTipoVehiculo("Furgoneta Carga");
                vehiculo = new Furgoneta(matricula, tipo, dias);
                preciofinal = vehiculo.calculaPrecio(dias);
                break;
            case "Camion":
                vehiculo.setTipoVehiculo("Camion");
                vehiculo = new Camion(matricula, tipo, dias);
                preciofinal = vehiculo.calculaPrecio(dias);

                break;
            default:

                break;
        }

        vehiculo.setDias(dias);
        vehiculo.setMatricula(matricula);
        Object[] fila = new Object[4];
        fila[0] = vehiculo.getTipoVehiculo();

        fila[1] = vehiculo.getMatricula();

        fila[2] = vehiculo.getDias();

        fila[3] = preciofinal;
        model.addRow(fila);

        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();

        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tablaReporte.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        tablaReporte.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaReporte.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        tablaReporte.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);

        limpiar();
        btnGuardar.setEnabled(false);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMatriculaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDias.requestFocus();

        }

        if (validacion()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

    }//GEN-LAST:event_txtMatriculaKeyReleased

    private void txtMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaKeyTyped
        Character c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
        if (txtMatricula.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtMatriculaKeyTyped

    private void txtDiasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasKeyReleased

        if (validacion()) {
            btnGuardar.setEnabled(true);
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                btnGuardar.doClick();

            }
        } else {
            btnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_txtDiasKeyReleased

    private void comboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMouseClicked
        if (validacion()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_comboMouseClicked

    private void txtDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtDiasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblerror;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
