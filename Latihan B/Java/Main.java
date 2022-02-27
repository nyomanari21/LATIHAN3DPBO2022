import java.util.Scanner;

class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		//membuat array objek yang dibutuhkan
		Processor pObj[] = new Processor[100];
		Disk dObj[] = new Disk[100];
		Ram rObj[] = new Ram[100];
		PC pcObj[] = new PC[100];

		//penyimpan input data PC
		String nameProc = "";
		int priceProc = 0;
		String typeDisk = "";
		int capacityDisk = 0;
		int priceDisk = 0;
		int capacityRam = 0;
		int priceRam = 0;

		int maxProduct = 0; //penyimpan jumlah maksimum produk yang diinput
		String next = "y"; //penanda kelanjutan do while loop

		//input data PC dengan do while loop
		do{

			if(next.equals("y") || next.equals("Y")){

				pObj[maxProduct] = new Processor();
				dObj[maxProduct] = new Disk();
				rObj[maxProduct] = new Ram();
				pcObj[maxProduct] = new PC();

				if(maxProduct != 0){
					System.out.println("");
				}
				System.out.println("=========================");
				System.out.println("Masukkan data PC " + (maxProduct+1));
				
				//input data processor
				System.out.print("Processor Name  : ");
				try{
					nameProc = sc.next();
				}catch(Exception e){}
				pObj[maxProduct].setName(nameProc);

				System.out.print("Processor Price : ");
				try{
					priceProc = sc.nextInt();
				}catch(Exception e){}
				pObj[maxProduct].setPrice(priceProc);

				pcObj[maxProduct].setProcessor(pObj[maxProduct]);

				//input data disk
				System.out.print("Disk Type       : ");
				try{
					typeDisk = sc.next();
				}catch(Exception e){}
				dObj[maxProduct].setType(typeDisk);

				System.out.print("Disk Capacity   : ");
				try{
					capacityDisk = sc.nextInt();
				}catch(Exception e){}
				dObj[maxProduct].setCapacity(capacityDisk);

				System.out.print("Disk Price      : ");
				try{
					priceDisk = sc.nextInt();
				}catch(Exception e){}
				dObj[maxProduct].setPrice(priceDisk);

				pcObj[maxProduct].setDisk(dObj[maxProduct]);

				//input data ram
				System.out.print("Ram Capacity    : ");
				try{
					capacityRam = sc.nextInt();
				}catch(Exception e){}
				rObj[maxProduct].setCapacity(capacityRam);

				System.out.print("Ram Price       : ");
				try{
					priceRam = sc.nextInt();
				}catch(Exception e){}
				rObj[maxProduct].setPrice(priceRam);

				pcObj[maxProduct].setRam(rObj[maxProduct]);

				pcObj[maxProduct].setTotalPrice(pObj[maxProduct].getPrice(), dObj[maxProduct].getPrice(), rObj[maxProduct].getPrice());

				maxProduct++; //iterasi jumlah data yang diinput

			}

			//meminta user untuk melanjutkan input atau tidak
			System.out.print("\n>>Lanjut? (y/n): ");
			try{
				next = sc.next();
			}catch(Exception e){}

		}while(!next.equals("n") && !next.equals("N"));

		//menampilkan seluruh data produk
		System.out.println("\n((Data PC))");

		for(int i = 0; i < maxProduct; i++){

			System.out.println("\n=========================");
			System.out.println("PC " + (i+1));
			System.out.println("=========================");
			pcObj[i].printPC();

		}

	}

}