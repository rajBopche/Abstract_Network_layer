import com.google.gson.annotations.SerializedName

open class BaseNetworkResponse {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    open var name: String = ""
}