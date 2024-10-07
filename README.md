# Proyek Kotlin Sederhana

Proyek ini adalah contoh aplikasi sederhana yang ditulis dalam bahasa pemrograman Kotlin. Di dalamnya terdapat berbagai contoh kode untuk memahami sintaks dan fitur dasar Kotlin.

## Struktur Proyek

```
my_kotlin_app/
│
├── main.kt
└── README.md
```

## Deskripsi

Aplikasi ini mencakup contoh kode untuk:

1. **Hello World**
2. **Variabel**
3. **Fungsi**
4. **Kondisional**
5. **Loop**
6. **Null Safety**
7. **Kelas dan Objek**
8. **Lambda dan Higher-Order Function**
9. **Extension Function**

## Cara Menjalankan

### Persyaratan

Pastikan kamu sudah menginstal [Kotlin](https://kotlinlang.org/docs/command-line.html) dan memiliki akses ke terminal atau command prompt.

### Langkah-langkah

1. **Clone atau Unduh Proyek**
   ```bash
   git clone <repository-url>
   cd my_kotlin_app
   ```

2. **Jalankan Kode**
   - Untuk menjalankan kode Kotlin, buka terminal dan gunakan perintah:
     ```bash
     kotlinc main.kt -include-runtime -d main.jar
     java -jar main.jar
     ```

## Contoh Kode

### Hello World

```kotlin
fun main() {
    println("Hello, World!")
}
```

### Variabel

```kotlin
val name: String = "Alice"
var age: Int = 25
```

### Fungsi

```kotlin
fun tambah(a: Int, b: Int): Int {
    return a + b
}

// Fungsi dengan single-line expression
fun kali(a: Int, b: Int) = a * b
```

### Kondisional

```kotlin
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
```

### Loop

```kotlin
// For loop
for (i in 1..5) {
    println(i) // Mencetak angka 1 sampai 5
}

// While loop
var x = 5
while (x > 0) {
    println(x)
    x--
}
```

### Null Safety

```kotlin
var nullableString: String? = null
println(nullableString?.length) // Menggunakan safe call (?.)
```

### Kelas dan Objek

```kotlin
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main() {
    val user = Person("Alice", 28)
    user.introduce() // Output: Hi, my name is Alice and I am 28 years old.
}
```

### Lambda dan Higher-Order Function

```kotlin
val sum = { a: Int, b: Int, operation: (Int, Int) -> Int ->
    return operation(a, b)
}

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println(applyOperation(3, 5, sum)) // Output 8
}
```

### Extension Function

```kotlin
fun String.hello() {
    println("Hello, $this!")
}

fun main() {
    "Kotlin".hello() // Output: Hello, Kotlin!
}
```

## Lisensi

Proyek ini dirilis di bawah lisensi MIT. Silakan lihat file LICENSE untuk informasi lebih lanjut.

```

Silakan sesuaikan bagian-bagian tertentu dari README ini sesuai kebutuhan proyekmu, seperti menambahkan informasi lisensi, kontributor, atau instruksi tambahan. Jika ada yang ingin ditambahkan atau diubah, beri tahu saja!
