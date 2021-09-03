package controlador;

public class Factura {
    private String codigoFac, fechaFac = "", observacion = "";
    private float total, subtotal;
    private Servicio servicio;

    public Factura( ) {
        this.codigoFac = "";
        this.fechaFac = "";
        this.observacion = "";
        this.total = 0;
        this.subtotal = 0;
        this.servicio = new Servicio();
    }

    public String getCodigoFac() {
        return codigoFac;
    }

    public void setCodigoFac(String codigoFac) {
        this.codigoFac = codigoFac;
    }

    public String getFechaFac() {
        return fechaFac;
    }

    public void setFechaFac(String fechaFac) {
        this.fechaFac = fechaFac;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
}
