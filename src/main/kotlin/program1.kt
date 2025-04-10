
fun main() {
    println("Odd Number")
    println(filterOdd(listOf(2, 3, 33, 55, 2, 555, 22)))
    println("******************************************")

    println("\nReverse String")
    println(reverseString("rahul"))
    println("******************************************")

    println("\nFind vowels")
   val (vowels,consonts)= findVOwels("rahul bhusare123")
    println("vowels=$vowels  consonts=$consonts")
    println("******************************************")


}

fun filterOdd(num:List<Int>):List<Int>{
   return num.filter { it%2!=0 }.sortedDescending()
}

fun reverseString(input:String):String{
    var reversed:String=""
    for (i in input.length-1 downTo 0){
        reversed+=input[i]
    }
    return reversed
}

fun findVOwels(input:String):Pair<Int,Int>{
    var vowel=0
    var consonts=0
    val vowelSets= setOf('a','e','i','o','u')

    for (i in input){
        if (i in 'a'..'z'){
            if (i in vowelSets) {
                vowel++
            }else{
                consonts++
            }
        }


    }
    return Pair(vowel,consonts)

}
