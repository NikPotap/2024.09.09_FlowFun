fun getListOfPassword(input: String, length: Int): List<String> {
    var listOfPassword = mutableListOf<String>()
    while (listOfPassword.size < length) {
        val temp = createPassword()
        if (temp.first().toString() != input) continue
        listOfPassword.add(temp)
    }
    return listOfPassword
}