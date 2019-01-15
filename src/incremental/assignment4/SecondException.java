package incremental.assignment4;

public class SecondException extends NumberException{

    SecondException(){
        setExceptionType();
    }

    @Override
    public void setExceptionType() {
        exceptionType = "second";
    }
}
