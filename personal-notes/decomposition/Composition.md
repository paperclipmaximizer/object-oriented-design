![[literature/OOP Design/Lexicon/Composition|Composition]]
```plantuml
@startuml
class Room
class House
House *--- "1..*" Room 

@enduml
```
```java
public class Human{ 
	private Brain brain;

	public Human(){
		brain = new Brain();
	}
}
```
```java
public class Employee{
  private Salary salary;
  
  public Employee(Salary employeeSalary){
    this.salary = employeeSalary;
  }
}
```