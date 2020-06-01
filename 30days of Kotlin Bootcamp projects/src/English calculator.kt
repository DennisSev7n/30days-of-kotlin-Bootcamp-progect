//This is a calculator that uses words instead of symbols to carry out various operations
fun main(args: Array<String>){
    println("Hello! this is a simple calculator that uses words instead of symbols so as to help people with VISUAL AGNOSIA use the calculator '")
print("Enter the first number:")
    val num1:Int = readLine()!!. toInt()
    print("Enter the second number:")
    val num2: Int= readLine()!!. toInt()
    print("Enter operator (add, subtract, multiply,, divide): ")
    val operator:String= readLine()!!. toString()

    var result: Int = 0

    when(operator){
        "add" -> result =num1 + num2
        "subtract" -> result = num1 - num2
        "multiply" -> result = num1 * num2
        "divide"->result=num1/num2
    //if the operator dosen't match the constant given
else -> { println("Error! operator is not valid")}
}
println("When we $operator $num1 and $num2, it is = $result")
}

