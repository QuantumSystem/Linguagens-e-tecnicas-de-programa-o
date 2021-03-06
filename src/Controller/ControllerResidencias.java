/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOResidencias;
import Model.Residencias;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiago
 */
public class ControllerResidencias extends Observable{
    public Residencias getResidencia(int id) {
        DAOResidencias dao = new DAOResidencias();
        return dao.get(id);
    }
    
    public void insertResidencias(String rua, String numero) {
        DAOResidencias dao = new DAOResidencias();
        Residencias r = new Residencias();
        r.setRua(rua);
        r.setNumero(numero);
        dao.insertResidencia(r);
        this.setChanged();
        this.notifyObservers();
    }
    
    public void deletaResidencias(int id) {
        DAOResidencias dao = new DAOResidencias();
        dao.deletaResidencias(id);
    }
    
    public void updateResidencias(Residencias residencias) {
        DAOResidencias dao = new DAOResidencias();
        dao.updateResidencias(residencias);
        this.setChanged();
        this.notifyObservers();
    }
    
    public ArrayList<Residencias> getAll()
    {
        DAOResidencias daoResidencias = new DAOResidencias();
        ArrayList<Residencias> residencias = (ArrayList<Residencias>) daoResidencias.getAll();
        
        return residencias;
    }
}
