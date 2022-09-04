import java.util.concurrent.atomic.AtomicInteger;

public class Counted {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private static int id = 0;

    public Counted() {
        id = COUNTER.getAndIncrement();
    }

    public static int getId() {
        return id;
    }
}
