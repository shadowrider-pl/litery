package finbarre.litery;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	public long tree(List<String> in) {

		int n = Integer.parseInt(in.get(0));
		String u = in.get(1);
		String w = in.get(2);
		long result = 0;
		BST tree = new BST();

		StringBuilder sbu = new StringBuilder(u);
		StringBuilder sbw = new StringBuilder(w);
		Helper helper = updateSBW(sbw);
		sbw=helper.getSb();
		tree=helper.getTree();
		

		for (int i = 0; i < n-1; i++) {
			sbw=helper.getSb();
			tree=helper.getTree();
			List<Integer> list = (List<Integer>) tree.get(String.valueOf(sbu.charAt(i)));
			int position = list.get(0);
			
			if (sbu.charAt(i) != position) {
				result = result + position ;
			}

			sbw.deleteCharAt(position);

			helper=updateSBW(sbw);

		}
		return result;
	}

	public Helper updateSBW(StringBuilder sbw) {
		BST newTree = new BST();
		for (int i = 0; i < sbw.length(); i++) {
			if (newTree.get(String.valueOf(sbw.charAt(i))) == null) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				newTree.put(String.valueOf(sbw.charAt(i)), list);
			} else {
				List<Integer> list = (List<Integer>) newTree.get(String.valueOf(sbw.charAt(i)));
				list.add(i);
				newTree.put(String.valueOf(sbw.charAt(i)), list);
			}
		}
		Helper result = new Helper();
		result.setSb(sbw);
		result.setTree(newTree);
		return result;
	}

	public class Helper{
		private BST tree;
		private StringBuilder sb;
		public BST getTree() {
			return tree;
		}
		public void setTree(BST tree) {
			this.tree = tree;
		}
		public StringBuilder getSb() {
			return sb;
		}
		public void setSb(StringBuilder sb) {
			this.sb = sb;
		}
	}
	
	public class BST {
		private BSTNode root;

		public void put(String key, Object value) {
			if (root == null) {
				root = new BSTNode(key, value);
			} else {
				root.put(key, value);
			}
		}

		public Object get(String key) {
			return root == null ? null : root.get(key);
		}
	}

	public class BSTNode {
		private String key;
		private Object value;
		private BSTNode left, right;

		public BSTNode(String key, Object value) {
			this.key = key;
			this.value = value;
		}

		// if key not found in BST then it is added. If jey already exists then that
		// node's value
		// is updated.
		public void put(String key, Object value) {
			if (key.compareTo(this.key) < 0) {
				if (left != null) {
					left.put(key, value);
				} else {
					left = new BSTNode(key, value);
				}
			} else if (key.compareTo(this.key) > 0) {
				if (right != null) {
					right.put(key, value);
				} else {
					right = new BSTNode(key, value);
				}
			} else {
				// update this one
				this.value = value;
			}
		}

		// find Node with given key and return it's value
		public Object get(String key) {
			if (this.key.equals(key)) {
				return value;
			}

			if (key.compareTo(this.key) < 0) {
				return left == null ? null : left.get(key);
			} else {
				return right == null ? null : right.get(key);
			}
		}
	}
}
