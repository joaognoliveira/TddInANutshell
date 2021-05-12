import org.junit.Test;

import org.junit.Assert;

public class JankenponTest {

    @Test
    public void testRockPaperMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Rock", adversary = "Paper";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Paper", matchOutcome);
    }

    @Test
    public void testRockRockMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Rock", adversary = "Rock";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Draw", matchOutcome);
    }

    @Test
    public void testRockScissorsMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Rock", adversary = "Scissors";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Rock", matchOutcome);
    }

    @Test
    public void testPaperPaperMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Paper", adversary = "Paper";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Draw", matchOutcome);
    }

    @Test
    public void testScissorsPaperMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Scissors", adversary = "Paper";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Scissors", matchOutcome);
    }

    @Test
    public void testScissorsScissorsMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Scissors", adversary = "Scissors";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Draw", matchOutcome);
    }

    @Test
    public void testPaperRockMatch(){
        Jankenpon jankenpon = new Jankenpon();

        String player = "Paper", adversary = "Rock";
        String matchOutcome = jankenpon.match(player, adversary);
        Assert.assertEquals("Paper", matchOutcome);
    }

}