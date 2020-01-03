package cs14619.Shi.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculuarNodeTest {

	@Test
	public void test() {
		
		linkedList prisoners=new linkedList();
		
		
		assertTrue(prisoners.isEmpty()); //before inserting, list is empty
		assertEquals(0, prisoners.size()); // Size is 0
		prisoners.insert(5);
		assertFalse(prisoners.isEmpty()); // after inserting element, list is not empty	
		
		assertEquals(1,prisoners.size()); //size is 1
		
		
		
		//OTHER TEST CASES 
		//1. For n={1,2,3,..,6}, k = 2, Output: 1
		
		linkedList prisoners1 = new linkedList();
		
		for(int i = 1; i < 7; i++) {
			prisoners1.insert(i);
		}
		
		assertEquals(6, prisoners1.size());		
		assertEquals(1, prisoners1.remove(2));		
		
		//2. For n= {1}, k = 9, Output =1
		linkedList prisoners2 = new linkedList();
		prisoners2.insert(1);
		assertEquals(1, prisoners2.size());		
		assertEquals(1, prisoners2.remove(9));
		
		
		
		//3. n={1,2, …,7}, k = 7, Output = 4
		linkedList prisoners3 = new linkedList();
		for(int i = 1; i < 8; i++) {
			prisoners3.insert(i);
		}		
		
		assertEquals(7, prisoners3.size());		
		assertEquals(4, prisoners3.remove(7));
		
		
		//4. n ={1, 2,…, 12}, k = 8, Output= 2
		linkedList prisoners4 = new linkedList();
		for(int i = 1; i < 13; i++) {
			prisoners4.insert(i);
		}
		assertEquals(12, prisoners4.size());		
		assertEquals(2, prisoners4.remove(8));
		
		
		//5. n = {1, 2,…, 5}, k = 1, Output = 3
		linkedList prisoners5 = new linkedList();
		for(int i = 1; i < 6; i++) {
			prisoners5.insert(i);
		}
		assertEquals(5, prisoners5.size());		
		assertEquals(3, prisoners5.remove(1));
	}
	

}
