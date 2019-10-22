package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDate
import java.time.LocalDateTime

class Clasificacion {

  int id_clasificacion
    String detalles


    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "Clasificaciones"

        description sqlType: "text"
    }
}
