package student;

import person.Person;

public class Student extends Person {
    private String code;

    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
