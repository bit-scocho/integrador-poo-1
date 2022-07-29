
/* Hija de Persona */

package edu.unam.modelo;

import edu.unam.modelo.Persona;

public class Cliente extends Persona
    {
        /* ATRIBUTOS */
        // Algunos dados por la herencia.
        
        /* CONSTR */
        Cliente(int id, String nombre, String apellido, String fech_nac, char sexo)
            {
                super(id, nombre, apellido, fech_nac, sexo);
            }

        /* SET-GET */
        /* METODOS */
        public void calificar(int calf, Tutor tutor)
            {
                continue;
            }
    }