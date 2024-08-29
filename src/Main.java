public class Main {
    public static void main(String[] args) {
        /*Odd Even Program! */

        int numbers[] = {1,3,4,5,5,6,7,8};

        for(Integer number:numbers){
            if(number%2 == 0){
                System.out.println(number+ " is Even!");
            }else {
                System.out.println(number +" is odd!");
            }
        }
    }
}