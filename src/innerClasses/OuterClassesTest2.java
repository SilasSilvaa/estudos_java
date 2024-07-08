package innerClasses;

public class OuterClassesTest2 {
    private String name = "name 1";

    void print(final String param){
        final String lastName =  "Lastname";

        class LocalClass{

            public void printLocal(){
            System.out.println(param);
//            param = " ";
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest2 outerClassesTest2 = new OuterClassesTest2();
        outerClassesTest2.print("Param");
    }
}
