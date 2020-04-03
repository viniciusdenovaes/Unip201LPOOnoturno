
public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("Gato", 2.5, 7);
		
		System.out.println(animal);
		
		animal.setIdade(9);
		
		System.out.println(animal);
		
		animal.setIdade(7);
		animal.getIdade();
		
		
		Animal animal1 = new Animal("Gato", 2.5, 7);
		Animal animal2 = new Animal("Gato", 2.5, 7);
		Animal animal3 = animal1;
		
		System.out.println(animal1.equals(animal2));
		System.out.println(animal1 == animal2);
		
		System.out.println(animal1.equals(animal3));
		System.out.println(animal1 == animal3);
		
		
		
	}

}
