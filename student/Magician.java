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
 *  The test for this class will not compile as it is
 *  not complete. You will need to fill it in
 *  to fit the specification for being iterable.
 *
 *  The Magician's iterator should behave as followed:
 *
 *  hasNext() should return if the magician has any more tricks
 *  to perform as given by numOfRequests in the constructor.
 *
 *  next() should return the next trick in the magician's bag,
 *  starting initially at the first trick in the bag.
 *  Which trick to select next should be based on the trickSelector
 *  in the constructor, which should take in the index of the current
 *  trick performed and return the next trick's index. If the value
 *  returned by the trickSelector is out of bounds, you should
 *  wrap it around the size of the trickBag.
 *
 *  @author YOUR NAME HERE
 */
public class Magician<Abra, Kadabra> { //FIXME?
    
    /** a list of functions (tricks) that the magician
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

    //ADDTOME ? ? ?
    
}
