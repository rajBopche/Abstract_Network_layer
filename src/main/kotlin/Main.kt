import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

fun main() {  //this class can be your ViewModel/Activity
    val mDataManager = DataManager()
    runBlocking(Dispatchers.IO) {
        println("\n\n=============== Printing Users =======================\n\n")
        mDataManager.getUsers()?.forEach {
            println("${it.name}\n")
        }
        println("\n\n=============== Printing User Repo =======================\n\n")
        mDataManager.getUserRepos("mojombo")?.forEach {
            println("${it.name}\n")
        }
    }
}


