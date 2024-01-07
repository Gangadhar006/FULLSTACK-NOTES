package design_patterns.proxy_task;

public class DashboardComponent implements IComponent{
    @Override
    public void renders() {
        System.out.println("rendering...");
    }
}
