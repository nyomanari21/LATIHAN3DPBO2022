class Ram{

	private:
		//atribut private
		int capacity; //kapasitas ram
		int price; //harga ram

	public:

		//konstruktor
		Ram(){

		}

		Ram(int c, int p){
			this->capacity = c;
			this->price = p;
		}

		//getter dan setter atribut capacity
		void setCapacity(int c){
			this->capacity = c;
		}

		int getCapacity(){
			return this->capacity;
		}

		//getter dan setter atribut price
		void setPrice(int c){
			this->price = c;
		}

		int getPrice(){
			return this->price;
		}

		//destruktor
		~Ram(){

		}

};