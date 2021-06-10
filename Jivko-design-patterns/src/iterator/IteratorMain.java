package iterator;

public class IteratorMain {

	public static void main(String[] args) {

		NameRepository nameRepository = new NameRepository();
		for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
			String currentName = (String) iterator.next();
			System.out.println("Name: " + currentName);
		}

	}

}
