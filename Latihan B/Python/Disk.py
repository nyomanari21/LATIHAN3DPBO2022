class Disk():

	#atribut private
	iType = "" #tipe disk
	iCapacity = 0 #kapasitas disk
	iPrice = 0 #harga disk


	#konstruktor
	def __init__(self, iType = "", iCapacity = 0, iPrice = 0):
		self.iType = iType
		self.iCapacity = iCapacity
		self.iPrice = iPrice

	#getter dan setter atribut iType
	def setType(self, iType):
		self.iType = iType

	def getType(self):
		return self.iType

	#getter dan setter atribut iCapacity
	def setCapacity(self, iCapacity):
		self.iCapacity = iCapacity

	def getCapacity(self):
		return self.iCapacity

	#getter dan setter atribut iPrice
	def setPrice(self, iPrice):
		self.iPrice = iPrice

	def getPrice(self):
		return self.iPrice