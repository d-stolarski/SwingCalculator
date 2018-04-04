import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Window extends JFrame {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() { public void run() {
             JFrame frame = new JFrame("Hello, Daniel!");
             frame.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
             frame.add(new JLabel("Hello, this is the beautiful World!"));
             frame.pack();
             frame.setVisible(true);
         } });
     }
}
