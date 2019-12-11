/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:38:38
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_ASIGNAT_PARAL_HORARIO")
public class AdmAsignatParalHorario implements Serializable{
    
    @EmbeddedId
    private AdmAsignatParalHorarioPK pk;
    
    @Column(name = "HORA_INICIO", nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaInicio;
    
    @Column(name = "HORA_FIN", nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaFin;
    
    @Column(name = "HORAS", nullable = false)
    private Integer horas;
    
    @PrimaryKeyJoinColumns({
            @PrimaryKeyJoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA"),
            @PrimaryKeyJoinColumn(name = "PARALELO", referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsgnaturaParalelo asignaturaParalelo;
    
    @JoinColumn(name = "COD_AULA", referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmAula aula;

    public AdmAsignatParalHorario() {
    }

    public AdmAsignatParalHorario(AdmAsignatParalHorarioPK pk, AdmAsgnaturaParalelo asignaturaParalelo) {
        this.pk = pk;
        this.asignaturaParalelo = asignaturaParalelo;
    }

    public AdmAsignatParalHorarioPK getPk() {
        return pk;
    }

    public void setPk(AdmAsignatParalHorarioPK pk) {
        this.pk = pk;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public AdmAsgnaturaParalelo getAsignaturaParalelo() {
        return asignaturaParalelo;
    }

    public void setAsignaturaParalelo(AdmAsgnaturaParalelo asignaturaParalelo) {
        this.asignaturaParalelo = asignaturaParalelo;
    }

    public AdmAula getAula() {
        return aula;
    }

    public void setAula(AdmAula aula) {
        this.aula = aula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.pk);
        hash = 61 * hash + Objects.hashCode(this.asignaturaParalelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmAsignatParalHorario other = (AdmAsignatParalHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        if (!Objects.equals(this.asignaturaParalelo, other.asignaturaParalelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorario{" + "pk=" + pk + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", horas=" + horas + ", asignaturaParalelo=" + asignaturaParalelo + ", aula=" + aula + '}';
    }
    
    
}
