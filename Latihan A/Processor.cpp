class Processor{

	private:
		//atribut private
		string name; //nama prosesor
		int price; //harga prosesor

	public:

		//konstruktor
		Processor(){

		}

		Processor(string n, int p){
			this->name = n;
			this->price = p;
		}

		//getter dan setter atribut name
		void setName(string n){
			this->name = n;
		}

		string getName(){
			return this->name;
		}

		//getter dan setter atribut price
		void setPrice(int p){
			this->price = p;
		}

		int getPrice(){
			return this->price;
		}

		//destruktor
		~Processor(){

		}

};