package Entities;

public class DomainException extends Exception{
    public DomainException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Usuario ou senha está incorreto";
    }
}
