package Base.Objects.Abstracts;

import Base.Objects.Enums.ObjectType;
import Base.Objects.util.Coordinate;

import javax.swing.*;

public abstract class AbstractFigur {
    private Coordinate coordinate;
    private ImageIcon image;
    private ObjectType objectType;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }
}
