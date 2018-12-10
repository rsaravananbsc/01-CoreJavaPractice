package Java10Features;

import java.util.List;

public class Java10_CollectionFactoryMethods {

	public static void main(String[] args) {
		
		List<String> list = List.of("Java", "Kava", "Mava");
		
		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
		
		System.out.println(list);

	}

}
