package behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        OrderContext myOrder = new OrderContext();

        System.out.println("--- State Pattern Demo ---");
        myOrder.showStatus();
        myOrder.nextStep();
        myOrder.showStatus();
        myOrder.nextStep();
        myOrder.showStatus();
    }
}