//Write a java program to define an interface 'compute' with an abstract method 'convert()'
//Define two classes with implements this compute interface and extends the convert method to convert methon to kilobytes to gigabytes, and euro to rupees
//Declare object sfor both -the classes to demenstrate th econversion from kilobytes to gigabytes and euros to rupees.
import java.util.Scanner;
interface Compute {
    public double convert(int val);

}

class ByteConversion implements Compute{
    public double convert(int val)
    {
        return (val /(1024 * 1024));
    }
}

class CurrencyConversion implements Compute{
    public double convert(int val)
    {
        return (val / 89.68);
    }
}

class Terminal {
    public static void main(String[] args)
    {
        int ch,byt,rup;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the type of operation you wish to choose: \n1: For bytes \n2: For Currency");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the number of kilobytes you wish to convert into gigabytes .");
            byt = sc.nextInt();
            ByteConversion b = new ByteConversion();
            System.out.println("The converted values is "+ b.convert(byt) + "GigaBytes");
            break;

            case 2:
            System.out.println("Enter the rupees you wish to convert into euros .");
            rup = sc.nextInt();
            CurrencyConversion c = new CurrencyConversion();
            System.out.println("The converted values is "+ c.convert(rup) + "Euros");
            break;

            default:
            System.out.println("INVAILD******");
            break;
        }
    }
}

