package dio.example.design.pattern.project1.behavior;

public class AggressiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Stragety: AggressiveBehavior::move");
    }
}
