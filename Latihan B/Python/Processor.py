class Processor():

	#atribut private
	iName = "" #nama prosesor
	iPrice = 0 #harga prosesor


	#konstruktor
	def __init__(self, iName = "", iPrice = 0):
		self.iName = iName
		self.iPrice = iPrice

	#getter dan setter atribut iName
	def setName(self, iName):
		self.iName = iName

	def getName(self):
		return self.iName

	#getter dan setter atribut iPrice
	def setPrice(self, iPrice):
		self.iPrice = iPrice

	def getPrice(self):
		return self.iPrice