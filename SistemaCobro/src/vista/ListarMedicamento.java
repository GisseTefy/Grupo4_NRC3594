package vista;

import configuracionTablas.GestionCeldas;
import configuracionTablas.GestionEncabezadoTabla;
import controlador.CRUD;
import controlador.ColorearFilas;
import controlador.Medicamento;
import java.awt.event.KeyEvent;
import javax.swing.table.JTableHeader;

public class ListarMedicamento extends javax.swing.JFrame {

    private CRUD crud = new CRUD();
    private Medicamento medicamento = new Medicamento();

    public ListarMedicamento() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        crud.listarMedicamento(jTableListado, null);
        estiloTabla();
    }

    public void estiloTabla() {
        jTableListado.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("Buscar"));
        jTableListado.getColumnModel().getColumn(5).setCellRenderer(new GestionCeldas("Actualizar"));
        jTableListado.getColumnModel().getColumn(6).setCellRenderer(new GestionCeldas("Eliminar"));

        jTableListado.getTableHeader().setReorderingAllowed(false);
        jTableListado.setRowHeight(30);

        jTableListado.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableListado.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(3).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(4).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(5).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(6).setPreferredWidth(30);

        JTableHeader encabezado = jTableListado.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezadoTabla());
        jTableListado.setTableHeader(encabezado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jLabelDescip = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE MEDICAMENTOS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextFieldBusqueda.setBackground(new java.awt.Color(0, 153, 204));
        jTextFieldBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBusqueda.setBorder(null);
        jPanel5.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 290, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/Line_Blanca.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 10));

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

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaDescrip.setColumns(20);
        jTextAreaDescrip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jLabelDescip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelDescip.setText("Descripción: ");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Registrar Medicamento");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 65, 65), 3));
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
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescip)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csr3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 710, 460));

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
        if (columnas == 0 || columnas == numCol - 3) {
            CRUMedicamento cRUMedicamento = new CRUMedicamento();
            this.setVisible(false);
            cRUMedicamento.mostrarDatosE(crud.buscarMedicamento(new Medicamento(), "MDC_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
            cRUMedicamento.setVisible(true);
        } else if (columnas == numCol - 2) {
            CRUMedicamento cRUMedicamento = new CRUMedicamento();
            this.setVisible(false);
            cRUMedicamento.actualizarDatosE(crud.buscarMedicamento(new Medicamento(), "MDC_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
            cRUMedicamento.setVisible(true);
        } else if (columnas == numCol - 1) {
            crud.eliminarDato("medicacion", "MDI_CODIGO", jTableListado.getValueAt(fila, 0).toString());
            Mensaje mensaje = new Mensaje();
            mensaje.setExito(true);
            mensaje.redicListadoMDI();
            mensaje.interExito();
            mensaje.mostrarM("Dato eliminado", "El dato ha sido eliminado");
            this.setVisible(false);
        } else {
            medicamento = crud.buscarMedicamento(medicamento, "MDC_CODIGO", jTableListado.getValueAt(fila, 0).toString());
            jTextAreaDescrip.setText(medicamento.getDescripcion());
        }
    }//GEN-LAST:event_jTableListadoMousePressed

    private void jTableListadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoKeyReleased
        //Envento de presion Teclado
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            int fila = jTableListado.getSelectedRow();
            int columnas = jTableListado.getColumnCount() - 1;
            medicamento = crud.buscarMedicamento(medicamento, "MDC_CODIGO", jTableListado.getValueAt(fila, 0).toString());
            jTextAreaDescrip.setText(medicamento.getDescripcion());
        }
    }//GEN-LAST:event_jTableListadoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CRUMedicamento cRUMedicamento = new CRUMedicamento();
        cRUMedicamento.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // Buscar Medicamento
        String dato = jTextFieldBusqueda.getText();
        crud.listarMedicamento(jTableListado, dato);
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
            java.util.logging.Logger.getLogger(ListarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMedicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarMedicamento().setVisible(true);
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
    private javax.swing.JLabel jLabelDescip;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListado;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
