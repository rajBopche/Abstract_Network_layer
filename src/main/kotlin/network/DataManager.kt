package network

import apiconfig.ApiClient
import model.User
import model.UserRepo
import utils.safeLaunch

class DataManager {  //This class handles all Data Request and Manipulation

    private val networkApiClient = ApiClient.apiClient

    suspend fun getUsers(): List<User>? {
        val result = safeLaunch {
            // this block is suspended until the result arrives
            networkApiClient.getUsers()
        }
        return when (result.code) { //depending on result code return response or null
            200 -> result.data
            else -> null
        }
    }

    suspend fun getUserRepos(userName: String): List<UserRepo>? {
        val result = safeLaunch {
            // this block is suspended until the result arrives
            networkApiClient.getUserRepos(userName)
        }
        return when (result.code) {
            200 -> result.data
            else -> null
        }
    }

}