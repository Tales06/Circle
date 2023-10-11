
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        //esecuzione App
         SwingUtilities.invokeLater(() -> {

            //titolo
            JFrame frsme = new JFrame("App Circonferenza");

            //crezione dell'interfaccia
            frsme.setSize(800, 400);

            //opzione per chiudere la finestra
            frsme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            
            frsme.add(new Circle());
            frsme.setVisible(true);

        });
    }
}