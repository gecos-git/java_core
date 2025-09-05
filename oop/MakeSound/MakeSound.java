public class MakeSound {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 2);
        Cat cat = new Cat("Вискас", 4);

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;
        
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            System.out.print(animal.getName() + " говорит: ");
            animal.makeSound();
        }
    }
}
