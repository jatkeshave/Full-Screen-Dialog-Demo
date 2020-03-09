val kotlinVersion = project.properties["project.kotlin.version"]
val androidGradleVersion = project.properties["project.gradle.android"]


plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "keshav.dialog.demo"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName  = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes.invoke {
        "release" {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
   implementation(fileTree(mapOf("dir" to "libs", "include" to arrayOf("*.jar"))))
   implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
   implementation("androidx.core:core-ktx:1.2.0")
   implementation("androidx.appcompat:appcompat:1.1.0")
   implementation("androidx.constraintlayout:constraintlayout:1.1.3")
   testImplementation("junit:junit:4.12")
   androidTestImplementation("androidx.test.ext:junit:1.1.1")
   androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")

}