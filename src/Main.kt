//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    блок с выведенным результатом задачи № 1
    val str1: String = "Ivar Johnsovich Jacobson 35 years old"
    val result1 = task1(str1)
    println("Фамилия - ${result1[1]}")
    println("Имя - ${result1[0]}")
    println("Возраст - ${result1[3]}")


//   блок с выведенным результатом задачи № 2
    println("element no fruit: ${isFruit(str_2)}")


//  блок с выведенным результатом задачи № 3
    val user = User(name = "Ivar", age = 35)
    println("age = ${user.age} and name ${user.name}")
    user.name = "Igor"
    println("age = ${user.age} and name ${user.name}")

//    блок с выведенным результатом задачи № 4
    println(user.showMessage())

//    блок с выведенным результатом задачи № 5
    val room = Room(id="some_id", title = "some_title", admin=user)
    println(room.showMessage())
    room.title = null
    println(room.showMessage())


}

// Задача 1 "Переменные" ф-ция возвращает Array<String>

fun task1(str: String, delim: String = " "): Array<String> {
    val result = str.split(delim).toTypedArray()
    println("Successfully done")
    return result
}

//Задача 2: "Циклы" ф-ция принимает исходный массив и возвращает элемент не явл. фруктом, то есть элемент который не содержится в массиве fruits
var str_2: Array<String> = arrayOf("Apple", "Banana", "Orange", "100")

fun isFruit(arr: Array<String>): String {
    var result: String = " "
    var fruits = arrayOf("Apple", "Banana", "Orange")
    for (el in arr) {
        if (el !in fruits) result = el
    }
    return result
}

// Задача 3  and Задача 4:
data class User(var name: String = " ", var age: Int = 0){
    fun showMessage(): String{
        return "${this.name} has accepted your invitation, the age of ${this.name} is ${this.age}"
    }
}

// Задача 5:

data class Room(var id: String? = null, var title: Any? = null, var admin: User? = null){
    fun showMessage(): String{
        return "The room id is ${this.validation(this.id)}, it has a title ${this.validation(this.title)} and the admin of the room is ${this.validation(this.admin?.name)}"
    }
    private fun validation(el: Any?): Any{
        return el ?: "N/A"
    }
}