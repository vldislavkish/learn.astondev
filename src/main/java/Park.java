public class Park {

    public class Attraction {
        private String name;
        private String operatingHours;
        private int price;

        public Attraction (String name, String operatingHours, int price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Park.Attraction attraction = new Park().new Attraction("Колесо обозрения",
                "10:00 - 22:00", 500);

    }
}
