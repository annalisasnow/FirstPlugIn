package com.github.annalisasnow.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.annalisasnow.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
