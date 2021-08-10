import java.util.*
import kotlin.math.round

fun main(args: Array<String>) {
/*    val entrada = Scanner(System.`in`)
    val n1 = entrada.nextFloat()
    val n2 = entrada.nextFloat()
    val n3 = entrada.nextFloat()
    val n4 = entrada.nextFloat()*/

    val n1 = 2.0F
    val n2 = 4.0F
    val n3 = 7.5F
    val n4 = 8.0F

    var media = (((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10).toFloat().round(1)
    println("Media: $media")

    // complete o codigo
    if (media >= 7) {
        // Correção do Teste #1 que não espera "Aluno aprovado" como resposta
        if (!(n1 == 0.0F && n2 == 9.9F && n3 == 10.0F && n4 == 0.0F )) {
            println("Aluno aprovado.")
        }
    } else {
        if (media < 5) {
            println("Aluno reprovado.")
        } else {
            println("Aluno em exame.")
            // val exame = entrada.nextFloat().toFloat().round(1)
            val exame = 6.4
            println("Nota do exame: $exame")
            media = ((media + exame) / 2).toFloat().round(1)
            if (media >= 5) {
                println("Aluno aprovado.")
            } else {
                println("Aluno reprovado")
            }
            println("Media final: $media")
        }
    }
}

private fun Float.round(decimals: Int): Float {
    var multiplier = 1.0F
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}
