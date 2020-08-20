plugins {
    id(GradlePlugins.androidApplication)
    id(GradlePlugins.kotlinAndroid)
    id(GradlePlugins.kotlinAndroidExt)
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.example.cleanarchitecture"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    implementation(project(Modules.entity))
    implementation(project(Modules.domain))
    implementation(project(Modules.data))

    implementation(Libs.stdLib)
    implementation("androidx.core:core-ktx:1.3.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
}