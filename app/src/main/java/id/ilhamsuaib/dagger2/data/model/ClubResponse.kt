package id.ilhamsuaib.dagger2.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by ilham on 3/7/18.
 */

class ClubResponse(
        @field:SerializedName("name")
        val error: String? = "",

        @field:SerializedName("clubs")
        val clubs: List<ClubModel>? = null)