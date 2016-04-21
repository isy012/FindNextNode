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
		Node n = new Node(); //We instantiate a new node tree
	}

	public String next(Node n){
		int lastSeen = Character.toUpperCase(n.name); //convert 

		for each kid in kids
			int current = Character.toUpperCase(kid.name); 
			if (current - lastSeen = 1){
				return kid.name; // exit the recursion
				//break;
			} else{
				next(kid);
			};
		}
}


/*
* This is how I would call the methods:
*
* iter = new iteration();//Instantiate a new object
*
* if iter.next() //if returns true 
*	print iter.next();
* else //if edge case of last node
*	print "Reached End Of Tree";

*/

/*
* Future updates: 
* To prevent lengthly traversal from left to right, perhaps
* one could randomize where you begin the traversal based on 
* the range of children. 
*
* Refactor the method to handle characters and numbers so that
* it can be generalized
*
*/

