import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


<<<<<<< HEAD:src/test/java/AnimalTest.java
public class AnimalTest {
    @Test
    /**
     * When the animal is given
     * Then return its properties (name, species, breed, description)
     */

    //Tests the arraylist in Main class that calls the Animal constructor
    public void whenAnimalThenGiveItsProperties (){
        // Arrange
        Animal animal = new Animal("Nate", "Dragon", "", "Green");

        // Assert
        assertThat(animal.getName(), equalTo("Nate"));
        assertThat(animal.getSpecies(), equalTo("Dragon"));
        assertThat(animal.getBreed(), equalTo(""));
        assertThat(animal.getDescription(), equalTo("Green"));
    }
=======


>>>>>>> v1.1:test/MainTest.java
}
