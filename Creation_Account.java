import java.util.Scanner;

    public class Creation_Account{
        public static void main(String[] args) {


        }
        static void Account_creation(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name = ");
            Main.Name.add(sc.nextLine());
            Main.ACNumber.add(Main.Acc_no);
            Main.Acc_no++;
            System.out.print("Enter your phone number = ");
            Main.phone.add(sc.nextLine());
            System.out.print("Enter new Password = ");
            Main.password.add(sc.next());
            System.out.print("Enter your Gender = ");
            Main.Gender.add(sc.next());
            System.out.print("Enter your Address = ");
            Main.address.add(sc.next());
            System.out.print("Enter your AdhaarNumber = ");
            Main.AdhaarNo.add(sc.next());


        }
    }


