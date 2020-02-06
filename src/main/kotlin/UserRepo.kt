import com.google.gson.annotations.SerializedName

data class UserRepo(
    @SerializedName("private")
    val isPrivate: Boolean

) : BaseNetworkResponse()