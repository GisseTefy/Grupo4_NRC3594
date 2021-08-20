package controlador;
/*
Ingresar los datos del formulario en el cual consten los datos del departamento: Código
del departamento y nombre del departamento
*/
public class Departamento {
    private String codigoDep, nombreDep, descripcion;
    
    public Departamento(){
        this.codigoDep = "";
        this.nombreDep = "";
        this.descripcion = "";
    
    }
    public void registrarDepartamento(String codigoDep, String nombreDep, String descripcion){
        this.codigoDep = codigoDep;
        this.nombreDep = nombreDep;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoDep() {
        return codigoDep;
    }

    public void setCodigoDep(String codigoDep) {
        this.codigoDep = codigoDep;
    }
    
    public String getNombreDep() {
        return nombreDep;
    }
    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }
    
}
