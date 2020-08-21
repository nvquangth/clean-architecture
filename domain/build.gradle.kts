plugins {
    id(GradlePlugins.javaLib)
    id(GradlePlugins.kotlin)
}

dependencies {

    // Module
    implementation(project(Modules.entity))

    implementation(Libs.stdLib)

    // Hilt
    implementation(Libs.hilt)
}