public class ExceptionTest
{
    public static void main(String args[])
    {
        int a, b, c;
        int arr [] = new int[10];
        a = 10;
        b = 10;
        
        try
        {
            if(a==b)
            {
                CreateExceptionTest exp = new CreateExceptionTest("SOMETHING WENT WRONG");
                throw exp;
            }
        }
        catch(CreateExceptionTest e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try
        {
            System.out.println("Before...");
            //arr[12] = 12;
            //c = a / b;
            System.out.println("After...");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finnaly block");
        }

        System.out.println("End...");
    }
}
