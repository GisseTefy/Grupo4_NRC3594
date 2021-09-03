package controlador;

public class Servicio {
    private String codigoServicio, codigoEmpleado, codigoPaciente, codigoMedicacion, nombre, 
            fecha, estado, descripcion;
    private float precio;

    public Servicio() {
        codigoServicio = "";
        codigoEmpleado = "";
        codigoPaciente = "";
        codigoMedicacion = "";
        nombre = "";
        fecha = "";
        descripcion = "";
        estado = "";
        precio = 0;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void registrarServicio(String codigoServicio, String codigoEmpleado, String codigoPaciente, String codigoMedicacion, String nombre, String fecha,String estado, String descripcion, float precio) {
        this.codigoServicio = codigoServicio;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoPaciente = codigoPaciente;
        this.codigoMedicacion = codigoMedicacion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getCodigoMedicacion() {
        return codigoMedicacion;
    }

    public void setCodigoMedicacion(String codigoMedicacion) {
        this.codigoMedicacion = codigoMedicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
