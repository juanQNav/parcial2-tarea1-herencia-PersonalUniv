package person;

import java.time.LocalDate;
public class Person {
    private String name;
    private LocalDate birthday;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public LocalDate getBirthday(){
        return birthday;
    }
    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }
}
