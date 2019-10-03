package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDate
import java.time.LocalDateTime

class Manga {

    String description
    String name
    Category category
    Author author
    int quantityChapters
    LocalDate begin
    LocalDate end

    static hasMany = [chapters: Chapter]

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "mangas"

        description sqlType: "text"
    }
}
