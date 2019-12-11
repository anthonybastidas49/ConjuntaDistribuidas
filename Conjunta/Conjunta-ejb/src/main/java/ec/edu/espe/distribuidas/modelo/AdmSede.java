/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:37:11
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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_SEDE", catalog = "", schema = "")
public class AdmSede implements Serializable {

    @Id
    @Column(name = "COD_SEDE", nullable = false, length = 10)
    private String codigo;
    ///
    @Column(name = "NOMBRE", length = 100,nullable = false)
    private String nombre;

    @Column(name = "DIRECCION", length = 100,nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "sede", fetch = FetchType.LAZY)
    private List<AdmEdificio> listaAdmEdificio;

    public AdmSede() {
    }

    public AdmSede(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<AdmEdificio> getListaAdmEdificio() {
        return listaAdmEdificio;
    }

    public void setListaAdmEdificio(List<AdmEdificio> listaAdmEdificio) {
        this.listaAdmEdificio = listaAdmEdificio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.codigo);
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
        final AdmSede other = (AdmSede) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmSede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", listaAdmEdificio=" + listaAdmEdificio + '}';
    }

}
