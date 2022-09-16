//Matthew Barlow
public class ExpressionTree {
	private MyStack<ExpressionNodes> mStack;
	private ExpressionNodes root;
	
	public ExpressionTree(String str){
		String[] marr=str.split(" ");
		stackConstructor(marr);
		root=mStack.peek();
	}
	public ExpressionNodes getRoot(){
		return root;
	}
	
	public void stackConstructor(String[] str){
		mStack = new MyStack<ExpressionNodes>();
		for(int i=0;i<str.length;i++){
			ExpressionNodes temp = new ExpressionNodes(str[i]);
			if(temp.val.equals("/")||temp.val.equals("*")||temp.val.equals("+")||temp.val.equals("-")){
				temp.right=mStack.pop();
				temp.left=mStack.pop();
				mStack.push(temp);
			}
			else{
				mStack.push(temp);
			}
		}
	}
	public String postfix(ExpressionNodes rt){
		if(rt.left==null || rt.right==null){
			return rt.val;
		}
		return postfix(rt.left) +" "+postfix(rt.right)+" "+rt.val+" ";
	}
	public String prefix(ExpressionNodes rt){
		if(rt.left==null || rt.right==null){
			return rt.val;
		}
		return rt.val+" "+prefix(rt.left)+ " "+prefix(rt.right);
	}
	public int eval(ExpressionNodes rt){
		if(rt.left==null || rt.right==null){
			return Integer.parseInt(rt.val);
		}
		if(rt.val.equals("*")){
			return eval(rt.left)*eval(rt.right);
		}
		if(rt.val.equals("/")){
			return eval(rt.left)/eval(rt.right);
		}
		if(rt.val.equals("-")){
			return eval(rt.left)-eval(rt.right);
		}
		return eval(rt.left)+eval(rt.right);
	}
	public String infix(ExpressionNodes rt){
		if(rt.left==null || rt.right==null){
			return rt.val;
		}
		return "("+infix(rt.left)+rt.val+infix(rt.right)+")";
	}
}

class ExpressionNodes{
	public ExpressionNodes left;
	public ExpressionNodes right;
	public String val;
	public ExpressionNodes(String value){
		val=value;
		left=null;
		right=null;
	}
	public String toString(){
		return val;
	}
}