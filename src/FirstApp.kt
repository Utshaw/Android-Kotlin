
fun foo(name: String): Int {
    print("Hello $name")
    return 100
}


fun main(args: Array<String>) {
    val someVal = "some"
    someVal?.toUpperCase() // call toUpperCase only if not null

}