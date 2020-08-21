plugins {
    id(GradlePlugins.androidLib)
    id(GradlePlugins.kotlinAndroid)
    id(GradlePlugins.kotlinAndroidExt)
    id(GradlePlugins.kotlinKapt)
}

android {
    compileSdkVersion(Android.targetSdk)

    defaultConfig {
        minSdkVersion(Android.minSdk)
        targetSdkVersion(Android.targetSdk)

        testInstrumentationRunner = AndroidJUnit.testInstrumentationRunner
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

}

dependencies {

    implementation(Libs.stdLib)

    // Appcompat
    implementation(Libs.appcompat)

    // Android Core
    implementation(Libs.coreKtx)
}