import java.io.IOException;

public class Adminimp implements opration{

    @Override
    public void Menu(DataBase DataBase) {
        Admin Admin = new Admin();
        Admin.setName("michael");
        Admin.setPassword("123123");
        DataBase.addAdmin(Admin);
        DataBase.SaveAdminUser();
        try {
            DataBase.GetAdminUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
