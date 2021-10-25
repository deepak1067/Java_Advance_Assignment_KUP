package Ques7;

public class JavaHungry {
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException {
        try
        {
            int arr[]= {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception : " + e);
        }
    }
}