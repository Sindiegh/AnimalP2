public class main {
    public static void main(String [] args )
    {
        Dog dog = new Dog();

        dog.eat() ;   // -> 'Food'
        dog.sounds() ;// -> 'Barks'

        Cat cat = new Cat();

        cat.eat() ;   // -> 'Food'
        cat.sounds(); // -> 'Meow'
    }


}
