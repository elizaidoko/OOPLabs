package lab07.exercise3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department department[];

    public Institute(String name, Department department[]){
        setName(name);
        setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartment() {
        return Arrays.copyOf(department,department.length);
    }

    public void setDepartment(Department[] department) {
        if(department != null)
            this.department = Arrays.copyOf(department,department.length);

    }

    @Override
    public String toString() {
        String output = "Name: " + getName() + "\n\n";

            for(int i=0; i<department.length; i++){
                if(department[i] != null)
                    output += "\n\n"+department[i].toString();
            }

            output += "\n\nTotal students in the institute: " + getTotatlStudents();

        return output;
    }

    public int getTotatlStudents(){
        int count = 0;
        Student[] students;

        for(int i = 0; i < department.length; i++){
            if(department[i] != null){
                students = department[i].getStudents();

                for(int j=0; j<students.length;j++){
                    if(students[j] != null){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
