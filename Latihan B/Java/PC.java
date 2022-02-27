public class PC{

	//atribut private
	Processor pObj = new Processor(); //data prosesor
	Disk dObj = new Disk(); //data disk
	Ram rObj = new Ram(); //data ram
	int totalPrice; //total harga pc


	//konstruktor
	public PC(){

	}

	public PC(Processor p, Disk d, Ram r, int tp){
		this.pObj = p;
		this.dObj = d;
		this.rObj = r;
		this.totalPrice = tp;
	}

	//getter dan setter atribut pObj
	public void setProcessor(Processor p){
		this.pObj = p;
	}

	public Processor getProcessor(){
		return this.pObj;
	}

	//getter dan setter atribut dObj
	public void setDisk(Disk d){
		this.dObj = d;
	}

	public Disk getDisk(){
		return this.dObj;
	}

	//getter dan setter atribut rObj
	public void setRam(Ram r){
		this.rObj = r;
	}

	public Ram getRam(){
		return this.rObj;
	}

	//getter dan setter atribut totalPrice
	public void setTotalPrice(int p1, int p2, int p3){
		this.totalPrice = p1+p2+p3;
	}

	public int getTotalPrice(){
		return this.totalPrice;
	}

	//method menampilkan data PC
	public void printPC(){

		System.out.println("-------------------------");
		System.out.println("Processor");
		System.out.println("----------");
		System.out.println("Name     : " + pObj.getName());
		System.out.println("Price    : Rp" + pObj.getPrice());
		System.out.println("-------------------------");
		System.out.println("Disk");
		System.out.println("----------");
		System.out.println("Type     : " + dObj.getType());
		System.out.println("Capacity : " + dObj.getCapacity() + " GB");
		System.out.println("Price    : Rp" + dObj.getPrice());
		System.out.println("-------------------------");
		System.out.println("Ram");
		System.out.println("----------");
		System.out.println("Capacity : " + rObj.getCapacity() + " GB");
		System.out.println("Price    : Rp" + rObj.getPrice());
		System.out.println("-------------------------");

		System.out.println("Total Price: Rp" + this.totalPrice);

	}

}