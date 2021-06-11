
fun foo() {
    print("This is some line")
}


fun main(args: Array<String>) {
    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
    val result = number1.toInt()  + number2.toInt()
    print(result)
}