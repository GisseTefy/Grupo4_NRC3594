package controlador;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUD {

    public void coneccionBD() {

    }

    public void registrarDepartamento(Departamento departamento) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into departamento values(?,?,?)");
            pst.setString(1, departamento.getCodigoDep());
            pst.setString(2, departamento.getNombreDep());
            pst.setString(3, departamento.getDescripcion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarFactura(Factura factura) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into facturacion values(?,?,?,?,?)");
            pst.setString(1, factura.getCodigoFac());
            pst.setString(2, factura.getServicio().getCodigoServicio());
            pst.setString(3, factura.getFechaFac());
            pst.setFloat(4, factura.getTotal());
            pst.setString(5, factura.getObservacion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarPuestoTra(PuestoTrabajo puestoTra) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into puesto_trabajo values(?,?,?)");
            System.out.println("Conectado: ");
            pst.setString(1, puestoTra.getCodigoPuesTra());
            pst.setString(2, puestoTra.getNombrePuesTra());
            pst.setString(3, puestoTra.getDescripcion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarMedicamento(Medicamento medicamento) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into medicamento values(?,?,?,?,?,?)");
            pst.setString(1, medicamento.getCodigo());
            pst.setString(2, medicamento.getNombre());
            pst.setString(3, medicamento.getAdmininistracion());
            pst.setString(4, medicamento.getFrabricante());
            pst.setString(5, medicamento.getExpedicion());
            pst.setString(6, medicamento.getDescripcion());

            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarMedicacion(Medicacion medicacion) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into medicacion values(?,?,?,?,?)");

            pst.setString(1, medicacion.getCodigoMedicacion());
            pst.setString(2, medicacion.getServicio().getCodigoServicio());
            pst.setString(3, medicacion.getMedicamento().getCodigo());
            pst.setInt(4, medicacion.getCantidad());
            pst.setFloat(5, medicacion.getPrecio());

            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarServicio(Servicio servicio) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into servicio values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, servicio.getCodigoServicio());
            pst.setString(2, servicio.getCodigoEmpleado());
            pst.setString(3, servicio.getCodigoPaciente());
            pst.setString(4, servicio.getCodigoMedicacion());
            pst.setString(5, servicio.getNombre());
            pst.setString(6, servicio.getFecha());
            pst.setString(7, servicio.getEstado());
            pst.setString(8, servicio.getDescripcion());
            pst.setFloat(9, servicio.getPrecio());

            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarEmpleado(Empleado empleado) {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into empleado values(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, empleado.getCodigoEmpleado());
            pst.setString(2, empleado.getApellidos());
            pst.setString(3, empleado.getNombres());
            pst.setString(4, empleado.getCedula());
            pst.setString(5, empleado.getFechaNac());
            pst.setString(6, empleado.getCorreo());
            pst.setString(7, empleado.getDireccion());
            pst.setString(8, empleado.getTelefono());
            pst.setString(9, empleado.getDepartamento().getCodigoDep());
            pst.setString(10, empleado.getPuestoTrabajo().getCodigoPuesTra());
            pst.setString(11, empleado.getUsuario());
            pst.setString(12, empleado.getPassword());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void registrarPaciente(Paciente paciente) {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into paciente values(?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println("base de datos ingresada");
            pst.setString(1, paciente.getCodigoPaciente());
            pst.setString(2, paciente.getApellidos());
            pst.setString(3, paciente.getNombres());
            pst.setString(4, paciente.getCedula());
            pst.setString(5, paciente.getFechaNac());
            pst.setString(6, paciente.getCorreo());
            pst.setString(7, paciente.getDireccion());
            pst.setString(8, paciente.getTelefono());
            pst.setString(9, paciente.getHabitacion());
            pst.setString(10, paciente.getEstado());
            pst.setString(11, paciente.getDiagnostico());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public boolean eliminarDato(String tabla, String criterio, String codigo) {
        String instruccion = "DELETE FROM " + tabla + " WHERE " + criterio + " = '" + codigo + "'";
        boolean validar = false;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement(instruccion);
            System.out.println("base de datos ingresada");
            pst.executeUpdate();
            cn.close();
            validar = true;
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
        return validar;
    }

    public boolean eliminarMedicacion(String criterio1, String codigo1, String criterio2, String codigo2) {
        String instruccion = "DELETE FROM medicacion WHERE " + criterio1 + " = '" + codigo1 + "' && " + criterio2 + " = '" + codigo2 + "'";
        boolean validar = false;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement(instruccion);
            System.out.println("base de datos ingresada");
            pst.executeUpdate();
            cn.close();
            validar = true;
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
        return validar;
    }

    public void actualizarEmpleado(Empleado empleado) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE empleado SET "
                    + "ENT_APELLI = ?,ENT_NOMBRE = ?,ENT_CEDULA = ?,"
                    + "ENT_FECHAN = ?,ENT_CORREO = ?,ENT_DIRECC = ?,"
                    + "ENT_TELEFO = ?,DEP_CODIGO = ?,PDT_CODIGO = ?,"
                    + "EMP_USUARI = ?,EMP_PASSWO = ? WHERE EMP_CODIGO = '" + empleado.getCodigoEmpleado() + "'");
            pst.setString(1, empleado.getApellidos());
            pst.setString(2, empleado.getNombres());
            pst.setString(3, empleado.getCedula());
            pst.setString(4, empleado.getFechaNac());
            pst.setString(5, empleado.getCorreo());
            pst.setString(6, empleado.getDireccion());
            pst.setString(7, empleado.getTelefono());
            pst.setString(8, empleado.getDepartamento().getCodigoDep());
            pst.setString(9, empleado.getPuestoTrabajo().getCodigoPuesTra());
            pst.setString(10, empleado.getUsuario());
            pst.setString(11, empleado.getPassword());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void actualizarDepartamento(Departamento departamento) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE departamento SET DEP_NOMBRE = ?,"
                    + "DEP_DESCRI = ? WHERE DEP_CODIGO = '" + departamento.getCodigoDep() + "'");
            pst.setString(1, departamento.getNombreDep());
            pst.setString(2, departamento.getDescripcion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void actualizarPuestosT(PuestoTrabajo puestoT) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE puesto_trabajo SET PDT_NOMBRE = ?, PDT_DESCRI = ? WHERE PDT_CODIGO = '" + puestoT.getCodigoPuesTra() + "'");
            pst.setString(1, puestoT.getNombrePuesTra());
            pst.setString(2, puestoT.getDescripcion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void actualizarServicio(Servicio servicio) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE servicio SET EMP_CODIGO = ?, PAC_CODIGO = ?, "
                    + "SER_NOMBRE = ?, SER_FECHA = ?, SER_ESTADO = ?, SER_DESCRIP = ?,"
                    + "SER_PRECIO = ? WHERE SER_CODIGO = '" + servicio.getCodigoServicio() + "'");
            pst.setString(1, servicio.getCodigoEmpleado());
            pst.setString(2, servicio.getCodigoPaciente());
            pst.setString(3, servicio.getNombre());
            pst.setString(4, servicio.getFecha());
            pst.setString(5, servicio.getEstado());
            pst.setString(6, servicio.getDescripcion());
            pst.setFloat(7, servicio.getPrecio());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void actualizarPaciente(Paciente paciente) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE paciente SET ENT_APELLI = ?,"
                    + " ENT_NOMBRE = ?, ENT_CEDULA = ?, ENT_FECHAN = ?, ENT_CORREO = ?, ENT_DIRECC = ?,"
                    + " ENT_TELEFO = ?, PAC_HABITA = ?, PAC_ESTADO = ?, PAC_DIAGNO = ? WHERE PAC_CODIGO = '" + paciente.getCodigoPaciente() + "'");
            // System.out.println("PAC_CODIGO: "+paciente.getCodigoPaciente());
            pst.setString(1, paciente.getApellidos());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getCedula());
            pst.setString(4, paciente.getFechaNac());
            pst.setString(5, paciente.getCorreo());
            pst.setString(6, paciente.getDireccion());
            pst.setString(7, paciente.getTelefono());
            pst.setString(8, paciente.getHabitacion());
            pst.setString(9, paciente.getEstado());
            pst.setString(10, paciente.getDiagnostico());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void actualizarMedicamento(Medicamento medicamento) {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            PreparedStatement pst = cn.prepareStatement("UPDATE medicamento SET MDC_NOMBRE = ?, MDC_ADMINI = ?,"
                    + " MDC_FRABRI = ?, MDC_EXPEDI = ?, MDC_DESCRI = ? WHERE MDC_CODIGO = '" + medicamento.getCodigo() + "'");
            pst.setString(1, medicamento.getNombre());
            pst.setString(2, medicamento.getAdmininistracion());
            pst.setString(3, medicamento.getFrabricante());
            pst.setString(4, medicamento.getExpedicion());
            pst.setString(5, medicamento.getDescripcion());
            pst.executeUpdate();
            cn.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
    }

    public void listarEmpleado(JTable tabla, String dato) {
        Departamento departamento = new Departamento();
        PuestoTrabajo puestoT = new PuestoTrabajo();

        String[] nomCampos = {"Codigo", "Apellidos", "Nombres", "Departamento", "Puesto de Trabajo", "", "", ""};
        String[][] datos = listar("empleado");
        String[][] datosEmpleado = new String[datos.length][5 + 3];
        if ((dato == null) || (dato.equals(""))) {
            for (int i = 0; i < datos.length; i++) {
                System.out.println("dato: " + dato + "->" + datos[i][1]);
                System.out.println("dato2: " + dato + "->" + datos[i][2]);
                datosEmpleado[i][0] = datos[i][0];
                datosEmpleado[i][1] = datos[i][1];
                datosEmpleado[i][2] = datos[i][2];
                datosEmpleado[i][3] = buscarDepartamento(departamento, "DEP_CODIGO", datos[i][8]).getNombreDep();
                datosEmpleado[i][4] = buscarPuestoT(puestoT, "PDT_CODIGO", datos[i][9]).getNombrePuesTra();
                datosEmpleado[i][5] = null;
                datosEmpleado[i][6] = null;
                datosEmpleado[i][7] = null;
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datosEmpleado, nomCampos));
        } else {
            String[][] datoB = new String[1][8];
            for (int i = 0; i < datos.length; i++) {
                if ((dato.equals(datos[i][1])) || (dato.equals(datos[i][2])) || (dato.equals(datos[i][0]))) {
                    datoB[0][0] = datos[i][0];
                    datoB[0][1] = datos[i][1];
                    datoB[0][2] = datos[i][2];
                    datoB[0][3] = buscarDepartamento(departamento, "DEP_CODIGO", datos[i][8]).getNombreDep();
                    datoB[0][4] = buscarPuestoT(puestoT, "PDT_CODIGO", datos[i][9]).getNombrePuesTra();
                    datoB[0][5] = null;
                    datoB[0][6] = null;
                    datoB[0][7] = null;
                    break;
                }
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datoB, nomCampos));
        }
    }

    public void listarPaciente(JTable tabla, String dato) {

        String[] nomCampos = {"Codigo", "Apellidos", "Nombres", "Habitación", "Estado", "", "", ""};
        String[][] datos = listar("paciente");
        String[][] datosPacientes = new String[datos.length][5 + 3];
        if ((dato == null) || (dato.equals(""))) {
            for (int i = 0; i < datos.length; i++) {
                datosPacientes[i][0] = datos[i][0];
                datosPacientes[i][1] = datos[i][1];
                datosPacientes[i][2] = datos[i][2];
                datosPacientes[i][3] = datos[i][8];
                datosPacientes[i][4] = datos[i][9];
                datosPacientes[i][5] = null;
                datosPacientes[i][6] = null;
                datosPacientes[i][7] = null;

            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datosPacientes, nomCampos));
        } else {
            String[][] datoB = new String[1][8];
            for (int i = 0; i < datos.length; i++) {
                if ((dato.equals(datos[i][0])) || (dato.equals(datos[i][1])) || (dato.equals(datos[i][2]))) {
                    datoB[0][0] = datos[i][0];
                    datoB[0][1] = datos[i][1];
                    datoB[0][2] = datos[i][2];
                    datoB[0][3] = datos[i][8];
                    datoB[0][4] = datos[i][9];
                    datoB[0][5] = null;
                    datoB[0][6] = null;
                    datoB[0][7] = null;

                    tabla.setModel(new javax.swing.table.DefaultTableModel(datoB, nomCampos));
                    return;
                }
            }
        }
    }

    public void listarFactura(JTable tabla, String dato) {

        String[] nomCampos = {"Codigo Factura", "Codigo Servicio", "Estado", "Fecha", "Total", "Observaciones"};
        String[][] datos = listar("facturacion");
        String[][] datosFactura = new String[datos.length][6];
        if ((dato == null) || (dato.equals(""))) {
            for (int i = 0; i < datos.length; i++) {
                datosFactura[i][0] = datos[i][0];
                datosFactura[i][1] = datos[i][1];
                datosFactura[i][2] = buscarServicio(new Servicio(), "SER_CODIGO", datos[i][1]).getEstado();
                datosFactura[i][3] = datos[i][2];
                datosFactura[i][4] = datos[i][3];
                datosFactura[i][5] = datos[i][4];
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datosFactura, nomCampos));
        } else {
            String[][] datoB = new String[1][6];
            for (int i = 0; i < datos.length; i++) {
                if ((dato.equals(datos[i][0])) || (dato.equals(datos[i][1])) || (dato.equals(datos[i][2]))) {
                    datoB[0][0] = datos[i][0];
                    datoB[0][1] = datos[i][1];
                    datoB[0][2] = buscarServicio(new Servicio(), "SER_CODIGO", datos[i][1]).getEstado();
                    datoB[0][3] = datos[i][2];
                    datoB[0][4] = datos[i][3];
                    datoB[0][5] = datos[i][4];

                    tabla.setModel(new javax.swing.table.DefaultTableModel(datoB, nomCampos));
                    return;
                }
            }
        }
    }

    public void listarMedicacion(JTable tabla, String dato) {
        Servicio servicio = new Servicio();
        Medicamento medicamento = new Medicamento();
        Empleado empleado = new Empleado();
        Paciente paciente = new Paciente();

        String[] nomCampos = {"Codigo Medicacion", "Codigo Servicio", "Nombre Servicio", "Nombre Medicacion", "Nombre Doctor", "Nombre Paciente", "", "", ""};
        String[][] datos = listar("medicacion");
        String[][] datosMedicacion = new String[datos.length][6 + 3];
        if ((dato == null) || (dato.equals(""))) {
            for (int i = 0; i < datos.length; i++) {
                datosMedicacion[i][0] = datos[i][0];
                datosMedicacion[i][1] = datos[i][1];
                servicio = buscarServicio(servicio, "SER_CODIGO", datos[i][1]);
                medicamento = buscarMedicamento(medicamento, "MDC_CODIGO", datos[i][2]);
                datosMedicacion[i][2] = servicio.getNombre();
                datosMedicacion[i][3] = medicamento.getNombre();
                datosMedicacion[i][4] = buscarEmpleado(empleado, "EMP_CODIGO", servicio.getCodigoEmpleado()).getApellidos();
                datosMedicacion[i][5] = buscarPaciente(paciente, "PAC_CODIGO", servicio.getCodigoPaciente()).getApellidos();
                datosMedicacion[i][6] = null;
                datosMedicacion[i][7] = null;
                datosMedicacion[i][8] = null;
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datosMedicacion, nomCampos));
        } else {
            int aux = 0;
            for (int i = 0; i < datos.length; i++) {
                servicio = buscarServicio(servicio, "SER_CODIGO", datos[i][1]);
                if (dato.equals(buscarPaciente(paciente, "PAC_CODIGO", servicio.getCodigoPaciente()).getApellidos())
                        || dato.equals(servicio.getNombre()) || dato.equals(datos[i][0]) || dato.equals(datos[i][1])) {
                    aux++;
                }
            }
            String[][] datoB = new String[aux][9];
            int auxDos = 0;
            for (int i = 0; i < datos.length; i++) {
                servicio = buscarServicio(servicio, "SER_CODIGO", datos[i][1]);
                if (dato.equals(buscarPaciente(paciente, "PAC_CODIGO", servicio.getCodigoPaciente()).getApellidos())
                        || dato.equals(servicio.getNombre()) || dato.equals(datos[i][0]) || dato.equals(datos[i][1])) {
                    datoB[auxDos][0] = datos[i][0];
                    datoB[auxDos][1] = datos[i][1];
                    medicamento = buscarMedicamento(medicamento, "MDC_CODIGO", datos[i][2]);
                    datoB[auxDos][2] = servicio.getNombre();
                    datoB[auxDos][3] = medicamento.getNombre();
                    datoB[auxDos][4] = buscarEmpleado(empleado, "EMP_CODIGO", servicio.getCodigoEmpleado()).getApellidos();
                    datoB[auxDos][5] = buscarPaciente(paciente, "PAC_CODIGO", servicio.getCodigoPaciente()).getApellidos();
                    datoB[auxDos][6] = null;
                    datoB[auxDos][7] = null;
                    datoB[auxDos][8] = null;
                    auxDos++;
                }
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datoB, nomCampos));
        }
    }

    public void listarServicio(JTable tabla, String filtro, boolean tipo) {
        Empleado empleado = new Empleado();
        Paciente paciente = new Paciente();
        String[][] datos = listar("servicio");

        if (!tipo) {
            String[] nomCampos = {"Codigo Servicio", "Codigo Medicacion", "Nombre Doctor", "Nombre Paciente", "Estado", "Fecha", "Precio", "", "", ""};
            if ((filtro == null) || (filtro.equals(""))) {
                String[][] datosServicio = new String[datos.length][7 + 3];
                for (int i = 0; i < datos.length; i++) {
                    datosServicio[i][0] = datos[i][0];
                    datosServicio[i][1] = datos[i][3];
                    datosServicio[i][2] = buscarEmpleado(empleado, "EMP_CODIGO", datos[i][1]).getApellidos();
                    datosServicio[i][3] = buscarPaciente(paciente, "PAC_CODIGO", datos[i][2]).getApellidos();
                    datosServicio[i][4] = datos[i][6];
                    datosServicio[i][5] = datos[i][5];
                    datosServicio[i][6] = datos[i][8];
                    datosServicio[i][7] = null;
                    datosServicio[i][8] = null;
                    datosServicio[i][9] = null;
                }
                tabla.setModel(new javax.swing.table.DefaultTableModel(datosServicio, nomCampos));
            } else {
                int aux = 0;
                for (int i = 0; i < datos.length; i++) {
                    paciente = buscarPaciente(paciente, "PAC_CODIGO", datos[i][2]);
                    System.out.println(datos[i][6]);
                    if (filtro.equals(datos[i][0]) || filtro.equals(paciente.getApellidos()) || filtro.equals(paciente.getNombres()) || filtro.equals(datos[i][5])) {
                        aux++;
                    }

                }
                String[][] datosB = new String[aux][10];
                int auxDos = 0;
                for (int i = 0; i < datos.length; i++) {
                    paciente = buscarPaciente(paciente, "PAC_CODIGO", datos[i][2]);
                    System.out.println("Codigo: Activo ->" + datos[i][6]);
                    if (datos[i][6].equals("ACTIVO")) {
                        if (filtro.equals(datos[i][0]) || filtro.equals(paciente.getApellidos()) || filtro.equals(paciente.getNombres()) || filtro.equals(datos[i][5])) {
                            datosB[auxDos][0] = datos[i][0];
                            datosB[auxDos][1] = datos[i][3];
                            datosB[auxDos][2] = buscarEmpleado(empleado, "EMP_CODIGO", datos[i][1]).getApellidos();
                            datosB[auxDos][3] = buscarPaciente(paciente, "PAC_CODIGO", datos[i][2]).getApellidos();
                            datosB[auxDos][4] = datos[i][6];
                            datosB[auxDos][5] = datos[i][5];
                            datosB[auxDos][6] = datos[i][8];
                            datosB[auxDos][7] = null;
                            datosB[auxDos][8] = null;
                            datosB[auxDos][9] = null;

                            auxDos++;
                        }
                    }
                }
                tabla.setModel(new javax.swing.table.DefaultTableModel(datosB, nomCampos));
                return;
            }
        } else {
            int aux = 0;
            String[] nomCampos = {"Codigo Servicio", "Codigo Medicacion", "Nombre Doctor", "Nombre Paciente", "Estado", "Fecha", "Precio", ""};
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < datos.length; i++) {
                System.out.println("qui1 ");
                paciente = buscarPaciente(paciente, "PAC_CODIGO", datos[i][2]);
                 System.out.println("qui1 ");
                if (datos[i][6].equals("ACTIVO")) {
                     System.out.println("qui1 ");
                    if (paciente.getApellidos().equals(filtro) || paciente.getNombres().equals(filtro) || datos[i][0].equals(filtro) || datos[i][5].equals(filtro)) {
                        model.addRow(new Object[]{"", "", "", "", "", "", "", null});
                         System.out.println("qui1 ");
                        tabla.getModel().setValueAt(datos[i][0], aux, 0);
                        tabla.getModel().setValueAt(datos[i][3], aux, 1);
                        tabla.getModel().setValueAt(buscarEmpleado(empleado, "EMP_CODIGO", datos[i][1]).getApellidos(), aux, 2);
                        tabla.getModel().setValueAt(paciente.getApellidos(), aux, 3);
                        tabla.getModel().setValueAt(datos[i][6], aux, 4);
                        tabla.getModel().setValueAt(datos[i][5], aux, 5);
                        tabla.getModel().setValueAt(datos[i][8], aux, 6);
                        tabla.getModel().setValueAt(false, aux, 7);
                        aux++;
                         System.out.println("qui1 ");
                    }
                }
            }
        }
    }

    public void listarMedicamento(JTable tabla, String dato) {

        String[] nomCampos = {"Codigo", "Nombre", "Administración", "Fabricante", "", "", ""};
        String[][] datos = listar("medicamento");
        String[][] datosMedicamento = new String[datos.length][4 + 3];
        if (dato == null || dato.equals("")) {
            for (int i = 0; i < datos.length; i++) {
                datosMedicamento[i][0] = datos[i][0];
                datosMedicamento[i][1] = datos[i][1];
                datosMedicamento[i][2] = datos[i][2];
                datosMedicamento[i][3] = datos[i][3];
                datosMedicamento[i][4] = null;
                datosMedicamento[i][5] = null;
                datosMedicamento[i][6] = null;
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(datosMedicamento, nomCampos));
        } else {
            String[][] datoB = new String[1][7];
            for (int i = 0; i < datos.length; i++) {
                if (dato.equals(datos[i][0]) || dato.equals(datos[i][1])) {
                    datoB[0][0] = datos[i][0];
                    datoB[0][1] = datos[i][1];
                    datoB[0][2] = datos[i][2];
                    datoB[0][3] = datos[i][3];
                    datoB[0][4] = null;
                    datoB[0][5] = null;
                    datoB[0][6] = null;

                    tabla.setModel(new javax.swing.table.DefaultTableModel(datoB, nomCampos));
                    return;
                }
            }
        }
    }

    public void listarDepartamentos(JTable tabla, String dato) {
        String[] nomCampos = {"Codigo", "Nombre", "Descripción", "", "", ""};
        String[][] datos = listar("departamento");
        if ((dato != null) && (!dato.equals(""))) {
            String departamento[][] = null;
            for (int i = 0; i < datos.length; i++) {
                if ((datos[i][1].equals(dato)) || (datos[i][0].equals(dato))) {
                    departamento = new String[1][6];
                    departamento[0][0] = datos[i][0];
                    departamento[0][1] = datos[i][1];
                    departamento[0][2] = datos[i][2];
                    departamento[0][3] = null;
                    departamento[0][4] = null;
                    departamento[0][5] = null;
                }
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(departamento, nomCampos));
        } else {
            tabla.setModel(new javax.swing.table.DefaultTableModel(datos, nomCampos));
        }
    }

    public void listarPuestoTrab(JTable tabla, String dato) {
        String[] nomCampos = {"Codigo", "Nombre", "Descripción", "", "", ""};
        String[][] datos = listar("puesto_trabajo");
        if ((dato != null) && (!dato.equals(""))) {
            String departamento[][] = null;
            for (int i = 0; i < datos.length; i++) {
                if ((datos[i][1].equals(dato)) || (datos[i][0].equals(dato))) {
                    departamento = new String[1][6];
                    departamento[0][0] = datos[i][0];
                    departamento[0][1] = datos[i][1];
                    departamento[0][2] = datos[i][2];
                    departamento[0][3] = null;
                    departamento[0][4] = null;
                    departamento[0][5] = null;
                }
            }
            tabla.setModel(new javax.swing.table.DefaultTableModel(departamento, nomCampos));
        } else {
            tabla.setModel(new javax.swing.table.DefaultTableModel(datos, nomCampos));
        }
    }

    private String[][] listar(String BD) {
        String[] nomCampos;
        String[][] datos = null;
        String instruccion = "select *from " + BD;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            System.out.println("Coneccion realizada :D");
            Statement sentencia = cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            int columnas = pst.getMetaData().getColumnCount();
            pst.last();
            int filas = pst.getRow();
            nomCampos = new String[columnas];
            datos = new String[filas][columnas];

            pst.first();

            for (int i = 0; i < columnas; i++) {
                nomCampos[i] = pst.getMetaData().getColumnName(i + 1);
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    datos[i][j] = pst.getString(nomCampos[j]);
                }
                pst.next();
            }
            pst.close();
            sentencia.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
        return datos;
    }

    public String[] seleccionardatos(String tabla, String columna) {
        String[] datos = null;
        String instruccion = "select *from " + tabla;
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            Statement sentencia = cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            pst.last();
            int filas = pst.getRow();
            datos = new String[filas];

            pst.first();
            for (int i = 0; i < filas; i++) {
                datos[i] = pst.getString(columna);
                pst.next();
            }
            pst.close();
            sentencia.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
        return datos;
    }

    private String[] buscarDatos(String tabla, String criterio, String dato) {
        String[] datos = null;
        String instruccion = "select *from " + tabla + " where " + criterio + " = '" + dato + "'";
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            Statement sentencia = cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            int columnas = pst.getMetaData().getColumnCount();
            String[] nomCampos = new String[columnas];
            datos = new String[columnas];
            pst.first();

            for (int i = 0; i < columnas; i++) {
                nomCampos[i] = pst.getMetaData().getColumnName(i + 1);
            }

            for (int i = 0; i < columnas; i++) {
                datos[i] = pst.getString(nomCampos[i]);
            }
            pst.close();
            sentencia.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
            return null;
        }
        return datos;
    }

    private String[] buscarDatosMedicacion(String tabla, String criterio, String dato, String criterio2, String dato2) {
        String[] datos = null;
        String instruccion = "select *from " + tabla + " where " + criterio + " = '" + dato + "' && " + criterio2 + " = '" + dato2 + "'";
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            Statement sentencia = cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            System.out.println("Conectado");
            int columnas = pst.getMetaData().getColumnCount();
            String[] nomCampos = new String[columnas];
            datos = new String[columnas];
            pst.first();

            for (int i = 0; i < columnas; i++) {
                nomCampos[i] = pst.getMetaData().getColumnName(i + 1);
            }

            for (int i = 0; i < columnas; i++) {
                datos[i] = pst.getString(nomCampos[i]);
            }
            pst.close();
            sentencia.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
            datos = null;
        }
        return datos;
    }

    public Departamento buscarDepartamento(Departamento departamento, String criterio, String dato) {
        String[] datos = buscarDatos("departamento", criterio, dato);///<-  VALIDAR
        if (datos != null) {
            departamento.setCodigoDep(datos[0]);
            departamento.setNombreDep(datos[1]);
            departamento.setDescripcion(datos[2]);
        } else {
            return null;
        }
        return departamento;
    }

    public PuestoTrabajo buscarPuestoT(PuestoTrabajo puestoT, String criterio, String dato) {
        String[] datos = buscarDatos("puesto_trabajo", criterio, dato);///<-  VALIDAR
        if (datos != null) {
            puestoT.setCodigoPuesTra(datos[0]);
            puestoT.setNombrePuesTra(datos[1]);
            puestoT.setDescripcion(datos[2]);
        }
        return puestoT;
    }

    public Paciente buscarPaciente(Paciente paciente, String criterio, String dato) {
        String[] datos = buscarDatos("paciente", criterio, dato);///<-  VALIDAR
        if (datos != null) {
            paciente.setCodigoPaciente(datos[0]);
            paciente.setApellidos(datos[1]);
            paciente.setNombres(datos[2]);
            paciente.setCedula(datos[3]);
            paciente.setFechaNac(datos[4]);
            paciente.setCorreo(datos[5]);
            paciente.setDireccion(datos[6]);
            paciente.setTelefono(datos[7]);
            paciente.setHabitacion(datos[8]);
            paciente.setEstado(datos[9]);
            paciente.setDiagnostico(datos[10]);
        } else {
            return null;
        }
        return paciente;
    }

    public Medicamento buscarMedicamento(Medicamento medicamento, String criterio, String dato) {
        String[] datos = buscarDatos("medicamento", criterio, dato);///<-  VALIDAR
        if (datos != null) {
            medicamento.setCodigo(datos[0]);
            medicamento.setNombre(datos[1]);
            medicamento.setAdmininistracion(datos[2]);
            medicamento.setFrabricante(datos[3]);
            medicamento.setExpedicion(datos[4]);
            medicamento.setDescripcion(datos[5]);
        }
        return medicamento;
    }

    public Servicio buscarServicio(Servicio servicio, String criterio, String dato) {
        String[] datos = buscarDatos("servicio", criterio, dato);///<-  VALIDAR
        if (datos != null) {
            servicio.setCodigoServicio(datos[0]);
            servicio.setCodigoEmpleado(datos[1]);
            servicio.setCodigoPaciente(datos[2]);
            servicio.setCodigoMedicacion(datos[3]);
            servicio.setNombre(datos[4]);
            servicio.setFecha(datos[5]);
            servicio.setEstado(datos[6]);
            servicio.setDescripcion(datos[7]);
            servicio.setPrecio(Float.valueOf(datos[8]));
        }
        return servicio;
    }

    public Medicacion buscarMedicacion(Medicacion medicacion, String criterio, String dato, String criterio2, String dato2) {
        String[] datos = buscarDatosMedicacion("medicacion", criterio, dato, criterio2, dato2);///<-  VALIDAR
        if (datos != null) {
            medicacion.setCodigoMedicacion(datos[0]);
            medicacion.setServicio(buscarServicio(new Servicio(), "SER_CODIGO", datos[1]));
            medicacion.setMedicamento(buscarMedicamento(new Medicamento(), "MDC_CODIGO", datos[2]));
            medicacion.setCantidad(Integer.parseInt(datos[3]));
            medicacion.setPrecio(Integer.parseInt(datos[4]));
        } else {
            medicacion = null;
        }
        return medicacion;
    }

    public boolean validarUsuPass(String usuario, String password) {
        Empleado empleado = new Empleado();
        empleado = buscarEmpleado(empleado, "EMP_USUARI", usuario);
        if (empleado != null) {
            if (empleado.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Empleado buscarEmpleado(Empleado empleado, String criterio, String dato) {
        String[] datos = buscarDatos("empleado", criterio, dato);///<-  VALIDAR
        Departamento departamento = new Departamento();
        PuestoTrabajo puestoTrabajo = new PuestoTrabajo();
        if (datos != null) {
            empleado.setCodigoEmpleado(datos[0]);
            empleado.setApellidos(datos[1]);
            empleado.setNombres(datos[2]);
            empleado.setCedula(datos[3]);
            empleado.setFechaNac(datos[4]);
            empleado.setCorreo(datos[5]);
            empleado.setDireccion(datos[6]);
            empleado.setTelefono(datos[7]);
            departamento = buscarDepartamento(departamento, "DEP_CODIGO", datos[8]);
            puestoTrabajo = buscarPuestoT(puestoTrabajo, "PDT_CODIGO", datos[9]);
            empleado.setDepartamento(departamento);
            empleado.setPuestoTrabajo(puestoTrabajo);
            empleado.setUsuario(datos[10]);
            empleado.setPassword(datos[11]);
        } else {
            return null;
        }
        return empleado;
    }

    public String obtenerCodigo(String tabla) {
        String instruccion = "select *from " + tabla;
        String codigo = "000";
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro", "root", "");
            Statement sentencia = cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            int a = 1;
            int b = 0;
            pst.last();
            if (pst.getRow() == 0) {
                return "001";
            }
            int filas = pst.getRow();
            pst.first();
            for (int i = 0; i <= filas; i++) {
                codigo = pst.getString(pst.getMetaData().getColumnName(1)).substring(3, 6);
                b = Integer.parseInt(codigo);
                if (a == b) {
                    a++;
                    i = 0;
                    pst.first();
                } else if (filas != 1) {
                    pst.next();
                }
            }
            if (a < 10) {
                codigo = "00" + a;
            } else if (a >= 10 && a < 100) {
                codigo = "0" + a;
            } else {
                codigo = "" + a;
            }
            sentencia.close();
        } catch (Exception e) {
            System.out.println("No se conecto a la base de datos");
        }
        return codigo;
    }
}
