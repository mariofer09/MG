package edu.mario.mg

import edu.mario.mg.security.User
import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Asiento {

    int id_asiento
    int id_sala
    int fila
   String Columna

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "asientos"


        description sqlType: "text"
    }
}
