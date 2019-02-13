import java.util.ArrayList;
import java.util.Random;

/**
 * @author loodeer
 * @date 2019-02-14 00:58
 */
public class Client {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(3) + 1, "我要出去逛街"));
        }

        Handler father = new Father1();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }

    }
}
