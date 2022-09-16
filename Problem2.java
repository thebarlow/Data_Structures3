//Matthew Barlow
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Problem2<AnyType> {
	static AvlTree<String> myTree;
	public static void main (String[] args) throws IOException{
		myTree=new AvlTree();
		
		FileReader reader = new FileReader(args[0]);
	    BufferedReader bReader = new BufferedReader(reader);
	    int count=0;//this variable keeps track of which line number we are on
	    while(bReader.readLine()!=null){//while there is another line to read
	    	count++;//add to the count before operations, which is why count is initially set to 0
	    	String thisLine = bReader.readLine();
	    	String[] sentence = thisLine.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");//remove all spaces and punctuation
	    	for(int i=0;i<sentence.length;i++){
	    		myTree.insert(sentence[i], count);//insert each word individually into the AVL Tree
	    	}
	    }
	    printIndex();
	}
	public void indexWord(String word, int line){
		myTree.insert(word,line);
	}
	/*This one gave me a lot of problems. What I ended up having to do was pass my Linked List of line numbers to this class
	 * and then convert to a String List.
	 */
	public List getLinesForWord(String word){
		LinkedList abc=myTree.getList(word);
		List myList=new List();
		for(int i=0;i<abc.size();i++){
			String ans=myList.getItem(i);
			myList.add(ans);
		}
		return myList;
	}
	public static void printIndex(){
		myTree.printTree();
	}
}
