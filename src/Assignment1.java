import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {
    public static void findFiles(String regex,File file){
        // searching only for the directory provided, we can extend this to search for files in sub-directories by
        // calling this function recursively.
        File files[] = file.listFiles();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        int count = 0;
        for(File f : files){
            matcher = pattern.matcher(f.getName());
            if(matcher.find()) {
                count++;
                System.out.println(f.getAbsolutePath());
            }
        }
        System.out.println(count + " files found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regex ");
        String regex = sc.nextLine();
        String choice;
        boolean continueSearch = true;
        File file = new File(System.getProperty("user.home")); // create file instance for user's home directory
        do{
            findFiles(regex,file);
            System.out.println("do you want to enter another regex [yes/no]");
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter regex");
                regex = sc.nextLine();
            }
            else
                continueSearch = false;
        }while(continueSearch);

    }
}
