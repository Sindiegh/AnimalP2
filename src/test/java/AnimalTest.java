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
        Assert.assertEquals("Barks",dog.sounds());
    }

    @Test
    void TestDogEats() {
        Dog dog = new Dog();
        Assert.assertEquals("Food",dog.eat());
    }

    @Test
    void TestCatSound() {
    Cat cat =new Cat();
        Assert.assertEquals("Meow",cat.sounds());

    }

    @Test
    void TestCatEats() {
         Cat cat = new Cat();
         Assert.assertEquals("Food",cat.eat());

    }
}
