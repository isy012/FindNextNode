/* Tree Traversal To Find N+1 Assignment
 *
 * This class finds the next node by traversing the tree.
 * Since we know the node names are characters, we can convert
 * the string into ASCII uppercase integer to compare the values
 * the last seen node and current node. If the next node is found
 * break the recursion by returning the child's node name.
 *
 * DATA STRUCTURE OF A NODE
 * node 
 * 	string name
 * 	node kids[]
 *
 * Izzy Park (c)2016
 */


public class FindNextNode {

	public static void main(String[] args){

	}

	public String next(Node n){
		int lastSeen = Character.toUpperCase(n.name); //convert to ASCII dec

		for (int i=0, i< n.kids.length; i++ ){
			int current = Character.toUpperCase(n.kid.name); 

			if (current - lastSeen = 1){ //if the next letter follows previous letter
				return kid.name; // exit the recursion
				//break;
			} else {
				next(kid);
			};
		}
}


/*
* This is how I would call the methods:
*
* Node n = new Node(); 
* iter = new iteration();
* String next = iter.next(n)
*
* if next //if true
*	print next;
* else //if null
*	print "Reached End Of Tree";
*
*/

/*
* Future updates: 
* To prevent lengthly traversal from left to right, perhaps
* one could randomize where you begin the traversal. For example,
* starting at the 3rd of 5th child.
*
* Refactor the method to handle characters and numbers so that
* it can be generalized.
*
* Graceful exit out of the recursion when you reach the end of
* the tree without finding the next node in sequence
*
*/

