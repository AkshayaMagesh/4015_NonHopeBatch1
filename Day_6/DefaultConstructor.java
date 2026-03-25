package Day_6;

public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("I am inside default constructor");
    }
    DefaultConstructor(int x) {
        this.x = x;
        System.out.println("this is the input "+x);
    }
    int x = 90;
    public static void main(String[] args) {
        System.out.println("See your default constructor class file is aitomatically created while compilation");
        DefaultConstructor obj = new DefaultConstructor();
        DefaultConstructor inp = new DefaultConstructor(20);
        System.out.println(obj.x);

    }
}
