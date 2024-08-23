public abstract class AnimalVoadorAB extends AnimalAB {
    protected double quantidadeAsas;
    protected double envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, double altura, double peso, double quantidadeAsas, double envergaduraAsa) {
        super(nome, tipoAnimal, idade, "Aéreo", altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voar();
}