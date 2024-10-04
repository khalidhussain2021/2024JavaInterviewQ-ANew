package com.interview.prog;


public class Cohesion {

//	 Cohesion refers to how closely related and focused the responsibilities of a single module 
	//(class or method) are. A highly cohesive class or method is focused on a single responsibility 
	//or task, making the code more maintainable, understandable, and reusable.
//
//	 High Cohesion: When a class is responsible for a single, well-defined task or responsibility, 
	//it has high cohesion. This is desirable because it makes the class easier to maintain and test.
//	 Low Cohesion: When a class does too many unrelated tasks or responsibilities, it has low cohesion. This can make the code difficult to maintain and prone to bugs.
//	
}
class Invoice {
    private double totalAmount;

    public Invoice(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double calculateTax() {
        return totalAmount * 0.1; // Tax calculation is a cohesive responsibility
    }

    public void printInvoice() {
        System.out.println("Invoice Total: " + totalAmount);
    }
}
//Here, the Invoice class focuses only on the tasks related to invoices, like calculating tax and printing an invoice,
//which makes it highly cohesive.

//low cohensive

class Utility {
    public void calculateTax(double totalAmount) {
        // Tax calculation
    }

    public void printInvoice(double totalAmount) {
        // Print invoice
    }

    public void sendEmail(String message) {
        // Send email
    }

    public void backupDatabase() {
        // Backup database
    }
}

//the Utility class has low cohesion because it is responsible for unrelated tasks like tax 
//calculation, invoice printing, email sending, and database backup. Such a class would be harder to maintain, 
//as changes in one functionality could affect others.

//Coupling
//Definition: Coupling refers to the degree of interdependence between modules (classes, methods).
//Low coupling is desirable because it makes the system more flexible and maintainable. 
//If two modules are tightly coupled, changes in one module may require changes in another.

//Tight (High) Coupling: When classes are highly dependent on each other,
//leading to a system that is harder to maintain or modify. If you change one class, 
//you might have to change others as well.
//Loose (Low) Coupling: When classes have little knowledge of each other and interact through 
//well-defined interfaces. This makes the system easier to change or extend.

//Example of the tightly coupling
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine(); // Directly depends on the concrete Engine class
    }

    public void startCar() {
        engine.start();
    }
}

//example of the low coupling
interface Engine1 {
    void start();
}

class PetrolEngine implements Engine1 {
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class ElectricEngine implements Engine1 {
    public void start() {
        System.out.println("Electric engine started");
    }
}

class Car1 {
    private Engine1 engine;

    public Car1(Engine1 engine) {
        this.engine = engine; // Depends on the interface, not the concrete class
    }

    public void startCar() {
        engine.start();
    }
}



