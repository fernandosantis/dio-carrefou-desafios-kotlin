fun main(args: Array<String>) {

/* EXERCICIO 3 - Taxa de IR
    Desafio
    Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

    Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.



    Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

    Entrada
    A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

    Saída
    Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".

*/




    // continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',', '.')
    // val r = readLine()!!.toFloat()

    // teste
    // val r = 3002.00F
    // val r = 1701.12F
     val r = 4520F

    var i = 0F

    if (r > 4500F) {
        i = ((r - 4500F) * 28 / 100) + (1500F * 18 / 100) + (1000F * 8 / 100)
    } else if (r > 3000F) {
        i = ((r - 3000F) * 18 / 100) + (1000F * 8 / 100)
    } else if (r > 2000F) {
        i = (r - 2000F) * 8 / 100
    } else {
        i = 0F
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}
