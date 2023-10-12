package collection;
import java.util.TreeSet;
import java.util.Set;
public class TreeSetExample {
	//TreeSet example
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();	
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		System.out.print("Elements are: ");
		for (String element : s) {
			System.out.print(element + " ");
		}
	}
}
