package socketprogramming;

public class StringCheck {
    public static void main(String[] args) {
        String str = new String("bye");
        if(str != "bye"){
            System.out.println("not equal");
        }
        else {
            System.out.println("equal");
        }

        if(str.equals("bye")){
            System.out.println("with equals : true");
        }
        else
        {
            System.out.println("with equals : false");
        }
    }
}
