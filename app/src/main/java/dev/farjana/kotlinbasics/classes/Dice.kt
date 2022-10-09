package dev.farjana.kotlinbasics.classes

class Dice(private val sides:Int) {
    private val colors= arrayOf( "Red", "Green","Blue")
    fun roll(): Int {
        return (1..sides).random()
    }
    fun rollColor():String{
        return colors.random()
    }
}
