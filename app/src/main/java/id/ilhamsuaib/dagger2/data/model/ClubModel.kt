package id.ilhamsuaib.dagger2.data.model

import com.google.gson.annotations.SerializedName
import id.ilhamsuaib.dagger2.presentation.model.Club

/**
 * Created by ilham on 3/7/18.
 */

data class ClubModel(

        @field:SerializedName("key")
        private val key: String? = "",

        @field:SerializedName("name")
        private val name: String? = "",

        @field:SerializedName("code")
        private val code: String? = "") {

    fun transform(): Club = Club(key = this.key, name = this.name, code = this.code)
}