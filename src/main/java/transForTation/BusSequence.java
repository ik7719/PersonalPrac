package transForTation;

public class BusSequence {

    private static Long sequence = 0L;

    public Long nextVal(){
        return sequence + 1L;
    }
}
