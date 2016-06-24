package pattern.creation.abstractfactory.factory;

import pattern.creation.abstractfactory.color.Color;
import pattern.creation.abstractfactory.shape.Circle;
import pattern.creation.abstractfactory.shape.Rectangle;
import pattern.creation.abstractfactory.shape.Shape;
import pattern.creation.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if (null == shape || "".equals(shape)) {
			return null;
		} else if ("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		}

		return null;
	}

}
