plugins {
    id(GradlePlugins.javaLib)
    id(GradlePlugins.kotlin)
}

dependencies {

    // Module
    implementation(project(Modules.entity))
    implementation(project(Modules.common))

    implementation(Libs.stdLib)

    // Hilt
    implementation(Libs.hilt)
}