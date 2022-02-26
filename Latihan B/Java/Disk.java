public class Disk{

	//atribut private
	private String type; //tipe disk
	private int capacity; //kapasitas disk
	private int price; //harga disk


	//konstruktor
	public Disk(){

	}

	public Disk(String type, int capacity, int price){
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	//setter dan getter atribut type
	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return this.type;
	}

	//setter dan getter atribut capacity
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}

	public int getCapacity(){
		return this.capacity;
	}

	//setter dan getter atribut price
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

}