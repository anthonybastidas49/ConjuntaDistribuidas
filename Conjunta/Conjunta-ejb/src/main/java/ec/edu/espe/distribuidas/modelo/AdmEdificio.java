/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:37:33
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_EDIFICIO", catalog = "", schema = "")
public class AdmEdificio implements Serializable{
   
    @EmbeddedId
    private AdmEdificioPK pk;
    
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "LATITUD", nullable = false)
    private BigDecimal latitud;
    
    @Column(name = "LONGITUD", nullable = false)
    private BigDecimal longitud;
    
    ///FK
    @PrimaryKeyJoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmSede sede;
    
    @OneToMany(mappedBy = "edificio", fetch = FetchType.LAZY)
    private List<AdmAula> listaAdmAula;

    public AdmEdificio() {
    }

    public AdmEdificio(AdmEdificioPK pk, AdmSede sede) {
        this.pk = pk;
        this.sede = sede;
    }

    public AdmEdificioPK getPk() {
        return pk;
    }

    public void setPk(AdmEdificioPK pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public AdmSede getSede() {
        return sede;
    }

    public void setSede(AdmSede sede) {
        this.sede = sede;
    }

    public List<AdmAula> getListaAdmAula() {
        return listaAdmAula;
    }

    public void setListaAdmAula(List<AdmAula> listaAdmAula) {
        this.listaAdmAula = listaAdmAula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.pk);
        hash = 59 * hash + Objects.hashCode(this.sede);
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
        final AdmEdificio other = (AdmEdificio) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        if (!Objects.equals(this.sede, other.sede)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificio{" + "pk=" + pk + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", sede=" + sede + ", listaAdmAula=" + listaAdmAula + '}';
    }
    
    
}
