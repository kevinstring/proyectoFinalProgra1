/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class Equipo {
    private int id;
    private String nombre;
    private Usuario lider;
    private List<Usuario> miembros;
    private ArrayList<Proyecto> proyecte = new ArrayList<>();
    private List<Equipo> equi;
    private String estado;
    public Equipo (){
                miembros = new ArrayList<>();
    }
    public void asignarProyecto(Proyecto p) {
        p.setEquipoAsignado(this);
        getProyecte().add(p);
    }   
   public void agregarMiembro(Usuario miembro) {
        miembros.add(miembro);
    }

      public List<Usuario> obtenerMiembros() {
        return miembros;
    }
    public void ide(){
        this.setId(id++);
    }

    public int getId() {
        return id;
    }

    public void miembroEquipo() {
        for (Usuario usuario : getMiembro()) {
            usuario.getUsuario();
        }
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lider
     */
    public Usuario getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    /**
     * @return the miembro
     */
    public List<Usuario> getMiembro() {
        return miembros;
    }

    /**
     * @param miembro the miembro to set
     */
    public void setMiembro(ArrayList<Usuario> miembro) {
        this.setMiembro(miembro);
    }

    /**
     * @param miembro the miembro to set
     */


    /**
     * @return the proyecte
     */
    public ArrayList<Proyecto> getProyecte() {
        return proyecte;
    }

    /**
     * @param proyecte the proyecte to set
     */
    public void setProyecte(ArrayList<Proyecto> proyecte) {
        this.proyecte = proyecte;
    }

    /**
     * @return the equi
     */
    public List<Equipo> getEqui() {
        return equi;
    }

    /**
     * @param equi the equi to set
     */
    public void setEqui(ArrayList<Equipo> equi) {
        this.equi = equi;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
