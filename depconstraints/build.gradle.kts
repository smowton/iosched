/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("java-platform")
    id("maven-publish")
}

val appcompat = "1.1.0"
val activity = "1.2.0-rc01"
val activityCompose = "1.3.0-alpha03"
val appStartup = "1.1.0-beta01"
val cardview = "1.0.0"
val archTesting = "2.0.0"
val arcore = "1.7.0"
val benchmark = Versions.BENCHMARK
val browser = "1.0.0"
val compose = Versions.COMPOSE
val composeMaterial = "1.1.0"
val constraintLayout = "1.1.3"
val core = "1.3.2"
val coroutines = "1.6.0"
val coroutinesTest = "1.6.0"
val crashlytics = "17.2.2"
val dataStore = "1.0.0-beta01"
val drawerLayout = "1.1.0-rc01"
val espresso = "3.1.1"
val firebaseAnalytics = "17.4.0"
val firebaseAuth = "19.3.1"
val firebaseConfig = "19.1.4"
val firebaseFirestore = "21.4.3"
val firebaseFunctions = "19.0.2"
val firebaseMessaging = "20.1.6"
val firebaseUi = "7.1.1"
val flexbox = "3.0.0"
val fragment = "1.3.0"
val glide = "4.9.0"
val googlePlayServicesMapsKtx = "3.0.0"
val googlePlayServicesVision = "17.0.2"
val gson = "2.8.6"
val hamcrest = "1.3"
val hilt = Versions.HILT_AGP
val junit = "4.13.2"
val junitExt = "1.1.1"
val lifecycle = "2.4.1"
val lottie = "3.0.0"
val material = "1.4.0-beta01"
val mockito = "3.3.1"
val mockitoKotlin = "1.5.0"
val okhttp = "3.10.0"
val okio = "1.14.0"
val pageIndicator = "1.3.0"
val playCore = "1.6.5"
val profileInstaller = Versions.PROFILE_INSTALLER
val room = "2.4.2"
val rules = "1.1.1"
val runner = "1.2.0"
val slidingpanelayout = "1.2.0-alpha01"
val threetenabp = "1.0.5"
val timber = "5.0.1"
val viewpager2 = "1.0.0"
val viewModelCompose = "1.0.0-alpha02"
val uiAutomator = "2.2.0"

dependencies {
    constraints {
        api("${Libs.ACTIVITY_COMPOSE}:$activityCompose")
        api("${Libs.ACTIVITY_KTX}:$activity")
        api("${Libs.APPCOMPAT}:$appcompat")
        api("${Libs.APP_STARTUP}:$appStartup")
        api("${Libs.CARDVIEW}:$cardview")
        api("${Libs.ARCH_TESTING}:$archTesting")
        api("${Libs.ARCORE}:$arcore")
        api("${Libs.BENCHMARK}:$benchmark")
        api("${Libs.BENCHMARK_MACRO}:$benchmark")
        api("${Libs.BROWSER}:$browser")
        api("${Libs.COMPOSE_ANIMATION}:$compose")
        api("${Libs.COMPOSE_MATERIAL}:$compose")
        api("${Libs.COMPOSE_RUNTIME}:$compose")
        api("${Libs.COMPOSE_TEST}:$compose")
        api("${Libs.COMPOSE_THEME_ADAPTER}:$composeMaterial")
        api("${Libs.COMPOSE_TOOLING}:$compose")
        api("${Libs.CONSTRAINT_LAYOUT}:$constraintLayout")
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.COROUTINES}:$coroutines")
        api("${Libs.COROUTINES_TEST}:$coroutinesTest")
        api("${Libs.CRASHLYTICS}:$crashlytics")
        api("${Libs.DATA_STORE_PREFERENCES}:$dataStore")
        api("${Libs.DRAWER_LAYOUT}:$drawerLayout")
        api("${Libs.ESPRESSO_CORE}:$espresso")
        api("${Libs.ESPRESSO_CONTRIB}:$espresso")
        api("${Libs.FIREBASE_AUTH}:$firebaseAuth")
        api("${Libs.FIREBASE_CONFIG}:$firebaseConfig")
        api("${Libs.FIREBASE_ANALYTICS}:$firebaseAnalytics")
        api("${Libs.FIREBASE_FIRESTORE}:$firebaseFirestore")
        api("${Libs.FIREBASE_FUNCTIONS}:$firebaseFunctions")
        api("${Libs.FIREBASE_MESSAGING}:$firebaseMessaging")
        api("${Libs.FIREBASE_UI_AUTH}:$firebaseUi")
        api("${Libs.FLEXBOX}:$flexbox")
        api("${Libs.FRAGMENT_KTX}:$fragment")
        api("${Libs.FRAGMENT_TEST}:$fragment")
        api("${Libs.GLIDE}:$glide")
        api("${Libs.GLIDE_COMPILER}:$glide")
        api("${Libs.GOOGLE_MAP_UTILS_KTX}:$googlePlayServicesMapsKtx")
        api("${Libs.GOOGLE_PLAY_SERVICES_MAPS_KTX}:$googlePlayServicesMapsKtx")
        api("${Libs.GOOGLE_PLAY_SERVICES_VISION}:$googlePlayServicesVision")
        api("${Libs.GSON}:$gson")
        api("${Libs.HAMCREST}:$hamcrest")
        api("${Libs.HILT_ANDROID}:$hilt")
        api("${Libs.HILT_COMPILER}:$hilt")
        api("${Libs.HILT_TESTING}:$hilt")
        api("${Libs.JUNIT}:$junit")
        api("${Libs.EXT_JUNIT}:$junitExt")
        api("${Libs.KOTLIN_STDLIB}:${Versions.KOTLIN}")
        api("${Libs.LIFECYCLE_COMPILER}:$lifecycle")
        api("${Libs.LIFECYCLE_LIVE_DATA_KTX}:$lifecycle")
        api("${Libs.LIFECYCLE_RUNTIME_KTX}:$lifecycle")
        api("${Libs.LIFECYCLE_VIEW_MODEL_KTX}:$lifecycle")
        api("${Libs.LOTTIE}:$lottie")
        api("${Libs.MATERIAL}:$material")
        api("${Libs.MDC_COMPOSE_THEME_ADAPTER}:$compose")
        api("${Libs.MOCKITO_CORE}:$mockito")
        api("${Libs.MOCKITO_KOTLIN}:$mockitoKotlin")
        api("${Libs.NAVIGATION_FRAGMENT_KTX}:${Versions.NAVIGATION}")
        api("${Libs.NAVIGATION_UI_KTX}:${Versions.NAVIGATION}")
        api("${Libs.PROFILE_INSTALLER}:$profileInstaller")
        api("${Libs.ROOM_KTX}:$room")
        api("${Libs.ROOM_RUNTIME}:$room")
        api("${Libs.ROOM_COMPILER}:$room")
        api("${Libs.OKHTTP}:$okhttp")
        api("${Libs.OKHTTP_LOGGING_INTERCEPTOR}:$okhttp")
        api("${Libs.OKIO}:$okio")
        api("${Libs.INK_PAGE_INDICATOR}:$pageIndicator")
        api("${Libs.RULES}:$rules")
        api("${Libs.RUNNER}:$runner")
        api("${Libs.SLIDING_PANE_LAYOUT}:$slidingpanelayout")
        api("${Libs.THREETENABP}:$threetenabp")
        api("${Libs.THREETENBP}:${Versions.THREETENBP}")
        api("${Libs.TIMBER}:$timber")
        api("${Libs.UI_AUTOMATOR}:$uiAutomator")
        api("${Libs.VIEWPAGER2}:$viewpager2")
        api("${Libs.VIEWMODEL_COMPOSE}:$viewModelCompose")
    }
}

publishing {
    publications {
        create<MavenPublication>("myPlatform") {
            from(components["javaPlatform"])
        }
    }
}
