import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet hashSet = new HashSet();
        String word="";
        boolean isIsogram = true;

        System.out.println("Give Word:");
        word = scanner.nextLine();
        if(!word.equals("")){
            for(int i = 0; i<word.length(); i++){
                char currentLetter = word.charAt(i);
                if(hashSet.contains(currentLetter)){
                    isIsogram = false;
                    break;
                }else{
                    hashSet.add(currentLetter);
                }
            }
        }

        System.out.println(hashSet.toString());
        if(isIsogram)
            System.out.println(word + " is an Isogram");
        else
            System.out.println(word + " is not an Isogram");

    }
}
