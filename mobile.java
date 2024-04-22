import java.util.Scanner;

class mobile{
    public static void main(String args[]){
        int choice;
        Scanner input = new Scanner(System.in);
        do{

            System.out.println("Simple Mobile Money ");
            System.out.println("1. Buy Airtime/Bundle");
            System.out.println("2. Send Money ");
            System.out.println("3. Make Payment");
            System.out.println("4. Withdraw Money ");
            System.out.println("5. Exit ");
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();

            if(choice == 1){
                System.out.println("1. Buy Bundle ");
                System.out.println("2. Buy Airtime ");
                System.out.print("Enter Your Choice: ");
                
                int choice2 = input.nextInt();
                if (choice2==1){
                    System.out.println("Enter Phone Number: ");
                    int phone = input.nextInt();
                    System.out.println("Enter Amount: ");
                    double amount = input.nextDouble();
                    System.out.println("Number: "+phone+" has been Credited with  MWK"+amount);
                    break;
                }
            }else if (choice ==2){
                
                System.out.print("Enter Phone Number: ");
                String phone = input.nextLine();
                System.out.println(" ");
                System.out.print("Enter Amount: ");
                double amount = input.nextDouble();
                System.out.print("Number"+phone+" has been Credited with  MWK"+amount);
                break;

            }else if (choice == 5){
                System.out.println("Goodbye!");
                break;
            }else {
                System.out.println("Invalid Input");
            }

        }while(choice != 5);
    }
}