plugins {
    id(GradlePlugins.androidLib)
    id(GradlePlugins.kotlinAndroid)
    id(GradlePlugins.kotlinAndroidExt)
}

android {
    compileSdkVersion(29)

}

dependencies {

    implementation(project(Modules.entity))
    implementation(project(Modules.domain))

    implementation(Libs.stdLib)

}