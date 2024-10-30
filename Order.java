package lab7;

public class Order {
	private Child[] children;

	private int numOfChild;

	public Order() {
		this.numOfChild = 0;
	}
	public int getNumofChilds() {
		return this.numOfChild;
	}
	public Child[] getChilds() {
		return this.children;
	}
	

	

	public void addChildtoOrder(Child c) {
		int var;
		if (this.children == null) {
			var = 1;
			Child[] newChild = new Child[var];
			newChild[0] = c;
			this.children = newChild;
		} else {
			var = this.children.length + 1;
		}
		if (this.children.length < 5) {
			Child[] newChild = new Child[var];
			if (var == 1) {
				newChild[0] = c;
				this.children = newChild;
			} else {
				for (int i = 0; i < var - 1; i++) {
					newChild[i] = this.children[i];
				}
				newChild[var - 1] = c;
				this.children = newChild;
				
			}
			
		}this.numOfChild = this.children.length;
	}

	public void removeChildfromOrder(Child c) {
		if (this.children != null) {
			boolean status = false;
			for (int i = 0; i < this.children.length; i++) {
				if (this.children[i] == c) {
					status = true;
				}
			}
			if (status) {
				int var = this.children.length - 1;
				Child[] newChild = new Child[var];
				int a = 0;
				for (int i = 0; i < this.children.length; i++) {
					if (this.children[i] != c) {
						newChild[a++] = this.children[i];
					}
				}
				this.children = newChild;
			}
			
		}this.numOfChild = this.children.length;
	}
	

	public String toString() {
		return "The order contains " + numOfChild + " Childs";
	}

}
