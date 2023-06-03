/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Proyecto {
    private int id;
    private String nombreProyecto;
    private String fechaInicio;
    private String fechaFin;
    private String departamento;
    private Equipo equipoAsignado;
   

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
     * @return the nombreProyecto
     */
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    /**
     * @param nombreProyecto the nombreProyecto to set
     */
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
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
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
