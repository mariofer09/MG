package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Category {

    String name
    String description

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "categorys"

        description sqlType: "text"
    }
}
