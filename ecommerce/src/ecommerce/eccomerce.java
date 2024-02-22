package ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eccomerce {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eccomerce window = new eccomerce();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public eccomerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 627);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 38));
		lblNewLabel.setBounds(333, 37, 182, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\sadwi\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-21 120243.png"));
		lblNewLabel_1.setBounds(62, 107, 207, 288);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\sadwi\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-02-21 120255.png"));
		lblNewLabel_2.setBounds(484, 109, 207, 286);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\sadwi\\Downloads\\download (2).png"));
		lblNewLabel_3.setBounds(343, 39, 237, 100);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1200/-");
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblNewLabel_4.setBounds(131, 418, 85, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("1000/-");
		lblNewLabel_5.setFont(new Font("Viner Hand ITC", Font.BOLD, 23));
		lblNewLabel_5.setBounds(560, 404, 85, 48);
		frame.getContentPane().add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(677, 11, 182, 38);
		frame.getContentPane().add(panel);
		
		JLabel lb = new JLabel("CART : 0");
		panel.add(lb);
		lb.setFont(new Font("Times New Roman", Font.BOLD, 25));
		JLabel lb1 = new JLabel("Bill:0");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1.setBounds(716, 60, 124, 27);
		frame.getContentPane().add(lb1);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				bill=bill+1200;
				lb1.setText("bill :"+bill);
			}
		});
		btnNewButton.setBounds(104, 456, 124, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				bill=bill+1000;
				lb1.setText("bill :"+bill);
				
			}
		});
		btnNewButton_1.setBounds(535, 452, 118, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
