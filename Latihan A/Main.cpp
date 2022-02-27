#include <iostream>
#include <string>

using namespace std;

#include "PC.cpp"

int main(){

	//membuat objek yang dibutuhkan
	Processor pObj[100];
	Disk dObj[100];
	Ram rObj[100];
	PC PCObj[100];

	//penyimpan input data PC
	string nameProc;
	int priceProc;
	string typeDisk;
	int capacityDisk;
	int priceDisk;
	int capacityRam;
	int priceRam;

	int i = 0; //iterator
	int maxProduct = 0; //penyimpan jumlah maksimum produk yang diinput
	char next = 'y'; //penanda kelanjutan do while loop

	//input data PC dengan do while loop
	do{

		if(next == 'y' || next == 'Y'){

			if(i != 0){
				cout << endl;
			}
			cout << "=========================" << endl;
			cout << "Masukkan data PC " << (i+1) << endl;

			//input data Processor
			cout << "Processor Name  : ";
			cin >> nameProc;
			pObj[i].setName(nameProc);

			cout << "Processor Price : ";
			cin >> priceProc;
			pObj[i].setPrice(priceProc);

			PCObj[i].setProcessor(pObj[i]);

			//input data Disk
			cout << "Disk Type       : ";
			cin >> typeDisk;
			dObj[i].setType(typeDisk);

			cout << "Disk Capacity   : ";
			cin >> capacityDisk;
			dObj[i].setCapacity(capacityDisk);

			cout << "Disk Price      : ";
			cin >> priceDisk;
			dObj[i].setPrice(priceDisk);

			PCObj[i].setDisk(dObj[i]);

			//input data Ram
			cout << "Ram Capacity    : ";
			cin >> capacityRam;
			rObj[i].setCapacity(capacityRam);

			cout << "Ram Price       : ";
			cin >> priceRam;
			rObj[i].setPrice(priceRam);

			PCObj[i].setRam(rObj[i]);

			PCObj[i].setTotalPrice(pObj[i].getPrice(), dObj[i].getPrice(), rObj[i].getPrice());

			i++; //iterator
			maxProduct = i; //iterasi jumlah produk yang diinput

		}

		//meminta user apakah akan melanjutkan input produk atau tidak
		cout << "\nLanjut? (y/n): ";
		cin >> next;

	}while(next != 'n' && next != 'N');

	//menampilkan seluruh data PC
	cout << "\n((Data PC))" << endl;

	for(i = 0; i < maxProduct; i++){

		cout << "\n=========================" << endl;
		cout << "PC " << (i+1) << endl;
		cout << "=========================" << endl;
		PCObj[i].printPC();

	}
	
	return 0;
}