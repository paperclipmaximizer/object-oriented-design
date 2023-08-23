Attributes with a public access modifier are accessible by any class in your system. This means that other classes can retrieve and modify the attribute.
Public methods are also accessible by any class in your system. But this access does not allow other classes to change the implementation of the behavior for the method. A publicly accessible methods simply allows other classes to call the method and receive any output from it. 
```java
public class Person {
	public String name;

	public void sleep(int n) {
		wait(n);
	}
}
public static void main(String[] args) {
	Person johnDoe = new Person();
	johnDoe.name = "John Doe";
	johnDoe.sleep(6000);
}
```
*Notice we can invoke the behaviour but we cannot change how it is implemented because it is hidden from us through encapsulation*
