package incremental.assignment4;

public abstract class NumberException extends Exception{

    public String exceptionType;

    public abstract void setExceptionType();

    public String toString(){
        return "Exception of type " + exceptionType;
    }
}
