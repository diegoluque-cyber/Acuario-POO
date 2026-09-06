package ejemplo

fun crearAnimales() {

    println("===== SISTEMA DE ANIMALES =====")

    val perro = Perro(
        nombre = "Max",
        edad = 3
    )

    perro.peso = 12.5

    perro.mostrarInformacion()
    perro.hacerSonido()
    perro.moverse()

    println()

    val gato = Gato(
        nombre = "Michi",
        edad = 2
    )

    gato.peso = 4.2

    gato.mostrarInformacion()
    gato.hacerSonido()
    gato.moverse()
}

fun main() {

    crearAnimales()
}