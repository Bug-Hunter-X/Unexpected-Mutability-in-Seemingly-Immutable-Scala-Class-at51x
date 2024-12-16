# Unexpected Mutability in Seemingly Immutable Scala Class

This repository demonstrates a potential pitfall in Scala related to mutable variables within classes that appear immutable from their external interface.  The code shows a `MyClass` that, despite having a `val` for its name, allows its age to be modified through a mutable `var` accessed by a custom setter.

The problem is that the `age_=` setter silently handles invalid inputs (negative age) without raising an error or exception. This hidden mutability can lead to hard-to-debug issues.  The solution offers safer alternative approaches.