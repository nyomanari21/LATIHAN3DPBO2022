from Processor import Processor
from Disk import Disk
from Ram import Ram

class PC():

	#atribut private
	pObj = Processor() #data prosesor
	dObj = Disk() #data disk
	rObj = Ram() #data ram
	totalPrice = 0 #total harga pc


	#konstruktor
	def __init__(self, pObj = Processor(), dObj = Disk(), rObj = Ram(), totalPrice = 0):
		self.pObj = pObj
		self.dObj = dObj
		self.rObj = rObj
		self.totalPrice = totalPrice

	#getter dan setter atribut pObj
	def setProcessor(self, pObj):
		self.pObj = pObj

	def getProcessor(self):
		return self.pObj

	#getter dan setter atribut dObj
	def setDisk(self, dObj):
		self.dObj = dObj

	def getDisk(self):
		return self.dObj

	#getter dan setter atribut rObj
	def setRam(self, rObj):
		self.rObj = rObj

	def getRam(self):
		return self.rObj

	#getter dan setter atribut totalPrice
	def setTotalPrice(self, p1, p2, p3):
		self.totalPrice = p1+p2+p3

	def getTotalPrice(self):
		return self.totalPrice

	def printPC(self):
		print("-------------------------")
		print("Processor")
		print("----------")
		print("Name     : " + str(self.pObj.getName()))
		print("Price    : Rp" + str(self.pObj.getPrice()))
		print("-------------------------")
		print("Disk")
		print("----------")
		print("Type     : " + str(self.dObj.getType()))
		print("Capacity : " + str(self.dObj.getCapacity()) + " GB")
		print("Price    : Rp" + str(self.dObj.getPrice()))
		print("-------------------------")
		print("Ram")
		print("----------")
		print("Capacity : " + str(self.rObj.getCapacity()) + " GB")
		print("Price    : Rp" + str(self.rObj.getPrice()))
		print("-------------------------")

		print("Total Price: " + str(self.totalPrice))