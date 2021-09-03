package vista;

import controlador.CRUD;
import controlador.Empleado;
import controlador.Medicacion;
import controlador.Medicamento;
import controlador.Paciente;
import controlador.Servicio;
import controlador.Validacion;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CRUServicio extends javax.swing.JFrame {

    private CRUD crud = new CRUD();
    private Medicacion medicacion = new Medicacion();
    private Medicamento medicamento = new Medicamento();
    private Servicio servicio = new Servicio();
    private Validacion validacion = new Validacion();
    private Mensaje mensaje = new Mensaje();

    public CRUServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void mostrarDatosE(Servicio servicio) {
        llenarCampos(servicio);
        desactivarEdicion();
        jLabelTitulo.setText("MOSTRAR SERVICIOS");
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setVisible(false);
        jButtonAgregar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
    }

    public void actualizarDatosE(Servicio servicio) {
        this.servicio = servicio;
        llenarCampos(servicio);
        jLabelTitulo.setText("ACTUALIZAR SERVICIOS");
        jButtonRegistrar.setText("Actualizar");
    }

    private void desactivarEdicion() {
        jTextFieldNombreD.setEditable(false);
        jTextFieldNombreP.setEditable(false);
        jTextFieldNombreServicio.setEditable(false);
        jTextAreaPrescri.setEditable(false);
        jTextFieldPrecio.setEditable(false);
        jDateChooserFecha.setEnabled(false);
        jTableMedicacion.setEnabled(false);
    }

    private void llenarCampos(Servicio servicio) {
        Empleado empleado = new Empleado();
        Paciente paciente = new Paciente();
        crud.buscarEmpleado(empleado, "EMP_CODIGO", servicio.getCodigoEmpleado());
        crud.buscarPaciente(paciente, "PAC_CODIGO", servicio.getCodigoPaciente());

        jTextFieldNombreD.setText(empleado.getNombres());
        jTextFieldNombreP.setText(paciente.getNombres());
        jTextFieldNombreServicio.setText(servicio.getNombre());
        jTextAreaPrescri.setText(servicio.getDescripcion());
        jTextFieldPrecio.setText("" + servicio.getPrecio());
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formato.parse(servicio.getFecha());
            jDateChooserFecha.setDate(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CRUServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        llenarMedicamentos(servicio);
    }
    public void eliminarRegistrosMedicacion(Servicio servicio){
        for(int i = 1; i <=10; i++){
            if(crud.eliminarMedicacion("SER_CODIGO", servicio.getCodigoServicio(),"MDC_CODIGO", "MDC00" + i) == false){
                break;
            }
        }
    }
    public void llenarMedicamentos(Servicio servicio) {
        Medicacion medicacion = new Medicacion();
        DefaultTableModel model = (DefaultTableModel) jTableMedicacion.getModel();
        for (int i = 1; i < 10; i++) {
            medicacion = crud.buscarMedicacion(medicacion, "SER_CODIGO", servicio.getCodigoServicio(), "MDC_CODIGO", "MDC00" + i);
            if (medicacion == null) {
                break;
            } else {
                model.addRow(new Object[]{"", "", null, null, null});
                jTableMedicacion.getModel().setValueAt(medicacion.getMedicamento().getCodigo(), i - 1, 0);
                jTableMedicacion.getModel().setValueAt(medicacion.getMedicamento().getNombre(), i - 1, 1);
                jTableMedicacion.getModel().setValueAt(medicacion.getCantidad(), i - 1, 2);
                jTableMedicacion.getModel().setValueAt(medicacion.getPrecio(), i - 1, 3);
                medicacion = new Medicacion();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombreP = new javax.swing.JLabel();
        jTextFieldNombreP = new javax.swing.JTextField();
        jLabelNombreD = new javax.swing.JLabel();
        jTextFieldNombreD = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabelNombreServicio = new javax.swing.JLabel();
        jTextFieldNombreServicio = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelMedicacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicacion = new javax.swing.JTable();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelPrescrip = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPrescri = new javax.swing.JTextArea();
        jButtonRegresar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("REGISTRAR SERVICIO");
        jPanel5.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csrbc.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNombreP.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombreP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombreP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreP.setText("Nombre Paciente");

        jTextFieldNombreP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombrePActionPerformed(evt);
            }
        });

        jLabelNombreD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombreD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreD.setText("Nombre Doctor");

        jTextFieldNombreD.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setText("Fecha de Consulta");

        jDateChooserFecha.setForeground(new java.awt.Color(51, 51, 51));

        jLabelNombreServicio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelNombreServicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreServicio.setText("Nombre Servicio");

        jTextFieldNombreServicio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabelPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("Precio");

        jTextFieldPrecio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreP)
                            .addComponent(jLabelNombreD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreD, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreP)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPrecio))
                            .addComponent(jDateChooserFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFecha)
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreP)
                            .addComponent(jTextFieldNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelFecha)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombreD))
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPrecio)
                        .addComponent(jTextFieldNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNombreServicio))
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMedicacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelMedicacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedicacion.setText("Medicación");
        jPanel3.add(jLabelMedicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTableMedicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jTableMedicacion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableMedicacion.setForeground(new java.awt.Color(51, 51, 51));
        jTableMedicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "        Codigo", "        Nombre", "      Cantidad", "        Precio", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedicacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableMedicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMedicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableMedicacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableMedicacionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicacion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 550, 120));

        jButtonAgregar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, 28));

        jButtonEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 30));

        jPanel4.setBackground(new java.awt.Color(65, 65, 65));

        jLabelPrescrip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelPrescrip.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrescrip.setText("Prescripción");

        jTextAreaPrescri.setColumns(20);
        jTextAreaPrescri.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextAreaPrescri.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaPrescri.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPrescri);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelPrescrip)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPrescrip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 590, 500));

        jButtonRegresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegresar.setText("Salir");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 130, 40));

        jButtonRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // Boton de registrar
        ////////////////// REGISTRAR SERVICIO ////////////////////////////
        Empleado empleado = new Empleado();
        Paciente paciente = new Paciente();

        if (!validacion.validarApenNomb(jTextFieldNombreD.getText())) {
            //if(){}
            empleado = crud.buscarEmpleado(empleado, "ENT_NOMBRE", jTextFieldNombreD.getText());
            if (empleado != null) {
                String codigoD = empleado.getCodigoEmpleado();
                servicio.setCodigoEmpleado(codigoD);
            } else {
                mensaje.interError();
                mensaje.mostrarM("ERROR EN EL REGISTRO", "El Empleado ingresado no se encuetra registrado");
                return;
            }
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.validarApenNomb(jTextFieldNombreP.getText())) {
            paciente = crud.buscarPaciente(paciente, "ENT_NOMBRE", jTextFieldNombreP.getText());
            if (paciente != null) {
                String codigoP = paciente.getCodigoPaciente();
                servicio.setCodigoPaciente(codigoP);
            } else {
                mensaje.interError();
                mensaje.mostrarM("ERROR EN EL REGISTRO", "El Paciente ingresado no se encuetra registrado");
                return;
            }
        } else {
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextFieldNombreServicio.getText())) {
            servicio.setNombre(jTextFieldNombreServicio.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Nombre del Servicio no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (jDateChooserFecha.getDate() != null) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
            String fecha = formatoFecha.format(jDateChooserFecha.getDate());
            servicio.setFecha(fecha);
        } else {
            validacion.setMensajeE("ERROR!. El campo Fecha no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextAreaPrescri.getText())) {
            servicio.setDescripcion(jTextAreaPrescri.getText());
        } else {
            validacion.setMensajeE("ERROR!. El campo Prescripción no se encuentra llenado.");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        if (!validacion.camposVacios(jTextFieldPrecio.getText()) && validacion.soloNumero(jTextFieldPrecio.getText())) {
            servicio.setPrecio(Integer.parseInt(jTextFieldPrecio.getText()));
        } else {
            validacion.setMensajeE("ERROR!. El campo precio");
            mensaje.interError();
            mensaje.mostrarM("ERROR EN EL REGISTRO", validacion.getMensajeE());
            return;
        }
        servicio.setEstado("ACTIVO");
        if(jButtonRegistrar.getText().equals("Registrar")){
            servicio.setCodigoServicio("SER" + crud.obtenerCodigo("servicio"));
            servicio.setCodigoMedicacion("MDI" + crud.obtenerCodigo("medicacion"));
            crud.registrarServicio(servicio);
        }else if(jButtonRegistrar.getText().equals("Actualizar")){
            eliminarRegistrosMedicacion(servicio);
            crud.actualizarServicio(servicio);
        }   


        ////////////////// REGISTRAR MEDICACION ////////////////////////////
        String codigoMDC = "";
        int fils = jTableMedicacion.getModel().getRowCount();
        int cantidad = 0;
        float precio = 0;

        for (int i = 0; i < fils; i++) {
            codigoMDC = (String) jTableMedicacion.getModel().getValueAt(i, 0);
            System.out.println("codigoMDC: " + codigoMDC);
            cantidad = (int) jTableMedicacion.getModel().getValueAt(i, 2);
            System.out.println("cantidad: " + cantidad);
            precio = (float) jTableMedicacion.getModel().getValueAt(i, 3);
            System.out.println("precio: " + precio);
            medicamento = crud.buscarMedicamento(medicamento, "MDC_CODIGO", codigoMDC);
            System.out.println("CodigoMediacamento: " + medicacion.getCodigoMedicacion());
            medicacion.registrarMedicacion(servicio.getCodigoMedicacion(), servicio, medicamento, cantidad, precio);
            crud.registrarMedicacion(medicacion);
        }

        mensaje.setExito(true);
        mensaje.redicListadoSER();
        if(jButtonRegistrar.getText().equals("Registrar")){
            mensaje.interExito();
            mensaje.mostrarM("Registro EXITOSO", "El registro se realizó exitosamente"); 
        }else{
            mensaje.interExito();
            mensaje.mostrarM("ACTUALIZACIÓN EXITOSO", "La actualización se realizó exitosamente");
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMedicacion.getModel();
        model.addRow(new Object[]{"", "", null, null, null});
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int fils = jTableMedicacion.getModel().getRowCount();
        for (int i = 0; i < fils; i++) {
            System.out.println(":" + jTableMedicacion.getValueAt(i, 4));
            if (jTableMedicacion.getValueAt(i, 4) != null) {
                ((DefaultTableModel) jTableMedicacion.getModel()).removeRow(i);
                System.out.println("i: " + i);
                i--;
                fils = jTableMedicacion.getModel().getRowCount();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableMedicacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableMedicacionFocusGained
        int fila = jTableMedicacion.getSelectedRow();
        String nombreMedicamento = (String) jTableMedicacion.getValueAt(fila, 1);
        medicamento = crud.buscarMedicamento(medicamento, "MDC_NOMBRE", nombreMedicamento);
        jTableMedicacion.setValueAt(medicamento.getCodigo(), fila, 0);
    }//GEN-LAST:event_jTableMedicacionFocusGained

    private void jTableMedicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableMedicacionFocusLost
        int fila = jTableMedicacion.getSelectedRow();
        String nombreMedicamento = (String) jTableMedicacion.getValueAt(fila, 1);
        medicamento = crud.buscarMedicamento(medicamento, "MDC_NOMBRE", nombreMedicamento);
        jTableMedicacion.setValueAt(medicamento.getCodigo(), fila, 0);
    }//GEN-LAST:event_jTableMedicacionFocusLost

    private void jTextFieldNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombrePActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        this.setVisible(false);
        ListarServicio listarServicio = new ListarServicio();
        listarServicio.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(CRUServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMedicacion;
    private javax.swing.JLabel jLabelNombreD;
    private javax.swing.JLabel jLabelNombreP;
    private javax.swing.JLabel jLabelNombreServicio;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelPrescrip;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMedicacion;
    private javax.swing.JTextArea jTextAreaPrescri;
    private javax.swing.JTextField jTextFieldNombreD;
    private javax.swing.JTextField jTextFieldNombreP;
    private javax.swing.JTextField jTextFieldNombreServicio;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
