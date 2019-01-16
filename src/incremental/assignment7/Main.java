package incremental.assignment7;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFilePath = "/home/zadmin/Desktop/text.txt";
            File inputFile = new File(inputFilePath);
            String outputFilePath = inputFile.getAbsolutePath().replace(inputFile.getName(), "char-count-" + inputFile.getName());
            Scanner sc = new Scanner(new FileInputStream(inputFile));
            Map<Character,Integer> charCount = new HashMap<>();
            charCount.put('\n',0);
            while(sc.hasNext()){
                String line = sc.nextLine();
                for(int i=0;i<line.length();i++){
                    if(charCount.containsKey(line.charAt(i)))
                        charCount.put(line.charAt(i),charCount.get(line.charAt(i))+1);
                    else
                        charCount.put(line.charAt(i),1);
                    if(i == line.length()-1)
                        charCount.put('\n',charCount.get('\n')+1);
                }
            }
            File outputFile =  new File(outputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            Iterator iterator = charCount.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry pair = (Map.Entry)iterator.next();
                String s;
                if((char)pair.getKey() == ' ')
                {
                    s = "\\s" + " = " + pair.getValue() + "\n";

                }
                else if((char)pair.getKey() == '\n'){
                    s = "\\n" + " = " + pair.getValue() + "\n";
                }
                else {
                     s = pair.getKey() + " = " + pair.getValue() + "\n";
                }
                byte[] strToBytes = s.getBytes();
                fileOutputStream.write(strToBytes);
            }
            System.out.println("File written successfully");

        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("IOException");
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
