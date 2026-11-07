package de.niklasbednarczyk.nbdex

import android.app.Application
import de.niklasbednarczyk.nbdex.di.initKoin
import org.koin.android.ext.koin.androidContext

class DexApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@DexApplication)
        }
    }
}
