package src;


// 3
public class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("\nПарк: " + parkName + "\nАттракцион: " + name +
                    "\nВремя работы: " + workingHours + "\nСтоимость: " + cost + " руб.");
        }
    }
}