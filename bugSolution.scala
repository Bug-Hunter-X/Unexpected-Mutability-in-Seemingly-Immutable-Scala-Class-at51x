```scala
class MyClass(val name: String, var age: Int) {
  require(age >= 0, "Age must be non-negative")
}

object Main extends App {
  try {
    val person = new MyClass("John", 30)
    println(person.age) // Output: 30
    val invalidPerson = new MyClass("Jane", -5) // throws exception
    println(invalidPerson.age) // Unreachable code
  } catch {
    case e: IllegalArgumentException => println("Exception caught: " + e.getMessage)
  }
}
```