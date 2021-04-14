package me.lazy_assedninja.plugins

object AndroidX {
    val appCompat = "androidx.appcompat:appcompat:${DependenciesVersions.appCompat}"
    val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${DependenciesVersions.constraintLayout}"
    val navigationFragment =
        "androidx.navigation:navigation-fragment:${DependenciesVersions.navigation}"
    val navigationUI = "androidx.navigation:navigation-ui:${DependenciesVersions.navigation}"
    val navigationFragmentKotlin =
        "androidx.navigation:navigation-fragment-ktx:${DependenciesVersions.navigation}"
    val navigationUIKotlin =
        "androidx.navigation:navigation-ui-ktx:${DependenciesVersions.navigation}"
    val recyclerview = "androidx.recyclerview:recyclerview:${DependenciesVersions.recyclerview}"
    val media = "androidx.media:media:${DependenciesVersions.media}"
    val core = "androidx.core:core-ktx:${DependenciesVersions.core}"
    val lifecycleJava8 =
        "androidx.lifecycle:lifecycle-common-java8:${DependenciesVersions.lifecycle}"
    val lifecycleCompiler =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DependenciesVersions.lifecycle}"
    val room = "androidx.room:room-runtime:${DependenciesVersions.room}"
    val roomCompiler = "androidx.room:room-compiler:${DependenciesVersions.room}"
    val roomKotlin = "androidx.room:room-ktx:${DependenciesVersions.room}"

    val testJunit = "androidx.test.ext:junit:${DependenciesVersions.testJunit}"
    val testEspresso = "androidx.test.espresso:espresso-core:${DependenciesVersions.testEspresso}"
}