package id.ilhamsuaib.dagger2.presentation.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import id.ilhamsuaib.dagger2.BaseApp
import id.ilhamsuaib.dagger2.R
import id.ilhamsuaib.dagger2.di.component.ActivityComponent
import id.ilhamsuaib.dagger2.presentation.model.Club
import javax.inject.Inject

class OtherActivity : AppCompatActivity() {

    @Inject lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other2)

        val activityComponent: ActivityComponent = (applicationContext as BaseApp)
                .appComponent
                .activityComponent()
                .build()
        activityComponent.inject(this)

        println("club list : ${Gson().toJsonTree(presenter.clubList)}")
    }
}
