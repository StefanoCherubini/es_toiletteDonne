package progetto_cheru;

public class Main {
    public static void main(String[] args) {
        Bagno b1 = new Bagno();
        String[] nomi = {"Marco", "Francesco","Lorenzo", "Sara", "Paola", "Marta","Francesca"};
        char[] sessi = {'M', 'M', 'M', 'F', 'F', 'F', 'F'};

        for(int i=0; i<nomi.length; i++) {
            Thread1 t = new Thread1(b1, nomi[i], sessi[i]);
            t.start();
        }
    }
}