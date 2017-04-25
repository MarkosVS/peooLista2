class Pai:
	def __init__(self, formatonariz, corolhos, mrcnascenca):
		self.formatonariz = formatonariz
		self.corolhos = corolhos
		self.mrcnascenca = mrcnascenca
class Mae:
	def __init__(self, corolhos, corcabelo):
		self.corolhos = corolhos
		self.corcabelo = corcabelo
class Filho(Pai,Mae):
	def __init__(self, formatonariz):
		#inicia atributos de Pai
		super().__init__("reto", "azuis", "sinal em forma de estrela")
		#inicia atributos de Mae
		Mae.__init__(self, "verdes", "loiros")
		#inicia atributos de Filho
		self.formatonariz = formatonariz