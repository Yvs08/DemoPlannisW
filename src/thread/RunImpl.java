package thread;

public class RunImpl implements Runnable {

    private CompteEnBanque cb;
    private String name;

    public RunImpl(CompteEnBanque cb) {
        this.cb = cb;
    }

    RunImpl(CompteEnBanque cb, String name) {
        this.cb = cb;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 25; i++) {
            if (cb.getSolde() > 0) {
                cb.retraitArgent(2);
                System.out.println("Retrait effectué par "+  this.name);
            }
        }
    }
}
