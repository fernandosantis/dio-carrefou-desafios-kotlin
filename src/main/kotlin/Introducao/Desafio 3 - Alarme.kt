import kotlin.math.abs

fun main(args: Array<String>) {

/*        input = readLine()!!.split(" ").map { it.toInt() }
        val (h1, m1, h2, m2 ) = input*/
    val h1 = 23
    val m1 = 30
    val h2 = 0
    val m2 = 34
    if ( h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0 ) { println("Ultima Linha") }
    else {
//complete os espaços vazios com os códigos que estão faltando
        val x = h1 * 60 + m1
        var y = h2 * 60 + m2
        if (y <= x) {
            y += 24 * 60
        }
        println(y - x)
    }
}
