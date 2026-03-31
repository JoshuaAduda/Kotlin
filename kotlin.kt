// Section 1
// student record
var studentName:String = "Alex Morgan"//mutable
val studentId:Int = 2024001 //immutable
var GPA:Double = 3.75 //mutable
val isEnrolled:Boolean= true //immutable
val middleInitial:Char = 'J' //immutable
var output = "Student: $studentName $middleInitial. (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled"
var phoneNumber:String? = null  // nullable variable 

/*fun main() {
    
    println(output)
    println(phoneNumber)
}*/

// Section 2

fun displayMenu(){
	println(" ===MENU===")
    println()
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
    println("==============")
}
/*fun main(){
    displayMenu()
}*/
fun calculateDiscount(price: Double, discountPercent: Double): Double {                
    return price - (price * discountPercent / 100)                
}                

/*fun main() {                
    val discountedPrice: Double = calculateDiscount(50.00, 20.00)                
    println(discountedPrice) 
}*/

// Task 2.3
fun getGrades(score: Int): String {
    // Reordered to check highest grades first
    return if (score in 80..100) {
        "A"
    } else if (score in 65..79) {
        "B"
    } else if (score in 50..64) {
        "C"
    } else if (score in 35..49) {
        "D"
    } else {
        "F"
    }
    
    
//     if (score in 80..100){
//         "A"
//     }

}
/*fun main() {
    val score = 85 // Added variable declaration
    println(getGrades(score)) // Calls function and prints result
}*/

// Task 2.4
// Corrected Task 2.4
fun isEven(number: Int): Boolean {
    // A number is even if it leaves no remainder when divided by 2
    return number % 2 == 0
}

/*fun main() {
    val number = 12
    // Print true or false based on the result
    println(isEven(number)) 
}*/

// Section 3
// Task 3.1

var temperature:Int =25

/*fun main(){
    if (temperature >= 30){
        println("Hot day")
    }else if (temperature > 20){
        println("Perfect weather")
    }else{
        println("Cool day")
    }
 val temperature = 25
    
  println(temperature)
}*/

// Task 3.2
val dayOfWeek = "Monday" 

/*fun main() {
    val result = when (dayOfWeek) {
        "Saturday", "Sunday" -> "Weekend! Time to relax"
        "Monday" -> "Back to work"
        "Friday" -> "TGIF!"
        else -> "Regular weekday"
    }
    println(result)
}*/

// Task 3.3
var trafficLight = "GREEN"

/*fun main(){
    val trafficAction = when(trafficLight){
        "RED"-> "STOP"
        "YELLOW"-> "CAUTION"
        "GREEN"-> "GO"
        else -> "INVALID"
    }
    println(trafficAction)
}*/


// Section 4

// Task 4.1
/*fun main(){
var i=1
while(i<=10){
    println(i)
    i+=1
 }
}*/

// Task 4.2
/*fun main() {
    var i = 5
    while (i >= 1) {
        println("countdown: $i")
        i -= 1
    }
    println("Blast off!")
}*/

// Task 4.3
val shoppingList =listOf("Milk", "Eggs", "Bread","Butter","Coffee")
/*fun main(){
    for (list in shoppingList){
        println(list)
    }
}*/

// Task 4.4
K





