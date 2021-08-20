package controlador;

import java.util.Date;

/* Ingresar los datos del formulario en el cual consten los datos del empleado : cédula,
nombre, fecha de nacimiento, dirección, departamento, puesto de trabajo.*/

public class Empleado extends Entidad{
    private String codigoEmpleado = "", usuario = "", password = "";
    private Departamento departamento = new Departamento();
    private PuestoTrabajo puestoTrabajo = new PuestoTrabajo();
    
    public Empleado() {
        this.codigoEmpleado = "";
        this.apellidos = "";
        this.nombres = "";
        this.cedula = "";
        this.fechaNac = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.departamento.setCodigoDep("");
        this.departamento.setNombreDep("");
        this.departamento.setDescripcion("");
        this.puestoTrabajo.setNombrePuesTra("");
        this.puestoTrabajo.setCodigoPuesTra("");
        this.usuario = "";
        this.password = "";
    }
    
    public void registrarEmp(String CodigoEmpleado, String apellidos, String nombres, String cedula,
            String correo, String fechaNac, String direccion, String telefono, 
            Departamento departamento, PuestoTrabajo puestoTrabajo, String usuario, String password){
        this.codigoEmpleado = CodigoEmpleado;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula = cedula;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamento = departamento; //Desarrollar este apartado
        this.puestoTrabajo = puestoTrabajo;//Desarrollar este apartadp
        this.usuario = usuario;
        this.password = password;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public PuestoTrabajo getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }
    
    
}
