package Lambdas.shap;

public class ShapeDemo {


  public static void main(String[] args) {
    ShapeImplementation circleDraw = new ShapeImplementation();
    circleDraw.doIt(200, (x) -> save(x));
  }
   static void save(int x){
     System.out.println("Save the parameter");
  }

}

class ShapeImplementation {
  public void doIt(int x, ShapeDraw<Integer> shapeDraw){
    shapeDraw.draw(x);
  }
}
