class Ram():

	#atribut private
	iCapacity = 0 #kapasitas ram
	iPrice = 0 #harga ram

	#konstruktor
	def __init__(self, iCapacity = 0, iPrice = 0):
		self.iCapacity = iCapacity
		self.iPrice = iPrice

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