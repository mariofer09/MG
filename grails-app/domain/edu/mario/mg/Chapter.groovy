package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Chapter {

    String name
    String description
    int pages
    String data

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "chapters"

        description sqlType: "text"
    }

}
