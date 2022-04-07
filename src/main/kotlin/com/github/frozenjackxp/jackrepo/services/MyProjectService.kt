package com.github.frozenjackxp.jackrepo.services

import com.intellij.openapi.project.Project
import com.github.frozenjackxp.jackrepo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
