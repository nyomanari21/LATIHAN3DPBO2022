from Processor import Processor
from Disk import Disk
from Ram import Ram
from PC import PC

#membuat objek yang dibutuhkan
pObj = [Processor() for i in range(100)]
dObj = [Disk() for i in range(100)]
rObj = [Ram() for i in range(100)]
pcObj = [PC() for i in range(100)]

maxProduct = 0 #jumlah produk maksimum yang diinput

lanjut = 'y' #penanda kelanjutan do while loop

#memasukkan data produk dengan do while loop
while lanjut != 'n' and lanjut != 'N':

	if lanjut == 'y' or lanjut == 'Y':

		if maxProduct != 0:
			print("")

		print("=========================")
		print("Masukkan data produk " + str(maxProduct+1))

		#input data tiap produk
		nameProc = str(input("Processor Name  : "))
		pObj[maxProduct].setName(nameProc)

		priceProc = int(input("Processor Price : "))
		pObj[maxProduct].setPrice(priceProc)

		typeDisk = str(input("Disk Type       : "))
		dObj[maxProduct].setType(typeDisk)

		capacityDisk = int(input("Disk Capacity   : "))
		dObj[maxProduct].setCapacity(capacityDisk)

		priceDisk = int(input("Disk Price      : "))
		dObj[maxProduct].setPrice(priceDisk)

		capacityRam = int(input("Ram Capacity    : "))
		rObj[maxProduct].setCapacity(capacityRam)

		priceRam = int(input("Ram Price       : "))
		rObj[maxProduct].setPrice(priceRam)

		pcObj[maxProduct].setTotalPrice(pObj[maxProduct].getPrice(), dObj[maxProduct].getPrice(), rObj[maxProduct].getPrice())

		maxProduct += 1 #iterasi jumlah produk yang diinput

	#meminta user apakah akan melanjutkan input produk atau tidak
	lanjut = str(input("\n>>Lanjut? (y/n): "))

#menampilkan seluruh data PC
print("\n((Data Produk))")

i = 0 #iterator
for i in range(maxProduct):
	print("\n=========================")
	print("PC " + str(i+1))
	print("=========================")
	print("-------------------------")
	print("Processor")
	print("----------")
	print("Name     : " + str(pObj[i].getName()))
	print("Price    : Rp" + str(pObj[i].getPrice()))
	print("-------------------------")
	print("Disk")
	print("----------")
	print("Type     : " + str(dObj[i].getType()))
	print("Capacity : " + str(dObj[i].getCapacity()) + " GB")
	print("Price    : Rp" + str(dObj[i].getPrice()))
	print("-------------------------")
	print("Ram")
	print("----------")
	print("Capacity : " + str(rObj[i].getCapacity()) + " GB")
	print("Price    : Rp" + str(rObj[i].getPrice()))
	print("-------------------------")

	print("Total Price: " + str(pcObj[i].getTotalPrice()))