package lab7;

public class Toy {
	
	public int id;
	
	public String name;
	
	public int quantity;
	
	public double price;
	
	private String temp;

	public Toy(){
	}
	public Toy(int m, String str, int n, double x) {
		this.id =m;
		this.name = str;
		this.quantity = n;
		this.price = x;
		}
	public Toy(Toy toy) {
		this.name = toy.name;
		this.id = toy.id;
		this.quantity = toy.quantity;
		this.price = toy.price;
	}
	
	public int getToyID() {
		return this.id;
	}
	public String getToyName() {
		return this.name;
	}
	public int getToyQuantity() {
		return this.quantity;
	}
	public double getToyPrice() {
		
		return this.price;
	}
	public String getToyInformation() {
		temp = String.format("%.2f", getToyPrice());
		return "Toy("+getToyID()+","+getToyName()+"), quantity("+getToyQuantity()+") with $( "+temp+")/toy";
	}
	
	public void setToyID(int m) {
		this.id = m;
	}
	public void setToyName(String str) {
		this.name =str;
	}
	public void setToyPrice(double x) {
		this.price = x;
	}
	public void  setToyQuantity(int n) {
		this.quantity = n;
	}
	
	
	
}
