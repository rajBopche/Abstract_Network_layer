package utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import network.Result

//This method wraps the real api call in try-catch block and return a network.Result accordingly
suspend fun <T> safeLaunch(block: suspend () -> T): Result<T> {

    val result = Result<T>()

    try {
        val response: T? = withContext(Dispatchers.IO) {
            block() // this coroutine  is suspended till the result returns
        }

        response?.let { it ->
            //  we get response without any exception and add it to result
            result.apply {
                data = it // if data is not null add response to data
                code = 200 // success response
            }
        }

    } catch (e: Exception) { // we get a exception and add it to result
        result.apply {
            data = null  // if exception occurred, set data to null
            code = 500  //failure response
        }
    }

    return result // return result
}