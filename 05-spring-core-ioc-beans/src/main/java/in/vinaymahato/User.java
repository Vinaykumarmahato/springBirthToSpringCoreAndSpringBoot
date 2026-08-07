package in.vinaymahato;

public class User {
    private String Name;
    private int Age;

    public User(int age, String name) {
        Age = age;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
