import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // to consume the new line created by hitting enter. This is a problem with nextInt() method.
        for(int i=0 ; i<testCases ;i++) {

            String input[] = scanner.nextLine().split(" ");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate signUpDate = LocalDate.parse(input[0],dateTimeFormatter);
            LocalDate currentDate = LocalDate.parse(input[1],dateTimeFormatter);
            LocalDate firstAnniversaryDate = signUpDate.withYear(signUpDate.getYear() + 1);

            if(currentDate.isBefore(firstAnniversaryDate.minusDays(30))){
                System.out.println("No Range"); // if 1 year(minus 30 days) has not elapsed or if currentdate is before signupdate.
                continue;
            }
            else {
                LocalDate currentYearAnniversary = signUpDate.withYear(currentDate.getYear());
                if (currentDate.isBefore(currentYearAnniversary.plusDays(30)) && currentDate.isAfter(currentYearAnniversary.minusDays(30))) {
                    // if current date falls in the range
                    System.out.println(currentYearAnniversary.minusDays(30).format(dateTimeFormatter) + " " + currentDate.format(dateTimeFormatter));
                }
                else{
                    // backdate
                    if(currentDate.isBefore(currentYearAnniversary.minusDays(30))){
                        // if current date is before window start date, backdate to previous year's range
                        LocalDate previousYearAnniversary = currentYearAnniversary.withYear(currentYearAnniversary.getYear() -1 );
                        System.out.println(previousYearAnniversary.minusDays(30).format(dateTimeFormatter) + " " + previousYearAnniversary.plusDays(30).format(dateTimeFormatter));
                    }
                    else
                    {
                        // if current date is after end date of window, backdate to current years's range
                        System.out.println(currentYearAnniversary.minusDays(30).format(dateTimeFormatter) + " " + currentYearAnniversary.plusDays(30).format(dateTimeFormatter));
                    }

                }
            }


        }
    }
}
