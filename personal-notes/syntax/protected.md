*. behaviors and attributes are not accessible to the encapsulating class itself, all subclasses and classes within the same package.*
```java
package Populace;
public class Person {
	protected String name;
	public Person(String newName){
		this.name = newName;
	}
	public String getName() {
		return this.name;
	}
}
```
```java
package EducationalInstitution;
import Populace.*;
public class University {
	private String name = "Coursera";
	private List<Person> students = new ArrayList<Person>();

	public static void main(String[] ars){
		University uni = new University();
		Person student = new Person("John Doe");
		student.name = "John Kennedy"; // this line does not work it is protected and in a diffferent package 
		uni.students.add(student);
		}
}
```

