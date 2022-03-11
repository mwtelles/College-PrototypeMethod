package Prototype;

public class Manager implements Cloneable{
    private String name;
    private String lastName;
    private Role role;

    public Manager(String name, String lastName, Role role) {
        this.name = name;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager managerClone = (Manager) super.clone();
        managerClone.role = (Role) managerClone.role.clone();
        return managerClone;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
