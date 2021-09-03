package vista;

import controlador.Departamento;
import controlador.Validacion;
import controlador.CRUD;
import java.awt.Color;

public class CRUDepartamento extends javax.swing.JFrame {

    private Departamento departamento = new Departamento();
    private Validacion validacion = new Validacion();
    private Mensaje mensaje = new Mensaje();
    private CRUD crud = new CRUD();

    public CRUDepartamento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void mostrarDatosE(Departamento departamento) {
        llenarCampos(departamento);
        desactivarEdicion();
        jLabelTitulo.setText("MOSTRAR DEPARTAMENTO");
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setVisible(false);
    }

    public void actualizarDatosE(Departamento departamento) {
        this.departamento = departamento;
        llenarCampos(departamento);
        jLabelTitulo.setText("ACTUALIZAR DEPARTAMENTO");
        jButtonRegistrar.setText("Actualizar");
    }

    private void desactivarEdicion() {

        jTextFieldNombre.setEditable(false);
        jTextPaneDescrip.setEditable(false);
    }

    private void llenarCampos(Departamento departamento) {
        jTextFieldNombre.setText(departamento.getNombreDep());
        jTextPaneDescrip.setText(departamento.getDescripcion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDescrip = new javax.swing.JTextArea();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setForeground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 204));
        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("CREAR NUEVO DEPARTAMENTO");
        jPanel6.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csrbc.png"))); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(65, 65, 65));
        jPanel1.setLayout(null);

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");
        jPanel1.add(jLabelNombre);
        jLabelNombre.setBounds(20, 20, 50, 30);

        jTextFieldNombre.setBackground(new java.awt.Color(64, 64, 64));
        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setBorder(null);
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(80, 20, 410, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/Line_Blanca.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 410, 14);

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 510, 70));

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripción :");
        jPanel2.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextPaneDescrip.setBackground(new java.awt.Color(239, 239, 239));
        jTextPaneDescrip.setColumns(20);
        jTextPaneDescrip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextPaneDescrip.setForeground(new java.awt.Color(51, 51, 51));
        jTextPaneDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextPaneDescrip);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 470, 130));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 510, 190));

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 580, 290));

        jButtonRegistrar.setBackground(new java.awt.Color(239, 239, 239));
        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(null);
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
        jPanel6.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 110, 40));

        jButtonSalir.setBackground(new java.awt.Color(239, 239, 239));
        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
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
        jPanel6.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        //Boton Añadir
        if (!validacion.camposVacios(jTextFieldNombre.getText())) {
            departamento.setNombreDep(jTextFieldNombre.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Nombre no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextPaneDescrip.getText())) {
            departamento.setDescripcion(jTextPaneDescrip.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Descripción no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (jButtonRegistrar.getText().equals("Registrar")) {
            departamento.setCodigoDep("DEP" + crud.obtenerCodigo("departamento"));
            crud.registrarDepartamento(departamento);
            mensaje.setExito(true);
            mensaje.redicListadoDep();
            mensaje.interExito();
            mensaje.mostrarM("Registro EXITOSO", "El registro se realizó exitosamente");
            this.setVisible(false);
        }else if(jButtonRegistrar.getText().equals("Actualizar")){
            crud.actualizarDepartamento(departamento);
            mensaje.setExito(true);
            mensaje.redicListadoDep();
            mensaje.interExito();
            mensaje.mostrarM("Actualizacion EXITOSO", "Se Actualizo el dato");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
        ListarDepartamentos listarDepartamentos = new ListarDepartamentos();
        listarDepartamentos.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        jButtonSalir.setBackground(new Color(168,168,168));
        //jButtonSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(new Color(239,239,239));
        //jButtonSalir.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jButtonSalirMouseExited

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
            java.util.logging.Logger.getLogger(CRUDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextArea jTextPaneDescrip;
    // End of variables declaration//GEN-END:variables
}
