import org.junit.Test;

import org.junit.Assert;

public class JankenponTest {

    @Test
    public void testMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Rock", adversary = "Paper";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Paper", matchOutcome);
    }

    @Test
    public void testDraw(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Rock", adversary = "Rock";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Draw", matchOutcome);
    }

}