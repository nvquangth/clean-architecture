plugins {
    id(GradlePlugins.javaLib)
    id(GradlePlugins.kotlin)
}

dependencies {

    // Module
    implementation(project(Modules.common))

    implementation(Libs.stdLib)
}