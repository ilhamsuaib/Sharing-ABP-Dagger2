package id.ilhamsuaib.dagger2.data.repo

import id.ilhamsuaib.dagger2.data.ApiService
import id.ilhamsuaib.dagger2.data.model.ClubResponse
import id.ilhamsuaib.dagger2.presentation.model.Club
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by ilham on 3/10/18.
 */

@Singleton
class ClubRepository @Inject constructor(val service: ApiService) {

    fun getClubs(): Flowable<List<Club>> {
        return service.getClubs()
                .flatMap {
                    Flowable.fromIterable(it.clubs)
                }
                .map {
                    it.transform()
                }
                .toList()
                .toFlowable()
    }
}