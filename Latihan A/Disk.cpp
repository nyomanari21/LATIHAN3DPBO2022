class Disk{

	private:
		//atribut private
		string type; //tipe disk
		int capacity; //kapasitas disk
		int price; //harga disk

	public:

		//konstruktor
		Disk(){

		}

		Disk(string t, int c, int p){
			this->type = t;
			this->capacity = c;
			this->price = p;
		}

		//getter dan setter atribut type
		void setType(string t){
			this->type = t;
		}

		string getType(){
			return this->type;
		}

		//getter dan setter atribut capacity
		void setCapacity(int c){
			this->capacity = c;
		}

		int getCapacity(){
			return this->capacity;
		}

		//getter dan setter atribut price
		void setPrice(int p){
			this->price = p;
		}

		int getPrice(){
			return this->price;
		}

		//destruktor
		~Disk(){

		}

};