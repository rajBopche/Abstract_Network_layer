import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

    @GET("users/{user}/repos")
    suspend fun getUserRepos(@Path("user") userName: String): List<UserRepo>

}