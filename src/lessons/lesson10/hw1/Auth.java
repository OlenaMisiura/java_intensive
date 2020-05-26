package lessons.lesson10.hw1;

import java.util.Objects;

public class Auth implements Comparable<Auth> {
    private int id;
    private String login;
    private String password;

    public Auth() {
    }

    public Auth(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auth auth = (Auth) o;
        return id == auth.id &&
                login.equals(auth.login) &&
                password.equals(auth.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Auth{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Auth o) {
        return this.id-o.id;
    }
}
