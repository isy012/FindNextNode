/* Tree Traversal To Find N+1 Assignment
 *
 * This class finds the next node by traversing the entire tree on each search.
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
* To find the next node:
*
* Node n = new Node();
* FindNextNode iter = new FindNextNode();
* 
* //Given any node you choose in the tree, find the next node
* String next = new String(iter.next(n));
* 
* if next //if not null
*	print next;
* else //if null
*	print "Reached End of Tree";
*
*/

/*
* Future updates: 
* Store the current position in the index so you can traverse the tree again
*
* To prevent lengthly traversal from left to right, perhaps
* one could randomize where you begin the traversal. For example,
* starting at the 3rd of 5th child. Getting to the last node is 
* currently inefficient.
*
* Refactor the method to handle characters and numbers so that
* it can be generalized.
*
* Graceful exit out of the recursion when you reach the end of
* the tree without finding the next node in sequence
* 
*
* Alternative Approaches
* Traverse the tree once and capture all nodes in a hash table
* Hash table lookup is less expensive. Given a node, do a ASCII 
* decimal compare to find the next node in the sequence. However
* if more nodes get added to the tree, you'd have to rebuild the
* hash table, defeating the original purpose of why the hash 
* table was built.
*/