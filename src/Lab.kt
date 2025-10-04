fun main() {
    println("Введите первое число: ")
    val number1 = readln().toInt()
    println("Введите второе число: ")
    val number2 = readln().toInt()

    if (number1 > number2) {
        println("Первое число больше")
    } else if (number1 == number2) {
        println("Числа равны")
    } else {
        println("Второе число больше")
    }

    val max = if (number1 > number2) number1 else number2

    val numbers = 0..100 step 10
    val numbers2 = 0 until 100 step 10
    val numbers3 = 100 downTo 0 step 10  // исправил, чтобы корректно уменьшать

    val symbol = 'a'..'z'

    for (i in numbers) {
        println(i)
    }

    repeat(times = 5) {
        println(1)
    }

    print("Введите порядковый номер месяца (1-12): ")
    val index = readln().toInt()
    val month = when (index) {
        1 -> "Январь"
        2 -> "Февраль"
        3 -> "Март"
        4 -> "Апрель"
        5 -> "Май"
        6 -> "Июнь"
        7 -> "Июль"
        8 -> "Август"
        9 -> "Сентябрь"
        10 -> "Октябрь"
        11 -> "Ноябрь"
        12 -> "Декабрь"
        else -> "неизвестный месяц"
    }
    if (index in 1..12) {
        println("Вы ввели индекс $index, соответствующий месяцу: $month")
    }

    print("Введите первое число: ")
    val number3 = readln().toInt()
    print("Введите второе число: ")
    val number4 = readln().toInt()

    if (number3 > number4) {
        println("Число $number3 больше чем число $number4")
    } else {
        println("Число $number4 больше чем число $number3")
    }

    val max2 = if (number3 > number4) number3 else number4
    println("Максимальное число - $max2")

    print("Введите ваш возраст: ")
    val age = readln().toInt()
    val status = if (age >= 18) "Взрослый" else "Ребёнок"
    println(status)

    print("Введите ваш уровень: ")
    val level = readln().toInt()
    print("У вас есть VIP-статус? (true/false): ")
    val hasVIP = readln().toBoolean()

    if ((level >= 0 && hasVIP) || level >= 50) {
        println("Доступ разрешен!")
    } else {
        println("Доступ запрещен!")
    }

    print("Введите ваш уровень: ")
    val level2 = readln().toInt()

    if (level2 in 1..50) {
        println("Уровень $level2 соответствует требованиям! Вы можете зайти в данж!")
    } else {
        println("Высокий уровень! Вход воспрещён!")
    }

    println("Начинаем ритуал защиты")
    repeat(5) { index ->
        if (index == 2) {
            println("Пропускаем шаг ${index + 1} из-за магического вмешательства")
            return@repeat
        }
        println("Заклинание защиты активировано! (Шаг ${index + 1})")
    }
    println("Замок защищен!")

    val months = listOf("Python", "Kotlin", "C#", "C++", "Java")
    println(months[0])
    println(months.size)
    println("Kotlin" in months)

    val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Введите номер месяца (1-12): ")
    val input = readln().toInt()
    if (input in 1..12) {
        val days = daysInMonth[input - 1]
        println("В этом месяце $days дней.")
    } else {
        println("Некорректный номер месяца.")
    }

    val lowerCaseLetter: Char = 'a'
    val upperCaseLetter: Char = 'Q'
    val number: Char = '1'
    val space: Char = ' '
    val dollar: Char = '$'
    val chUnicode = '\u0040'
    println(chUnicode)
    println('a'.code)
    println(97.toChar())

    print("Введите символ: ")
    val ch = readln().first()
    val ch1 = 'b'
    val ch2 = ch1 + 1
    val ch3 = ch2 - 2

    var chVar = 'A'
    chVar += 10
    println(chVar)
    println(++chVar)
    println(++chVar)
    println(--chVar)

    println('a' < 'c')
    println('x' >= 'z')
    println('D' == 'D')
    println('Q' != 'q')
    println('A' < 'a')

    val one = '1'
    println(one.isDigit())
    println(one.isLetter())
    val capital = 'A'
    val small = 'e'
    println(capital.isLetterOrDigit())
    println(capital.isUpperCase())
    println(capital.isLowerCase())
    println(small.uppercase())
    println(small.uppercaseChar())
}
