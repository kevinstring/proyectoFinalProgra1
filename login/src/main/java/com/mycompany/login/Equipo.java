/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Equipo {
      private int id;
    private String nombre;
    private Usuario lider;
    private ArrayList<Usuario> miembro;
    private ArrayList<Proyecto> proyecte =new ArrayList<>();

  
    
      
    public void asignarProyecto(Proyecto p){
        p.setEquipoAsignado(this);
        proyecte.add(p);
    }
      public Equipo() {
        this.miembro = new ArrayList<Usuario>();
    }
    public int getId() {
        return id;
    }

    
    
    public void miembroEquipo(){
        for(Usuario usuario:miembro){
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
    public ArrayList<Usuario> getMiembro() {
        return miembro;
    }

    /**
     * @param miembro the miembro to set
     */
    public void setMiembro(ArrayList<Usuario> miembro) {
        this.miembro = miembro;
    }
}
