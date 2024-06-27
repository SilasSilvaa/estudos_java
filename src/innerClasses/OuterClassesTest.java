package innerClasses;

public class OuterClassesTest {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void  printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest outerClass = new OuterClassesTest();
//        OuterClassesTest.Inner inner = outerClass.new Inner();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
    }
}
