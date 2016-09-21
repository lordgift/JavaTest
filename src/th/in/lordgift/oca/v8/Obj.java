package th.in.lordgift.oca.v8;

/**
 * Created by Gift on 17-Jul-16.
 */
public class Obj {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Main.finalize");
    }
}
