public class PC{

	//atribut private
	Processor pObj; //data prosesor
	Disk dObj; //data disk
	Ram rObj; //data ram
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

}