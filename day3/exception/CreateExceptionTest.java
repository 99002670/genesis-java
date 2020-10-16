public class CreateExceptionTest extends Exception
{

    private String message;

    public CreateExceptionTest(String message)
    {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return "MyException:something went wrong here";
    }
}
