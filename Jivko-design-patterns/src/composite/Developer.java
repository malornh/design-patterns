package composite;

public class Developer implements Employee {

	private String name;
	private double salary;
	
	
	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee employee) {
		// Leaf node cannot add employees
	}

	@Override
	public void remove(Employee employee) {
		// Leaf node cannot remove employees
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void printData() {
		System.out.println("=====> Developer name: " + this.getName() + " with salary: " + this.getSalary());
	}

}
