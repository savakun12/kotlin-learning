// ** Hello World **
fun main() {
    println("Hello, World!")
}

// ** Variabel **
val name: String = "Alice"
var age: Int = 25

// ** Function **
fun tambah(a: Int, b: Int): Int {
  return a + b
}

//Fungsi dengan single-line expression
fun kali(a: Int, b: Int) = a * b

// ** Kondisional **
fun nilaiUjian(nilai: Int): String {
    return if (nilai >= 90) {
        "A"
    } else if (nilai >= 80) {
        "B"
    } else if (nilai >= 70) {
        "C"
    } else {
        "D"
    }
}

// ** Loop **
//for
for (i in 1..5) {
    println(i) // Mencetak angka 1 sampai 5
}

//while
var x = 5
while (x > 0) {
    println(x)
    x--
}

//Null safety
var nullableString: String? = null
println(nullableString?.length) //Menggunakan safe call (?.)

//CLass dan Object
class Person(val name: String var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main() {
    val user =  User("Alice", 28)
    println(user) //Output: User(name=Alice, age=28)
}

//Lambda dan Higher-Order Function
val sum = { a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println(applyOperation(3, 5, sum)) // Output 8
}

//Extension function
fun String.hello() {
    println("Hello, $this!")
}

fun main() {
    "Kotlin".hello()//Output: Hello, Kotlin!
}

