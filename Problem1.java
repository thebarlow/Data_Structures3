//Matthew Barlow
public class Problem1 {
	public static void main(String [] args){
		String test= "34 2 - 5 *";
		ExpressionTree myTree = new ExpressionTree(test);
		ExpressionNodes root = myTree.getRoot();
		System.out.println("input is: " +test +"\n");
		System.out.println("postfix is: " +myTree.postfix(root));
		System.out.println("prefix is: " +myTree.prefix(root));
		System.out.println("infix is: " +myTree.infix(root));
		System.out.println("eval is: " +myTree.eval(root));
	}
}
