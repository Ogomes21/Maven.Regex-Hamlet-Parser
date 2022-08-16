import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testFindHamlet() {

        //Given
        String hamletWord = "hamlet";

        //When
        Boolean actual = hamletParser.findHamlet(hamletWord);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHamletUpperCase() {

        //Given
        String hamletWord = "Hamlet";

        //When
        Boolean actual = hamletParser.findHamlet(hamletWord);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHoratio() {

        //Given
        String horatioWord = "horatio";

        //When
        Boolean actual = hamletParser.findHoratio(horatioWord);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHoratioUpperCase() {

        //Given
        String horatioWord = "Horatio";

        //When
        Boolean actual = hamletParser.findHoratio(horatioWord);

        //Then
        Assert.assertTrue(actual);
    }


    @Test
    public void testChangeHamletToLeon() {
    }


    @Test
    public void testChangeHoratioToTariq() {
    }




}