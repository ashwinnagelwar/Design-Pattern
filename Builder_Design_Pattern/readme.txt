The Builder Design Pattern is a creational design pattern used to construct complex objects step by step.
 Instead of creating an object all at once, the Builder pattern allows for greater control over the construction
  process by separating the construction of an object from its representation. This pattern is especially useful
   when the object requires multiple optional parameters or a complex setup process.

Key Concepts of Builder Pattern
-------------------------------
1. Separate Construction and Representation: The pattern decouples the creation of an object from its structure, 
   making the construction process more flexible.
2. Step-by-Step Construction: The builder allows you to create an object step by step, especially if the object has
   multiple components or settings.
3. Immutable Object: It often results in immutable objects, as you set all parameters at once, ensuring a complete,
   finalized state upon construction.
   
Structure
-----------
The Builder pattern involves these main components:

Product: The complex object to be constructed (e.g., a car, a meal, etc.).
Builder: An abstract interface defining methods for constructing parts of the Product.
ConcreteBuilder: A class that implements the Builder interface and assembles the Product piece by piece.
Director: Optional class that controls the construction process, calling the builder's methods in a specific order.
Client: The user of the builder, initiating the creation of the object by configuring and using the builder.


Stpes
1. Create Parent class and define its all parameters
2. then create static class(builder class) within this parent class with same paraameters
3. define setters for all parameters in builder class
3. aslo define build method which return parent class object with argument "this", it will force you to implement 
parameterized constructor in parent class with builder type paramenters, you can check in mobile class.
like this-->
public Mobile(MobileBuilder mobileBuilder) {
		this.cameraSize=mobileBuilder.cameraSize;
		this.name=mobileBuilder.name;
		this.OS=mobileBuilder.OS;
		this.ram=mobileBuilder.ram;
		this.rom=mobileBuilder.rom;
		this.price=mobileBuilder.price;
	}