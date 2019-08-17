import com.study.singleton.Singleton01;
import com.study.singleton.Singleton02;
import com.study.singleton.Singleton03;
import com.study.singleton.Singleton04;
import com.study.singleton.Singleton05;
import com.study.singleton.Singleton06;
import com.study.singleton.Singleton07;
import org.junit.Test;

/**
 * 单例测试
 *
 * @author song_wei
 * @date 2019-04-08
 */
public class SingletonTest {

    private static final Integer SIZE = 10;

    @Test
    public void singleton01() {
        test(Singleton01.getInstance().hashCode());
    }

    @Test
    public void singleton02() {
        test(Singleton02.getInstance().hashCode());
    }

    @Test
    public void singleton03() {
        test(Singleton03.getInstance().hashCode());
    }

    @Test
    public void singleton04() {
        test(Singleton04.getInstance().hashCode());
    }

    @Test
    public void singleton05() {
        test(Singleton05.getInstance().hashCode());
    }

    @Test
    public void singleton06() {
        test(Singleton06.getInstance().hashCode());
    }

    @Test
    public void singleton07() {
        test(Singleton07.INSTANCE.hashCode());
    }

    private void test(int hashCode) {
        for (int i = 0; i < SIZE; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName()
                    + ": " + hashCode), "线程 - " + i).start();
        }
    }

}
