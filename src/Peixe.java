public class Peixe extends AnimalMarinhoAB {
    private int quantidadeComidaIngerida;
    private double distanciaNadada;

    public Peixe(String nome, int idade, double altura, double peso) {
        super(nome, "Peixe", idade, altura, peso);
        this.quantidadeComidaIngerida = 0;
        this.distanciaNadada = 0.0;
    }

    @Override
    public void comer() {
        quantidadeComidaIngerida += 100; 
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
    
    }

    @Override
    public void nadar() {
        distanciaNadada += 1.0; 
    }
    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Tipo: " + tipoAnimal +
               ", Idade: " + idade +
               ", Habitat: " + habitat +
               ", Altura: " + altura + " metros" +
               ", Peso: " + peso + " kg" +
               ",Quantidade de comida ingerida: " + quantidadeComidaIngerida +
               ",Distancia Nadada: " + distanciaNadada;
    
    
}
}

