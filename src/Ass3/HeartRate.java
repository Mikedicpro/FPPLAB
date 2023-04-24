package Ass3;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class HeartRates {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private static final int RESTING_HEART_RATE = 70;
        private static final double LOWER_BOUNDARY = 0.5;
        private static final double UPPER_BOUNDARY = 0.85;

        public HeartRates(String firstName, String lastName, LocalDate birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public int calculateAge() {
            LocalDate today = LocalDate.now();
            return Period.between(birthDate, today).getYears();
        }

        public int calculateMaximumHeartRate() {
            int age = calculateAge();
            return 220 - age;
        }

        public void printTargetHeartRateRange() {
            int maximumHeartRate = calculateMaximumHeartRate();
            int averageHeartRate = maximumHeartRate - RESTING_HEART_RATE;
            int lowerBoundaryTargetHeartRate = (int) (averageHeartRate * LOWER_BOUNDARY) + RESTING_HEART_RATE;
            int upperBoundaryTargetHeartRate = (int) (averageHeartRate * UPPER_BOUNDARY) + RESTING_HEART_RATE;
            System.out.println("Target Heart Rate Range: " + lowerBoundaryTargetHeartRate + " - " + upperBoundaryTargetHeartRate + " bpm");
        }

        @Override
        public String toString() {
            return "Name: " + firstName + " " + lastName + "\n" +
                    "Date of Birth: " + birthDate.toString() + "\n" +
                    "Age: " + calculateAge() + " years\n" +
                    "Maximum Heart Rate: " + calculateMaximumHeartRate() + " bpm";
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter your birth year: ");
            int year = scanner.nextInt();
            System.out.print("Enter your birth month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter your birth day (1-31): ");
            int day = scanner.nextInt();
            HeartRates heartRates = new HeartRates(firstName, lastName, LocalDate.of(year, month, day));
            System.out.println(heartRates.toString());
            heartRates.printTargetHeartRateRange();
        }
    }

