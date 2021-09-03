package vista;

import controlador.CRUD;
import controlador.Medicamento;
import controlador.Validacion;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUMedicamento extends javax.swing.JFrame {

    private CRUD crud = new CRUD();
    private Medicamento medicamento = new Medicamento();
    private Validacion validacion = new Validacion();
    private Mensaje mensaje = new Mensaje();

    public CRUMedicamento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void mostrarDatosE(Medicamento medicamento) {
        llenarCampos(medicamento);
        desactivarEdicion();
        jLabelTitulo.setText("MOSTRAR MEDICAMENTO");
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setVisible(false);
    }

    public void actualizarDatosE(Medicamento medicamento) {
        this.medicamento = medicamento;
        llenarCampos(medicamento);
        jLabelTitulo.setText("ACTUALIZAR MEDICAMENTO");
        jButtonRegistrar.setText("Actualizar");
    }

    private void desactivarEdicion() {

        jTextFieldNombre.setEditable(false);
        jTextFieldFabricante.setEditable(false);
        jTextAreaDescripcion.setEditable(false);
        jDateChooserExpedicion.setEnabled(false);
        jComboBoxVias.setEnabled(false);
    }

    private void llenarCampos(Medicamento medicamento) {
        jTextFieldNombre.setText(medicamento.getNombre());
        jTextFieldFabricante.setText(medicamento.getFrabricante());
        jTextAreaDescripcion.setText(medicamento.getDescripcion());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formato.parse(medicamento.getExpedicion());
            jDateChooserExpedicion.setDate(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CRUMedicamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBoxVias.setSelectedItem(medicamento.getAdmininistracion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelVias = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelExpedicion = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jComboBoxVias = new javax.swing.JComboBox<>();
        jDateChooserExpedicion = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");

        jLabelVias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelVias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVias.setText("Administración");

        jLabelFabricante.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelFabricante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFabricante.setText("Fabricante");

        jLabelExpedicion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelExpedicion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExpedicion.setText("Expedición");

        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldFabricante.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldFabricante.setForeground(new java.awt.Color(51, 51, 51));

        jComboBoxVias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxVias.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxVias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oral", "Rectal", "Sublingual", "Enteral", "Intramuscular", "Intravenosa", "Subcutánea", "Oftálmica", "Otica", "Peridural", "Intra-Articular" }));

        jDateChooserExpedicion.setForeground(new java.awt.Color(51, 51, 51));
        jDateChooserExpedicion.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelVias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxVias, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelExpedicion)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelFabricante)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFabricante)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelFabricante)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelVias)
                        .addComponent(jLabelExpedicion)
                        .addComponent(jComboBoxVias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserExpedicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextAreaDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 650, 320));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("REGISTRAR NUEVO MEDICAMENTO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csrbc.png"))); // NOI18N

        jButtonRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseExited(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelar.setText("Salir");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseExited(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // Boton Registrar 
        if (!validacion.camposVacios(jTextFieldNombre.getText())) {
            medicamento.setNombre(jTextFieldNombre.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Nombre no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextFieldFabricante.getText())) {
            medicamento.setFrabricante(jTextFieldFabricante.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Fabricante no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextAreaDescripcion.getText())) {
            medicamento.setDescripcion(jTextAreaDescripcion.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Descripcion no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (jDateChooserExpedicion.getDate() != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
            String expedicion = formatoFecha.format(jDateChooserExpedicion.getDate());
            medicamento.setExpedicion(expedicion);
        } else {
            validacion.setMensajeE("ERROR!. El campo Fecha de Expedición no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        medicamento.setAdmininistracion(jComboBoxVias.getSelectedItem().toString());
        if (jButtonRegistrar.getText().equals("Registrar")) {
            medicamento.setCodigo("MDC" + crud.obtenerCodigo("medicamento"));
            crud.registrarMedicamento(medicamento);
            mensaje.setExito(true);
            mensaje.redicListadoMDC();
            mensaje.interExito();
            mensaje.mostrarM("Registro EXITOSO", "El registro se realizó exitosamente");
            this.setVisible(false);
        } else if (jButtonRegistrar.getText().equals("Actualizar")) {
            crud.actualizarMedicamento(medicamento);
            mensaje.setExito(true);
            mensaje.redicListadoMDC();
            mensaje.interExito();
            mensaje.mostrarM("Actualización EXITOSO", "La actualización se realizó exitosamente");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Boton regresar
        this.setVisible(false);
        ListarMedicamento listarMedicamento = new ListarMedicamento();
        listarMedicamento.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseEntered
        jButtonCancelar.setBackground(new Color(168,168,168));
    }//GEN-LAST:event_jButtonCancelarMouseEntered

    private void jButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseExited
        jButtonCancelar.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_jButtonCancelarMouseExited

    private void jButtonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseEntered
        jButtonRegistrar.setBackground(new Color(168,168,168));
    }//GEN-LAST:event_jButtonRegistrarMouseEntered

    private void jButtonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseExited
        jButtonRegistrar.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_jButtonRegistrarMouseExited

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
            java.util.logging.Logger.getLogger(CRUMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxVias;
    private com.toedter.calendar.JDateChooser jDateChooserExpedicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelExpedicion;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
