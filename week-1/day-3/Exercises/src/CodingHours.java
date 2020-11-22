public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int daily = 6;
        // The semester is 17 weeks long
        int weeks = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int weekly = daily*5;
        System.out.println(weekly*weeks);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println(weekly*100/52 + "%");

    }
}
