import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class SwingMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 518, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 251, 39, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBounds(59, 251, 39, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(108, 251, 39, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(10, 289, 39, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(59, 289, 39, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(108, 289, 39, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(10, 323, 39, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(59, 323, 39, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(108, 323, 39, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.setBounds(157, 251, 39, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.setBounds(157, 217, 39, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(157, 289, 39, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.setBounds(157, 323, 39, 23);
		contentPane.add(button_11);
	}
}
