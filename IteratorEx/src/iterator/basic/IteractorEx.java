package iterator.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteractorEx {

	public static void main(String args[]) {
	      // 1. ArrayList를 만든다. 
	      List<String> al = new ArrayList();
	      
	      // 2. 임의의 데이터를 저장한다. 
	      al.add("가");
	      al.add("니");
	      al.add("다");
	      al.add("라");
	      al.add("마");
	      al.add("바");
	      al.add("사");
	      al.add("자");

	      // 3. iterator 객체 사용한다. 
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      
	      // 4. test를 위해 저장되어 있는 element를 출력한다. 
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
	      // Modify objects being iterated
	      ListIterator litr = al.listIterator();
	      
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         litr.set(element + "+");
	      }
	      System.out.print("Modified contents of al: ");
	      itr = al.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();

	      // Now, display the list backwards
	      System.out.print("Modified list backwards: ");
	      
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	   }

}
