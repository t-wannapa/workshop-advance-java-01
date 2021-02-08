import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    @DisplayName("ตรวจสอบขนาด default ของ CircularBuffer ต้องมีขนาดเท่ากับ 10")
    public void create_buffer_with_default_size(){
        CircularBuffer circularBuffer = new CircularBuffer();
        // Act
        circularBuffer.create();
        int size = circularBuffer.getSize();

        // Validate/Checking/Assert
        assertEquals(10, size);
    }

}