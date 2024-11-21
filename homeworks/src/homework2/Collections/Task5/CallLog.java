package homework2.Collections.Task5;

import java.util.HashMap;
import java.util.Map;

public class CallLog {

    Map<Contact, Integer> callLog = new HashMap<>();

    public void addCall (Contact contact) {
        if (callLog.containsKey(contact)) {
            callLog.put(contact, callLog.get(contact) + 1);
        } else {
            callLog.put(contact, 1);
        }
    }
    public void callLogPrint () {
        for (Map.Entry<Contact, Integer> entry : callLog.entrySet()) {
            System.out.println(entry.getKey() + " - колличество вызовов: " + entry.getValue());
        }
    }
}
