package full3exercici4;

public class Full3exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TaulerJoc a = new TaulerJoc(300,200);
        Ball b = new Ball(50,50, 10, "GREEN");

        a.addBall(b);
        b.setXSpeed(3);

        while(true)
        {
            a.pause();
            b.bounce(300,200);
        }
    }
    
}
