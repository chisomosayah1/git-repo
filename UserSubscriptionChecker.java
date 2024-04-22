import java.util.Random;

public class UserSubscriptionChecker{
    public static void main(String [] args) {

        Random rand = new Random();
        int daysUntilExpiration = rand.nextInt(2);

        System.out.println("You have " + daysUntilExpiration+ " day(s)");


        switch (daysUntilExpiration){
            case 0:
            System.out.println(" The subscription has expired");
            System.out.println("");
            break;

            case 1:
            System.out.println(" The subscription will expire within a day. \n renew now and save 20%");
            //System.out.println("renew now and save 20%");
            break;

            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println(" The subscription will expire in " + daysUntilExpiration +"days");
            System.out.println("renew now and save 10%");
            break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println(" The subscription will expire in " + daysUntilExpiration +"days");
            System.out.println("renew now");
            break;


            default:
            System.out.println(" The subscription is still active");
            break;


        }
    }

}