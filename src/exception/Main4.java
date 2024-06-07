package exception;

public class Main4 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }

        try{
            throw new ArrayIndexOutOfBoundsException();
//            throw new IllegalArgumentException();
//
        }catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
