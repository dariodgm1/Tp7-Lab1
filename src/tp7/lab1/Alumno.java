/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.lab1;

import java.util.HashMap;

/**
 *
 * @author ciro2
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
     private HashMap<String,Alumno> registro2=new HashMap<String,Alumno>();
      private HashMap<String,Materia> registro=new HashMap<String,Materia>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Alumno() {
       
    }

   

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public boolean agregarAlumno(String nombre, Alumno a) {
        boolean agregado = false;
        if (!registro.containsKey(nombre)) {
            registro2.put(nombre, a);
            agregado = true;
        }
        return agregado;
    }   
            public boolean agregarMateria(String nombre, Materia m) {
        boolean agregado = false;
        if (!registro.containsKey(nombre)) {
            registro.put(nombre, m);
            agregado = true;
        }
        return agregado;
    }  
    public void cantidadMaterias(){}
    
}
