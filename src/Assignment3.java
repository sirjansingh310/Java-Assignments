import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String url = "";
        try{
            System.out.println("Enter a url");
            url = br.readLine();
            int pingCount;
            System.out.println("Enter ping count");
            pingCount = Integer.parseInt(br.readLine());
            String command = "ping -c  " + pingCount + " " + url; // using ping utility.
            double time[] = new double[pingCount];
            String commandOutput;
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(command); // execute the command
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            System.out.println("pinging...");
            for(int i=0;i<pingCount+1;i++){
                if(i==0)
                {
                    br.readLine();
                    continue;// avoid first line of output
                }
                commandOutput = br.readLine();
                commandOutput = commandOutput.substring(commandOutput.indexOf("time="),commandOutput.indexOf(" ms"));
                commandOutput = commandOutput.replace("time=","");
                time[i-1] = Double.parseDouble(commandOutput);
             ///   System.out.println(time[i-1]);
            }
            Arrays.sort(time);
            double median;
            if(pingCount%2 == 0){
                median = (time[(pingCount/2)-1] + time[(pingCount/2)])/2;
            }
            else
                median = time[pingCount/2 + 1];
            System.out.println("Median : "+ median + " ms");

        }

        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("There was an error pinging "+ url + " Please check if the url is valid and try again");
        }
    }
}
