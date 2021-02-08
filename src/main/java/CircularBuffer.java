public class CircularBuffer {
    private int default_buffer = 10;
    private String[] buffer;
    private int writePointer;
    private int readPointer;

    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.create();

        int size = circularBuffer.getSize();
        System.out.println(String.format("buffer size : %s", size));
    }

    private int getSize() {
        return buffer.length;
    }

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

    public void write(String input) {
        int pointer = getWritePointer();
        nextWritePointer();

        buffer[pointer] = input;
    }


    public String read() {
        int pointer = getReadPointer();
        nextReadPointer();

        return buffer[pointer];
    }

    public int getWritePointer() {
        return writePointer;
    }
    public int getReadPointer() {
        return readPointer;
    }

    private void nextWritePointer() {
        if (isEndBuffer(writePointer)) {
            writePointer = 0;
            return;
        }
        writePointer++;
    }

    private void nextReadPointer() {
        if (isEndBuffer(readPointer)) {
            readPointer = 0;
            return;
        }
        readPointer++;
    }

    private boolean isEndBuffer(int pointer) {
        return pointer == buffer.length-1;
    }

    private boolean isFullBuffer() {
        return readPointer == writePointer;
    }
}
