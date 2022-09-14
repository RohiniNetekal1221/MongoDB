package assignment4java;
import java.util.LinkedList;
import java.util.List;
public class studentlist {
	public List<student>addStudents(){
		List<student> std= new LinkedList<student>();
		std.add(new student(110,"INNO", 99));
		std.add(new student(111,"GENGA", 16));
		std.add(new student(112,"ALLU", 58));
		std.add(new student(113,"ARJUN", 89));
		return std;
	
	}
}

