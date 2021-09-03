package controlador;

public class Medicacion {
    private String codigoMedicacion;
    private Servicio servicio;
    private Medicamento medicamento;
    private int cantidad;
    private float precio;

    public Medicacion() {
        codigoMedicacion = "";
        servicio = new Servicio();
        medicamento = new Medicamento();
        cantidad = 0;
        precio = 0;
    }

    public void registrarMedicacion(String codigoMedicacion, Servicio servicio, Medicamento medicamento, int cantidad, float precio) {
        this.codigoMedicacion = codigoMedicacion;
        this.servicio = servicio;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigoMedicacion() {
        return codigoMedicacion;
    }

    public void setCodigoMedicacion(String codigoMedicacion) {
        this.codigoMedicacion = codigoMedicacion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
