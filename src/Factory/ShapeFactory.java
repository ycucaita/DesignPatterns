package Factory;

import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        return Objects.nonNull(getShapeType().containsKey(shapeType.toUpperCase())) ?
                getShapeType().get(shapeType.toUpperCase()).get() : null;
    }

    private Map<String, Supplier<Shape>> getShapeType() {
        Map<String, Supplier<Shape>> map = new HashMap<>();
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
        return map;
    }


    /*public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }*/

}
