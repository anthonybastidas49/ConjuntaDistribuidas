/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 20:04:38
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Anthony
 */
@Embeddable
public class AdmAsignatParalHorarioPK implements Serializable{
   
   @Column(name = "COD_ASIGNATURA", nullable = false, length = 4)
   private Integer codigo;
   
   @Column(name = "PARALELO", nullable = false, length = 1)
   private String paralelo;
   
   @Column(name = "COD_AULA", nullable = false, length = 4)
   private Integer codigoAula;
   
   @Column(name = "DIA", nullable = false, length = 3)
   private String dia;

    public AdmAsignatParalHorarioPK() {
    }

    public AdmAsignatParalHorarioPK(Integer codigo, String paralelo, Integer codigoAula, String dia) {
        this.codigo = codigo;
        this.paralelo = paralelo;
        this.codigoAula = codigoAula;
        this.dia = dia;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public Integer getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(Integer codigoAula) {
        this.codigoAula = codigoAula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        hash = 43 * hash + Objects.hashCode(this.paralelo);
        hash = 43 * hash + Objects.hashCode(this.codigoAula);
        hash = 43 * hash + Objects.hashCode(this.dia);
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
        final AdmAsignatParalHorarioPK other = (AdmAsignatParalHorarioPK) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.codigoAula, other.codigoAula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorarioPK{" + "codigo=" + codigo + ", paralelo=" + paralelo + ", codigoAula=" + codigoAula + ", dia=" + dia + '}';
    }
   
   
}
