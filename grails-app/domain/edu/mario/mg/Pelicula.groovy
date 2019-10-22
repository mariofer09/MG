package edu.mario.mg

import edu.mario.mg.utils.Constants
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor

import java.time.LocalDateTime

class Pelicula {

    int id_pelicula
    String nombre
    String duracion
    String estreno
    int id_clasificacion
    String imagen
    String descripcion

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "peliculas"

        description sqlType: "text"
    }
}
