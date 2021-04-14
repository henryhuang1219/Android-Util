package me.lazy_assedninja.sample.ui.index

import dagger.Subcomponent
import me.lazy_assedninja.sample.di.ActivityScope
import me.lazy_assedninja.sample.ui.encrypt.EncryptFragment
import me.lazy_assedninja.sample.ui.utils_list.UtilsFragment

// Scope annotation that the LoginComponent uses Classes annotated with @ActivityScope
// will have a unique instance in this Component
@ActivityScope
// Definition of a Dagger SubComponent
@Subcomponent
interface MainComponent {

    // Factory to create instances of MainComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
    fun inject(utilsFragment: UtilsFragment)
    fun inject(encryptFragment: EncryptFragment)
}