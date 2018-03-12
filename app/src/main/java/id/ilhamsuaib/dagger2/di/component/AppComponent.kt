package id.ilhamsuaib.dagger2.di.component

import dagger.Component
import id.ilhamsuaib.dagger2.di.module.AppModule
import javax.inject.Singleton

/**
 * Created by ilham on 3/7/18.
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun activityComponent(): ActivityComponent.Builder
}