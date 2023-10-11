import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Circle extends JPanel{

    private JPanel Cerchio;
    private JButton bottone;
    private int coordinataX;
    private int coordinataY;
    private int radius;

    //costruttore
    public Circle(){
        Cerchio = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                if (coordinataX != 0 && coordinataY != 0){

                    //colore randomico per i cerchi
                    Color colore = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                    g.setColor(colore);

                    //grafica del cerchio
                    g.drawOval(coordinataX - radius, coordinataY - radius, radius * 2, radius *2);
                    
                    
                }
            }
        };
        //creazione bottone
        bottone = new JButton("Clicca per disegnare");

        //azione che deve fare il bottone
        bottone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                //input dall'utente
                String inputX = JOptionPane.showInputDialog("Inserisci la coordinata X del cerchio");
                String inputY = JOptionPane.showInputDialog("Inserisci la coordinata Y del cerchio");

                try{

                    //convertiamo gli input in int
                    coordinataX = Integer.parseInt(inputX);
                    coordinataY = Integer.parseInt(inputY);

                    //input del raggio
                    String inputRadius = JOptionPane.showInputDialog("Inserisci il raggio del cerchio");

                    //conversione da string in int
                    radius = Integer.parseInt(inputRadius);

                    //ridisegna il cerchio
                    repaint();
                    
                } catch (NumberFormatException ex){

                    //se non inserisci i valori: ERR
                    JOptionPane.showMessageDialog(null, "Inserisci valori validi.");
                }

            }
        });

        setLayout(new BorderLayout());
        add(Cerchio, BorderLayout.CENTER);
        add(bottone, BorderLayout.SOUTH);

        
    }
    
}
