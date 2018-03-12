package id.ilhamsuaib.dagger2.di.component

import dagger.Subcomponent
import id.ilhamsuaib.dagger2.di.ActivityScope
import id.ilhamsuaib.dagger2.presentation.home.MainActivity
import id.ilhamsuaib.dagger2.presentation.home.OtherActivity

/**
 * Created by ilham on 3/7/18.
 */

@ActivityScope
@Subcomponent
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ActivityComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: OtherActivity)
}