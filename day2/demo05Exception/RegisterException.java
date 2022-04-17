package jmu.day2.demo05Exception;

public class RegisterException extends Exception{
    public RegisterException(){

    }

    public RegisterException(String message){
        super(message);
    }
}
