
// Section 1
// task 1.1  
// Student record
var studentName:String = "Klynx Junior"
val studentId:Int = 2024001
var GPA:Double = 3.75
val isEnrolled:Boolean = true
val middleInitial:Char = 'J'
 
// task 1.2  
val output = "Student: $studentName $middleInitial (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled"     

// task 1.3
var phoneNumber:String? = null


// fun main() { 
//     println(output)
//     println(phoneNumber)
// }


// Section 2
// Task2.1
fun displayMenu() {
    println("=== MENU ===")
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
    println("============")
}

// fun main() {
//     displayMenu()
// }
// task 2.2
fun calculateDiscount(price: Double, discountPercent: Double): Double {
    return price - (price * discountPercent / 100)
}

// fun main() {
//     val finalPrice = calculateDiscount(1000.0, 25.0)
//     println("Discounted Price: $finalPrice")
// }
// task 2.3
fun getGrade(score: Int): String {
    return if (score in 80..100) {"A"} 
    else if (score in 65..79) {"B"}
    else if (score in 50..64) {"C"}
    else if (score in 40..49) {"D"}
    else {"F"}
}

// fun main() {
//     val score = 70
//     println(getGrade(score))
// }

// // task 2.4
// fun isEven(number: Int):Boolean = number % 2 == 0
//     fun main() {
//     println(isEven(4))  
//     println(isEven(7))  
// }
// Section 3
// Task3.1
var temperature:Int =25

fun main(){
    if (temperature >= 30){println("Hot day")}
    else if (temperature > 20){println("Perfect weather")}
    else{println("Cool day")}
 val temperature = 35
    
//   println(temperature)
// }
// Task3.2
    

