package edu.mario.mg.security

import edu.mario.mg.model.enums.ParamValueType
import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Param {

    int code

    String name
    String description

    String value
    ParamValueType paramValueType

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "params"
    }
}
