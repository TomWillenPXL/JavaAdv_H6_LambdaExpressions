package be.pxl.ja.oefening1;

import java.util.ArrayList;
import java.util.function.Function;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}


	//TODO: uncomment this method after the NumberFilter interface is created.
	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}


	public String convertNumbers(Function<Integer, String> filter){
		String result = "";
		for (Integer number : numbers){
			String str = "";
			if (!result.equals("")){
				result += "-";
			}

			str = filter.apply(number);
			result += str;
		}

		return result;
	}

}
