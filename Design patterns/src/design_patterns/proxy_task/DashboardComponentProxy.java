package design_patterns.proxy_task;

public class DashboardComponentProxy implements IComponent {
    private boolean isSigned;

    public DashboardComponentProxy(String email, String pass) {
        if (email.equals("email.com") && pass.equals("pass"))
            isSigned = true;
    }

    @Override
    public void renders() {
        if (isSigned) {
            DashboardComponent component = new DashboardComponent();
            component.renders();
        } else
            System.out.println("enter valid details");
    }
}
