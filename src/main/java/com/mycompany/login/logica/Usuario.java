
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable {
   
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String contrasenia;
    
    
    @ManyToOne
    @JoinColumn(name="fk_rol")
    private Rol unRol;

    
    public Usuario() {
    }

    public Usuario(String nombre, String contrasenia, Rol unRol) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.unRol = unRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    
    
}
