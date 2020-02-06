class DataManager {

    private val networkApiClient = ApiClient.apiClient

    suspend fun getUsers(): List<User>? {
        val result = safeLaunch {
            networkApiClient.getUsers()
        }
        return when (result.code) {
            200 -> result.data
            else -> null
        }
    }

    suspend fun getUserRepos(userName: String): List<UserRepo>? {
        val result = safeLaunch {
            networkApiClient.getUserRepos(userName)
        }
        return when (result.code) {
            200 -> result.data
            else -> null
        }
    }

}