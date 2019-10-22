package edu.mario.mg

import edu.mario.mg.utils.Constants

class ReservacionAsiento {

    int usuario
    int id_asientos
    int estado


    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM

    static constraints = {
        table "reservacionAsientos"
    }
}
