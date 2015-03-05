package tree;

public class TreeNode {
	public TreeNode parent;
	public TreeNode left;
	public TreeNode right;
	public String data;
	
	public TreeNode(String data){
		this.data = data;
		this.setLeft(null);
		this.setRight(null);
		this.setParent(null);
	}
	
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
		
	}


	public void setLeft(TreeNode left){
		this.left = left;
	}
	public void setRight(TreeNode right){
		this.right = right;
	}
	public void setData(String data){
		this.data = data;
	}
	
	public TreeNode getParent(){
		return this.parent;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	public TreeNode getRight(){
		return this.right;
	}
	public String getData(){
		return this.data;
	}


}
