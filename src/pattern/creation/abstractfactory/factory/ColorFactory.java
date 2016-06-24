package pattern.creation.abstractfactory.factory;

import pattern.creation.abstractfactory.color.Blue;
import pattern.creation.abstractfactory.color.Color;
import pattern.creation.abstractfactory.color.Green;
import pattern.creation.abstractfactory.color.Red;
import pattern.creation.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if (null == color) {
			return null;
		}
		
		if ("RED".equals(color)) {
			return new Red();
		} else if ("GREEN".equals(color)) {
			return new Green();
		} else if ("BLUE".equals(color)) {
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
