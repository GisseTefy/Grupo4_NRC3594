package vista;

import configuracionTablas.GestionCeldas;
import configuracionTablas.GestionEncabezadoTabla;
import controlador.CRUD;
import controlador.Medicacion;
import javax.swing.table.JTableHeader;

public class ListarMedicacion extends javax.swing.JFrame {

    private CRUD crud = new CRUD();
    private Medicacion medicamento = new Medicacion();

    public ListarMedicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        crud.listarMedicacion(jTableListado, null);
        estiloTabla();
    }

    public void estiloTabla() {
        jTableListado.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(5).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(6).setCellRenderer(new GestionCeldas("Buscar"));
        jTableListado.getColumnModel().getColumn(7).setCellRenderer(new GestionCeldas("Actualizar"));
        jTableListado.getColumnModel().getColumn(8).setCellRenderer(new GestionCeldas("Eliminar"));

        jTableListado.getTableHeader().setReorderingAllowed(false);
        jTableListado.setRowHeight(30);

        jTableListado.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(4).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(5).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(6).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(7).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(8).setPreferredWidth(30);

        JTableHeader encabezado = jTableListado.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezadoTabla());
        jTableListado.setTableHeader(encabezado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE MEDICACION");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 20));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 35));

        jButtonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel5.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 280, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar: ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/Line_Blanca.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 460));

        jPanel6.setBackground(new java.awt.Color(246, 245, 245));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane.setBackground(new java.awt.Color(255, 255, 255));

        jTableListado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, "", null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableListado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
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

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Editar Medicamentos");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csr3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 710, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Sistema sistema = new Sistema();
        sistema.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private String[][] filtrarDatos(String criterio) {
        int numCol = jTableListado.getColumnCount();
        int numFila = 0;
        for (int i = 0; i <= jTableListado.getRowCount() - 1; i++) {
            if (jTableListado.getValueAt(i, 0).toString().equals(criterio)) {
                numFila++;
                
            }
        }
        String[][] datos = new String[numFila][numCol - 3];
        int aux =0;
        
        for (int i = 0; i <= jTableListado.getRowCount() - 1; i++) {
            ;
            if (jTableListado.getValueAt(i, 0).toString().equals(criterio)) {
                
                datos[aux][0] = jTableListado.getValueAt(i, 0).toString();
                datos[aux][1] = jTableListado.getValueAt(i, 1).toString();
                datos[aux][2] = jTableListado.getValueAt(i, 2).toString();
                datos[aux][3] = jTableListado.getValueAt(i, 3).toString();
                datos[aux][4] = jTableListado.getValueAt(i, 4).toString();
                datos[aux][5] = jTableListado.getValueAt(i, 5).toString();
                aux++;
            }
        }
        return datos;
    }
    private void jTableListadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoMousePressed
       /* int fila = jTableListado.getSelectedRow();
        int columnas = jTableListado.getSelectedColumn();
        int numCol = jTableListado.getColumnCount();
        
        if (columnas == 0 || columnas == numCol - 3) {
            String criterio = jTableListado.getValueAt(fila, 0).toString();
            String[] nombreC = {"Codigo Medicacion", "Codigo Servicio", "Nombre Servicio", "Nombre Medicamento", "Nombre Doctor", "Nombre Paciente"};
            String[][] datos = filtrarDatos(criterio);
            RUMedicacion rUMedicacion = new RUMedicacion(nombreC, datos);
            rUMedicacion.mostrarDatos();
            this.setVisible(false);
            rUMedicacion.setVisible(true);
        } else if (columnas == numCol - 2) {
            String criterio = jTableListado.getValueAt(fila, 0).toString();
            String[] nombreC = {"Codigo Medicacion", "Codigo Servicio", "Nombre Servicio", "Nombre Medicamento", "Nombre Doctor", "Nombre Paciente"};
            String[][] datos = filtrarDatos(criterio);
            RUMedicacion rUMedicacion = new RUMedicacion(nombreC, datos);
            rUMedicacion.actualizarDatos();
            this.setVisible(false);
            rUMedicacion.setVisible(true);
        } else if (columnas == numCol - 1) {
            boolean validar =false;
            validar = crud.eliminarDato("medicamento", "MDC_CODIGO", jTableListado.getValueAt(fila, 0).toString());
            Mensaje mensaje = new Mensaje();
            this.setVisible(false);
            mensaje.setExito(true);
            mensaje.redicListadoMDI();
            if(validar) mensaje.mostrarM("Dato eliminado", "El dato ha sido eliminado");
            else mensaje.mostrarM("ERROR EN LA ELIMINACION", "El medicamento esta en uso en un servicio, por favor retire el medicamento del servicio");

        } else {
        }*/
    }//GEN-LAST:event_jTableListadoMousePressed

    private void jTableListadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoKeyReleased

    }//GEN-LAST:event_jTableListadoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // Boton Buscar
        String dato = jTextFieldBusqueda.getText();
        crud.listarMedicacion(jTableListado, dato);
        estiloTabla();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarMedicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMedicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMedicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMedicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ListarMedicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableListado;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
