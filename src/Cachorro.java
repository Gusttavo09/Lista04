public class Cachorro extends AnimalTerrestreAB {
	
	    private int quantidadeComidaIngerida;
	    private double caminhoPercorrido;
	    private int horasDormidas;

	    public Cachorro(String nome, int idade, double altura, double peso) {
	        super(nome, "Cachorro", idade, "Terrestre", altura, peso, 4);
	        this.quantidadeComidaIngerida = 0;
	        this.caminhoPercorrido = 0.0;
	        this.horasDormidas = 0;
	    }

	    @Override
	    public void comer() {
	        quantidadeComidaIngerida += 500; 
	    }

	    @Override
	    public void moverse() {
	        caminhoPercorrido += 2.0; 
	    }

	    @Override
	    public void dormir() {
	        horasDormidas += 8; 
	    } 
	        @Override
	        public String toString() {
	            return "Nome: " + nome +
	                   ", Tipo: " + tipoAnimal +
	                   ", Idade: " + idade +
	                   ", Habitat: " + habitat +
	                   ", Altura: " + altura + " metros" +
	                   ", Peso: " + peso + " kg" +
	                   ", Comida ingerida: " + quantidadeComidaIngerida + "g" +
	                   ", Caminho percorrido: " + caminhoPercorrido + " km" +
	                   ", Horas dormidas: " + horasDormidas + " horas";
	        
	        
	}
}
