package edu.mario.mg.security

import com.sun.jmx.snmp.Timestamp


class Manga {
    int code
    String name
    String category
    String author
    int chapters
    Timestamp begin
    Timestamp end



    static constraints = {
        table "manga"
    }
}
