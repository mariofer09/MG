package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Sala {

    int id_sala
    int numButacas
    



    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "salas"

        description sqlType: "text"
    }

}
