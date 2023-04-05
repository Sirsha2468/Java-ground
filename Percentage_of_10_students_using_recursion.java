import java.util.Scanner;

class Student {
    String Name;
    int Roll;
    int M1, M2, M3;
    
    Student() {
        Name = " ";
        Roll = M1 = M2 = M3 = 0;
    }
    
    Student(String S, int R, int x, int y, int z) {
        Name = S;
        Roll = R;
        M1 = x;
        M2 = y;
        M3 = z;
    }
    
    void display() {
        System.out.println("Name: " + Name + "\nRoll: " + Roll);
    }
}

interface Exam {
    public double percentage();
}

class Result extends Student implements Exam {
    Result(String S, int R, int x, int y, int z) {
        super(S, R, x, y, z);
    }
    
    public double percentage() {
        double d;
        d = (M1 + M2 + M3) * 100 / 300;
        return d;
    }
    
    void displayResult() {
        super.display();
        System.out.println("Average percentage: " + percentage() + "\n");
    }
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Result[] students = new Result[10];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Roll number: ");
            int roll = sc.nextInt();
            System.out.print("Marks in three subjects (separated by spaces): ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            
            students[i] = new Result(name, roll, m1, m2, m3);
            System.out.println();
        }
        
        System.out.println("Results:");
        for (int i = 0; i < students.length; i++) {
            students[i].displayResult();
        }
