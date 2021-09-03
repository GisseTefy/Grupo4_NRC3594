package vista;

import configuracionTablas.GestionCeldas;
import configuracionTablas.GestionEncabezadoTabla;
import controlador.CRUD;
import controlador.Departamento;
import controlador.Paciente;
import java.awt.event.KeyEvent;
import javax.swing.table.JTableHeader;

public class ListarDepartamentos extends javax.swing.JFrame {

    CRUD crud = new CRUD();

    public ListarDepartamentos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        crud.listarDepartamentos(jTableListado, null);
        estiloTabla();

    }

    public void estiloTabla() {
        jTableListado.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableListado.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        jTableListado.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("Buscar"));
        jTableListado.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("Actualizar"));
        jTableListado.getColumnModel().getColumn(5).setCellRenderer(new GestionCeldas("Eliminar"));

        jTableListado.getTableHeader().setReorderingAllowed(false);
        jTableListado.setRowHeight(30);

        jTableListado.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableListado.getColumnModel().getColumn(1).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(2).setPreferredWidth(170);
        jTableListado.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(4).setPreferredWidth(30);
        jTableListado.getColumnModel().getColumn(5).setPreferredWidth(30);

        JTableHeader encabezado = jTableListado.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezadoTabla());
        jTableListado.setTableHeader(encabezado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrip = new javax.swing.JTextArea();
        jLabelDescip = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1020, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 245, 245));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/csr3.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 485));

        jScrollPane.setBackground(new java.awt.Color(255, 255, 255));

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
        jTextAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrip);

        jLabelDescip.setText("Descripción");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Añadir Departamento");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescip)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 690, 460));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(310, 460));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE DEPARTAMENTOS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, 34));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosImg/Line_Blanca.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

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
            CRUDepartamento crudDepartamento = new CRUDepartamento();
            this.setVisible(false);
            crudDepartamento.mostrarDatosE(crud.buscarDepartamento(new Departamento(), "DEP_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
            crudDepartamento.setVisible(true);
        } else if (columnas == numCol - 2) {
            CRUDepartamento crudDepartamento = new CRUDepartamento();
            this.setVisible(false);
            crudDepartamento.actualizarDatosE(crud.buscarDepartamento(new Departamento(), "DEP_CODIGO", jTableListado.getValueAt(fila, 0).toString()));
            crudDepartamento.setVisible(true);
        } else if (columnas == numCol - 1) {
            crud.eliminarDato("departamento", "DEP_CODIGO", jTableListado.getValueAt(fila, 0).toString());
            Mensaje mensaje = new Mensaje();
            mensaje.interExito();
            mensaje.mostrarM("Dato eliminado", "El dato ha sido eliminado");
            ListarDepartamentos listarDepartamentos = new ListarDepartamentos();
            this.setVisible(false);
            listarDepartamentos .setVisible(true);
        } else {
            jTextAreaDescrip.setText(jTableListado.getValueAt(fila, 2).toString());
        }
    }//GEN-LAST:event_jTableListadoMousePressed

    private void jTableListadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListadoKeyReleased
        //Envento de presion Teclado
        if ((evt.getKeyCode() == KeyEvent.VK_UP) || (evt.getKeyCode() == KeyEvent.VK_DOWN)) {
            int fila = jTableListado.getSelectedRow();
            int columnas = jTableListado.getColumnCount() - 1;
            jTextAreaDescrip.setText(jTableListado.getValueAt(fila, columnas).toString());
        }
    }//GEN-LAST:event_jTableListadoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CRUDepartamento cRUDepartamento = new CRUDepartamento();
        cRUDepartamento.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        //Boton Buscar
        String dato = jTextFieldBusqueda.getText();
        crud.listarDepartamentos(jTableListado, dato);
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
            java.util.logging.Logger.getLogger(ListarDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarDepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarDepartamentos().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListado;
    private javax.swing.JTextArea jTextAreaDescrip;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
