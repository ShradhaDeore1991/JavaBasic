package standalone.collection;

import java.util.List;

public class Person {
    private List<String> friends;

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                '}';
    }
}
