package incremental.assignment2.taskA;


import java.util.ArrayList;

public class VampireNumbers {
    public static String swap(String s,int i, int j){
        char ch[] = s.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
    public static void findAllPermutations(String s,int start, int end, ArrayList<String> allPermutations){
         if(start == end)
             allPermutations.add(s);
         else{
             for(int i=start;i<=end;i++){
                 s = swap(s,start,i);
                 findAllPermutations(s,start+1,end,allPermutations);
             }
         }
    }
    public static boolean isVampire(int n){
        String num =  Integer.toString(n);
        if(num.length()%2 == 1)
            return false;
        ArrayList<String> allPermutations = new ArrayList<>();
        findAllPermutations(num,0,num.length()-1,allPermutations);
        for(String s : allPermutations){
            String firstHalf = s.substring(0,num.length()/2);
            String secondHalf = s.substring(num.length()/2,num.length());
            if(firstHalf.charAt(0) != '0' && secondHalf.charAt(0) != '0'){
                int x = Integer.parseInt(firstHalf);
                int y = Integer.parseInt(secondHalf);
                if (x * y == n)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Program to print first 100 vampire numbers.
        int i = 1;
        int count = 0;
        System.out.println("The first 100 vampire numbers are:");
        while(true) {
            if(isVampire(i)) {
                System.out.println(i);
                count++;
            }
            i++;
            if(count == 100)
                break;
        }
    }
}
