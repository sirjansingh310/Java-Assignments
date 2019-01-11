import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Assignment3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String url = br.readLine();
            String command = "ping -c 10 " + url;
            double time[] = new double[10];
            String commandOutput;
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(command);
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            System.out.println("pinging...");
            for(int i=0;i<11;i++){
                if(i==0)
                {
                    br.readLine();
                    continue;// avoid first line of output
                }
                commandOutput = br.readLine();
                commandOutput = commandOutput.substring(commandOutput.indexOf("time="),commandOutput.indexOf(" ms"));
                commandOutput = commandOutput.replace("time=","");
                time[i-1] = Double.parseDouble(commandOutput);
            //    System.out.println(time[i-1]);
            }
            Arrays.sort(time);
            System.out.println((time[4]+time[5])/2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
