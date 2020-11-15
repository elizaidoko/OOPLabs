package lab07.exercise3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student students[];

    public Department(String name,Student[] students) {
        setName(name);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students,students.length);
    }

    public void setStudents(Student[] students) {
        if(students != null)
            this.students = Arrays.copyOf(students,students.length);
    }

    @Override
    public String toString() {
        String output = "Name: " + getName() + "\nList of students: \n";


            for(int i=0; i<students.length; i++){
                if(students[i] != null)
                    output += "\n"+students[i].toString();

            }


        return output;
    }
}
