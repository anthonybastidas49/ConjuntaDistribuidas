/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:37:23
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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_ASIGNATURA", catalog = "", schema = "")
public class AdmAsignatura implements Serializable{
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "COD_ASIGNATURA", nullable = false)
   private Integer codigo;

    @Column(name = "NOMBRE", length = 100,nullable = true)
    private String nombre;

    @Column(name = "CREDITOS", length = 2,nullable = true)
    private Integer creditos;

    @OneToMany(mappedBy = "asignatura", fetch = FetchType.LAZY)
    private List<AdmAsgnaturaParalelo> asignaturaParalelo;  
    public AdmAsignatura() {
    }

    public AdmAsignatura(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public List<AdmAsgnaturaParalelo> getAsignaturaParalelo() {
        return asignaturaParalelo;
    }

    public void setAsignaturaParalelo(List<AdmAsgnaturaParalelo> asignaturaParalelo) {
        this.asignaturaParalelo = asignaturaParalelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final AdmAsignatura other = (AdmAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", asignaturaParalelo=" + asignaturaParalelo + '}';
    }
   
   
   
}
