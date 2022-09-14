package assignment4java;
import java.util.List;
public class lambda {
	public List<student>marksSort(){
		List<student>std=new studentlist().addStudents();
				System.out.println("Sorts according to marks");
				std.sort((student s1, student s2)->s1.getMarks()-s2.getMarks());
				
				return std; 
			 }
			
			
			public List<student>nameSort(){
				System.out.println("Sorting according to name");
			List<student>std1=new studentlist().addStudents();
			 std1.sort((student n1, student n2)->n1.getStdName().compareTo(n2.getStdName()));
			return std1; 
		 }
			
		public static void main (String args[]) 
			{
				System.out.println(new lambda().marksSort());
				System.out.println(new lambda().nameSort());
			}
		}
