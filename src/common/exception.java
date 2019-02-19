package common;

public class exception extends Exception{
    private String message;

    public exception(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }
}
