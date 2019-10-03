package edu.mario.mg

import java.time.LocalDateTime

class Category {

    String name
    String description

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "categorys"

        description sqlType: "text"
    }
}
