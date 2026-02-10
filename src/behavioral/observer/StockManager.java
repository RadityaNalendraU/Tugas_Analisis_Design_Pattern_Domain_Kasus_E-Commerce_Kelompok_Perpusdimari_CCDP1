package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class StockManager {
    // Sesuai diagram: -List observers
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setStockStatus(String status) {
        System.out.println("\n[StockManager] Perubahan status: " + status);
        notifyAllObservers(status);
    }

    // Sesuai diagram: -void notifyAllObservers
    private void notifyAllObservers(String status) {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}