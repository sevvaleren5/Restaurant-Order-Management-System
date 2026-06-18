import java.util.ArrayList;

class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
        System.out.println(item.getName() + " siparişe eklendi.");
    }

    public void showOrder() {
        System.out.println("\n--- Sipariş Detayı ---");
        double total = 0;
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " TL");
            total += item.getPrice();
        }
        System.out.println("Toplam: " + total + " TL");
    }
}

