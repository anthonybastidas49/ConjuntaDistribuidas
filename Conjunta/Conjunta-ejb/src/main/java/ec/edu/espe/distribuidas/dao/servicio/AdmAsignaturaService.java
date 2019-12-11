/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjunta-ejb
 * Creado: 10/12/2019 - 20:56:04
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por 
 * la licencia BSD.
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.dao.servicio;

import ec.edu.espe.distribuidas.dao.AdmAsignaturaDAO;
import ec.edu.espe.distribuidas.modelo.AdmAsignatura;
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
public class AdmAsignaturaService {
   @EJB
    private AdmAsignaturaDAO dao;
    
    public List<AdmAsignatura> findAll(){
        return dao.findAll();
    }
    public AdmAsignatura findByPk(Integer codigo){
        return dao.find(codigo);
    }
    public void insert(AdmAsignatura admAsignatura){
        dao.create(admAsignatura);
    }
    public void update(AdmAsignatura admAsignatura){
        dao.edit(admAsignatura);
    }
}
