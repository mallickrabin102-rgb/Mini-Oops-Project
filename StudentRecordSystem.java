import java.util.Scanner;

class Student {
    String name;
    int id;
    int age;
    String course;

    Student(String name, int id, int age, String course) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Student Name:" + name);
        System.out.println("Student ID:" + id);
        System.out.println("Student Age:" + age);
        System.out.println("Student Course:" + course);

    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] student = new Student[10];
        student[0] = new Student("Alex", 120, 22, "MCA");
        student[1] = new Student("Raj", 121, 25, "Data Science");
        student[2] = new Student("Stark", 122, 26, "Data Science");
        student[3] = new Student("Jenny", 123, 24, "Data Science");
        student[4] = new Student("Max", 113, 25, "Cs");
        int count = 5;

        int choice;
        int searchId;
        do {
            System.out.println("1.View Students");
            System.out.println("2.Add Student");
            System.out.println("3.Search Students");
            System.out.println("4.Delete Student Record:");
            System.out.println("5.Exit!");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Student student2 : student) {
                        if (student2 != null) {
                            System.out.println("---------");
                            student2.display();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter Student Name:");
                    String name = sc.next();

                    System.out.println("Enter ID:");
                    int id = sc.nextInt();

                    System.out.println("Enter Age:");
                    int age = sc.nextInt();

                    System.out.println("Enter Course");
                    String course = sc.next();
                    if (count<student.length) {
                        Student s = new Student(name, id, age, course);
                    student[count] = s;
                    count++;
                    System.out.println("Student Added Successfully!");
                    
                    }else{
                        System.out.println("Student list full!");
                    }
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Student ID:");
                    searchId = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (student[i]!=null &&  searchId == student[i].id) {
                            found = true;
                            System.out.println("\nStudent found:");
                            student[i].display();
                            break;
                        }

                    }
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    boolean delete = false;
                    System.out.println("Enter ID to Delete:");
                    int deleteID = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (student[i] != null && deleteID == student[i].id) {
                            student[i] = null;
                            delete = true;
                            System.out.println("Student deleted successfully!");
                            break;
                        }
                    }
                    if (!delete) {
                        System.out.println("Id not found!");
                    }
                    break;
                case 5:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
