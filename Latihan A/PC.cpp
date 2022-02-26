class PC{

	private:
		//atribut private
		Processor pObj; //data prosesor
		Disk dObj; //data disk
		Ram rObj; //data ram
		int totalPrice = 0; //total harga pc

	public:

		//konstruktor
		PC(){

		}

		PC(Processor p, Disk d, Ram r, int tp){
			this->pObj = p;
			this->dObj = d;
			this->rObj = r;
			this->totalPrice = tp;
		}

		//getter dan setter atribut pObj
		void setProcessor(Processor p){
			this->pObj = p;
		}

		Processor getProcessor(){
			return this->pObj;
		}

		//getter dan setter atribut dObj
		void setDisk(Disk d){
			this->dObj = d;
		}

		Disk getDisk(){
			return this->dObj;
		}

		//getter dan setter atribut rObj
		void setRam(Ram p){
			this->rObj = p;
		}

		Ram getRam(){
			return this->rObj;
		}

		//getter dan setter atribut totalPrice
		void setTotalPrice(int p1, int p2, int p3){
			this->totalPrice = p1+p2+p3;
		}

		int getTotalPrice(){
			return this->totalPrice;
		}

		//destruktor
		~PC(){

		}

};