package classes.dao;

import classes.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT=0;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Nick"));
        people.add(new Person(++PEOPLE_COUNT,"Gena"));
        people.add(new Person(++PEOPLE_COUNT,"Zhenya"));
        people.add(new Person(++PEOPLE_COUNT,"Ilham"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
}
