package network

class Result<T> {  // A simple wrapper for our Network Response
    var data: T? = null // default value set to null
    var code: Int = -999 //default value set to -999
}