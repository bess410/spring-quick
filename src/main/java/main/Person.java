package main;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {

    private String name = "Ella";
    private Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }
}
