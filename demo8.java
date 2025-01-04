
import java.util.Scanner;
public class demo8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String loginid = "Kethana";
        String pwd = "12345";
        String reply;
        do{
            System.out.println("welcome to mallareddy university");
            System.out.println("have you visited our site earlier");
        reply = sc.nextLine();
        if(reply == "no"){
            System.out.println("login here");
            System.out.println("enter ur id and pwd");
            loginid = sc.nextLine();
            pwd =  sc.nextLine();
        

        }else
        System.out.println("you are our valued customer");
    } while ((loginid == "Kethana") && (pwd == "12345"));

    }
}
    

