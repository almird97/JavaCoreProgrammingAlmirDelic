package two;

/**
 *
 * @author Almir
 */
public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String ime, String prezime, int godine) {
        this.name = ime;
        this.surname = prezime;
        this.age = godine;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
