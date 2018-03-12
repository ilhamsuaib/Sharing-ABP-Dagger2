package id.ilhamsuaib.dagger2

import android.app.Application
import id.ilhamsuaib.dagger2.di.component.AppComponent
import id.ilhamsuaib.dagger2.di.component.DaggerAppComponent
import id.ilhamsuaib.dagger2.di.module.AppModule

/**
 * Created by ilham on 3/7/18.
 */

class BaseApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
    }
}

