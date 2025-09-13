fun main() {
    //Task 1
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    val status = if (level < 10) "Новичок" else if (level < 50) "Опытный" else "Легенда"
    val bonus = if (level < 10) 10 else if (level < 50) 30 else 100
    println("Ваш статус: $status, вы получаете бонус +$bonus HP")

    //Task 2
    val age = readln().toInt()
    if (age < 12) println("Вы ребёнок") else if (age <= 17) println("Вы подросток") else println("Вы взрослый")

    //Task 3
    print("Введите число от 1 до 100: ")
    val number = readln().toInt()
    if (number in 10..50) println("Число $number входит в диапазон 10 - 50") else println("Число $number не входит в диапазон 10 - 50")

    //Task 4
    print("Введите один символ: ")
    val char = readln()[0]
    when {
        char in '0'..'9' -> println("Это цифра")
        char in 'a'..'z' || char in 'A'..'Z' -> println("Это буква латинского алфавита")
        char == ' ' -> println("Это пробел")
        else -> println("Это спецсимвол")
    }
}
