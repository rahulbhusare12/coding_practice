fun main(){
    val num= arrayOf(1,2,3,4,4,5,6,7,8,9)

    var str= "rahul bhusare"

    val sSplit =str.split(" ")
    sSplit.forEach{
        println(it.reversed())
    }
    var student:Student
    val result= higerOrder(a=10,b=20){
        a,b-> a+b

    }
    println(result)
   handelState(UIState.Success("Hello Error"))
   /* val students= listOf<Student>(Student("Rahul",80),Student("Swapnesh",90),Student("aaa",55))
    students.forEach{

    }
    println(students.isGrater())


*//*    num.forEach {
        println(it)
    }*//*

    val original="Rahul"
    var reverse=original.reverseString()



println(reverseString("ra"))*/
}

fun String.reverseString():String{
   return  this.reversed()
}

data class Student(
    val name:String,
    val mark:Int
)

fun List<Student>.isGrater():List<String>{
    return this.filter { it.mark>60 }.map { it.name }
}

sealed class UIState{
    object  Loading:UIState()
    data class  Success(val data:String):UIState()
    data class Error(val msg:String):UIState()
}

fun handelState(uiState: UIState){
    when(uiState){
        is UIState.Loading->{
            println("Loading")
        }
        is UIState.Error -> {
            println(uiState.msg)
        }
        is UIState.Success -> println(uiState.data)
    }

}

fun higerOrder( a:Int,b:Int,ab:(Int,Int)-> Int):Int{

    return ab(a,b)
}

