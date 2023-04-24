package ass11.src.prob1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> map = new HashMap<>();
		for(Student s:students){
			map.put(new Key(s.getFirstName(),s.getLastName()),s);
		}
		//students.forEach(s->map.put(new Key(s.getFirstName(),s.getLastName()),s));
		return map;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){		Map<Key,Student> map = new HashMap<>();
		double totalGpa=0.0;
		for(Student student:maps.values()){
			totalGpa += student.getGpa();
		}
		return totalGpa/maps.size();
	}
}
