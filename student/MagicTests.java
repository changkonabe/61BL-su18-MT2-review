import org.junit.Test;
import static org.junit.Assert.*;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/** Tests for the Magician/MagicShop classes. */
public class MagicTests {
    
    @Test
    public void testHatTrick() {
        String s = "I reach into my hat and pull out a...";
        Function<String, String> f = MagicShop.hatTrick();
        assertEquals("Rabbit!", f.apply(s));
    }
    
    @Test
    public void testSleightOfHand() {
        String s = "The queen of hearts is your card.";
        Function<String, String> f = MagicShop.sleightOfHand("heart", "diamond");
        assertEquals("The queen of diamonds is your card.", f.apply(s));
    }

    @Test
    public void testBeAmazed() {
        String s = "is this your card?";
        Function<String, String> f = MagicShop.beAmazed();
        assertEquals("IS THIS YOUR CARD?", f.apply(s));
    }

    @Test
    public void testNextSameParity() {
        IntUnaryOperator f = MagicShop.nextSameParity();
        int a = 0;
        int b = 1;
        assertEquals(f.applyAsInt(0), 2);
        assertEquals(f.applyAsInt(1), 3);        
    }
    
    /** Tests that magicians can learn tricks
     *  and perform them.
     */
    @Test
    public void testMagician() {
        Magician<String, String> copperfield = new Magician<String, String>(0, null);

        copperfield.learn(MagicShop.hatTrick());
        copperfield.learn(MagicShop.beAmazed());

        String inp = "abracadabra";
        
        assertEquals("Rabbit!", copperfield.perform(1, inp));
        assertEquals("ABRACADABRA", copperfield.perform(1, inp));
    }
    
    /** Test iteration of the Magician class
     *  and its respective iterator.
     */
    @Test
    public void testTrickIterator() {
        IntUnaryOperator selector = MagicShop.nextSameParity();
        int numberOfPerformances = 4;
        Magician<String, String> copperfield = new Magician<String, String>(numberOfPerformances, selector);

        copperfield.learn(MagicShop.hatTrick());
        copperfield.learn(MagicShop.sleightOfHand(" ", ""));
        copperfield.learn(MagicShop.beAmazed());
        
        String[] inputs = new String[] {
            "tada!",
            "don't blink",
            "now you see it, now you don't",
        };
        
        String[] expected = new String[] {
            "Rabbit!",
            "DON'T BLINK",
            "nowyouseeit,nowyoudon't",
            "Rabbit!",
        };
        
        int i = 0;
        for (Function<String, String> trick : copperfield) {
            inputs[i] = trick.apply(inputs[i]);
            i++;
        }

        for (int j = 0; j < expected.length; j++) {
            assertEquals(inputs[i], expected[i]);
        }
    }

    /** Main method if you wish to run this test in
     *  terminal. Note you will also need to set up
     *  your classpath properly as instructed here:
     *  https://sp18.datastructur.es/materials/lab/lab3supplement/lab3supplement
     */
    public static void main(String... args) {
        jh61b.junit.TestRunner.runTests(MagicTests.class);
    }

}
