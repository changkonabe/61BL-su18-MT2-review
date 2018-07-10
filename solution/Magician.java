import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.Iterator;
import java.lang.Iterable;

import java.util.List;
import java.util.ArrayList;

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
    
    int numRequests;
    IntUnaryOperator selector;
    
    /** Construct a new magician, whose iterator iterates over
     *  the given NUMOFREQUESTS and selects them based on
     *  TRICKSELECTOR, which should take in an number and return
     *  the index of the next trick from their bag to perform.
     */
    public Magician(int numOfRequests, IntUnaryOperator trickSelector) {
        trickBag = new ArrayList<>();
        numRequests = numOfRequests;
        selector = trickSelector;
    }

    /** Add a new TRICK to the magician's bag. */
    public void learn(Function<Abra, Kadabra> trick) {
        trickBag.add(trick);
    }
    
    /** Perform the magician's Ith trick on 
     *  the object RABBIT, returning the result.
     */
    public Kadabra perform(int i, Abra rabbit) {
        return trickBag.get(i).apply(rabbit);
    }

    public Iterator<Function<Abra, Kadabra>> iterator() {
        return new TrickIterator();
    }

    /** An iterator for the magician. */
    class TrickIterator implements Iterator<Function<Abra, Kadabra>> {

        int performed;
        int nextIndex;
        
        TrickIterator() {
            performed = 0;
            nextIndex = 0;
        }
        
        /** Return if this magician has any more tricks to perform.*/
        public boolean hasNext() {
            return performed < numRequests;
        }

        /** Return the next trick in the magician's bag,
         *  selected based on the magician's trick selector.
         */
        public Function<Abra, Kadabra> next() {
            Function<Abra, Kadabra> nextTrick = trickBag.get(nextIndex);
            nextIndex = selector.applyAsInt(nextIndex) % trickBag.size();
            performed++;
            return nextTrick;
        }
    }
    
}
