package tree;
import tree.TreeNode;

public class BinaryTree {
	
	int size = 0;
	TreeNode root;
	
	public BinaryTree(String rootData){
		TreeNode root = new TreeNode(rootData);
		this.root = root;
		size ++;
	}
	
	public void add(TreeNode newNode){
		if(size == 0){
			root = newNode;
			size ++;
		}
		TreeNode current = root;
		
		while(newNode.getData().length() > current.getData().length() && current.getLeft()==null){
			current = current.left;
		}
		while(newNode.getData().length() < current.getData().length() && current.getRight()==null){
			current = current.right;
		}
		if(current.left == null){
			current.setLeft(newNode);
			newNode.setParent(current);
			
		}
	}

}
