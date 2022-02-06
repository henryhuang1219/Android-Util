package me.lazy_assedninja.util.application

import android.app.Application
import me.lazy_assedninja.util.BuildConfig
import me.lazy_assedninja.util.UtilTestRunner
import timber.log.Timber

/**
 * We use a separate App for tests to prevent initializing dependency injection.
 *
 * See [UtilTestRunner].
 */
class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}