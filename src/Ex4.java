public class Ex4 {
    public static void main(String[] arg) {
//        String text1 = "Xin chào các bạn";
        System.out.println(countWords("Xin chào các bạn"));
        System.out.println(countWords("Hello Words"));
    }
    public static int countWords(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' '){
                count ++;
            }
        }
        return count + 1;
    }


}
