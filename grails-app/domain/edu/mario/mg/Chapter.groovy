package edu.mario.mg

import java.time.LocalDateTime

class Chapter {

    String name
    String description
    int pages
    String data

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "chapters"

        description sqlType: "text"
    }

}
