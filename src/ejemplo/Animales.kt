package ejemplo

abstract class Animal(
    open var nombre: String,
    open var edad: Int
) {

    init {
        println("Creando animal: $nombre")
    }

    open val tipo: String
        get() = "Animal"

    open var peso: Double = 0.0
        get() = field
        set(value) {
            field = if (value > 0) value else 0.0
        }

    abstract fun hacerSonido()

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Edad: $edad años")
        println("Peso: $peso kg")
        println("Tipo: $tipo")
    }
}

interface AccionAnimal {

    fun moverse()
}

class Perro(
    override var nombre: String,
    override var edad: Int
) : Animal(nombre, edad), AccionAnimal {

    override val tipo: String
        get() = "Perro"

    override fun hacerSonido() {
        println("$nombre dice: ¡Guau guau!")
    }

    override fun moverse() {
        println("$nombre corre por el parque.")
    }
}

class Gato(
    override var nombre: String,
    override var edad: Int
) : Animal(nombre, edad), AccionAnimal {

    override val tipo: String
        get() = "Gato"

    override fun hacerSonido() {
        println("$nombre dice: ¡Miau!")
    }

    override fun moverse() {
        println("$nombre camina silenciosamente.")
    }
}