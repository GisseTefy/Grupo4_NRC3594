package vista;

import controlador.Paciente;
import controlador.Validacion;
import controlador.CRUD;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUPaciente extends javax.swing.JFrame {

    private Paciente paciente = new Paciente();
    private Validacion validacion = new Validacion();
    private Mensaje mensaje = new Mensaje();
    private CRUD crud = new CRUD();

    public CRUPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void mostrarDatosE(Paciente paciente) {
        llenarCampos(paciente);
        desactivarEdicion();
        jLabelTitulo.setText("MOSTRAR PACIENTE");
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setVisible(false);
    }

    public void actualizarDatosE(Paciente paciente) {
        this.paciente = paciente;
        llenarCampos(paciente);
        jLabelTitulo.setText("ACTUALIZAR PACIENTE");
        jButtonRegistrar.setText("Actualizar");
    }

    private void desactivarEdicion() {
        jTextFieldApellidos.setEditable(false);
        jTextFieldNombres.setEditable(false);
        jTextFieldCedula.setEditable(false);
        jTextFieldCorreo.setEditable(false);
        jTextFieldTelef.setEditable(false);
        jTextFieldDireccion.setEditable(false);
        jTextPaneDiagnostico.setEditable(false);
        jDateChooserCalendario.setEnabled(false);
        jComboBoxEstado.setEnabled(false);
        jComboBoxHabitacion.setEnabled(false);
    }

    private void llenarCampos(Paciente paciente) {
        jTextFieldApellidos.setText(paciente.getApellidos());
        jTextFieldNombres.setText(paciente.getNombres());
        jTextFieldCedula.setText(paciente.getCedula());
        jTextFieldCorreo.setText(paciente.getCorreo());
        jTextFieldTelef.setText(paciente.getTelefono());
        jTextFieldDireccion.setText(paciente.getDireccion());
        jTextPaneDiagnostico.setText(paciente.getDiagnostico());
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(paciente.getFechaNac());
            jDateChooserCalendario.setDate(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CRUPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBoxEstado.setSelectedItem(paciente.getEstado());
        jComboBoxHabitacion.setSelectedItem(paciente.getHabitacion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelFechaN = new javax.swing.JLabel();
        jDateChooserCalendario = new com.toedter.calendar.JDateChooser();
        jLabelTelef = new javax.swing.JLabel();
        jTextFieldTelef = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelHabitacion = new javax.swing.JLabel();
        jLabeEstado = new javax.swing.JLabel();
        jComboBoxHabitacion = new javax.swing.JComboBox<>();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabelDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDiagnostico = new javax.swing.JTextPane();
        jButtonSalir = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("REGISTRAR NUEVO PACIENTE");
        jPanel7.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csrbc.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelApellidos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellidos.setText("Apellidos");
        jPanel1.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jTextFieldApellidos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 172, -1));

        jLabelCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("N. Cedula");
        jPanel1.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jTextFieldCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldCedula.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 172, -1));

        jLabelNombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombres.setText("Nombres");
        jPanel1.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 20));

        jTextFieldNombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 200, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 100));

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("Correo");
        jPanel2.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        jTextFieldCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 178, -1));

        jLabelDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Dirección");
        jPanel2.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        jTextFieldDireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 178, -1));

        jLabelFechaN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelFechaN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaN.setText("Fecha de Nacimiento");
        jPanel2.add(jLabelFechaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        jDateChooserCalendario.setForeground(new java.awt.Color(51, 51, 51));
        jDateChooserCalendario.setDateFormatString("dd-MM-yyyy");
        jPanel2.add(jDateChooserCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, -1));

        jLabelTelef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTelef.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelef.setText("N. Telef");
        jPanel2.add(jLabelTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jTextFieldTelef.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldTelef.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jTextFieldTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 200, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 100));

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHabitacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHabitacion.setText("Habitación asignada");
        jPanel3.add(jLabelHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabeEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabeEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabeEstado.setText("Estado");
        jPanel3.add(jLabeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jComboBoxHabitacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxHabitacion.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HAB001", "HAB002", "HAB003", "HAB004", "HAB005", "HAB006", "HAB007", "HAB008", "HAB009", "HAB010" }));
        jPanel3.add(jComboBoxHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 88, -1));

        jComboBoxEstado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBoxEstado.setForeground(new java.awt.Color(51, 51, 51));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Espera", "Finalizado" }));
        jPanel3.add(jComboBoxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 156, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 560, 60));

        jPanel4.setBackground(new java.awt.Color(65, 65, 65));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDiagnostico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDiagnostico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiagnostico.setText("Diagnóstico");
        jPanel4.add(jLabelDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jTextPaneDiagnostico.setBorder(null);
        jTextPaneDiagnostico.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextPaneDiagnostico.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTextPaneDiagnostico);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 530, 90));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 560, 150));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 480));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseExited(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 123, 34));

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
        jPanel7.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 128, 34));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        //Boton Registrar
        if (!validacion.validarApenNomb(jTextFieldApellidos.getText())) {
            paciente.setApellidos(jTextFieldApellidos.getText());
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.validarApenNomb(jTextFieldNombres.getText())) {
            paciente.setNombres(jTextFieldNombres.getText());
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.validarCedula(jTextFieldCedula.getText())) {
            paciente.setCedula(jTextFieldCedula.getText());
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.validarCorreo(jTextFieldCorreo.getText())) {
            paciente.setCorreo(jTextFieldCorreo.getText());
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.validarTelf(jTextFieldTelef.getText())) {
            paciente.setTelefono(jTextFieldTelef.getText());
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (jDateChooserCalendario.getDate() != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
            String fechaN = formatoFecha.format(jDateChooserCalendario.getDate());
            paciente.setFechaNac(fechaN);
        } else {
            validacion.setMensajeE("ERROR!. El campo Fecha de Nacimiento no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextFieldDireccion.getText())) {
            paciente.setDireccion(jTextFieldDireccion.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Dirección no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextPaneDiagnostico.getText())) {
            paciente.setDiagnostico(jTextPaneDiagnostico.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Diagnostico no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        paciente.setHabitacion(jComboBoxHabitacion.getSelectedItem().toString());
        paciente.setEstado(jComboBoxEstado.getSelectedItem().toString());

        if (jButtonRegistrar.getText().equals("Registrar")) {
            paciente.setCodigoPaciente("PAC" + crud.obtenerCodigo("paciente"));
            crud.registrarPaciente(paciente);
            mensaje.setExito(true);
            mensaje.redicListadoPAC();
            mensaje.interExito();
            mensaje.mostrarM("Registro EXITOSO", "El registro se realizó exitosamente");
            this.setVisible(false);
        } else if (jButtonRegistrar.getText().equals("Actualizar")) {
            crud.actualizarPaciente(paciente);
            mensaje.setExito(true);
            mensaje.redicListadoPAC();
            mensaje.interExito();
            mensaje.mostrarM("Actualización EXITOSO", "La actualización se realizó exitosamente");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
        ListarPacientes listarPacientes = new ListarPacientes();
        listarPacientes.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseEntered
        jButtonRegistrar.setBackground(new Color(168,168,168));
    }//GEN-LAST:event_jButtonRegistrarMouseEntered

    private void jButtonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseExited
        jButtonRegistrar.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_jButtonRegistrarMouseExited

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        jButtonSalir.setBackground(new Color(168,168,168));
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_jButtonSalirMouseExited

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
            java.util.logging.Logger.getLogger(CRUPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxHabitacion;
    private com.toedter.calendar.JDateChooser jDateChooserCalendario;
    private javax.swing.JLabel jLabeEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDiagnostico;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaN;
    private javax.swing.JLabel jLabelHabitacion;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelTelef;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldTelef;
    private javax.swing.JTextPane jTextPaneDiagnostico;
    // End of variables declaration//GEN-END:variables
}
