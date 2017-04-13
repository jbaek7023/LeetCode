/**
 * April 12, 2016 
 * -SUCCESS - About 30 min
 * 
 * 
 */
package index;


/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author jaeminbaek
 * 
 */
public class N002_AddTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(4);
		a.next = b;
		ListNode c = new ListNode(3);
		b.next = c;
		
		
		ListNode d = new ListNode(5);
		ListNode e = new ListNode(6);
		d.next = e;
		ListNode f = new ListNode(4);
		e.next = f;
		
		ListNode entireAddedNode = addTwoNumbers(a, d);
		while(entireAddedNode != null) {
			System.out.println(entireAddedNode.val);
			entireAddedNode = entireAddedNode.next;
		}
		// expected answer 
		//7, 0, 8
		//[1] [9, 9] => [0, 0, 1]
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode rootNode = new ListNode(0);
		ListNode prevNode = rootNode;
		
		int carry =0;
		while(l1 != null || l2 !=null || carry != 0) {
			int newL1Val = (l1==null)? 0 : l1.val;
			int newL2Val = (l2==null)? 0: l2.val;
			
			
			int sum = (newL1Val + newL2Val + carry) % 10 ;
			
			carry = (newL1Val + newL2Val + carry>=10) ? 1 : 0;
			
			
			ListNode newNode = new ListNode(sum);
			
			// move to the next node
			prevNode.next = newNode;
			prevNode = newNode;
			l1 = (l1==null) ? l1: l1.next;
			l2 = (l2==null) ? l2: l2.next;
			
		}
		//The best Part!
		return rootNode.next;
        
    }
	
	 public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

}

/*When there is no hasNext() function, just use this algorithm below
 * 
 * while전에 미리 initialize 하지마라. while안에서 다 initialize 하고 그전거를 잇는쪽으로 해야함.
 * while(l1 !=null) {
 * 	l1 = l1.next
 * }
 * 
 * 
 * 
 * */
 