package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.sql.Time;

/**
 * Created by meres on 2/26/18.
 */
public class Tachograph {
    Table<Integer, Integer, Integer> table = HashBasedTable.create(); ;

    public void addToTable(int currentTime, int joystickPosition, int referenceSpeed) {
        table.put(currentTime, joystickPosition, referenceSpeed);
    }

    public int getTableSize() {
        return table.size();
    }
}
