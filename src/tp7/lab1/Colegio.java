/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.lab1;

/**
 *
 * @author ciro2
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        a) Crear las materias:
//i. Ingles I de primer año.
//ii. Matemáticas de primer año.
//iii. Laboratorio 1 de primer año
//b) Crear 2 alumnos.
//a. López Martin con legajo 1001.
//b. Martínez Brenda con legajo 1002.
//c) Inscribir a López en las 3 materias.
//d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
//e) Visualizar la cantidad de materias a las que está inscripto cada alumno
            Materia m1 = new Materia(10, "Ingles I", 1);
            System.out.println("materia creada"+m1);
            Materia m2 = new Materia(11, "Matematicas", 1);            
            Materia m3 = new Materia(12, "Laboratorio I", 1);

           Alumno a1 = new Alumno(1001, "Lopez", "Martin");            
           Alumno a2 = new Alumno(1002, "Marinez", "Brenda");            
    
    }
    
}
