/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/
 fun numberCompare(number1: Int,number2: Int):String {
    val result = if (number1 > number2)
        "Первое число больше"
    else
        if (number2 > number1)
            "Второе число больше"
        else
            "Числа равны"
    return result
}
//Вариант2 ( не выводится - второе число больше!)

 /*fun numberCompare(number1: Int,number2: Int): String {
    val result = when {
        number1 > number2 -> number1.toString()
        number2 > number1 -> number2.toString()
        else -> "Числа равны"
    }
    return result */

fun main() {
    val number1: Int = 6
    val number2: Int = 5
    val result = numberCompare(number1, number2)
    println(result)


}


