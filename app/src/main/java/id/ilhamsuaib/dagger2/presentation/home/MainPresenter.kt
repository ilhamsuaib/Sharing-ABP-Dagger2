package id.ilhamsuaib.dagger2.presentation.home

import com.google.gson.Gson
import id.ilhamsuaib.dagger2.data.repo.ClubRepository
import id.ilhamsuaib.dagger2.di.ActivityScope
import id.ilhamsuaib.dagger2.presentation.base.BasePresenter
import id.ilhamsuaib.dagger2.presentation.model.Club
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ilham on 3/10/18.
 */

@ActivityScope
class MainPresenter @Inject constructor(val repo: ClubRepository): BasePresenter<MainView>() {

    var clubList: List<Club>? = null

    fun getClubs() {
        repo.getClubs().subscribe(
                {
                    println("data : ${Gson().toJsonTree(it)}")
                    clubList = it
                    view?.displayClubs(it)
                },
                {

                }
        )
    }
}