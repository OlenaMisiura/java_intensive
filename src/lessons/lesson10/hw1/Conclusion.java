package lessons.lesson10.hw1;

import java.util.Objects;

public class Conclusion implements Comparable<Conclusion>{
    private int id;
    private String name;
    private int age;
    private String login;
    private String password;
    private Person person;
    private Auth auth;

    public Conclusion()  {
    }

    public Conclusion(Person person, Auth auth) {
        this.person = person;
        this.auth = auth;
        this.id=person.getId();
        this.name=person.getName();
        this.age=person.getAge();
        this.login=auth.getLogin();
        this.password=auth.getPassword();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conclusion that = (Conclusion) o;
        return id == that.id &&
                age == that.age &&
                name.equals(that.name) &&
                login.equals(that.login) &&
                password.equals(that.password) &&
                person.equals(that.person) &&
                auth.equals(that.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, login, password, person, auth);
    }

    @Override
    public String toString() {
        return "Conclusion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' ;
    }

    @Override
    public int compareTo(Conclusion o) {
        return this.id-o.id;
    }
}
