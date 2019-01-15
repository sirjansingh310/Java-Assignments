package incremental.assignment4;

public abstract class NumberException extends Exception{

    public String exceptionType;

    NumberException(String exceptionType){
        this.exceptionType = exceptionType;
    }

    public String toString(){
        return "Exception of type " + exceptionType;
    }
}
