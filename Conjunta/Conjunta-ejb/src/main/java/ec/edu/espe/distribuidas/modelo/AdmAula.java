/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 19:37:40
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.modelo;

import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Anthony
 */
@Entity
@Table(name = "ADM_AULA", catalog = "", schema = "")
public class AdmAula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULA", nullable = false)
    private Integer codigo;
    
    @Column(name = "COD_ALTERNO", nullable = false, length = 4)
    private String codigoAlterno;
    
    @Column(name = "PISO", nullable = false, length = 2)
    private Integer piso;
    
    @Column(name = "TIPO", nullable = false, length = 3)
    private String tipo;
    
    @Column(name = "CAPACIDAD", nullable = false, length = 3)
    private Integer capacidad;
    ///FK
    @JoinColumns({
            @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO"),
            @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
    })
    @ManyToOne
    private AdmEdificio edificio;

    @OneToMany(mappedBy = "aula", fetch = FetchType.LAZY)
    private List<AdmAsignatParalHorario> paraleloHorarios;

    public AdmAula() {
    }

    public AdmAula(Integer codigo) {
        this.codigo = codigo;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public AdmEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(AdmEdificio edificio) {
        this.edificio = edificio;
    }

    public List<AdmAsignatParalHorario> getParaleloHorarios() {
        return paraleloHorarios;
    }

    public void setParaleloHorarios(List<AdmAsignatParalHorario> paraleloHorarios) {
        this.paraleloHorarios = paraleloHorarios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.codigo);
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
        final AdmAula other = (AdmAula) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAula{" + "codigo=" + codigo + ", codigoAlterno=" + codigoAlterno + ", piso=" + piso + ", tipo=" + tipo + ", capacidad=" + capacidad + ", edificio=" + edificio + ", paraleloHorarios=" + paraleloHorarios + '}';
    }
   
    

}
