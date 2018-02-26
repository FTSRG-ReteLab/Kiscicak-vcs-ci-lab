package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Assert;
import org.junit.Test;
import java.sql.Time;

/**
 * Created by meres on 2/26/18.
 */
public class TachographTest {

    @Test
    public void ChechSpeedLimit() {
        Tachograph t = new Tachograph();
        t.addToTable(10, 10, 10);
        t.addToTable(20, 30, 20);

        Assert.assertEquals(t.getTableSize(), 2);
    }
}
