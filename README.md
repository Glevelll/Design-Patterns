# Design-Patterns
An architectural construct that is a solution to a design problem within some commonly occurring context. Modern programming is hard to imagine without such patterns. They not only make it easier to write code, but also make the code beautiful.

# [Builder](https://github.com/Glevelll/Design-Patterns/tree/main/PatternBuilder)
A builder is a generative design pattern that provides a way to create a composite object.

# [Composite](https://github.com/Glevelll/Design-Patterns/tree/main/PatternComposite)
Composite is a structural design pattern that combines objects into a tree structure to represent a hierarchy from the particular to the whole. The linker allows clients to access individual objects and groups of objects in the same way.

# [Decorator](https://github.com/Glevelll/Design-Patterns/tree/main/PatternDecorator)
A structural pattern that allows you to add new behaviors to objects on the fly by wrapping them in wrapper objects. A decorator allows objects to be wrapped an infinite number of times, thanks to the fact that both wrappers and the actual wrapped objects share a common interface.


# [Factory](https://github.com/Glevelll/Design-Patterns/tree/main/PatternFactory)
This section has several views:

The Simple Factory pattern is a class that has one method with a large conditional statement that selects the product to be created. This method is called with a parameter that specifies which product to create. A simple factory usually does not have subclasses.

The Factory method pattern proposes to create objects not directly using the new operator, but through a call to a special factory method, and subclasses can change the class of the created objects.

An abstract factory declares methods for creating various abstract products. Concrete factories each refer to their product variation and implement abstract factory methods, allowing you to create all products of a particular variation.

# [Iterator](https://github.com/Glevelll/Design-Patterns/tree/main/PatternIterator)
An Iterator is a behavioral pattern that allows you to sequentially traverse a complex collection without revealing the details of its implementation. Thanks to the Iterator, the client can iterate through different collections in the same way, using a single iterator interface.

# [Observer](https://github.com/Glevelll/Design-Patterns/tree/main/PatternObserver)
A behavioral design pattern implements a mechanism for a class that allows an object of this class to receive notifications about changes in the state of other objects and thereby observe them.

# [Singleton](https://github.com/Glevelll/Design-Patterns/tree/main/PatternSingleton)
Singleton is used if there should be only one instance of some class, and this instance needs a global access point (the ability to access from anywhere in the program).

# [Strategy](https://github.com/Glevelll/Design-Patterns/tree/main/PatternStrategy)
The behavioral pattern brings a set of algorithms into their own classes and makes them interchangeable. Other objects contain a reference to the strategy object and delegate work to it. The program can replace this object with another if a different way of solving the problem is required.

# [Visitor](https://github.com/Glevelll/Design-Patterns/tree/main/PatternVisitor)
A Visitor is a behavioral pattern that describes an operation that is performed on objects of other classes. When visitingor changes, there is no need to change the serviced classes. The pattern demonstrates a classic technique for recovering lost type information without resorting to double-dispatching downcast.

# [Adapter&Facade](https://github.com/Glevelll/Design-Patterns/tree/main/PatternsAdapter%26Facade)
Adapter is a structural pattern that allows incompatible objects to be friends. The adapter acts as a layer between two objects, turning calls from one into calls understandable to the other.

Facade is a structural pattern that provides a simple interface to a complex object system, library, or framework. In addition to reducing the overall complexity of a program, Facade also helps to bring code that depends on an external system into a single place.
