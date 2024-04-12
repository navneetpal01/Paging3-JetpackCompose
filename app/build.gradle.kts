plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlinx-serialization")
    kotlin("kapt")
    alias(libs.plugins.daggerHiltAndroid)
}

android {
    namespace = "com.example.pagging3"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pagging3"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")

    //Retrofit
    implementation(libs.retrofit2)
    implementation(libs.retrofit2.converter)
    implementation(libs.okhttp3)
    implementation(libs.okhttp3.logging.interceptor)

    //Paging 3
    implementation("androidx.paging:paging-compose:3.3.0-beta01")

    // Room
    val roomVersion = "2.6.1"
    implementation("androidx.room:room-ktx:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-paging:$roomVersion")


    //Dagger Hilt
    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hilt.compiler)
    implementation(libs.hilt.work)
    //Coil
    implementation(libs.coil.compose)


}