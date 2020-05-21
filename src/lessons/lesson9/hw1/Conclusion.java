package lessons.lesson9.hw1;

public class Conclusion {
    private int id;
    private String name;
    private int age;
    private String login;
    private String password;
    private Person person;
    private Auth auth;

    public Conclusion() {
    }

//    public Conclusion(int id, String name, int age, String login, String password) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.login = login;
//        this.password = password;
//    }

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
    public String toString() {
        return "Conclusion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' ;
    }
}
