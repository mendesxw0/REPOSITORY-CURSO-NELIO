package pack;

public class MainSetGet {
    private String userName;
    private int userAge;


    public String getUserName() {
        userName = "Lucas";
        return userName;
    }
    public String setUserName(String user) {
        this.userName = user;
        return user;
    }

    public int getUserAge() {
        userAge = 23;

        if(userAge != 20) {
            String result = "O usuario tem uma idade diferente de 20.";

            System.out.println(result);
        }
        return userAge;
    }
}
