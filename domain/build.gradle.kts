plugins {
    id(GradlePlugins.javaLib)
    id(GradlePlugins.kotlin)
}

dependencies {

    implementation(project(Modules.entity))

    implementation(Libs.stdLib)
}