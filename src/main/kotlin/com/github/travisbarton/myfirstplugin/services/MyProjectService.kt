package com.github.travisbarton.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.travisbarton.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
