package edu.mario.mg.security

import java.time.LocalDate
import java.time.LocalDateTime

class User {

    String firtsname
    String lastname

    LocalDate birthday

    String username
    String password

    String phone
    String email

    static hasMany = [permissions: Permission]

    boolean enabled = true
    String createdBy
    String modifyBy
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "users"
        username unique: true
        password length: 500
    }
}
