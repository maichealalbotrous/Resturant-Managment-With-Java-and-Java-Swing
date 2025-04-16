public class User implements opration{
    String name;
    String password;
    opration[] opration;
    
    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public opration[] getList() {
        return opration;
    }

    public void setList(opration[] list) {
        this.opration = list;
    }

    @Override
    public void Menu(DataBase DataBase) {

    }

    @Override
    public String toString() {
        return  name+"</N>" +password+"</N>" ;
    }

    
}
