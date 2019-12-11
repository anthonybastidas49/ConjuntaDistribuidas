/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 20:56:24
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.dao.servicio;

import ec.edu.espe.distribuidas.dao.AdmAsgnaturaParaleloDAO;
import ec.edu.espe.distribuidas.modelo.AdmAsgnaturaParalelo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Anthony
 */
@Stateless
@LocalBean
public class AdmAsignaturaParaleloService {
    
    @EJB
    private AdmAsgnaturaParaleloDAO dao;
    
    public List<AdmAsgnaturaParalelo> findAll(){
        return dao.findAll();
    }
    public AdmAsgnaturaParalelo findByPk(Integer codigo){
        return dao.find(codigo);
    }
    public void insert(AdmAsgnaturaParalelo admAsgnaturaParalelo){
        dao.create(admAsgnaturaParalelo);
    }
    public void update(AdmAsgnaturaParalelo admAsgnaturaParalelo){
        dao.edit(admAsgnaturaParalelo);
    }
    public List<AdmAsgnaturaParalelo> listarPorAsignatura(Integer codigoAsignatura){
        return dao.listarPorAsignatura(codigoAsignatura);
    }
    
 
}
