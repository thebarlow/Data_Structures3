Matthew Barlow
README

Problem2.java
May be run in the command line with the file parameter placed directly after it.
> Java run problem2.java frank.txt

All other files were made in Microsoft word or Eclipse and can be run in whatever way is typical of your OS.

PROMPT
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
(35 pts) Implementing Expression Trees:

Implement a class called ExpressionTree . The constructor to ExpressionTree will take in a String that contains a postfix expression. The operands will be integers and the binary operators will be restricted to +, -, *, and divide. Individual tokens, that is the operands and operators, will be delimited by spaces. So for example:

34 2 - 5 *

would mean (34-2)*5.

Your constructor will run the stack based algorithm we discussed in class to build an expression tree. ExpressionNodes will be a nested class within ExpressionTree. You may use any code posted on canvas or from the Weiss textbook as a starting point for this class. As a stack data structure, you can either use java.util.LinkedList, your own class from homework 2, or the MyStack.java file from the sample solution for homework 2.
Once you have the ExpressionTree constructed you should provide the following four methods:

public int eval() - this method, when invoked on an expression tree object will return the integer value associated with evaluating the expression tree. It will need to call a private recursive method that takes in the root.
public String postfix() - this method, when invoked on an expression tree object will return a String that contains the corresponding postfix expression. It will need to call a private recursive method that takes in the root.
public String prefix() - this method, when invoked on an expression tree object will return a String that contains the corresponding prefix expression. It will need to call a private recursive method that takes in the root.
public String infix() - this method, when invoked on an expression tree object will return a String that contains the corresponding correct infix expression. Keep in mind that parenthesis will be needed (excessive parenthesis will be tolerated as long as it is correct). It will need to call a private recursive method that takes in the root.
Write a class called Problem1.java that instantiates an expression tree on a hard coded string representing a postfix expression tree, and demonstrate all of the methods listed above.

(30 pts) Write a command line application Problem2.java that indexes the words contained in a text file. Your program should go through the input file line by line. For each line, it extracts each word, and insert that word, along with it's line number into an AVL tree. Each element of the AVL tree should contain a unique word and a linked list of line numbers where that word occurs. 
To implement this AVL tree, you can use the AVLTree code from the textbook as a starting point (available hereDownload here -- note that you must include the UnderFlowException class, which is available hereDownload here). Modify this file directly and add the following functionality: 

Make sure the elements in the AvlTree are pairs of a word and a linked lists storing line numbers. The relative order of elements in the data structure should depend on the word only.
Write the method public void indexWord(String word, int line) that adds an occurrence of the word word in line line. If a word already exists in the AVL Tree, simply add the new line number to the existing node. If a word appears on the same line twice, it should only have one entry in the list for that line.
Write the method public List getLinesForWord(String word) that looks up a word and returns a list of lines in which it occurs.
Write the method public void printIndex() the prints out each unique word that is stored in the Avl tree along with a list of line numbers in which that word appears.

Finally, the main method in Problem2.java should create an instance of your AvlTree and uses it to indexes the words contained in a text file (provided to the program as a command line argument). Ignore case in the input text (insert everything as lower case), and ignore all punctuation. When indexing has finished, the program should call the printIndex method to display a list of unique words in the text file and the line numbers in which that word occurs. 
