import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void Caesar_testingEncryptingmethod() {
        Caesar caesar =new Caesar();
        assertEquals(" nbe",caesar.encrypt("mad",1));
    }
}
