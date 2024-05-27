import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Užduotis:
            OOP CRUD
            Author:
            long id
            string name
            string surname
         */


        System.out.println("Hello world!");
        Student s = new Student();
        s.introduce();
        System.out.println(s);
        System.out.println(s.toString());

        ArrayList<Employee> ultimateWorkForce = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

//        while (true){
//            int input = sc.nextInt();
//            switch (input){
//                case 1:
//                    for (Employee e : ultimateWorkForce) {
//                        System.out.println(e);
//                    }
//                break;
//                case 2:
//                    Employee emp = new Employee();
//                    System.out.println("iveskite darboviete:");
//                    emp.setOccupation(sc.nextLine());
//                    System.out.println("iveskite algos dydi:");
//                    double salary = sc.nextDouble();
//                    sc.nextLine();
//                    emp.setSalary(salary);
//                    ultimateWorkForce.add(emp);
//                break;
//            }
//
//        }
        // Replace "C:\\" with the actual path you want to explore (adjust for OS)
        String rootPath = "C:\\Users\\dvdfi\\OneDrive\\Pictures"; // Modify this path based on your OS and access rights
        File rootDir = new File(rootPath);
        printFiles(rootDir);
    }

    public static void printFiles(File directory) {
        // Check if directory exists and is actually a directory
        if (directory.exists() && directory.isDirectory()) {
            // Get list of files and subdirectories
            File[] files = directory.listFiles();

            // Iterate through each file/subdirectory
            for (File file : files) {
                if (file.isFile()) {
                    // Print filename if it's a file
                    System.out.println(file.getAbsolutePath()); // Absolute path of the file
                } else if (file.isDirectory()) {
                    // Recursive call for subdirectories (explore deeper)
                    printFiles(file);
                }
            }
        }
    }
}