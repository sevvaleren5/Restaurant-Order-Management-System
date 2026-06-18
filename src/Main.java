public class Main {
    public static void main(String[] args) {
        // Menü öğeleri
        MenuItem pizza = new MenuItem("Pizza", 80);
        MenuItem burger = new MenuItem("Burger", 50);
        MenuItem cola = new MenuItem("Kola", 15);
        MenuItem chocolate = new MenuItem("Chocolate", 10);
        MenuItem salad = new MenuItem("Salad", 10);
        MenuItem veggie = new MenuItem("Fries", 10);

        // Sipariş oluşturma
        Order order1 = new Order();
        order1.addItem(pizza);
        order1.addItem(cola);
        order1.showOrder();

        // İkinci sipariş
        Order order2 = new Order();
        order2.addItem(burger);
        order2.addItem(cola);
        order2.addItem(cola);
        order2.showOrder();

        Order order3 = new Order();
        order3.addItem(pizza);
        order3.addItem(cola);
        order3.addItem(salad);
        order3.addItem(veggie);
        order3.showOrder();
    }
}

