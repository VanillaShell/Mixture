package dslearn;

import java.util.Arrays;

import dslearn.linerlists.ListSlinked;

public class Test {

	public static void main(String[] args) {
//		Object[] a = new Object[0];
//		int[] b = new int[0];
//		//b[0] = 2;
//		System.out.println(a.toString());
//		System.out.println(Arrays.toString(b));

		ListSlinked<Integer> a = new ListSlinked<Integer>();
		a.add(1);a.add(2);a.add(3);a.add(4);
		System.out.println(Arrays.toString(a.toArray()));
		a.reverse1();
		System.out.println(Arrays.toString(a.toArray()));
		a.reverse2();
		System.out.println(Arrays.toString(a.toArray()));
		
		a.add(4, 5);System.out.println(Arrays.toString(a.toArray()));
		a.add(4, 9);System.out.println(Arrays.toString(a.toArray()));
		a.add(0, 10);System.out.println(Arrays.toString(a.toArray()));
		a.add(14);System.out.println(Arrays.toString(a.toArray()));
		
		System.out.println(a.size());
		a.clear();
		System.out.println(a.size());
	}

}
