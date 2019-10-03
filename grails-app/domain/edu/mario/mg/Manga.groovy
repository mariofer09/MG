package edu.mario.mg

import java.time.LocalDate

class Manga {


    String description
    String name
    Category category
    Author author
    int QuantityChapters
    LocalDate begin
    LocalDate end

    static hasMany = [chapters: Chapter]
    static constraints = {
        table "mangas"
    }
}
