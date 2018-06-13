/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaces.metodos;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.Filtro;

/**
 *
 * @author LN710Q
 */
public class FiltroDao implements metodos<Filtro> {
    
    private static final String SQL_INSERT = "INSERT INTO filtros_aceites (codFiltro,marca,stock,existencia) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE filtros_aceite SET marca = ?, stock = ? , existencia = ? WHERE codFiltro = ?";
    private static final String SQL_DELETE = "DELETE FROM  filtros_aceite WHERE codFiltros = ?";
    private static final String SQL_READ = "SELECT * FROM filstros_aceite WHERE codFiltros = ?";
    private static final String SQL_READALL = "SELECT * FROM filstros_aceite";
    private static final Conexion con = Conexion.conectar();
    
    
    @Override
    public boolean create(Filtro g) {
        
        PreparedStatement ps;
      
        
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Filtro c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Filtro read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Filtro> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
