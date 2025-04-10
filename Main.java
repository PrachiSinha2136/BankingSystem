import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<String> Name = new ArrayList<>();
    static  ArrayList<Integer> ACNumber= new ArrayList<>();
    static  ArrayList<String> phone = new ArrayList<>();
    static  ArrayList<String> password= new ArrayList<>();
    static  ArrayList<String> Gender= new ArrayList<>();
    static  ArrayList<String>  address = new ArrayList<>();
    static  ArrayList<String>  AdhaarNo= new ArrayList<>();
    static  ArrayList<Double>  bankBalance = new ArrayList<>();
    static Integer Acc_no =0;
    static Integer index;
    static  double Totalcash;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Bank");
        boolean check = true;
        while(check) {

            System.out.println("choose the service you want...");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Details");
            System.out.println("4. Exit");
            int num= sc.nextInt();
            switch(num){
                case 1:
                    Creation_Account.Account_creation();
                    break;

                case 2:
                    Login.login();
                    break;
                case 3:
                    Show_details.shows();
                    break;
                case 4:
                    check = false;
                     break;

            }

        }
    }
}