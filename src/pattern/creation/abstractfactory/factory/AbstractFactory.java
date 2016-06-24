package pattern.creation.abstractfactory.factory;

import pattern.creation.abstractfactory.color.Color;
import pattern.creation.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
