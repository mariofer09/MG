package edu.mario.mg.security

import java.time.LocalDate
import java.time.LocalDateTime

class Permission {

    int code

    String name
    String description

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "permissions"

        description sqlType: "text"
    }
}
