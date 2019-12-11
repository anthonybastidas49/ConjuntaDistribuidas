/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 20:45:44
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.dao;

import ec.edu.espe.distribuidas.modelo.AdmAsgnaturaParalelo;
import java.util.List;

/**
 *
 * @author Anthony
 */
public class AdmAsgnaturaParaleloDAO extends AbstractDAO<AdmAsgnaturaParalelo>{

    public AdmAsgnaturaParaleloDAO() {
        super(AdmAsgnaturaParalelo.class );
    }
    
    public List<AdmAsgnaturaParalelo> listarPorAsignatura(Integer codigoAsignatura){
        return this.finder(
                
                "SELECT data FROM AdmAsgnaturaParalelo data WHERE data.pk.codigoAsignatura=?1",
                new Object[]{
                    codigoAsignatura
                });
    }
    
}
