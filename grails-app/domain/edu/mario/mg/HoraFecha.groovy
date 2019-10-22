package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class HoraFecha {

    int hora
    String fecha

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "horaFecha"

        description sqlType: "text"
    }
}
