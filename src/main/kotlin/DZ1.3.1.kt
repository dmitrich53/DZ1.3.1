fun main() {
    while (true) {
        println("Ведите кол-во секунд с момента последнего посещения  и нажмите ENTER.")
        println("              Или введите q и нажмите  ENTER.")
        val seconds = readLine()
        if (seconds != "q") {
//            println(seconds)
            when (seconds?.toInt()) {
                in 0..60 -> println("Был(а) в сети только что.")
                in 61..60 * 60 -> if (seconds != null) {
                    inMinutes(seconds.toInt())
                }
                in 60 * 60 + 1..24 * 60 * 60 -> if (seconds != null) {
                    inHours(seconds.toInt())
                }
                in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> println("Был(а) в сети сегодня.")
                in 2 * 24 * 60 * 60 + 1..24 * 60 * 60 * 3 -> println("Был(а) в сети вчера.")
                else -> {
                    println("Был(а) в сети давно.")
                }
            }
        } else break
    }
}

fun inMinutes(n1: Int) {
    val minutes = (n1 / 60)
    val x = minutes.toString()
    val x1 = x.length
    return when (x[x1 - 1]) {
        in "1" -> println("Был(а) в сети " + (n1 / 60) + " минуту назад.")
        in "2..3..4" -> println("Был(а) в сети " + (n1 / 60) + " минуты назад.")
        else -> {
            println("Был(а) в сети " + (n1 / 60) + " минут назад.")
        }
    }

}

fun inHours(h1: Int) {
    val hours = (h1 / 3600)
    val x = hours.toString()
    val x1 = x.length
    return when (x[x1 - 1]) {
        in "1" -> println("Был(а) в сети " + (h1 / 3600) + " час назад.")
        in "2..3..4" -> println("Был(а) в сети " + (h1 / 3600) + " часа назад.")
        else -> {
            println("Был(а) в сети " + (h1 / 3600) + " часов назад.")
        }
    }

}











