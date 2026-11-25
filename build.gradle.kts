plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "vn.tina.autofishing"
    compileSdk = 35
    defaultConfig {
        applicationId = "vn.tina.autofishing"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("com.google.mlkit:text-recognition:16.0.1")
}
