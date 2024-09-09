fun createPassword(): String {
    var password = ""
    for (i in 0..5) {
        val charOrDigit = listOf(true,false).random()
        if (charOrDigit) {
            password += (0..9).random().toString()
        } else {
            if (i % 2 == 0) {
                password += ('a'..'z').random().uppercase()
            } else {
                password += ('a'..'z').random()
            }
        }
    }
    return password
}