package tests.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class Entry2 extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Testar");
	private final JComboBox comboBox = new JComboBox();
	private final JLabel lblNewLabel = new JLabel("Selecione a versão:");
	
	static Getters g = new Getters();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
	public static void entrar(String diretorio, String runner) {
		
		g.setDiretorio(diretorio);
		g.setRunner(runner);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry2 frame = new Entry2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entry2() {
		initGUI();
	}

	private void initGUI() {
		setTitle("Teste de Versões");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, comboBox);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -16, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 84, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 54, SpringLayout.NORTH, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -62, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -152, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -67, SpringLayout.EAST, contentPane);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 84, SpringLayout.NORTH, contentPane);
		contentPane.setLayout(springLayout);

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final String dir1 = "C:\\users\\nilto\\Testes\\Versions\\";
				final String dir2 = g.getDiretorio();
				final String runner = g.getRunner();

				if (comboBox.getSelectedIndex() == 0) {
					String arq1 = "v1.txt";
					// caminho
					String v1 = dir1 + dir2 + "\\" + arq1;
					new Runners2().testRunner(runner, v1);
					
				} else if (comboBox.getSelectedIndex() == 1) {
					String arq2 = "v2.txt";
					String v2 = dir1 + dir2 + arq2;
					new Runners2().testRunner(runner, v2);
				}
			}
		});
		contentPane.add(btnNewButton);

		comboBox.addItem("v1");
		comboBox.addItem("v2");

		contentPane.add(comboBox);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));

		contentPane.add(lblNewLabel);
	}
}