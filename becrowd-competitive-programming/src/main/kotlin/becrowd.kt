import java.util.*
import kotlin.math.pow


fun main(args: Array<String>) {

    ageInDays()

}

fun areaOfCircle() {

    println("Enter the radius")
    val reader = Scanner(System.`in`)
    val pi = 3.14159
    val radius: Double = reader.nextDouble()

    val area = radius.pow(2.0) * pi
    val A = String.format("%.4f", area)
    print("A=$A")
    println()

}

fun simpleSum() {
    val reader = Scanner(System.`in`)
    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()
    val SOMA = A + B
    print("SOMA = $SOMA")
    println()
}

fun simpleProduct() {
    val reader = Scanner(System.`in`)
    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()
    val PROD = A * B
    print("PROD = $PROD")
    println()
}

fun average1() {
    val reader = Scanner(System.`in`)
    val A: Double = reader.nextDouble()
    val B: Double = reader.nextDouble()
    val MEDIA: Double = (A * 3.5 + B * 7.5) / (3.5 + 7.5)
    print("MEDIA = ${String.format("%.5f", MEDIA)}")
    println()
}

fun average2() {
    val reader = Scanner(System.`in`)
    val A: Double = reader.nextDouble()
    val B: Double = reader.nextDouble()
    val C: Double = reader.nextDouble()
    val MEDIA: Double = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5)
    print("MEDIA = ${String.format("%.1f", MEDIA)}")
    println()
}

fun difference() {
    val reader = Scanner(System.`in`)
    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()
    val C: Int = reader.nextInt()
    val D: Int = reader.nextInt()
    val DIFERENCA: Int = (A * B - C * D)
    print("DIFERENCA = ${String.format("%d", DIFERENCA)}")
    println()
}

fun salary() {
    val reader = Scanner(System.`in`)
    val employeeNumber = reader.nextInt()
    val workedHours = reader.nextInt()
    val amountReceivedByHour = reader.nextDouble()

    val salary = workedHours * amountReceivedByHour
    println("NUMBER = $employeeNumber")
    print("SALARY = U\$ ${String.format("%.2f", salary)}")
    println()

}

fun salaryWithBonus() {
    val reader = Scanner(System.`in`)
    val sellerName = reader.next()
    val fixedSalary = reader.nextDouble()
    val saleTotal = reader.nextDouble()

    val salary = fixedSalary + saleTotal * 0.15
    print("TOTAL = R\$ ${String.format("%.2f", salary)}")
    println()
}

fun simpleCalculate() {
    val reader = Scanner(System.`in`)

    val code1 = reader.nextInt()
    val units1 = reader.nextInt()
    val price1 = reader.nextDouble()

    val code2 = reader.nextInt()
    val units2 = reader.nextInt()
    val price2 = reader.nextDouble()

    val valorPagar = units1 * price1 + units2 * price2

    print("VALOR A PAGAR: R\$ ${String.format("%.2f", valorPagar)}")
    println()
}

fun sphere() {
    val reader = Scanner(System.`in`)

    val radiusRaisedTo3 = reader.nextDouble().pow(3)
    val volume = (4.0 / 3) * 3.14159 * radiusRaisedTo3

    print("VOLUME = ${String.format("%.3f", volume)}")
    println()
}

fun area() {
    val reader = Scanner(System.`in`)
    val A = reader.nextDouble()
    val B = reader.nextDouble()
    val C = reader.nextDouble()
    val pi = 3.14159

    val areaRectangleTriangleBaseAHeightC = A * C / 2
    val areaCircleOfRadiusC = pi * C.pow(2)
    val areaTrapeziumOfBasesAandBHeighC = (A + B) * C / 2
    val areaSquareSideB = B.pow(2)
    val areaRectangleSidesAandB = A * B

    println("TRIANGULO: ${String.format("%.3f", areaRectangleTriangleBaseAHeightC)}")
    println("CIRCULO: ${String.format("%.3f", areaCircleOfRadiusC)}")
    println("TRAPEZIO: ${String.format("%.3f", areaTrapeziumOfBasesAandBHeighC)}")
    println("QUADRADO: ${String.format("%.3f", areaSquareSideB)}")
    print("RETANGULO: ${String.format("%.3f", areaRectangleSidesAandB)}")

    println()

}

fun theGreatest() {
    val reader = Scanner(System.`in`)

    val firstValue = reader.nextInt()
    val secondValue = reader.nextInt()
    val thirdValue = reader.nextInt()

    var maior = (firstValue + secondValue + Math.abs(firstValue - secondValue)) / 2;
    maior = (maior + thirdValue + Math.abs(maior - thirdValue)) / 2

    print("$maior eh o maior")
    println()
}

fun consumption() {
    val reader = Scanner(System.`in`)

    val distance = reader.nextInt()
    val spentFuel = reader.nextDouble()

    val averageConsumption = distance / spentFuel

    println("${String.format("%.3f", averageConsumption)} km/l")
}

fun distanceBetweenTwoPoints() {
    val reader = Scanner(System.`in`)

    val x1 = reader.nextDouble()
    val y1 = reader.nextDouble()
    val x2 = reader.nextDouble()
    val y2 = reader.nextDouble()

    val distance = Math.sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    print("${String.format("%.4f", distance)}")
    println()
}

//https://www.beecrowd.com.br/judge/en/problems/view/1016
fun distance() {
    val reader = Scanner(System.`in`)

    val distance = reader.nextInt()
    val time = (60 * distance) / 30;
    print("${String.format("%d minutos", time)}")
    println()
}

//https://www.beecrowd.com.br/judge/en/problems/view/1017
fun fuelSpent() {
    val reader = Scanner(System.`in`)

    val spentTime = reader.nextInt()
    val averageSpeed = reader.nextInt()
    val distance = spentTime * averageSpeed.toFloat()

    val liters = distance / 12;
    print("${String.format("%.3f", liters)}")
    println()
}

fun banknotes() {
    val reader = Scanner(System.`in`)
    var value = reader.nextInt()
    var valueSaved = value
    val bankNotesValue = listOf(100, 50, 20, 10, 5, 2, 1)
    val bankNotesQuantity = mutableMapOf<Float, Int>()

    fun isDivisible(noteValue: Int): Boolean {
        val quantity = value % noteValue
        val numberOfNotes = value / noteValue

        return when (value) {
            0 -> {
                bankNotesQuantity[noteValue.toFloat()] = 0
                false
            }

            quantity -> {
                bankNotesQuantity[noteValue.toFloat()] = 0
                true
            }

            else -> {
                bankNotesQuantity[noteValue.toFloat()] = numberOfNotes
                value -= numberOfNotes * noteValue
                true
            }
        }
    }
    bankNotesValue.map(::isDivisible)
    println(valueSaved)
    bankNotesQuantity.forEach { (value, quantity) ->
        println(
            String.format(
                "%d nota(s) de R\$ %.2f",
                quantity,
                value
            )
        )
    }

}

//TODO
fun banknotesSecondWay() {

    val reader = Scanner(System.`in`)
    var value = reader.nextInt()
    if (value == 0)
        return

    var valueSaved = value
    val bankNotesValue = listOf(100, 50, 20, 10, 5, 2, 1)
    val bankNotesQuantity = mutableMapOf<Float, Int>()

    for (noteValue in bankNotesValue) {
        val quantity = value % noteValue
        val numberOfNotes = value / noteValue

        when (value) {
            0 -> {
                bankNotesQuantity[noteValue.toFloat()] = 0
            }

            quantity -> {
                bankNotesQuantity[noteValue.toFloat()] = 0
            }

            else -> {
                bankNotesQuantity[noteValue.toFloat()] = numberOfNotes
                value -= numberOfNotes * noteValue
            }
        }
    }
    println(valueSaved)
    bankNotesQuantity.forEach { (value, quantity) ->
        println(
            String.format(
                "%d nota(s) de R\$ %.2f",
                quantity,
                value
            )
        )
    }
}

//https://www.beecrowd.com.br/judge/en/problems/view/1019
fun timeConversion() {
    val reader = Scanner(System.`in`)
    var value = reader.nextInt()

    val hour = value / 3600
    val minute = (value % 3600) / 60
    val second = (value % 3600) % 60

    println(
        String.format(
            "%d:%d:%d",
            hour,
            minute,
            second
        )
    )
}

//https://www.beecrowd.com.br/judge/en/problems/view/1020
fun ageInDays() {
    val reader = Scanner(System.`in`)
    var ageInDays = reader.nextInt()

    val years = ageInDays / 365
    var months = (ageInDays % 365) / 30
    var days = (ageInDays % 365) % 30

    println(
        String.format(
            "%d ano(s)%n%d mes(es)%n%d dia(s)",
            years,
            months,
            days
        )
    )
}

