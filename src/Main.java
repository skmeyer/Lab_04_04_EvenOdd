public class Main
{
    public static void main(String[] args)
    {
        int numToExamine = 37;
        int evenOrOdd = numToExamine%2;

        if (evenOrOdd == 0)
            System.out.println(numToExamine + ", the number you entered, is even!" );
        else
            System.out.println(numToExamine + ", the number you entered, is odd!" );

    }
}