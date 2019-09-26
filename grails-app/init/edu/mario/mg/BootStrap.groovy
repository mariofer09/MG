package edu.mario.mg

import edu.mario.mg.security.BasicParam
import edu.mario.mg.security.BasicPermission
import edu.mario.mg.security.BasicUser

class BootStrap {

    private BasicUser basicUser = new BasicUser()
    private BasicParam basicParam = new BasicParam()
    private BasicPermission basicPermission = new BasicPermission()

    def init = { servletContext ->
        basicUser.insert()
        basicParam.insert()
        basicPermission.insert()
    }
    def destroy = {
    }
}
