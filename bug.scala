```scala
class MyClass(val name: String) {
  private var _age: Int = 0 // Private mutable variable

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) {
      _age = newAge
    } else {
      // silently ignore negative ages
    }
  }
}

 object Main extends App {
  val person = new MyClass("John")
  person.age = 30
  println(person.age)  // Output: 30
  person.age = -5
  println(person.age)  // Output: 0
}
```