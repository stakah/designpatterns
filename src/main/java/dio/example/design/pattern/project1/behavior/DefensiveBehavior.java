package dio.example.design.pattern.project1.behavior;

public class DefensiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Strategy: DefensiveBehavior::move");
    }
}
