plugins {
    id("com.android.application")
    id("com.google.gms.google-services") // Para Firebase
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin") // Flutter
}

android {
    ndkVersion = "27.0.12077973"
    namespace = "com.example.barneyscanner"
    compileSdk = 35 // Asegúrate de que coincide con la versión de Flutter

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.barneyscanner"
        minSdk = 23 // Corrección de minSdkVersion
        targetSdk = 33 // Define manualmente la versión correcta
        versionCode = 1 // Reemplaza flutter.versionCode por un valor manual
        versionName = "1.0" // Reemplaza flutter.versionName por un valor manual
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug") // Cambiar en producción
        }
    }
}

flutter {
    source = "../.."
}
