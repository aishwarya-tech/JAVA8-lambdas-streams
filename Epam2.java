import java.util.List;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.*;


public class Epam2 {
	public static List<String> search(List<String> list) {
        return list.stream()
		  .filter(s -> s.startsWith("a"))
		  .filter(s -> s.length() == 3)
		  .collect(Collectors.toList());
}
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa","abc","abcd","eee","sghaj");
		List<String> result = search(list1);
		System.out.println(result);
	}
}
