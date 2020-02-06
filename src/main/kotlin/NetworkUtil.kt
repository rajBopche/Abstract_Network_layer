import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun <T> safeLaunch(block: suspend () -> T): Result<T> {

    val result = Result<T>()

    try {
        val response: T? = withContext(Dispatchers.IO) {
            block()
        }

        response?.let { it ->
            result.apply {
                data = it
                code = 200 // success response
            }
        }

    } catch (e: Exception) {
        result.apply {
            data = null
            code = 500  //failure response
        }
    }

    return result
}