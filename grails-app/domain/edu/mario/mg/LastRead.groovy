package edu.mario.mg

import edu.mario.mg.security.User

class LastRead {
    User user
    Manga manga
    Chapter chapters
    int lastPageRead



    static constraints = {
        table "last_reads"
    }
}
