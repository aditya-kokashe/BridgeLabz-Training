//Write a program to demonstrate NullPointerException. 

public class NullPointer{
    //Generate NullPointerException
    public static void generateException(){
        String text = null;
        System.out.println(text.length());
    }
    //Handle NullPointerException using try-catch
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }


    public static void main(String[] args){
        System.out.println("Generating NullPointerException:");
		
		
        try{
            generateException();
        }catch(NullPointerException e){
            System.out.println("Exception occurred in generateException() method.");
        }
        System.out.println("Handling NullPointerException:");
        handleException();
    }
}