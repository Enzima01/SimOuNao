package application;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;

public class Program {

	private JFrame frmSimno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program window = new Program();
					window.frmSimno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimno = new JFrame();
		frmSimno.setIconImage(Toolkit.getDefaultToolkit().getImage(Program.class.getResource("/imgs/simnao.png")));
		frmSimno.setResizable(false);
		frmSimno.setTitle("Sim ou Não | Enzima01");
		frmSimno.setBounds(100, 100, 295, 222);
		frmSimno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimno.getContentPane().setLayout(null);
		frmSimno.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("?");

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 32));
		lblNewLabel.setBounds(108, 60, 61, 46);
		frmSimno.getContentPane().add(lblNewLabel);

		List<String> list = new ArrayList<>();
		list.add("Sim");
		list.add("Não");
		Random random = new Random();

		JButton btnNewButton = new JButton("Sim ou Não");
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int randomItem = random.nextInt(list.size());
				String randomElement = list.get(randomItem);

				if (randomElement.equals("Sim")) {
					lblNewLabel.setForeground(Color.decode("#008000"));
				} else {
					lblNewLabel.setForeground(Color.RED);
				}

				lblNewLabel.setText(randomElement);

			}
		});
		btnNewButton.setBounds(74, 131, 128, 41);
		frmSimno.getContentPane().add(btnNewButton);
	}
}
