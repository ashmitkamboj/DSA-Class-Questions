import java.util.*;

public class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();

    String ans=generate(str);
    if(ans.isEmpty()){
        System.out.println( "NO SOLUTION");
    }else{
        System.out.println(ans);
    }
    }
    private static String generate(String str) {
        int n=str.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int oddcount=0;
        char oddchar=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()%2!=0){
                oddcount++;
                oddchar=entry.getKey();
            }
        }
        if(oddcount>1) return "";
        StringBuilder half=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char ch=entry.getKey();
            int value=entry.getValue()/2;
            for(int i=0;i<value;i++){
                half.append(ch);
            }

 
        }
        String firsthalf=half.toString();
        String secondhalf=half.reverse().toString();
        if(oddcount==1){
            return firsthalf+oddchar+secondhalf;
        }else{
            return firsthalf+secondhalf;
        }

    }    
}