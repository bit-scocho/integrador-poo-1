
/* Clase padre */

package edu.unam.modelo;

public class Persona
    {
        /* ATRIBUTOS */
        private int id;
        private String nombre;
        private String apellido;
        private String fecha_nacimiento;
        private char sexo;

        /* CONSTR */
        Persona(int id, String nombre, String apellido, String fech_nac, char sexo)
            {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.fech_nac = fech_nac;
                this.sexo = sexo;
            }

        /* SET-GET */
        /* METODOS */
    }