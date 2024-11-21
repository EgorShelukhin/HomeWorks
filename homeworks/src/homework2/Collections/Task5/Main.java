package homework2.Collections.Task5;

public class Main {
    public static void main(String[] args) {

        CallLog callLog = new CallLog();

        Contact contact1 = new Contact("Lera", "8-999-333-33-33");
        Contact contact2 = new Contact("Egor", "8-909-444-12-12");
        Contact contact3 = new Contact("Slavets", "8-955-555-55-55");

        callLog.addCall(contact1);
        callLog.addCall(contact2);
        callLog.addCall(contact2);
        callLog.addCall(contact2);
        callLog.addCall(contact1);
        callLog.addCall(contact1);
        callLog.addCall(contact3);

        callLog.callLogPrint();
    }
}