package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program3 {

	public static void main(String[] args) {

		AbstractShape s1 = new Rectangle(Color.BLACK, 3.0, 4.0);
		AbstractShape s2 = new Circle(Color.BLUE, 2.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
				
	}

}
