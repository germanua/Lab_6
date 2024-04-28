import java.util.ArrayList;
import java.util.List;

public class GraphicElement implements GraphicPrototype {
    private String type;
    private List<String> attributes;

    // Constructor
    public GraphicElement(String type) {
        this.type = type;
        this.attributes = new ArrayList<>();
    }

    // Method to add an attribute
    public void addAttribute(String attribute) {
        attributes.add(attribute);
    }

    // Method to get a copy of attributes
    public List<String> getAttributes() {
        return new ArrayList<>(attributes);
    }

    // Deep cloning method
    public GraphicElement deepClone() {
        GraphicElement clone = new GraphicElement(this.type);
        clone.attributes = new ArrayList<>(this.attributes); // Deep copy of attributes
        return clone;
    }

    // Shallow cloning method
    @Override
    public GraphicElement clone() {
        try {
            return (GraphicElement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
