package controlador;

/**
    Ingresar los datos del formulario en el cual consten los datos del departamento: Código
del departamento y nombre del departamento
 */
public class PuestoTrabajo {
    private String codigoPuesTra, nombrePuesTra, descripcion;
    
    public PuestoTrabajo(){
        codigoPuesTra = "";
        nombrePuesTra = "";
        descripcion = "";
    
    }
    public void registrarPuestoT(String codigopuestoTra, String nombrePuesTra, String descripcion){
        this.codigoPuesTra = codigopuestoTra;
        this.nombrePuesTra = nombrePuesTra;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoPuesTra() {
        return codigoPuesTra;
    }

    public void setCodigoPuesTra(String codigoPuesTra) {
        this.codigoPuesTra = codigoPuesTra;
    }

    public String getNombrePuesTra() {
        return nombrePuesTra;
    }

    public void setNombrePuesTra(String nombrePuesTra) {
        this.nombrePuesTra = nombrePuesTra;
    }
    
}
