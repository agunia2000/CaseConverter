import static org.junit.jupiter.api.Assertions.*;

class ConvertingFunctionsTest {

    ConvertingFunctions convertingFunctions = new ConvertingFunctions();

    @org.junit.jupiter.api.Test
    void getSentenceCase() {
        assertEquals("This is first test. Nice.", convertingFunctions.getSentenceCase("this is FIRST TEST. nice."));
        assertEquals("   Stupid text :) but // my app works good", convertingFunctions.getSentenceCase("   Stupid tExT :) but // my ApP WORKs Good"));
        assertEquals("Case-converter", convertingFunctions.getSentenceCase("CaSe-CoNvErTeR"));
        assertEquals(".  W  .   E ..L.  88 Come", convertingFunctions.getSentenceCase(".  w  .   e ..l.  88 cOMe"));
        assertEquals("And the winner is... You! Congratulations.", convertingFunctions.getSentenceCase("ANd The winner is... YOU! Congratulations."));
    }

    @org.junit.jupiter.api.Test
    void getTitleCase() {
        assertEquals("This Is First Test. Nice.", convertingFunctions.getTitleCase("this is FIRST TEST. nice."));
        assertEquals("   Stupid Text :) But // My App Works Good", convertingFunctions.getTitleCase("   Stupid tExT :) but // my ApP WORKs Good"));
        assertEquals("Case-Converter", convertingFunctions.getTitleCase("CaSe-CoNvErTeR"));
        assertEquals(".  W  .   E ..L.  88 Come", convertingFunctions.getTitleCase(".  w  .   e ..l.  88 cOMe"));
        assertEquals("And The Winner Is... You! Congratulations.", convertingFunctions.getTitleCase("ANd The winner is... YOU! Congratulations."));
    }

    @org.junit.jupiter.api.Test
    void getLowerCase() {
        assertEquals("this is first test. nice.", convertingFunctions.getLowerCase("this is FIRST TEST. nice."));
        assertEquals("   stupid text :) but // my app works good", convertingFunctions.getLowerCase("   Stupid tExT :) but // my ApP WORKs Good"));
        assertEquals("case-converter", convertingFunctions.getLowerCase("CaSe-CoNvErTeR"));
        assertEquals(".  w  .   e ..l.  88 come", convertingFunctions.getLowerCase(".  w  .   e ..l.  88 cOMe"));
        assertEquals("and the winner is... you! congratulations.", convertingFunctions.getLowerCase("ANd The winner is... YOU! Congratulations."));
    }

    @org.junit.jupiter.api.Test
    void getUpperCase() {
        assertEquals("THIS IS FIRST TEST. NICE.", convertingFunctions.getUpperCase("this is FIRST TEST. nice."));
        assertEquals("   STUPID TEXT :) BUT // MY APP WORKS GOOD", convertingFunctions.getUpperCase("   Stupid tExT :) but // my ApP WORKs Good"));
        assertEquals("CASE-CONVERTER", convertingFunctions.getUpperCase("CaSe-CoNvErTeR"));
        assertEquals(".  W  .   E ..L.  88 COME", convertingFunctions.getUpperCase(".  w  .   e ..l.  88 cOMe"));
        assertEquals("AND THE WINNER IS... YOU! CONGRATULATIONS.", convertingFunctions.getUpperCase("ANd The winner is... YOU! Congratulations."));
    }
}