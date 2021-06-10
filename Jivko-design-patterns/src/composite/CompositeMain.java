package composite;

public class CompositeMain {

	public static void main(String[] args) {


		Manager manager1 = new Manager("Georgi", 4000);
		Developer dev1 = new Developer("Atanas", 2500);
		Developer dev2 = new Developer("Ivan", 3000);
		
		
		manager1.add(dev1);
		manager1.add(dev2);
		
		Manager manager2 = new Manager("Cvetomir", 5000);
		Developer dev3 = new Developer("Peter", 3500);
		Developer dev4 = new Developer("Anastas", 4000);
		
		
		manager2.add(dev3);
		manager2.add(dev4);
		
		
		Manager manager3 = new Manager("Peter the boss", 7000);
		Developer dev5 = new Developer("Evgeni", 6500);

		manager3.add(dev5);
		
		manager3.add(manager1);
		manager3.add(manager2);
		
		
		manager3.printData();

	}

}
