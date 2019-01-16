package incremental.assignment7;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            String inputFilePath = args[0]; // get file name from command line args
            File inputFile = new File(inputFilePath);
            String outputFilePath = inputFile.getAbsolutePath().replace(inputFile.getName(), "char-count-" + inputFile.getName());
            Scanner sc = new Scanner(new FileInputStream(inputFile));
            Map<Character,Integer> charCount = new HashMap<>(); // hashmap to store character counts
            charCount.put('\n',0);
            while(sc.hasNext()){ // if scanner has more tokens
                String line = sc.nextLine();
                for(int i=0;i<line.length();i++){
                    if(charCount.containsKey(line.charAt(i)))
                        charCount.put(line.charAt(i),charCount.get(line.charAt(i))+1);
                    else
                        charCount.put(line.charAt(i),1);
                    if(i == line.length()-1)
                        charCount.put('\n',charCount.get('\n')+1); // for new line character
                }
            }

            File outputFile =  new File(outputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            Iterator iterator = charCount.entrySet().iterator();
            while(iterator.hasNext()){  // iterate through the hashmap
                Map.Entry pair = (Map.Entry)iterator.next();
                String s;
                if((char)pair.getKey() == ' ') // check for space . pair.getKey() returns an object, casted to character
                {
                    s = "\\s" + " = " + pair.getValue() + "\n"; // write in format /s = count

                }
                else if((char)pair.getKey() == '\n'){
                    s = "\\n" + " = " + pair.getValue() + "\n"; // write in format /n = count
                }
                else {
                     s = pair.getKey() + " = " + pair.getValue() + "\n";
                }

                byte[] strToBytes = s.getBytes();
                fileOutputStream.write(strToBytes); // write function accepts byte array. Convert string to byte array
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
