public class Product {
    private String name;
    private String date;
    private String manufacturer;
    private String country;
    private int price;
    private boolean buyersBookingStatus;

    public Product (String name, String date, String manufacturer,
                    String country, int price, boolean buyersBookingStatus) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.buyersBookingStatus = buyersBookingStatus;
    }

    public void productInfoConsole() {
        System.out.println("Название: " + name + ", дата производства: " + date + ", производитель: "
                + manufacturer + ", страна происхождения: " + country
                + ", цена: " + price + ", состояние бронирования покупателем: " + buyersBookingStatus);
    }

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Sony WH-1000XM5", "10.05.2023",
                "Sony Corp.", "Japan", 1299, true);
        productsArray[2] = new Product("iPhone 16 Pro", "15.09.2024",
                "Apple Inc.", "USA", 4999, false);
        productsArray[3] = new Product("PlayStation 5 Pro", "07.11.2024",
                "Sony Interactive.", "Japan", 3199, false);
        productsArray[4] = new Product("Dyson V15 Detect", "20.01.2025",
                "Dyson Ltd.", "UK", 2850, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].productInfoConsole();
        }

    }
}
