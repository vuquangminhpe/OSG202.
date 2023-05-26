

public class BT {
    public static void main(String[] args) {
        String s = "Dog bites man";
        String[] word = s.split(" ");
        String revesed = "";
        for (int i = word.length-1;i>=0;i--){
            revesed += word[i]+" ";
        }
        System.out.println(revesed.trim());
    }
}
