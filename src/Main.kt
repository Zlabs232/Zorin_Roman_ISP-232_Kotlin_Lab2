//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Task 1
    print("Введите ваш уровень: ")
    val level = readln().toInt()
    val status = if (level < 10) "Новичок" else if (level < 50) "Опытный" else "Легенда"
    val bonus = if (level < 10) 10 else if (level < 50) 30 else 100
    println("Ваш статус: $status, вы получаете бонус +$bonus HP")

}
