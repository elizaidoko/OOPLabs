package lab07.exercise3;

public class TestCollegeApp {
    public static void main(String[] args){

        Student student1 = new Student(154345,"Jake","Computing");
        Student student2 = new Student(234532,"Mary","Creative Media");
        Student student3 = new Student(453726,"Tommy","Computing");
        Student student4 = new Student(623456,"Peter","Creative Media");

        Student[] cs = new Student[10];
        cs[0] = student1;
        cs[1] = student3;

        Student[] cms = new Student[10];
        cms[0] = student2;
        cms[1] = student4;

        Department computing = new Department("Computing",cs);

        Department creativeMedia = new Department("Creative Media", cms);

        Department[] itt = new Department[5];

        itt[0] = computing;
        itt[1] = creativeMedia;

        Institute instituteOfTechgnologyTralee = new Institute("Institute of Technology Tralee",itt);

        System.out.println(instituteOfTechgnologyTralee.toString());

        int computerLocation = -1, creativeLocation = -1;

        for(int i = 0; i<itt.length;i++){
            if(itt[i] != null){
                if(itt[i].getName().equals("Computing")) {
                    computerLocation = i;
                }

                if(itt[i].getName().equals("Creative Media")){
                    creativeLocation = i;
                }
            }
        }
        //Subscript numbers noted

        if(creativeLocation != -1 && computerLocation != -1){
            Student[] allStudents = itt[computerLocation].getStudents();

            for(int i = 0; i<allStudents.length;i++){
                if(allStudents[i]!=null){
                    if (allStudents[i].getId() == 154345){
                        System.out.println("Found Jack");
                        allStudents[i].setDepartment("Creative Media");
                        itt[creativeLocation].getStudents()[2] = allStudents[i];
                        itt[computerLocation].getStudents()[i] = null;

                    }
                }
            }

        }


    }
}
