public class Processor{

	//atribut private
	private String name; //nama prosesor
	private int price; //harga prosesor


	//konstruktor
	public Processor(){

	}

	public Processor(String name, int price){
		this.name = name;
		this.price = price;
	}

	//getter dan setter atribut name
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	//getter dan setter atribut price
	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return this.price;
	}

}