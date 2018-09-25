package sk.itvkurze.webinar38._12_flyweight_pattern;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterSluzba sluzba = (TwitterSluzba)BezpecnostProxy.newInstance(new TwitterSluzbaStub());
		
		System.out.println(sluzba.getCasovaOs("test data"));
	}
}
