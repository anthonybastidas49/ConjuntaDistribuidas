/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:38:51
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_ASIGNATURA_PARALELO")
public class AdmAsgnaturaParalelo implements Serializable{
    
    @EmbeddedId
    private AdmAsgnaturaParaleloPK pk;
    
    @Column(name = "ALUMNOS", nullable = false, length =2)
    private Integer alumnos;
    
    @Column(name = "ESTADO", nullable = false, length =3)
    private Integer estado;
    
    @OneToMany(mappedBy = "asignaturaParalelo", fetch = FetchType.LAZY)
    private List<AdmAsignatParalHorario> listaAdmAsignParalHorario;
    
    @JoinColumn(name = "COD_ASIGNATURA", referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAula asignatura;

    public AdmAsgnaturaParalelo() {
    }

    public AdmAsgnaturaParalelo(AdmAsgnaturaParaleloPK pk) {
        this.pk = pk;
    }

    public AdmAsgnaturaParaleloPK getPk() {
        return pk;
    }

    public void setPk(AdmAsgnaturaParaleloPK pk) {
        this.pk = pk;
    }

    public Integer getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Integer alumnos) {
        this.alumnos = alumnos;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<AdmAsignatParalHorario> getListaAdmAsignParalHorario() {
        return listaAdmAsignParalHorario;
    }

    public void setListaAdmAsignParalHorario(List<AdmAsignatParalHorario> listaAdmAsignParalHorario) {
        this.listaAdmAsignParalHorario = listaAdmAsignParalHorario;
    }

    public AdmAula getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AdmAula asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.pk);
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
        final AdmAsgnaturaParalelo other = (AdmAsgnaturaParalelo) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsgnaturaParalelo{" + "pk=" + pk + ", alumnos=" + alumnos + ", estado=" + estado + ", listaAdmAsignParalHorario=" + listaAdmAsignParalHorario + ", asignatura=" + asignatura + '}';
    }
    
    
}
