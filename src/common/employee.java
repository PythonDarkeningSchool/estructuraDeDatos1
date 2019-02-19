package common;

public class employee {

    // define the variables
    private int code;
    private String name;
    private String turn;

    // empty constructor
    public employee(){}

    // constructor with parameters
    public employee(int code, String name, String turn){
        this.code = code;
        this.name = name;
        this.turn = turn;
    }

    // Define the getters and setters
    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public String getTurn(){
        return turn;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(int code){
        this.code = code;
    }

    public void setTurn(String turn){
        this.turn = turn;
    }

}

