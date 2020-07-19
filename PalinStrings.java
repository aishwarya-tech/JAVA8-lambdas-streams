import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PalinStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("madam","aaa","abc","wow","abcd");
		
		List palindromes = PalinStrings.filterList(list, StringPredicates::isPalindrome);
		System.out.println(palindromes);
	}
	
	public static List filterList(List<String> list, Predicate predicate)
	{
		List<String> finalList = new ArrayList<String>();
		
		for(String s : list)
		{
			if(predicate.test(s)){
				finalList.add(s);
			}
		}
		return finalList;
	}

}
