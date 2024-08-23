public class Pombo extends AnimalVoadorAB {
    private int quantidadeComidaIngerida;
    private double distanciaVoada;
    private double envergaduraAsa;
    private double quantidadeAsas;
    

    public Pombo(String nome, String tipoAnimal, int idade, double altura, double peso, double envergaduraAsa , double quantidadeAsas ) {
        super(nome, tipoAnimal, idade, altura, peso, quantidadeAsas, envergaduraAsa);
        this.quantidadeComidaIngerida = 0;
        this.distanciaVoada = 0.0;
    }

    @Override
    public void comer() {
        quantidadeComidaIngerida += 50; 
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void voar() {
        distanciaVoada += 5.0; 
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
               ", Distancia Voada: " + distanciaVoada +
               ", Envergadura da Asa" + envergaduraAsa +
               ", Quantidade de Asas" + quantidadeAsas;
    }
}
