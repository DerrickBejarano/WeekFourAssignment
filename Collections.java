import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Lily");
			employeeNames.add("Bob");
			employeeNames.add("Janice");
			employeeNames.add("James");
			employeeNames.add("Harry");
			
		Set<Integer> ids = new HashSet<Integer>();
			ids.add(1150);
			ids.add(1151);
			ids.add(1152);
			ids.add(1153);
			ids.add(1154);
			
		Map<Integer , String> employeeMap = new HashMap<Integer , String>();
			
		int i = 0;
			for (Integer id : ids) {		
				
				employeeMap.put(id, employeeNames.get(i)); 
				i++;
			}
						
			for (Integer key : employeeMap.keySet()) {
				employeeMap.keySet();
				System.out.println(key + " " + employeeMap.get(key));    //I added a " " to put a space between the key and value
				i++;
			}
			
			StringBuilder idsBuilder = new StringBuilder();
				for (Integer id : ids) {
				idsBuilder.append(id + "-");
				}
				
				System.out.println(idsBuilder.toString());
				
			StringBuilder namesBuilder = new StringBuilder();
			for (String name : employeeNames) {
				namesBuilder.append(name + " ");
				}
				System.out.println(namesBuilder.toString());
	}

}
