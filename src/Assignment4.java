import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0) {
                String input[] = br.readLine().split(" ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate signUpDate = LocalDate.parse(input[0],formatter);
                LocalDate currentDate = LocalDate.parse(input[1],formatter);
                LocalDate anniversary  = signUpDate.withYear(currentDate.getYear());
                if(currentDate.isBefore(signUpDate))
                    System.out.println("No range");
                else{
                    LocalDate startDate = anniversary.minusDays(30);
                    LocalDate endDate = anniversary.plusDays(30);
                    if(currentDate.isAfter(startDate) && currentDate.isBefore(endDate))
                        System.out.println(startDate.format(formatter) + " " + currentDate.format(formatter));
                    else
                        System.out.println(startDate.format(formatter) +" " + endDate.format(formatter));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
