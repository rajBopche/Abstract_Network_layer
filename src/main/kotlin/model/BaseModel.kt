package model

import com.google.gson.annotations.SerializedName

open class BaseModel { // some common fields which are present in all model

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("name")
    open var name: String = ""
}