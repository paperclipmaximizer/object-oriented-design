The second indication of
improper use of generalization is, if you break the Liskov Substitution Principle.
The principle states that a subclass can replace a superclass, if and only if,
the subclass does not change the functionality of the superclass.
How would this principle be violated through inheritance?
Let's take a look at this example.
This is our generalized Animal class, it knows how to eat, walk, and run.
Are you able to see how we can introduce a subclass that would break
the Liskov Substitution Principle?
What if we had this type of animal?
A whale doesn't know how to run and walk.
Running and walking are behaviors of land animals.
The Liskov Substitution Principle is violated here,
because the whale class overrides the animals classes running and
walking functions and replaces them with swimming behaviors.
The whale no longer behaves in the way we would expect it superclass to behave. 

A subclass that behaves in a way different to the superclass breaks the liskov substitution principle. 

Two conditions in which you would be able to properly use the generalization principle for inheritance.
1. The subclass has more functionality than the superclass.
2. Subclasses provide and share attributes and behaviors from the same superclass, but each subclass has their own distinct functions.