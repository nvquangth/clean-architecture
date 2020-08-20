object Versions {
    const val kotlin = "1.3.72"
}

object GradlePlugins {
    const val androidApplication = "com.android.application"
    const val androidLib = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExt = "kotlin-android-extensions"
    const val javaLib = "java-library"
    const val kotlin = "kotlin"
}

object Libs {
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
}

object Modules {
    const val entity = ":entity"
    const val domain = ":domain"
    const val data = ":data"
}