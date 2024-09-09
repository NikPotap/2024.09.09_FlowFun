import kotlinx.coroutines.flow.*
import kotlin.system.measureTimeMillis

suspend fun main() {
    val listSize = inputQuantity()
    val firstChar = inputFirstChar()
    var result: Map<String, String> = mapOf()

    val time: Long = measureTimeMillis {
        result = getIdFlow(listSize).zip(getPasswordFlow(firstChar, listSize)) { id, password -> Pair(id, password) }
            .toList().toMap()
    }
    println("Список паролей:\n$result")
    println("Всего создано паролей: $listSize.")
    println("Затрачено времении на создание списка: $time мс.")
}

fun getIdFlow(length: Int) = flow {
    for (item in getListId(length)) {
        emit(item)
    }
}

fun getPasswordFlow(input: String, length: Int) = flow {
    for (item in getListOfPassword(input, length)) {
        emit(item)
    }
}