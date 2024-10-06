## Hello World
fun main() {
    println("Hello, World!")
}

## Variabel
val name: String = "Alice"
var age: Int = 25

## Function
fun tambah(a: Int, b: Int): Int {
  return a + b
}

//Fungsi dengan single-line expression
fun kali(a: Int, b: Int) = a * b

##Kondisional
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
        
