/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 20:13:44
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
public class AdmAsgnaturaParaleloPK implements Serializable{
    
 @Column(name = "COD_ASIGNATURA", nullable = false, length = 4)   
 private Integer codigoAsignatura;
 
 @Column(name = "PARALELOS", nullable = false, length = 1)
 private String paralelo;

    public AdmAsgnaturaParaleloPK() {
    }

    public AdmAsgnaturaParaleloPK(Integer codigoAsignatura, String paralelo) {
        this.codigoAsignatura = codigoAsignatura;
        this.paralelo = paralelo;
    }

    public Integer getCodigo() {
        return codigoAsignatura;
    }

    
    public void setCodigo(Integer codigo) {
        this.codigoAsignatura = codigo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.codigoAsignatura);
        hash = 73 * hash + Objects.hashCode(this.paralelo);
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
        final AdmAsgnaturaParaleloPK other = (AdmAsgnaturaParaleloPK) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsignatura, other.codigoAsignatura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsgnaturaParaleloPK{" + "codigo=" + codigoAsignatura + ", paralelo=" + paralelo + '}';
    }
    
 
}
