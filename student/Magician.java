import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.Iterator;
import java.lang.Iterable;

import java.util.List;

/** Class representing a "magician", who
 *  is able to perform magic tricks from
 *  their trickbag.
 *
 *  The purpose of this class is to practice 
 *  working with iterators and (higher order) functions.
 *
 *  @author YOUR NAME HERE
 */
public class Magician<Abra, Kadabra> implements Iterable<Function<Abra, Kadabra>> {
    
    /** A list of functions (tricks) that the magician
     *  can perform. */
    List<Function<Abra, Kadabra>> trickBag;
    
    //ADDTOME ? ? ?
    
    /** Construct a new magician, whose iterator iterates over
     *  the given NUMOFREQUESTS and selects them based on
     *  TRICKSELECTOR, which should take in an number and return
     *  the index of the next trick from their bag to perform.
     */
    public Magician(int numOfRequests, IntUnaryOperator trickSelector) {
        //FIXME
    }

    /** Add a new TRICK to the magician's bag. */
    public void learn(Function<Abra, Kadabra> trick) {
        //FIXME
    }
    
    /** Perform the magician's Ith trick on 
     *  the object RABBIT, returning the result.
     */
    public Kadabra perform(int i, Abra rabbit) {
        return null; //FIXME
    }

    public Iterator<Function<Abra, Kadabra>> iterator() {
        return null; //FIXME
    }

    /** An iterator for the magician, that essentially
     *  iterates through the bag of tricks and returns the
     *  next function at the index provided by the
     *  selector.
     */
    class TrickIterator implements Iterator<Function<Abra, Kadabra>> {

        // ADDTOME ? ? ?
        
        /** Return if this magician has any more tricks to perform.*/
        public boolean hasNext() {
            return false; // FIXME
        }

        /** Return the next trick in the magician's bag,
         *  selected based on the magician's trick selector,
         *  initially starting at the very first function.
         *  The selector should apply the function 
         *  to the previous index used. 
         * 
         *  If the selector's returned value is out of bounds,
         *  next index to use should be that value mod the size
         *  of the list.
         */
        public Function<Abra, Kadabra> next() {
            return null; // FIXME
        }
    }
    
}
