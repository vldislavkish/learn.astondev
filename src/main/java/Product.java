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
                + manufacturer + ", страна происхождения " + country
                + ", цена: " + price + ", состояние бронирования покупателем: " + buyersBookingStatus);
    }

}
