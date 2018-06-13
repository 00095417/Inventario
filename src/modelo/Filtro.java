/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    
    private int id;
    private String codigo, marca;
    private int stock;
    private boolean excistencia;

    public Filtro() {
    }

    public Filtro(int id, String codigo, String marca, int stock, boolean excistencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }

    public Filtro(String codigo, String marca, int stock, boolean excistencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }

    public Filtro(String marca, int stock, boolean excistencia) {
        this.marca = marca;
        this.stock = stock;
        this.excistencia = excistencia;
    }    
}
