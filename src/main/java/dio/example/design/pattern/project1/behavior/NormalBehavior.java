package dio.example.design.pattern.project1.behavior;

public class NormalBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Strategy: NormalBehavior::move");
    }
}
