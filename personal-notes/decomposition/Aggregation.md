![[literature/OOP Design/Lexicon/Aggregation|Aggregation]]
```plantuml
@startuml
class Crew  
class Airliner

Airliner "0..*" o--  "0..*" Crew @enduml
```
```java
public class Airliner {
	public ArrayList<CrewMember> crew;

	public Airliner(){
		crew = new ArrayList<CrewMember>();
	}

	public void add ( CrewMember crewMember ){
	...
	}
}
```
```java
public class PetStore {
	public ArrayList<Pet> pet;

	public PetStore(){
		pet = new ArrayList<Pet>();
	}

	public void add( Pet pet ){
	...
	}
}
```
