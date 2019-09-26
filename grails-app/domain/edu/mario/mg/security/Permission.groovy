package edu.mario.mg.security

class Permission {

    int code

    String name
    String description

    static mapping = {
        table "permissions"
    }
}
