package Chapter9.Example.Example6;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date dateCreated;

    public Student(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
