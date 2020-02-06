package model

import com.google.gson.annotations.SerializedName

data class UserRepo( // User Repo Model
    @SerializedName("private")
    val isPrivate: Boolean

) : BaseModel()