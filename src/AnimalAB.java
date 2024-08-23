public abstract class AnimalAB implements AnimalIf {

	protected String nome;
	protected String tipoAnimal;
	protected int idade;
	protected String habitat;
	protected double altura;
	protected double peso;

	public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
		this.habitat = habitat;
		this.altura = altura;
		this.peso = peso;
	}

	@Override
	public abstract void comer();

	@Override
	public abstract void moverse();

	@Override
	public abstract void dormir();


		@Override
		public String toString() {
		    return "Nome: " + nome +
		           ", Tipo: " + tipoAnimal +
		           ", Idade: " + idade +
		           ", Habitat: " + habitat +
		           ", Altura: " + altura + " metros" +
		           ", Peso: " + peso + " kg";
		}
}