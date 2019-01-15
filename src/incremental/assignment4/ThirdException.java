package incremental.assignment4;

public class ThirdException extends NumberException{

    ThirdException(){
        setExceptionType();
    }

    @Override
    public void setExceptionType() {
        exceptionType = "third";
    }
}

