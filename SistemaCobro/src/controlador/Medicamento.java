package controlador;

public class Medicamento {
    private String codigo, nombre, admininistracion, frabricante, expedicion, descripcion;

    public Medicamento() {
        codigo = "";
        nombre = "";
        admininistracion = "";
        frabricante = "";
        expedicion = "";
        descripcion = "";
    }
       
    public void registrarMedicamento(String codigo, String nombre, String admininistracion, String frabricante, String expedicion, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.admininistracion = admininistracion;
        this.frabricante = frabricante;
        this.expedicion = expedicion;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdmininistracion() {
        return admininistracion;
    }

    public void setAdmininistracion(String admininistracion) {
        this.admininistracion = admininistracion;
    }

    public String getFrabricante() {
        return frabricante;
    }

    public void setFrabricante(String frabricante) {
        this.frabricante = frabricante;
    }

    public String getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(String expedicion) {
        this.expedicion = expedicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
