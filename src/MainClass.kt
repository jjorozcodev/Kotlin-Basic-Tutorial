

fun main (args: Array<String>)
{
    val realName = "Juan José" // Se usa VAL para variables inmutables (constantes)
    var alias = "JohnCoder" // Se usa VAR para variables mutables

    // realName = "" // no se permite
    alias = "JJ"

    println("Hi $alias!! ($realName)") // Concatenación con operador $

    val BigInt : Int = Int.MAX_VALUE
    val SmallInt : Int = Int.MIN_VALUE

    println("Biggest Int: " + BigInt) // Otra manera de concatenar
    println("Smallest Int: $SmallInt")

    val BigLong : Long = Long.MAX_VALUE
    val SmallLong : Long = Long.MIN_VALUE

    println("Biggest Long: " + BigLong)
    println("Smallest Long: $SmallLong")

    val BigDouble : Double = Double.MAX_VALUE
    val SmallDouble : Double = Double.MIN_VALUE

    println("Biggest Double: " + BigDouble)
    println("Smallest Double: $SmallDouble")

    val BigFloat : Float = Float.MAX_VALUE
    val SmallFloat : Float = Float.MIN_VALUE

    println("Biggest Float: " + BigFloat)
    println("Smallest Float: $SmallFloat")

    val OtherLong : Long = BigInt.toLong() // Un tipo numérico más simple no se puede asignar a uno más complejo a menos que se haga un cast explícito
    println("Un INT que se convirtió en LONG: " + OtherLong)
}