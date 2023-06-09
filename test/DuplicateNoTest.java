import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DuplicateNoTest {

    DuplicateNo obj = new DuplicateNo();
    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

    @Test
    public void testMethodReturnsDuplicate(){
        int[] arr ={2,3,4,3,4,2,2};
        int largest = obj.returnDuplicate(arr);
        assertEquals(3, largest);
    }
}
