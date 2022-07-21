public class Main {

    public static void main(String[] args) {
//1
        int x1 = 34;
        int x2 = 5;
//2
        double y1 = 2.5;
        double y2 = 3.7;
//3
        String word1 = "Rossita";
        String word2 = "Aaronson";
//4
        boolean bTrue = true;
        boolean bFalse = false;
//5
        int[] intArr = {10,20,30,40,50,60,70,80,90};
//6
        String[] stringArr = {"Banana", "Orange", "Apple", "Lime"};
//7
        System.out.println(x1 + x2);
        System.out.println(x1 - x2);
        System.out.println(x1 * x2);
        System.out.println(x1 / x2);
//8
        System.out.println(word1 + " " +  word2);
//9
        System.out.println(word1.charAt(1));
//10
        System.out.println(intArr[1] + intArr[4]);

//11
        for (int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }

//12
        for (String fruit : stringArr ){
            System.out.println(fruit);
        }

//13
         if (word1.length() < word2.length()){
             System.out.println("firstname is shorter");
         }else if (word1.length() > word2.length()){
             System.out.println("firstname is longer");
         }else{
             System.out.println("they're equal");
         }



    }


}
