/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Empleado {

    @Id
    private Integer id;
    private String nombre;
    private Direccion direccion;
    private String puesto;

    public Empleado() {
    }
    
    

    public Empleado(Integer id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto=puesto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


}
