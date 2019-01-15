package incremental.assignment4;

public class FirstException extends NumberException{

    FirstException(){
        setExceptionType();
    }

    @Override
    public void setExceptionType() {
        exceptionType = "first";
    }
}
