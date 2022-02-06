package me.lazy_assedninja.plugins

@Suppress("unused")
object AndroidX {

    const val CORE = "androidx.core:core-ktx:${DependenciesVersions.ANDROIDX_CORE}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${DependenciesVersions.ANDROIDX_APP_COMPAT}"
    const val LIFECYCLE_LIVEDATA =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_COMPILER =
        "androidx.lifecycle:lifecycle-compiler:${DependenciesVersions.LIFECYCLE}"
    const val LIFECYCLE_EXTENSIONS =
        "androidx.lifecycle:lifecycle-extensions:${DependenciesVersions.LIFECYCLE_ARCH}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${DependenciesVersions.CONSTRAINT_LAYOUT}"
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${DependenciesVersions.NAVIGATION}"
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${DependenciesVersions.NAVIGATION}"
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${DependenciesVersions.RECYCLER_VIEW}"

    const val CORE_TESTING = "androidx.arch.core:core-testing:${DependenciesVersions.ANDROIDX_ARCH_CORE}"
    const val TEST_JUNIT = "androidx.test.ext:junit:${DependenciesVersions.ANDROIDX_TEST_JUNIT}"
    const val TEST_ESPRESSO = "androidx.test.espresso:espresso-core:${DependenciesVersions.ANDROIDX_TEST_ESPRESSO}"
}