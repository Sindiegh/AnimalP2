import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AnimalTest {
//    @Test
//    void animalClass() {
//        Animal animal= new Animal();
//        Assert.assertEquals(animal.getName(),animal.getName());
//    }


    @Test
    void TestDogSound() {
        Dog dog =new Dog();
        Assert.assertEquals("Dog barks",dog.sounds());
    }

    @Test
    void TestDogEats() {
        Dog dog = new Dog();
        Assert.assertEquals("Rax eats",dog.eat());
    }

    @Test
    void TestCatSound() {
    Cat cat =new Cat();
        Assert.assertEquals("Cat meows",cat.sounds());

    }

    @Test
    void TestCatEats() {
         Cat cat = new Cat();
         Assert.assertEquals("Stormy eats",cat.eat());

    }
}
