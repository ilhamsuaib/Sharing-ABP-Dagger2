package id.ilhamsuaib.dagger2.presentation.home

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.ilhamsuaib.dagger2.BaseApp
import id.ilhamsuaib.dagger2.R
import id.ilhamsuaib.dagger2.di.component.ActivityComponent
import id.ilhamsuaib.dagger2.presentation.model.Club
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent: ActivityComponent = (applicationContext as BaseApp)
                .appComponent
                .activityComponent()
                .build()

        activityComponent.inject(this)

        presenter.attach(this)
        presenter.getClubs()

        btn.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
            finish()
        }
    }

    override fun displayClubs(it: List<Club>) {

    }
}
