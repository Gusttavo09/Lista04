public class Gato extends AnimalTerrestreAB {
	    private int quantidadeComidaIngerida;
	    private double caminhoPercorrido;
	    private int horasDormidas;

	    public Gato(String nome, int idade, double altura, double peso) {
	        super(nome, "Gato", idade, "Terrestre", altura, peso, 4);
	        this.quantidadeComidaIngerida = 0;
	        this.caminhoPercorrido = 0.0;
	        this.horasDormidas = 0;
	    }

	    @Override
	    public void comer() {
	        quantidadeComidaIngerida += 300;
	    }

	    @Override
	    public void moverse() {
	        caminhoPercorrido += 1.0; 
	    }

	    @Override
	    public void dormir() {
	        horasDormidas += 10; 
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
