package pattern.creation.factory;

public class ShapeFactory {

	public static Shape getShape(String type) {
		if (null == type || "".equals(type)) {
			return null;
		} else if ("CIRCLE".equalsIgnoreCase(type)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(type)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(type)) {
			return new Square();
		}

		return null;
	}
}
