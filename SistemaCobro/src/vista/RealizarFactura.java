package vista;

import controlador.CRUD;
import controlador.Paciente;
import controlador.Servicio;
import controlador.Medicacion;
import controlador.Medicamento;
import controlador.Factura;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

public class RealizarFactura extends javax.swing.JFrame {

    private Paciente paciente = new Paciente();
    private Servicio sercicio = new Servicio();
    private Medicacion medicacion = new Medicacion();
    private Medicamento medicamento = new Medicamento();
    private CRUD crud = new CRUD();
    private Mensaje mensaje = new Mensaje();
    private float subTotal = 0;
    private float IVA = 12;
    private float total = 0;

    public RealizarFactura() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //llenarFactura(datos);
        //llenarServicio(datos);
        //llenarMedicamento(datos[0][0])
    }

    private String fechaActural() {
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        return "" + dia + "/" + (mes + 1) + "/" + año;
    }

    public void llenarFactura(String[][] datos) {
        paciente = crud.buscarPaciente(paciente, "ENT_APELLI", datos[0][3]);
        jTextFieldApellidos.setText(paciente.getApellidos());
        jTextFieldNombre.setText(paciente.getNombres());
        jTextFieldCedula.setText(paciente.getCedula());
        jTextFieldFecha.setText(fechaActural());
        jTextFielSubT.setText("" + subTotal);
        jTextFieldIVA.setText(IVA + "%");
        total = ((subTotal * IVA) / (100)) * subTotal;
        jTextFieldTotal.setText(total + "");
    }

    public void llenarServicio(String datos) {
        int numFilas = jTableListado.getRowCount();
        Servicio servicio = new Servicio();
        DefaultTableModel model = (DefaultTableModel) jTableListado.getModel();
        servicio = crud.buscarServicio(servicio, "SER_CODIGO", datos);
        if (servicio != null) {
            model.addRow(new Object[]{"", "", "", ""});
            jTableListado.getModel().setValueAt(servicio.getCodigoServicio(), numFilas, 0);
            jTableListado.getModel().setValueAt(servicio.getNombre(), numFilas, 1);
            jTableListado.getModel().setValueAt(1, numFilas, 2);
            jTableListado.getModel().setValueAt(servicio.getPrecio(), numFilas, 3);
            subTotal = subTotal + servicio.getPrecio();
            System.out.println("subTotal: " + subTotal);
        }
    }

    public void llenarMedicamentos(String codigoSer) {
        Medicacion medicacion = new Medicacion();
        int numFilas = jTableListado.getRowCount();
        System.out.println("numFilas: " + numFilas);
        DefaultTableModel model = (DefaultTableModel) jTableListado.getModel();
        for (int i = 1; i < 10; i++) {
            medicacion = crud.buscarMedicacion(medicacion, "SER_CODIGO", codigoSer, "MDC_CODIGO", "MDC00" + i);
            if (medicacion == null) {
                break;
            } else {
                model.addRow(new Object[]{"", "", "", ""});
                jTableListado.getModel().setValueAt(medicacion.getMedicamento().getCodigo(), numFilas + i - 1, 0);
                jTableListado.getModel().setValueAt(medicacion.getMedicamento().getNombre(), numFilas + i - 1, 1);
                jTableListado.getModel().setValueAt(medicacion.getCantidad(), numFilas + i - 1, 2);
                jTableListado.getModel().setValueAt(medicacion.getPrecio(), numFilas + i - 1, 3);
                //System.out.println("a: "+(float)medicacion.getCantidad());
                //System.out.println("b: "+medicacion.getPrecio());
                // System.out.println("a*b: "+(float)medicacion.getCantidad()*medicacion.getPrecio());
                subTotal = subTotal + medicacion.getCantidad() * medicacion.getPrecio();
                //System.out.println("subTotal: "+subTotal);
                medicacion = new Medicacion();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDatosClientes = new javax.swing.JLabel();
        jLabelCodigoFac = new javax.swing.JLabel();
        jLabelEcuador = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelTituloFac = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelBaseImp = new javax.swing.JLabel();
        jLabelIva = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextFielSubT = new javax.swing.JTextField();
        jTextFieldIVA = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonRealizarPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(51, 51, 51));
        jLabelApellido.setText("Apellidos:");
        jPanel4.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabelNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setText("Nombres:");
        jPanel4.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelDatosClientes.setText("DATOS CLIENTE");
        jPanel4.add(jLabelDatosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabelCodigoFac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCodigoFac.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCodigoFac.setText("CODIGO FACTURA: F-0000009/2021");
        jPanel4.add(jLabelCodigoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelEcuador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelEcuador.setForeground(new java.awt.Color(51, 51, 51));
        jLabelEcuador.setText("Avenida general Enriquez e Isla Santiago");
        jPanel4.add(jLabelEcuador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jTextFieldApellidos.setEditable(false);
        jTextFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldApellidos.setBorder(null);
        jPanel4.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 210, -1));

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldNombre.setBorder(null);
        jPanel4.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, -1));

        jLabelTituloFac.setBackground(new java.awt.Color(0, 153, 204));
        jLabelTituloFac.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTituloFac.setForeground(new java.awt.Color(0, 153, 204));
        jLabelTituloFac.setText("FACTURA");
        jPanel4.add(jLabelTituloFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFecha.setText("Fecha Factura");
        jPanel4.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 90, -1));

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldFecha.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldFecha.setBorder(null);
        jPanel4.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 190, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csr3.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Teléfono: 02-3829500 ");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cédula: ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jTextFieldCedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldCedula.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldCedula.setBorder(null);
        jPanel4.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("info@clinicasanrafael.ec");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 150, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 220));

        jTableListado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableListado.setForeground(new java.awt.Color(51, 51, 51));
        jTableListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTableListado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 244, 641, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelBaseImp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelBaseImp.setForeground(new java.awt.Color(51, 51, 51));
        jLabelBaseImp.setText("SUB TOTAL");

        jLabelIva.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIva.setForeground(new java.awt.Color(51, 51, 51));
        jLabelIva.setText("IVA");

        jLabelTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTotal.setText("Total");

        jTextFielSubT.setEditable(false);
        jTextFielSubT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFielSubT.setForeground(new java.awt.Color(51, 51, 51));

        jTextFieldIVA.setEditable(false);
        jTextFieldIVA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldIVA.setForeground(new java.awt.Color(51, 51, 51));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBaseImp)
                    .addComponent(jLabelIva)
                    .addComponent(jLabelTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFielSubT)
                    .addComponent(jTextFieldIVA)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBaseImp)
                    .addComponent(jTextFielSubT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIva)
                    .addComponent(jTextFieldIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 640, 150));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));

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

        jButtonRealizarPago.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRealizarPago.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRealizarPago.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRealizarPago.setText("Realizar Pago");
        jButtonRealizarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRealizarPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRealizarPagoMouseExited(evt);
            }
        });
        jButtonRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(jButtonRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 662, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        jButtonSalir.setBackground(new Color(168, 168, 168));
    }//GEN-LAST:event_jButtonSalirMouseEntered

    private void jButtonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseExited
        jButtonSalir.setBackground(new Color(239, 239, 239));
    }//GEN-LAST:event_jButtonSalirMouseExited

    private void jButtonRealizarPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRealizarPagoMouseEntered
        jButtonRealizarPago.setBackground(new Color(168, 168, 168));
    }//GEN-LAST:event_jButtonRealizarPagoMouseEntered

    private void jButtonRealizarPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRealizarPagoMouseExited
        jButtonRealizarPago.setBackground(new Color(239, 239, 239));
    }//GEN-LAST:event_jButtonRealizarPagoMouseExited

    private void jButtonRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarPagoActionPerformed
        // Boton realizar Pago
        //String codigoServicio = "", codigoMedicamento = "";
        String codigoServicio = "";
        Servicio servicio = new Servicio();
        //Medicacion medicacion = new Medicacion();
        Factura factura = new Factura();
        factura.setCodigoFac("FAC" + crud.obtenerCodigo("facturacion"));
        factura.setFechaFac(jTextFieldFecha.getText());
        factura.setObservacion("Ninguna");
        factura.setSubtotal(Float.parseFloat(jTextFielSubT.getText()));
        factura.setTotal(Float.parseFloat(jTextFieldTotal.getText()));

        for (int i = 0; i < jTableListado.getRowCount(); i++) {
            codigoServicio = jTableListado.getValueAt(i, 0).toString();
            if (codigoServicio.substring(0, 3).equals("SER")) {
                servicio = crud.buscarServicio(servicio, "SER_CODIGO", codigoServicio);
                servicio.setEstado("Finalizado");
                factura.setServicio(servicio);
                crud.actualizarServicio(servicio);
                crud.registrarFactura(factura);
            }
        }

        /*for (int i = 0; i < jTableListado.getRowCount(); i++) {
            codigoServicio = jTableListado.getValueAt(i, 0).toString();
            if (codigoServicio.substring(0, 3).equals("SER")) {
                servicio = crud.buscarServicio(servicio, "SER_CODIGO", codigoServicio);
                eliminarMedicamentos(servicio);
                crud.eliminarDato("servicio", "SER_CODIGO", servicio.getCodigoServicio());
            }
        }*/
        mensaje.redicListadoSERFAC();
        mensaje.setExito(true);
        mensaje.interExito();
        mensaje.mostrarM("PROCESO EXITOSO", "El proceso finalizo CORRECTAMENTE !!");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRealizarPagoActionPerformed
    /*
    private void eliminarMedicamentos(Servicio servicio) {
        for (int i = 1; i <= 10; i++) {
            if (crud.eliminarMedicacion("SER_CODIGO", servicio.getCodigoServicio(), "MDC_CODIGO", "MDC00" + i) == false) {
                break;
            }
        }
    }
     */
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
            java.util.logging.Logger.getLogger(RealizarFactura.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarFactura.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarFactura.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarFactura.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarPago;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBaseImp;
    private javax.swing.JLabel jLabelCodigoFac;
    private javax.swing.JLabel jLabelDatosClientes;
    private javax.swing.JLabel jLabelEcuador;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIva;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTituloFac;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListado;
    private javax.swing.JTextField jTextFielSubT;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldIVA;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
