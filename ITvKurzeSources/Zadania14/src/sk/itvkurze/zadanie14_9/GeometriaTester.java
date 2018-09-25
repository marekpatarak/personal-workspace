package sk.itvkurze.zadanie14_9;

import java.awt.geom.Point2D;

public class GeometriaTester {

	public static void main(String[] args) {


		Elipsa elipsa = new Elipsa(0, 0, 300, 200);
		Point2D bod = new Point2D.Double(300, 200);
		System.out.println("Bod je vo vnutri? " + elipsa.jeVoVnutri(bod));
		System.out.println("Bod je na obvode? " + elipsa.jeNaObvode(bod));
	}

}
