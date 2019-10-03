package edu.mario.mg.security

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Permission {

    int code

    String name
    String description

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "permissions"

        description sqlType: "text"
    }
}
