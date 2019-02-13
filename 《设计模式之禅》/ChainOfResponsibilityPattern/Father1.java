/**
 * @author loodeer
 * @date 2019-02-14 00:47
 */
public class Father1 extends Handler{
    public Father1() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override protected void response(IWomen women) {
        System.out.println("---女儿向父亲请示---");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
