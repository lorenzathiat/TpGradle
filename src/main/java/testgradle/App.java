package testgradle;

import org.apache.commons.math3.distribution.NormalDistribution;


public class App {
	
	double covidChanceEnMoyenne(NormalDistribution n, int m) {

		return n.cumulativeProbability(m);

	}

	double covidChanceDurree(NormalDistribution n , int a, int b) {

		return n.probability(a, b);

	}

	public static void main(String[] args) {

		App app = new App();

		NormalDistribution normalDistribution = new NormalDistribution(15, 7);

		System.out.println("Covid 7 jours : "+app.covidChanceEnMoyenne(normalDistribution, 15));

		System.out.println("Covid entre 8 et 22 jours : "+app.covidChanceDurree(normalDistribution, 8, 22));

		System.out.println("Covid entre 1 et 29 jours : "+app.covidChanceDurree(normalDistribution, 1, 29));

		System.out.println("Covid entre 0 et 36 jours : "+app.covidChanceDurree(normalDistribution, -6, 29));

		System.out.println("Covid 0 jours : "+app.covidChanceEnMoyenne(normalDistribution, 0));

		//System.out.println("Covid 7 jours : "+normalDistribution.cumulativeProbability(15));

		//System.out.println("Covid entre 8 et 22 jours : "+normalDistribution.probability(8, 22));

	}

}
