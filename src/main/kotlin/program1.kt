fun main() {
    //write a function which will take list of numbers, remove odd numbers and then sort it in descending order
    println("Odd Number")
    println(filterOdd(listOf(2, 3, 33, 55, 2, 555, 22)))
    println("******************************************")

    //.Write a function to reverse a given string without using any predefined methods.

    println("\nReverse String")
    println(reverseString("rahul"))
    println("******************************************")

    //Write a function that counts the number of vowels and consonants in a given string

    println("\nFind vowels")
    val (vowels, consonants) = findVowels("rahul bhusare123")
    println("vowels=$vowels  consonts=$consonants")
    println("******************************************")

    //Write a function that counts and prints the occurrences of each character in a given string

    println("\nChar Occurrence")
    println(charOccurrence("rahulbbaal"))
    println("******************************************")

    //.Write a function to perform basic string compression using the counts of repeated characters. For example, the string "aabcccccaaa" would become "a2b1c5a3"

    println("\n Compress String")
    println(compressChar("aaabbdddaa"))
    println("******************************************")


    //Write a program that reverses each word in a string while maintaining the original order of words. [ex. I love programing = I evol gnimargorp]
    println("\n reverses word")
    println(reverseWords("I love programing"))
    println("******************************************")


}

fun filterOdd(num: List<Int>): List<Int> {
    return num.filter { it % 2 != 0 }.sortedDescending()
}

fun reverseString(input: String): String {
    var reversed: String = ""
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}

fun findVowels(input: String): Pair<Int, Int> {
    var vowels = 0
    var consonants = 0
    val vowelSet = setOf('a', 'e', 'i', 'o', 'u')

    for (i in input) {
        if (i in 'a'..'z') {
            if (i in vowelSet) {
                vowels++
            } else {
                consonants++
            }
        }


    }
    return Pair(vowels, consonants)

}

fun charOccurrence(input: String) {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    val st = StringBuilder()
    for ((char, count) in charCountMap) {
        st.append("$char$count")
        println("char = $char  count = $count")
    }
    println(st)
}


fun compressChar(input: String): String {
    var count = 1
    var compress = StringBuilder()
    //aaabbdddaa
    for (i in 0 until input.length - 1) {
        if (input[i] == input[i + 1]) {
            count++
        } else {
            compress.append(input[i])
            compress.append(count)
            count = 1
        }


    }
    compress.append(input.last())
    compress.append(count)
    return compress.toString()
}

fun reveseChar(input: String): String {
    var charArray = input.split(" ").reversed()
    var result = charArray.joinToString { " " }

    return result
}

fun reverseWords(input: String): String {
    var charArray = input.split(" ")
    return charArray.joinToString(" ") { it.reversed() }
}

