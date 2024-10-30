package lab7;

public class Child {
	private int numOfToys;

	private String name;

	private int age;

	private Toy[] toys;

	private int toysLength;

	public Child() {
	}

	public Child(String str, int n, Toy[] toys) {
		this.name = str;
		this.age = n;
		if (toys != null) {
			numOfToys = toys.length;
			toysLength = toys.length;
			this.toys = new Toy[toys.length];
			for (int i = 0; i < toysLength; i++) {
				Toy t = new Toy(toys[i].getToyID(), toys[i].getToyName(), toys[i].getToyQuantity(),
						toys[i].getToyPrice());
				this.toys[i] = t;
			}
		} else {
			numOfToys = 0;
			toysLength = 0;
			this.toys = null;
		}
	}

	public Child(Child child) {
		this.name = child.name;
		this.age = child.age;
		if (child.toys != null) {
			numOfToys = child.toys.length;
			toysLength = child.toys.length;
			this.toys = new Toy[child.toys.length];
			for (int i = 0; i < toysLength; i++) {
				Toy t = new Toy(child.toys[i].getToyID(), child.toys[i].getToyName(), child.toys[i].getToyQuantity(),
						child.toys[i].getToyPrice());
				this.toys[i] = t;
			}
		} else {
			numOfToys = 0;
			toysLength = 0;
			child.toys = null;
		}
	}

	public int getNumberofToys() {
		return this.numOfToys;
	}

	public int getChildAge() {
		return this.age;
	}

	public String getChildName() {
		return this.name;
	}

	public Toy[] getChildToy() {
		return this.toys;
	}

	public void setChildName(String str) {
		this.name = str;
	}

	public void setChildAge(int x) {
		this.age = x;
	}

	

	public void disposeToys() {
		this.toys = null;
		this.numOfToys = 0;
	}

	public void donate(Child c) {
		if (this != c) {
			if (toys != null) {
				int otherNum;
				if (c.toys == null) {
					otherNum = 0;
				} else {
					otherNum = c.toys.length;
				}
				Toy[] arr = new Toy[this.toys.length + otherNum];
				if (c.toys != null) {
					for (int i = 0; i < toys.length; i++) {
						arr[i] = this.toys[i];
					}
					for (int i = 0; i < c.toys.length; i++) {
						arr[i + this.toys.length] = c.toys[i];
					}
				}else {
					c.toys = toys;
				}
				this.toys = null;
				this.numOfToys = 0;
				c.toys = arr;
				c.numOfToys = arr.length;
			}
		}
	}
	public String toString() {
		return "Child [" + getChildName() + "] of age <" + getChildAge() + "> has (" + getNumberofToys() + ") toys";
	}

}
