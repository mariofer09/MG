package edu.mario.mg.security

import edu.mario.mg.model.enums.ParamValueType

class Param {

    int code

    String name
    String description

    String value
    ParamValueType paramValueType

    static mapping = {
        table "params"
    }
}
