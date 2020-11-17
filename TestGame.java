import org.junit.Assert;
import org.junit.Test;

public class TestGame {
    @Test
    public void testingMas() {
        int[] num = new int[2];
        if (num == null) {
            System.out.println("wrong");
        }
    }

    @Test
    public void testingCondition() {
        Main main = new Main();
        boolean tryToWin = true;
        Assert.assertTrue(true);
    }

    @Test
    public void testingArrayResult() {
        int bull=0;
        int cows=0;
        int[] all = new int[2];
        all[0] = bull;
        all[1] = cows;
        if(all[0]==2){
            System.out.println("ok");
        }
    }
}
