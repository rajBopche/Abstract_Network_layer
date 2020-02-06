import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("site_admin")
    val siteAdmin: String,

    @SerializedName("login")
    override var name: String

) : BaseNetworkResponse()