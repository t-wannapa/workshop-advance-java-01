public class CircularBuffer {
    private int default_buffer = 10;
    private String[] buffer;
    private int writePointer;
    private int readPointer;

    public void init(int size) {
        buffer = new String[size];
        writePointer = 0;
        readPointer = 0;
    }

    public void create() {
        init(default_buffer);
    }

    public void create(int size) {
        init(size);
    }
}
