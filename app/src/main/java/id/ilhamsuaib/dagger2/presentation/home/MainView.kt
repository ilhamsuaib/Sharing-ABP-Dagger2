package id.ilhamsuaib.dagger2.presentation.home

import id.ilhamsuaib.dagger2.presentation.base.BaseView
import id.ilhamsuaib.dagger2.presentation.model.Club

/**
 * Created by ilham on 3/10/18.
 */
interface MainView : BaseView {
    fun displayClubs(it: List<Club>)
}