fun inputQuantity(): Int {
    while (true) {
        print("\nВведите необходимое количество паролей: ")
        var input = readln()
        if (input.toIntOrNull() == null) {
            println("Вводите число!")
            continue
        }
        if (input.toInt() < 1) {
            println("Минимальное значение - 1.")
            continue
        }
        if (input.toInt() > 100000) {
            println("Максимальное значение - 100000.")
            continue
        }
        return input.toInt()
    }
}

fun inputFirstChar(): String {
    while (true) {
        print("\nВведите первый символ для набора паролей: ")
        var input = readln()
        if (input.length != 1) {
            println("Нужен один символ!")
            continue
        }
        try {
            if ((input.lowercase() !in ("a".."z")) && (input.toInt() !in 0..9)) {
                println("Используйте символы латинского алфавита или цифры.")
                continue
            }
        } catch (e: Exception) {
            println("Используйте символы латинского алфавита или цифры.")
            continue
        }
        return input.uppercase()
    }
}