fun getListId(length: Int): List<String> {
    var listOfId = mutableListOf<String>()
    for (num in 1..length) {
        var nextNum = num.toString()
        repeat(6 - num.toString().length) {
            nextNum = "0" + nextNum
        }
        listOfId.add(nextNum)
    }
    return listOfId
}