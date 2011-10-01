package entidades;
// Generated 26-09-2011 08:23:21 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * HojaClinica generated by hbm2java
 */
public class HojaClinica  implements java.io.Serializable {


     private Long idHojaClinica;
     private Habitacion habitacion;
     private Medico medico;
     private Hospital hospital;
     private int num;
     private Date fechaIngreso;
     private String sintomas;
     private String diagnostico;
     private String tratamiento;
     private boolean encamado;
     private boolean alta;
     private Date fechaAlta;
     private Set asegurados = new HashSet(0);

    public HojaClinica() {
    }

	
    public HojaClinica(Habitacion habitacion, Medico medico, Hospital hospital, int num, Date fechaIngreso, boolean encamado, boolean alta, Date fechaAlta) {
        this.habitacion = habitacion;
        this.medico = medico;
        this.hospital = hospital;
        this.num = num;
        this.fechaIngreso = fechaIngreso;
        this.encamado = encamado;
        this.alta = alta;
        this.fechaAlta = fechaAlta;
    }
    public HojaClinica(Habitacion habitacion, Medico medico, Hospital hospital, int num, Date fechaIngreso, String sintomas, String diagnostico, String tratamiento, boolean encamado, boolean alta, Date fechaAlta, Set asegurados) {
       this.habitacion = habitacion;
       this.medico = medico;
       this.hospital = hospital;
       this.num = num;
       this.fechaIngreso = fechaIngreso;
       this.sintomas = sintomas;
       this.diagnostico = diagnostico;
       this.tratamiento = tratamiento;
       this.encamado = encamado;
       this.alta = alta;
       this.fechaAlta = fechaAlta;
       this.asegurados = asegurados;
    }
   
    public Long getIdHojaClinica() {
        return this.idHojaClinica;
    }
    
    public void setIdHojaClinica(Long idHojaClinica) {
        this.idHojaClinica = idHojaClinica;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Hospital getHospital() {
        return this.hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public String getSintomas() {
        return this.sintomas;
    }
    
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public String getDiagnostico() {
        return this.diagnostico;
    }
    
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTratamiento() {
        return this.tratamiento;
    }
    
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public boolean isEncamado() {
        return this.encamado;
    }
    
    public void setEncamado(boolean encamado) {
        this.encamado = encamado;
    }
    public boolean isAlta() {
        return this.alta;
    }
    
    public void setAlta(boolean alta) {
        this.alta = alta;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Set getAsegurados() {
        return this.asegurados;
    }
    
    public void setAsegurados(Set asegurados) {
        this.asegurados = asegurados;
    }




}


