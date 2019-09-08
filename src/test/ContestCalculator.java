package test;

import java.util.ArrayList;

public class ContestCalculator {

	public Object calculateWinner(ArrayList<Double> wyateErpsNuggets, ArrayList<Double> butchCassidaysNuggets) {
		// TODO Auto-generated method stub
		Double wen = 0.0;
		Double bcn = 0.0;
		for (int i = 0; i < wyateErpsNuggets.size(); i++) {
			wen += wyateErpsNuggets.get(i);
		}
		for (int i = 0; i < butchCassidaysNuggets.size(); i++) {
			bcn += butchCassidaysNuggets.get(i);
		}
		if (wen>bcn) {
			return wyateErpsNuggets;
		}
		else {
			return butchCassidaysNuggets;
		}
	


	}

}
