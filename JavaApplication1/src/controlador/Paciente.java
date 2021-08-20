package controlador;

import java.util.Date;

/*
Ingresar los datos del formulario en el cual consten los datos del paciente:Número de
cédula, Nombres, apellidos, edad, lugar donde vive, número de habitación asignada,
teléfono, Diagnóstico, medicación aplicada, médico que ingresa al paciente en
hospitalización
*/
public class Paciente extends Entidad{
    private String codigoPaciente = "",habitacion="", estado = "", diagnostico = "", medicacionAplicada = "";
    
    public Paciente(){
        
        this.codigoPaciente = "";
        this.apellidos = "";
        this.nombres = "";
        this.cedula = "";
        this.correo = "";
        this.fechaNac = "";
        this.direccion = "";
        this.telefono = "";
        this.habitacion = "";
        this.estado = "";
        this.diagnostico = "";
    }
    
    public void registrarPaciente(String codigoPaciente, String apellidos, String nombres, String cedula, String correo,
            String fechaNac, String direccion, String telefono, String habitacion,
            String estado, String diagnostico){
        
        this.codigoPaciente = codigoPaciente;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula = cedula;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.habitacion = habitacion;
        this.estado = estado;
        this.diagnostico = diagnostico;
    }
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMedicacionAplicada() {
        return medicacionAplicada;
    }

    public void setMedicacionAplicada(String medicacionAplicada) {
        this.medicacionAplicada = medicacionAplicada;
    }
}