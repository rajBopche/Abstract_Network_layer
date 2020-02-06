import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import network.DataManager

fun main() {  //below code block can be in your ViewModel

    val mDataManager = DataManager()

    runBlocking(Dispatchers.IO) {
        //block main thread till all network calls are not completed

        val userList = mDataManager.getUsers() //get users list

        val userRepoList = mDataManager.getUserRepos("mojombo")// get user repos list
    }

}


