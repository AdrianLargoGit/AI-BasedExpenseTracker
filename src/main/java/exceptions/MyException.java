package exceptions;

public class MyException extends Exception{
    private long id = 7134463158L;

    public MyException(String message){
        super(message);
    }
}
