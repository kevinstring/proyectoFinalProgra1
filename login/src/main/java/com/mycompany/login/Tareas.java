/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.util.Date;

/**
 *
 * @author herma
 */
public class Tareas {
    
    private int id;
    private String nombreTarea;
    private String fechaInicio;
    private String fechaFin;
    private Equipo equipoAsignado;
    private Proyecto proyectoAsignado;
    private Usuario miembro;
    private String status;
    private String descripcion;
   private String estadoDeTareas;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombreTarea
     */
    public String getNombreTarea() {
        return nombreTarea;
    }

    /**
     * @param nombreTarea the nombreTarea to set
     */
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    /**
     * @return the fechas
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechas the fechas to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
 public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechas the fechas to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the equipoAsignado
     */
    public Equipo getEquipoAsignado() {
        return equipoAsignado;
    }

    /**
     * @param equipoAsignado the equipoAsignado to set
     */
    public void setEquipoAsignado(Equipo equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }

    /**
     * @return the proyectoAsignado
     */
    public Proyecto getProyectoAsignado() {
        return proyectoAsignado;
    }

    /**
     * @param proyectoAsignado the proyectoAsignado to set
     */
    public void setProyectoAsignado(Proyecto proyectoAsignado) {
        this.proyectoAsignado = proyectoAsignado;
    }

    /**
     * @return the miembro
     */
    public Usuario getMiembro() {
        return miembro;
    }

    /**
     * @param miembro the miembro to set
     */
    public void setMiembro(Usuario miembro) {
        this.miembro = miembro;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the estadoDeTareas
     */
    public String getEstadoDeTareas() {
        return estadoDeTareas;
    }

    /**
     * @param estadoDeTareas the estadoDeTareas to set
     */
    public void setEstadoDeTareas(String estadoDeTareas) {
        this.estadoDeTareas = estadoDeTareas;
    }
    
}
