package me.lazy_assedninja.sample.ui.splash

import android.content.Intent
import android.os.Bundle
import me.lazy_assedninja.library_dagger.ui.BaseActivity
import me.lazy_assedninja.sample.ui.index.MainActivity

class SplashActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}