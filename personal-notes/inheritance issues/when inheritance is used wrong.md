Am I using inheritance to simply share attributes or behavior without further adding anything special in my subclasses? 
If yes then you're misusing inheritance, the superclass already is enough 
```java
public class Pizza {
	private List toppings;
	private String size;
	private String crustStyle;

	public Pizza(String size, String crust) {
		this.toppings = new ArrayList();
		this.size = size;
		this.crustStyle = crust;
	}
	public void addTopping(String topping) {
		this.toppings.add(topping)
		}
	public void bulkAddTopping(ArrayList toppingList){
	this.toppings.addAll(toppingList);		}
	public void cook() throws InterruptedException {
		wait(10 * 6000);
		}
}
```
An example of the correct way to implement a pepperoni pizza 
```java
public class Pepperoni extends Pizza {

	public Pepperoni(String size, String crust) {
		super(size,crust);
		super.addTopping("pepperoni");
	}
}
```
You use inheritance when the behavior is different:
Animal : dog, cat, whale 
Employee : manager. salesperson, cashier