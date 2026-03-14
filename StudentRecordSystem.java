class Student{
    String name;
    int id;
    int age;
    String course;
    Student(String name, int id,int age,String course){
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
    }
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Student ID:"+id);
        System.out.println("Student Age:"+age);
        System.out.println("Student Course:"+course);



    }
}
public class StudentRecordSystem {
    public static void main(String[] args){
Student [] student = new Student[5];
student[0]= new Student("Alex", 120, 22, "MCA");
student[1]= new Student("Raj", 121, 25, "Data Science");
student[2]= new Student("Stark", 122, 26, "Data Science");
student[3]= new Student("Jenny", 123, 24, "Data Science");
student[4]= new Student("Max", 113, 25, "Cs");
for (Student students : student) {
    System.out.println("--------------");
    students.display();
System.out.println();

}


    }
}
