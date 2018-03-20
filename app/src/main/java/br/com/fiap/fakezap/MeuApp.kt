package br.com.fiap.fakezap

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk
import com.orhanobut.hawk.NoEncryption

class MeuApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Hawk.init(this).build()
    }

}
