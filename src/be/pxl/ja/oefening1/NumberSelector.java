package be.pxl.ja.oefening1;

import java.util.function.Function;

public class NumberSelector {

	NumberMachine machine;

	public NumberSelector(NumberMachine numberMachine) {
		machine = numberMachine;
	}

	public String showEvenNumbers() {
		NumberFilter filter = new NumberFilter() {
			@Override
			public boolean check(int number) {
				return number % 2 == 0;
			}
		};
		return machine.processNumbers(filter);

	}

	public String printHexNumbers() {
		Function<Integer, String> filter = Integer::toHexString;
		return machine.convertNumbers(filter);
	}

	public String showNumbersAbove(int number) {
		NumberFilter filter = num2 -> number < num2;
		return machine.processNumbers(filter);
	}
}
