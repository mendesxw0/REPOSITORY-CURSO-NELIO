package pack;

public class Main {
    public static void main(String[] args) {

        MainSetGet mainset = new MainSetGet();


        String result02 = mainset.getUserName();
        String result = mainset.setUserName(result02);
        System.out.println("SetUserName: "+ result);



        System.out.println(mainset.getUserAge());

    }
}