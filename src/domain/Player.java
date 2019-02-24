package domain;

import java.io.Serializable;
import java.util.StringJoiner;

public class Player implements Comparable<Player>, Serializable {

    private static final long serialVersionUID = 1l;

    private String firstName;
    private String lastName;
    private int result;

    public Player(String firstName, String lastName, int wynik) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = wynik;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getResult() {
        return result;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Player.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("result=" + result)
                .toString();
    }

    public String getCsvFormat() {
        return this.firstName + " " + this.lastName + ";" + this.result;
    }

    @Override
    public int compareTo(Player o) {
        if (this.lastName.compareTo(o.getLastName()) == 0) {
            return this.firstName.compareTo(o.getFirstName());
        } else {
            return this.lastName.compareTo(o.getLastName());
        }
    }
}