//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.function.IntPredicate;


public class AvgExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		double avgnumbers = AvgExample.filterlist(numbers);
		System.out.println(avgnumbers);
		
	}
	
	public static double filterlist(List<Integer> list)
	{
		//List<Object> finalList = new ArrayList<Object>();
		
		Integer sum = 0;
		  if(!list.isEmpty()) {
		    for (Integer mark : list) {
		        sum += mark;
		    }
		    return sum.doubleValue() / list.size();
		  }
		  return sum;
		
		
	}

}
