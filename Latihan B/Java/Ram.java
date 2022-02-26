public class Ram{

	//atribut private
	private int capacity; //kapasitas ram
	private int price; //harga ram


	//konstruktor
	public Ram(){

	}

	public Ram(int capacity, int price){
		this.capacity = capacity;
		this.price = price;
	}

	//getter dan setter atribut capacity
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}

	public int getCapacity(){
		return this.capacity;
	}

	//getter dan setter atribut price
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

}