class Student {
	String Name;
	int Roll;
	int M1, M2, M3;
	Student()
	{
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
		System.out.println("Extends name = " + Name + "\nRoll " + Roll);
	}
}
interface Exam {
	public double percentage();
}
class Result extends Student implements Exam
{
	Result(String S, int R, int x, int y, int z)
	{
		super(S,R,x,y,z);
	}
	public double percentage()
	{
	double d;
	d = (M1 + M2 + M3) * 100 / 300;
	return d;
	}
	void displayResult() {
		super.display();
	}
}
class test
{
	public static void main(String args[])
	{
		Result r1=new Result("Sirsha",12,90,80,85);
		r1.displayResult();
		System.out.println("Avg is = "+r1.percentage());
		Scanner sc = new Scanner(System.in); 
		int intArr[] = new int[10]; 
		for(int i = 0; i < 10; i++) 
			intArr[i] = sc.nextInt(); 
		for(int i = 0; i < 10; i++) 
			System.out.println(intArr[i]);
	}
}	
