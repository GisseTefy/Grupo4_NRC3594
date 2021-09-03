package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Mensaje extends javax.swing.JFrame {

    private boolean exito, listadoEmpleado, listadoPaciente, listadoDepartamento, listadoMedicamento, listadoMedicacion,
            listadoPuestoT, listadoServicio, listarServicioFactura;

    public Mensaje() {
        exito = false;
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void interExito() {
        jPanelMargen.setBackground(new Color(0, 198, 132));
        jLabelIcono.setIcon(new ImageIcon(getClass().getResource("/recursosIconos/comprobado.png")));
        jLabelTituloM.setForeground(new Color(0, 112, 74));
        jButtonAceptar.setForeground(new Color(0, 112, 74));
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 112, 74), 3));
    }

    public void interError() {
        jPanelMargen.setBackground(new Color(255, 76, 76));
        jLabelIcono.setIcon(new ImageIcon(getClass().getResource("/recursosIconos/cancelar.png")));
        jLabelTituloM.setForeground(new Color(168, 0, 0));
        jButtonAceptar.setForeground(new Color(168, 0, 0));
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 0, 0), 3));
    }

    public void redicListadoEmp() {
        listadoEmpleado = true;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoDep() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = true;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoMDC() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = true;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoPAC() {
        listadoEmpleado = false;
        listadoPaciente = true;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoMDI() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = true;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoPDT() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = true;
        listadoServicio = false;
        listarServicioFactura = false;
    }

    public void redicListadoSER() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = true;
        listarServicioFactura = false;
    }

    public void redicListadoSERFAC() {
        listadoEmpleado = false;
        listadoPaciente = false;
        listadoDepartamento = false;
        listadoMedicamento = false;
        listadoMedicacion = false;
        listadoPuestoT = false;
        listadoServicio = false;
        listarServicioFactura = true;
    }

    public void mostrarM(String titulo, String dato) {
        tituloMensaje(titulo);
        mesaje(dato);
        setVisible(true);
    }

    public boolean getExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    private void tituloMensaje(String mensaje) {
        jLabelTituloM.setText(mensaje);
    }

    private void mesaje(String mensaje) {
        jLabelMensaje.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTituloM = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jPanelMargen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursosIconos/cancelar.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 173));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloM.setBackground(new java.awt.Color(0, 137, 91));
        jLabelTituloM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTituloM.setForeground(new java.awt.Color(168, 0, 0));
        jLabelTituloM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloM.setText("Titulo mensaje");
        jLabelTituloM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelTituloM, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 310, -1));

        jLabelMensaje.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelMensaje.setText("Mensaje");
        jPanel1.add(jLabelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 30));

        jButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAceptar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(168, 0, 0));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 0, 0), 3));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 129, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 430, 120));

        jPanelMargen.setBackground(new java.awt.Color(255, 76, 76));

        javax.swing.GroupLayout jPanelMargenLayout = new javax.swing.GroupLayout(jPanelMargen);
        jPanelMargen.setLayout(jPanelMargenLayout);
        jPanelMargenLayout.setHorizontalGroup(
            jPanelMargenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanelMargenLayout.setVerticalGroup(
            jPanelMargenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMargen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (exito == true) {
            if (listadoEmpleado == true) {
                ListarEmpleado listarEmpleado = new ListarEmpleado();
                listarEmpleado.setVisible(true);
                exito = false;
            } else if (listadoDepartamento == true) {
                ListarDepartamentos listarDepartamentos = new ListarDepartamentos();
                listarDepartamentos.setVisible(true);
                exito = false;
            } else if (listadoMedicamento == true) {
                ListarMedicamento listarMedicamento = new ListarMedicamento();
                listarMedicamento.setVisible(true);
                exito = false;
            } else if (listadoPaciente == true) {
                ListarPacientes listarPacientes = new ListarPacientes();
                listarPacientes.setVisible(true);
                exito = false;
            } else if (listadoPuestoT == true) {
                ListarPuestoTrabajo listarPuestoTrabajo = new ListarPuestoTrabajo();
                listarPuestoTrabajo.setVisible(true);
                exito = false;
            } else if (listadoMedicacion == true) {
                ListarMedicacion listarMedicacion = new ListarMedicacion();
                listarMedicacion.setVisible(true);
                exito = false;
            } else if (listadoServicio == true) {
                ListarServicio listarServicio = new ListarServicio();
                listarServicio.setVisible(true);
                listarServicio.listarSER();
                exito = false;
            } else if (listarServicioFactura == true) {
                ListarServicio listarServicio = new ListarServicio();
                listarServicio.setVisible(true);
                listarServicio.listarSERFAC();
                exito = false;
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelTituloM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMargen;
    // End of variables declaration//GEN-END:variables
}
