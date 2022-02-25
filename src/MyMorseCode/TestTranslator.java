package MyMorseCode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestTranslator {

    @Test
    public void TestMorseToString() {

        //Arrange
        Translator translator = new Translator();

        //Act
        String actual = translator.ToMorse("**** * *_** *_** ___");

        //Assert
        assertEquals("H E L L O ", actual);
    }

    @Test
    public void TestStringToMorse(){

        //Arrange
        Translator translator = new Translator();

        //Act
        String actual = translator.ToMorse("A B C");

        //Assert
        assertEquals("*_   _***   _*_* ", actual);
    }

    @Test
    public void TestUpperAndLowerCaseLettersToMorse(){

        //Arrange
        Translator translator = new Translator();

        //Act
        String actual = translator.ToMorse("Ab");

        //Assert
        assertEquals("*_ _*** ", actual);

    }
}
