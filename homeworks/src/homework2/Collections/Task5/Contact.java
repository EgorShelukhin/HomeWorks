package homework2.Collections.Task5;

import java.util.Objects;

public class Contact {

    String name;
    String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}