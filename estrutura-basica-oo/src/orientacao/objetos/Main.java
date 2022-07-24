package orientacao.objetos;

public class Main {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setModelo("BMW");
		carro1.setCor("Branco");
		carro1.setCapacidadeTanque(59);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6.39));
		
		Carro carro2 = new Carro("\nMercedez Benz", "Prata", 66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.46));
		
	}

}
