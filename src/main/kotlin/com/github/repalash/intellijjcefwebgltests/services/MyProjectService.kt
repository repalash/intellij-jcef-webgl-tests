package com.github.repalash.intellijjcefwebgltests.services

import com.intellij.openapi.project.Project
import com.github.repalash.intellijjcefwebgltests.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
