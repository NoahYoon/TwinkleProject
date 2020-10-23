import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] list = {"sun", "bed", "car"};
        String[] answer = solution(list,0);
        System.out.println(Arrays.toString(answer));
        String[] list2 = {"zaabce", "abf", "zcdx","ddd","oabv","aaaaaaaaaaaaavva","aaaaaaaaaaaaaaaa"};
        String[] answer2 = solution(list2,0);
        System.out.println(Arrays.toString(answer2));        

    }
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++){
            for(int j = i + 1; j < strings.length; j++){
               String leftStr = strings[i];
               String rightStr = strings[j];
                System.out.println(strings.length);
                System.out.println(leftStr.length());
                System.out.println(rightStr.length());
               for (int k = 1; k <= 50; k++){
                    if (leftStr.length() <= k){
                        break;
                    } else if(rightStr.length() <= k){
                        break;
                    } else {                  
                        if(leftStr.charAt(k) > rightStr.charAt(k)){
                            String saved = leftStr;
                            strings[i] = rightStr;
                            strings[j] = saved;
                            break;                     
                        }
                    }
                }
            }
        }
            
        for(int i = 0; i < strings.length; i++){
            for(int j = i + 1; j < strings.length; j++){
                if(strings[i]. charAt(n) > strings[j]. charAt(n)){
                    String saved = strings[i];
                    strings[i] = strings[j];
                    strings[j] = saved;
                }        
            }
            
            answer[i] = strings[i];
        }
    
        return answer;
    }
}

    // public static String[] solution(String[] strings, int n) {
    //     String[] answer = {};
    //     answer = new String[strings.length];
    //     for(int i = 0; i < strings.length; i++){
    //         for (int j = i+1; j < strings.length; j++){
    //             if(strings[i]. charAt(n) > strings[j]. charAt(n)){
    //                String saved = strings[i];
    //                strings[i] = strings[j];
    //                strings[j] = saved;
    //             } else if(strings[i]. charAt(n) == strings[j]. charAt(n)){
    //                 for (int k = 1; k <= 50; k++){
                        
    //                     if(strings[i]. charAt(k) > strings[j]. charAt(k)){
                          
    //                         String saved = strings[i];
    //                         strings[i] = strings[j];
    //                         strings[j] = saved;
    //                         break;
    //                     } else if (strings[i]. charAt(k) < strings[j]. charAt(k)){
                            
    //                         break;
    //                     } 
    //                 }  
    //             }
    //         }
            
    //         answer[i] = strings[i];
            
    //     }
        
        
        
    //     return answer;
    // }
//}