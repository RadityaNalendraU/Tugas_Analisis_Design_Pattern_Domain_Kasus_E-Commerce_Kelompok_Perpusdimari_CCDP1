// src/behavioral/state/OrderState.java
package src.behavioral.state;

interface State {
    void next(Order context);
    void printStatus();
}

class Order {
    private State state = new PendingState();

    public void setState(State state) { this.state = state; }
    public void nextState() { state.next(this); }
    public void printStatus() { state.printStatus(); }
}

class PendingState implements State {
    public void next(Order context) { context.setState(new ShippedState()); }
    public void printStatus() { System.out.println("Status: Pesanan sedang diproses (Pending)."); }
}

class ShippedState implements State {
    public void next(Order context) { System.out.println("Pesanan sudah sampai tujuan."); }
    public void printStatus() { System.out.println("Status: Pesanan telah dikirim (Shipped)."); }
}

public class StateDemo {
    public static void main(String[] args) {
        Order pesanan = new Order();
        pesanan.printStatus();
        pesanan.nextState();
        pesanan.printStatus();
    }
}