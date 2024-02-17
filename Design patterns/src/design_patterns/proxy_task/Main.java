package design_patterns.proxy_task;

public class Main {
    public static void main(String[] args) {
        IComponent component=new DashboardComponentProxy("email.com","pass");
        component.renders();
    }
}
