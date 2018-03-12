package id.ilhamsuaib.dagger2.presentation.base

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ilham on 3/9/18.
 */

open class BasePresenter<T: BaseView> {

    protected var view: T? = null
    protected val disposables = CompositeDisposable()

    fun attach(view: T) {
        this.view = view
    }

    fun detach() {
        this.view = null
    }

    fun despose() {
        if (!disposables.isDisposed)
            disposables.dispose()
    }
}