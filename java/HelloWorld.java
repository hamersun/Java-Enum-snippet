
import static com.test.TEST.*;
import com.test.TEST;
import com.test.TEST.Group;

public class HelloWorld{

     //TEST a = TEST.FAILED;
     public static void main(String []args){
        System.out.println("Hello World: " + A3.value());
        System.out.println("enum: " + TEST.fromInt(108));
        System.out.println("Is Group.A: " + B3.isInGroup(Group.A));
        System.out.println("Is Group.B: " + C2.isInGroup(Group.B));
        System.out.println("Is Group.C: " + C5.isInGroup(Group.C));
     }
}

