package id.ilhamsuaib.dagger2.data

import id.ilhamsuaib.dagger2.data.model.ClubResponse
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by ilham on 3/7/18.
 */

interface ApiService {

    @GET("opendatajson/football.json/master/2017-18/es.1.clubs.json")
    fun getClubs(): Flowable<ClubResponse>
}