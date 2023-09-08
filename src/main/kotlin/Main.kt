fun main(args: Array<String>) {
    // Задание 1
    val age1 = 42
    val age2 = 21

    // Задание 2
    /*
    Константа avg1 имеет тип Int, хотя
    среднее арифметическое число не целое
    */
    val avg1 = (age1 + age2) / 2

    // Задание 3
    /*
    Теперь всё правильно, потому что
    константа avg2 имеет вещественный тип
    */
    val avg2 = (age1.toDouble() + age2.toDouble()) / 2

    // Задание 4
    val firstName = "Ольга"
    val lastName = "Макаренко"

    // Задание 5
    val fullName = firstName + ' ' + lastName

    // Задание 6
    val myDetails = "Привет, меня зовут ${fullName}."

    // Задание 7
    val date = Triple(9, 8, 2023)

    // Задание 8
    val (month, day, year) = date

    // Задание 9
    val (month1, _, year2) = date

    // Задание 10
    var month2 = month1
    month2++
    val date2 = Pair(month2, year2)
}