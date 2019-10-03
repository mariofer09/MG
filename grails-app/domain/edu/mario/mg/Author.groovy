package edu.mario.mg

import java.time.LocalDateTime

class Author {

    String firstName
    String lastName
    String description

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "authors"

        description sqlType: "text"
    }
}
