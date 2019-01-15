package incremental.assignment4;

public class MyExceptionThrower{
    public void throwException(int type) throws NumberException, NullPointerException{

        NumberException numberException = null;
        if(type == 1)
            numberException = new FirstException();
        else if(type == 2 )
            numberException = new SecondException();
        else if(type == 3)
            numberException = new ThirdException();
        if(numberException != null)
            throw numberException;
        else
            throw new NullPointerException();
    }
}
