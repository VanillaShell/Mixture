package dslearn;

import java.util.Arrays;

import dslearn.linerlists.ArrayStack;
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
		
		Object[] o = new Object[1];o[0] = new Integer(1);
		System.out.println(o[0] + o.toString() + Arrays.toString(o));
		Integer[] oo = new Integer[1];oo[0] = new Integer(1);
		System.out.println(oo[0] + oo.toString());
		String[] s = new String[1];s[0] = "134";
		System.out.println(Arrays.toString(s));
		
		System.out.println( 0 + ( 0 >> 1) );
		System.out.println( 1 + ( 1 >> 1) );
		System.out.println( 2 + ( 2 >> 1) );// x >> y = x/2^y
		
		ArrayStack<Integer> s1 = new ArrayStack<>(1);
		s1.push(1);s1.push(2);
		System.out.println(s1.getSize() );
		System.out.println(s1.pop() );
		s1.peek();s1.peek();s1.peek();
		System.out.println(s1.pop() );
		try {
			System.out.println(s1.pop() );
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//Deque dc = new LinkedList
	}

}
