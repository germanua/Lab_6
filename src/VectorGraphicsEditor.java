public class VectorGraphicsEditor {
    public static void main(String[] args) {
        GraphicElement originalElement = new GraphicElement("Circle");
        originalElement.addAttribute("Color: Blue");

        // Deep cloning
        GraphicElement deepClone = originalElement.deepClone();
        deepClone.addAttribute("Thickness: 2px");

        // Surface cloning
        GraphicElement surfaceClone = originalElement.clone();
        surfaceClone.addAttribute("Style: Dotted");

        System.out.println("Original Element Type: " + originalElement.getType() + ", Attributes: " + originalElement.getAttributes());
        System.out.println("Deep Cloned Element Type: " + deepClone.getType() + ", Attributes: " + deepClone.getAttributes());
        System.out.println("Surface Cloned Element Type: " + surfaceClone.getType() + ", Attributes: " + surfaceClone.getAttributes());
    }
}
