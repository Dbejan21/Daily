package Project4;

public class Task7 {

    /*
    Using a scanner enter a sentence that is not separated by space and each word
starts with upper case. Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava"
Output: I Want To Learn Java
Example-2:
Given Value: "ItIsSunnyOutside"
Output: It Is Sunny Outside
     */
    public static void main(String[] args) {
        String sentence = "IWantToLearnJava";
        String newString="";
        int start=0,end=0;
        for(int i=0;i<sentence.length();i++){
            if (end>=sentence.length())
                return;
            while(sentence.charAt(end+1)>=97){
                if (end+1==sentence.length()-1){
                    newString=newString+sentence.substring(start,end+2)+" ";
                    System.out.println(newString);
                    return;
                }
                end++;
            }
            newString=newString+sentence.substring(start,end+1)+" ";
            start=end+1;
            end=start+1;
        }
    }
}
