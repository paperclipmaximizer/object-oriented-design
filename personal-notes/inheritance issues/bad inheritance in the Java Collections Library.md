An example of bad inheritance can be seen in the Java Collections Library.
Have you ever used the stack class in Java?
A stack is understood as first in and last out data structure.
It has a small number of well defined behaviors like peak, pop and push.
This is not the case in the Java stack class,
because the stack class inherits from the vector class.
This means that the stack class is able to return an element at a specified index,
retrieve the index of an element and even insert an element into a specific index.
These are not behaviors expected from a stack, but
because of poor use of inheritance, they are allowed in Java.
If inheritance does not suit your need,
consider whether decomposition is more appropriate.
A smartphone is a good example of where decomposition works better
than inheritance.
A smartphone has characteristics of a phone and a camera.
Here is one design.
It does not make sense for us to Inherit from the phone and
then add camera methods to the subclass smartphone.
We should be using decomposition to extract out the camera responsibilities,
and put them in their own class.
The smartphone now indirectly provides the responsibilities of the camera in
the phone.
To separate part classes,
the smartphone doesn't need to know how these classes work.
Inheritance could be a difficult design principle to apply, but
it is still a very powerful technique.
Inheritance lets you define some classes that are tailor made for your system,
while defining common attributes and behaviors in the superclass.
Remember, that a common goal is to build reusable, flexible, and
maintainable systems.
Inheritance is simply one technique to help you reach that goal.
It is important to understand that a technique is beneficial when
used properly, but can cause headaches if not. 

