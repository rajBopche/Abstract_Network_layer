package model

import com.google.gson.annotations.SerializedName

data class User( //User Model
    @SerializedName("site_admin")
    val siteAdmin: String,

    @SerializedName("login")
    override var name: String

) : BaseModel()