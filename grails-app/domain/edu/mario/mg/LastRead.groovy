package edu.mario.mg

import edu.mario.mg.security.User

import java.time.LocalDateTime

class LastRead {

    User user
    Manga manga
    Chapter chapters
    int lastPageRead

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "last_reads"

        description sqlType: "text"
    }
}
