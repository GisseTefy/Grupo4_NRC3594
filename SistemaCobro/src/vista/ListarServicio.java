package vista;

import configuracionTablas.GestionCeldas;
import configuracionTablas.GestionEncabezadoTabla;
import controlador.CRUD;
import controlador.Paciente;
import controlador.Servicio;
import javax.swing.table.JTableHeader;

public class ListarServicio extends javax.swing.JFrame {

    private CRUD crud = new CRUD();
    private Servicio servicio = new Servicio();
    private boolean factura = false;
    private int numfilas = 0;

    public ListarServicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void listarSER() {
        factura = false;
        crud.listarServicio(jTableListado, "", false);
        jButtonFacturar.setText("Nuevo Servicio");
        jButtonListadoF.setEnabled(false);
        jButtonListadoF.setVisible(false);
        jLabelTitulo.setText("LISTADO DE SERVICIO");
        estiloTabla();
    }

    public void listarSERFAC() {
        factura = true;
        jButtonFacturar.setEnabled(false);
        jButtonListadoF.setEnabled(true);
        jButtonListadoF.setVisible(true);
        jLabelTitulo.setText("GENERAR FACTURA");
        estiloTabla();
    }

    public boolean isFactura() {
        return factura;
    }

    public void setFactura(boolean factura) {
        this.factura = factura;
    }

    public void estiloTabla() {
        jTableListado.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(5).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(6).setCellRenderer(new GestionCeldas("texto"));
        if (!factura) {
            jTableListado.getColumnModel().getColumn(7).setCellRenderer(new GestionCeldas("Buscar"));
            jTableListado.getColumnModel().getColumn(8).setCellRenderer(new GestionCeldas("Actualizar"));
            jTableListado.getColumnModel().getColumn(9).setCellRenderer(new GestionCeldas("Eliminar"));
        }

        jTableListado.getTableHeader().setReorderingAllowed(false);
        jTableListado.setRowHeight(30);

        jTableListado.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableListado.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableListado.getColumnModel().getColumn(6).setPreferredWidth(70);
        jTableListado.getColumnModel().getColumn(7).setPreferredWidth(30);
        if (!factura) {
            jTableListado.getColumnModel().getColumn(8).setPreferredWidth(30);
            jTableListado.getColumnModel().getColumn(9).setPreferredWidth(30);
        }

        JTableHeader encabezado = jTableListado.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezadoTabla());
        jTableListado.setTableHeader(encabezado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonFacturar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        jButtonListadoF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, 40));

        jTextFieldBusqueda.setBackground(new java.awt.Color(0, 153, 204));
        jTextFieldBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBusqueda.setBorder(null);
        jPanel5.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 290, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 35));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("LISTADO DE SERVICIOS");
        jPanel5.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/Line_Blanca.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 460));

        jPanel1.setBackground(new java.awt.Color(246, 245, 245));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButtonFacturar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonFacturar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonFacturar.setText("Facturar");
        jButtonFacturar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 65, 65), 3));
        jButtonFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturarActionPerformed(evt);
            }
        });

        jScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        jTableListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Servicio", "Codigo Medicamento", "Apellido Doctor", "Apellido Paciente", "Estado", "Fecha", "Precio", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableListadoMousePressed(evt);
            }
        });
        jTableListado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableListadoKeyReleased(evt);
            }
        });
        jScrollPane.setViewportView(jTableListado);

        jButtonListadoF.setBackground(new java.awt.Color(204, 204, 204));
        jButtonListadoF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonListadoF.setText("Listado Facturas");
        jButtonListadoF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 65, 65), 3));
        jButtonListadoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonListadoF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButtonListadoF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csr3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 710, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableListadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoMousePressed
        //Evento de presion Mouse
        int fila = jTableListado.getSelectedRow();
        int columnas = jTableListado.getSelectedColumn();
        int numCol = jTableListado.getColumnCount();
        if (factura == false) {
            if (columnas == 0 || columnas == numCol - 3) {
                this.setVisible(false);
                CRUServicio cRUServicio = new CRUServicio();
                cRUServicio.mostrarDatosE(crud.buscarServicio(new Servicio(), "SER_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
                cRUServicio.setVisible(true);
            } else if (columnas == numCol - 2) {
                this.setVisible(false);
                CRUServicio cRUServicio = new CRUServicio();
                cRUServicio.actualizarDatosE(crud.buscarServicio(new Servicio(), "SER_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
                cRUServicio.setVisible(true);
            } else if (columnas == numCol - 1) {

            }
        } else {
            if (columnas == numCol - 1) {
                if ((boolean) jTableListado.getValueAt(fila, numCol - 1)) {
                    numfilas--;
                } else {
                    numfilas++;
                }
                if (numfilas > 0) {
                    jButtonFacturar.setEnabled(true);
                } else {
                    jButtonFacturar.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_jTableListadoMousePressed

    private void jTableListadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoKeyReleased

    }//GEN-LAST:event_jTableListadoKeyReleased

    private void jButtonFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturarActionPerformed
        // Boton Facturar
        if (jButtonFacturar.getText().equals("Facturar")) {
            RealizarFactura realizarFactura = new RealizarFactura();
            String[][] registros = new String[numfilas][7];
            int filas = jTableListado.getRowCount();
            int aux = 0;
            int columnas = jTableListado.getColumnCount();
            for (int i = 0; i < filas; i++) {
                if ((boolean) jTableListado.getValueAt(i, columnas - 1)) {
                    registros[aux][0] = jTableListado.getValueAt(i, 0).toString();
                    realizarFactura.llenarMedicamentos(registros[aux][0]);
                    realizarFactura.llenarServicio(registros[aux][0]);
                    System.out.println("Dato 1: " + jTableListado.getValueAt(i, 0).toString());
                    registros[aux][1] = jTableListado.getValueAt(i, 1).toString();
                    System.out.println("Dato 2: " + jTableListado.getValueAt(i, 1).toString());
                    registros[aux][2] = jTableListado.getValueAt(i, 2).toString();
                    System.out.println("Dato 3: " + jTableListado.getValueAt(i, 2).toString());
                    registros[aux][3] = jTableListado.getValueAt(i, 3).toString();
                    System.out.println("Dato 4: " + jTableListado.getValueAt(i, 3).toString());
                    registros[aux][4] = jTableListado.getValueAt(i, 4).toString();
                    System.out.println("Dato 5: " + jTableListado.getValueAt(i, 4).toString());
                    registros[aux][5] = jTableListado.getValueAt(i, 5).toString();
                    System.out.println("Dato 6: " + jTableListado.getValueAt(i, 5).toString());
                    registros[aux][6] = jTableListado.getValueAt(i, 5).toString();
                    System.out.println("Dato 7: " + jTableListado.getValueAt(i, 6).toString());
                    aux++;
                }
            }
            this.setVisible(false);
            realizarFactura.setVisible(true);
            realizarFactura.llenarFactura(registros);
        }else{
          this.setVisible(false);
          CRUServicio cRUServicio = new CRUServicio();
          cRUServicio.setVisible(true);
        }
    }//GEN-LAST:event_jButtonFacturarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (factura == true) {
            System.out.println("Aqui");
            crud.listarServicio(jTableListado, jTextFieldBusqueda.getText(), factura);

        } else {
            //System.out.println("Aqui");
            String dato = jTextFieldBusqueda.getText();
            crud.listarServicio(jTableListado, dato, false);
            estiloTabla();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonListadoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoFActionPerformed
        // Boton listado Facturas
        this.setVisible(false);
        ListarFactura listarFactura = new ListarFactura();
        listarFactura.setVisible(true);
    }//GEN-LAST:event_jButtonListadoFActionPerformed

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
            java.util.logging.Logger.getLogger(ListarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonFacturar;
    private javax.swing.JButton jButtonListadoF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableListado;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
