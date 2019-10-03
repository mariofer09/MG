package edu.mario.mg

import java.time.LocalDateTime

class Manga {
    int code
    String name
    String category
    String author
    int chapters
    LocalDateTime begin
    LocalDateTime end



    static constraints = {
        table "manga"
    }
}
