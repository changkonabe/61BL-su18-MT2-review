import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/** A magic shop that sells tricks (functions). 
 * 
 *  The purpose of this class is to get
 *  practice working with functions.
 *
 *  It may be helpful to check the java.lang.String
 *  documentation.
 *
 *  @author YOUR NAME HERE
 */
public class MagicShop {

    /** Return a function that takes in a String and
     *  returns the string 'rabbit'.
     */
    public static Function<String, String> hatTrick() {
        return null; //FIXME
    }
    
    /** Return a function that replaces all instances 
     *  of OLD from a string with NEWSTRING.
     */
    public static Function<String, String> sleightOfHand(String old, String newString) {
        return null; //FIXME
    }

    /** Return a function that takes in a String
     *  and outputs the String in all upper-case.
     *  Do not use a lambda function. 
     */
    public static Function<String, String> beAmazed() {
        return null; //FIXME
    }

    /** Return a function that, when applied to an integer,
     *  returns the next integer of the same parity.
     *  (If the integer is odd, return the next odd number,
     *  if even, next even).
     */
    public static IntUnaryOperator nextSameParity() {
        return null; //FIXME
    }
}
