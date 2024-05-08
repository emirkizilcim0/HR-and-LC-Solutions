import java.util.*;

public class HelpfulMath{
	public static String fixer(String input){
		List<Integer> numbers = new ArrayList<>();

		for(char number : input.toCharArray()){
			if(number != '+'){
				numbers.add(Integer.parseInt(String.valueOf(number)));
			}
		}
		
		Collections.sort(numbers);

		String res = "";

		for(int i = 0; i < numbers.size(); i++){
			if(i == numbers.size() - 1){
				res += String.valueOf(numbers.get(i));
				break;	
			}
			res += String.valueOf(numbers.get(i)) + "+";
		}

		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.println(fixer(input));

		sc.close();
	}
}
