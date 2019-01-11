import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char chars[] = sc.nextLine().toLowerCase().replace(" ","").toCharArray();
        int freq[] = new int[26];
        for(char c : chars){
            freq[c - 'a']++;
        }
        boolean allAlpabets = true;
        for(int i : freq){
            if(i>0)
                continue;
            allAlpabets = false;
        }
        System.out.println(allAlpabets);

    }
}
