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
                else if((currentDate.isAfter(anniversary.minusDays(30)) && currentDate.isBefore(anniversary.plusDays(30))) || currentDate.isEqual(anniversary)){
                        System.out.println(anniversary.minusDays(30) + " "+ currentDate);
                    }
                else
                    System.out.println(currentDate.isBefore(anniversary.plusDays(30))); // to-do fix this
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
