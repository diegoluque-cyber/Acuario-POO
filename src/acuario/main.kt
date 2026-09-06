package acuario

fun construirAcuario() {

    println("===== ACUARIO 1 =====")
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    println("\n===== ACUARIO 2 =====")
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    println("\n===== ACUARIO 3 =====")
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    println("\n===== ACUARIO 4 =====")
    val acuario4 = Acuario(
        ancho = 25,
        alto = 35,
        largo = 110
    )
    acuario4.imprimirTamano()

    println("\n===== ACUARIO CON PECES =====")
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    println("\n===== CAMBIANDO VOLUMEN =====")
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()

    acuario7.volumen = 70

    println("Después de cambiar el volumen a 70 litros:")
    acuario7.imprimirTamano()

    println("\n===== HERENCIA =====")

    val miAcuario = Acuario(
        ancho = 25,
        largo = 25,
        alto = 40
    )

    miAcuario.imprimirTamano()

    println("\n===== TANQUE TORRE =====")

    val miTorre = TanqueTorre(
        diametro = 25,
        alto = 45
    )

    miTorre.imprimirTamano()
}

fun crearPeces() {

    println("\n===== PECES =====")

    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Color del tiburón: ${tiburon.color}")
    tiburon.comer()

    println("Color del pez payaso: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun main() {

    construirAcuario()

    crearPeces()
}