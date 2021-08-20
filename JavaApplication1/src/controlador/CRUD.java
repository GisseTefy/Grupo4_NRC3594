package controlador;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class CRUD {
    public void coneccionBD(){
        
    }
    
    public void registrarDepartamento(Departamento departamento){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            PreparedStatement pst = cn.prepareStatement("insert into departamento values(?,?,?)");
            pst.setString(1, departamento.getCodigoDep());
            pst.setString(2, departamento.getNombreDep());
            pst.setString(3, departamento.getDescripcion());
            pst.executeUpdate();
            cn.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
    }
       public void registrarPuestoTra(PuestoTrabajo puestoTra){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            PreparedStatement pst = cn.prepareStatement("insert into puesto_trabajo values(?,?,?)");
            pst.setString(1, puestoTra.getCodigoPuesTra());
            pst.setString(2, puestoTra.getNombrePuesTra());
            pst.setString(3, puestoTra.getDescripcion());
            pst.executeUpdate();
            cn.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
    }
    private java.sql.Date formatoFecha(Date fecha){
        java.sql.Date fechaE;
        long dE= fecha.getTime();
        fechaE = new java.sql.Date(dE);
        return fechaE;
    }
    public void registrarEmpleado(Empleado empleado){

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
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
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
    }
    public void registrarPaciente(Paciente paciente){

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            PreparedStatement pst = cn.prepareStatement("insert into paciente values(?,?,?,?,?,?,?,?,?,?,?)");
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
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
    }
    public void listarEmpleado(JTable tabla){
        Departamento departamento = new Departamento();
        PuestoTrabajo puestoT = new PuestoTrabajo();
        
        String[] nomCampos = {"Codigo Empleado","Apellidos","Nombres","Departamento","Puesto de Trabajo"};
        String[][] datos = listar("empleado");
        String[][] datosEmpleado = new String[datos.length][5];
        for(int i = 0; i < datos.length; i++){
            datosEmpleado[i][0] = datos[i][0];
            datosEmpleado[i][1] = datos[i][1];
            datosEmpleado[i][2] = datos[i][2];
            datosEmpleado[i][3] = buscarDepartamento(departamento, "DEP_CODIGO", datos[i][8]).getNombreDep();
            datosEmpleado[i][4] = buscarPuestoT(puestoT, "PDT_CODIGO", datos[i][9]).getNombrePuesTra();;
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(datosEmpleado,nomCampos));
        
    }
    public void listarPaciente(JTable tabla){
        
        String[] nomCampos = {"Codigo Paciente","Apellidos","Nombres","Habitación","Estado"};
        String[][] datos = listar("paciente");
        String[][] datosPacientes = new String[datos.length][5];
        for(int i = 0; i < datos.length; i++){
            datosPacientes[i][0] = datos[i][0];
            datosPacientes[i][1] = datos[i][1];
            datosPacientes[i][2] = datos[i][2];
            datosPacientes[i][3] = datos[i][8];
            datosPacientes[i][4] = datos[i][9];
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(datosPacientes,nomCampos));
        
    }
    public void listarDepartamentos(JTable tabla){
        String[] nomCampos = {"Codigo Departamento", "Nombre Departamento", "Descripción"};
        String[][] datos = listar("departamento");
        tabla.setModel(new javax.swing.table.DefaultTableModel(datos,nomCampos));
    }
    public void listarPuestoTrab(JTable tabla){
        String[] nomCampos = {"Codigo Puesto Trabajo", "Nombre Puesto Trabajo", "Descripción"};
        String[][] datos = listar("puesto_trabajo");
        tabla.setModel(new javax.swing.table.DefaultTableModel(datos,nomCampos));
        
    }
    private String[][] listar(String BD){
        String[] nomCampos;
        String [][] datos = null;
        String instruccion = "select *from " + BD;
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            Statement sentencia =cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            int columnas = pst.getMetaData().getColumnCount();
            pst.last();
            int filas= pst.getRow();
            nomCampos = new String[columnas];
            datos = new String[filas][columnas];
            
            pst.first();
            
            for(int i = 0; i < columnas; i++){
                nomCampos[i]=pst.getMetaData().getColumnName(i+1);
            }
                        
            for(int i = 0; i < filas; i++){
                for(int j =0; j < columnas;j++){
                    datos[i][j] = pst.getString(nomCampos[j]);
                }pst.next();
            }
            pst.close();
            sentencia.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
        return datos;
    }
    
    public String[] seleccionardatos(String tabla, String columna){
        String[] datos = null;
        String instruccion = "select *from " + tabla;
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            Statement sentencia =cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            pst.last();
            int filas= pst.getRow();
            datos = new String[filas];
           
            pst.first();     
            for(int i = 0; i < filas; i++){
                datos[i] = pst.getString(columna);
                pst.next();
            }
            pst.close();
            sentencia.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
        return datos;
    }
    
    private String[] buscarDatos(String tabla, String criterio, String dato){
        String[] datos = null;
        String instruccion = "select *from " + tabla + " where "+ criterio + " = '" + dato+"'";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            Statement sentencia =cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            int columnas = pst.getMetaData().getColumnCount();
            String[] nomCampos = new String[columnas];
            datos = new String[columnas];
            pst.first();
            
            for(int i = 0; i < columnas; i++){
                nomCampos[i]=pst.getMetaData().getColumnName(i+1);
            }
                        
            for(int i = 0; i < columnas; i++){
                datos[i] = pst.getString(nomCampos[i]);
            }
            pst.close();
            sentencia.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
        return datos;
    }
    public Departamento buscarDepartamento(Departamento departamento, String criterio, String dato){
        String [] datos = buscarDatos("departamento", criterio, dato);///<-  VALIDAR
        if(datos != null){
            departamento.setCodigoDep(datos[0]);
            departamento.setNombreDep(datos[1]);
            departamento.setDescripcion(datos[2]);
        }
        return departamento;
    }
    public PuestoTrabajo buscarPuestoT(PuestoTrabajo puestoT, String criterio, String dato){
        String [] datos = buscarDatos("puesto_trabajo", criterio, dato);///<-  VALIDAR
        if(datos != null){
            puestoT.setCodigoPuesTra(datos[0]);
            puestoT.setNombrePuesTra(datos[1]);
            puestoT.setDescripcion(datos[2]);
        }
        return puestoT;
    }
    public String obtenerCodigo(String tabla){
        String instruccion = "select *from " + tabla;
        String codigo = "000";
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema_cobro","root","");
            System.out.println("Coneccion realizada :D");
            Statement sentencia =cn.createStatement();
            ResultSet pst = sentencia.executeQuery(instruccion);
            pst.last();
            codigo = pst.getString(pst.getMetaData().getColumnName(1));
            String aux = codigo.substring(3, 6);
            int aumento = Integer.parseInt(aux) + 1;
            codigo = "00"+aumento; //<- Corregir esto
            sentencia.close();
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos");
        }
        return codigo;
    }
}
