package dev.farjana.kotlinbasics.classes

class Coin (private val coinNumber: Int ){
    private val coins = arrayOf(5,3,4)
    private var randomValue =0

    fun spin():Int{
        for(i in 1..coinNumber){
             randomValue= coins.random()
            println(randomValue)
        }
        return randomValue
    }
}