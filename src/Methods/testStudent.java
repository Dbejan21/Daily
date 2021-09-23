package Methods;

public class testStudent {

    public static void main(String[] args) {
        TechStudent student1 = new TechStudent();
        TechStudent student2 = new TechStudent();

        // static variables are the same for every object
        student1.setStudentName("David");
        student2.setStudentName("John");
        System.out.println(student1.studentName);
        System.out.println(student2.studentName);

        //when was the last time change the variable
        student1.setSchoolName("Techtorial");
        student2.setSchoolName("Tech School");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        TechStudent.setSchoolName("2200 E Devon Ave");
        System.out.println(student1.schoolAddress);
        System.out.println(student2.schoolAddress);
        setStaticVariables("Techtorial", "2200 E Devon");
        //if method return type is void we cannot use in the print out statement

    }

    public static void setStaticVariables (String schoolName, String address){
        TechStudent.setSchoolAddress(address);
        TechStudent.setSchoolName(schoolName);
    }
}
