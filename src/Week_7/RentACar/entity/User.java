package Week_7.RentACar.entity;

public class User {
    private int Id;
    private String Name;
    private String Password;
    private String Role;

    public User() {
    }

    public User(int id, String name, String password, String role) {
        this.Id = id;
        this.Name = name;
        this.Password = password;
        this.Role = role;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Pass='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }
}
