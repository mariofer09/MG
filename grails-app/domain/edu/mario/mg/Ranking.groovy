package edu.mario.mg

import edu.mario.mg.utils.Constants

class Ranking {

    String description
    Manga manga
    int rank



    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM

    static constraints = {
        table "rankings"
    }
}
