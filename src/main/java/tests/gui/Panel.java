package tests.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class Panel {
//	private static final JMenu mnNewMenu_2 = new JMenu("CyberAgency");
	private static final JMenuItem mntmNewMenuItem_3 = new JMenuItem("Cat\u00E1logos");
//	private static final JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Redes de Decis\u00E3o");
	private static final JMenuItem mtmNewMenuItem = new JMenuItem("Cat\u00E1logo de Ag\u00EAncias");
	private static final JMenuItem mntmNewMenuItem_1 = new JMenuItem("Distribui\u00E7\u00E3o Manual");
	private static final JMenuItem mntmNewMenuItem_2 = new JMenuItem("Campe\u00E3o e Desafiante");
	private static final JButton btnNewButton = new JButton("CyEn");
	private static final JButton btnNewButton_1_2 = new JButton("Catal");
	private static final JButton btnCyberagency = new JButton("Agency");
	private static final JButton btnCatalAgen = new JButton("Agencies");
	private static final JButton btnExtratorweb = new JButton("ExtratorWeb");
	private static final JButton btnListaValores = new JButton("    Values");
//	private static final JButton btnComparaArv = new JButton("    Rastreio de \u00C1rvores");

	private static final JPanel panel = new JPanel();

	private static final JPanel panel_inclusao = new JPanel();

	private static final JLabel lblIncluso = new JLabel("Include");
	protected static final JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("PASS");
	protected static final JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("NOT PASS");

	private static final JPanel panel2 = new JPanel();
	private static final JPanel panel_inclusao2 = new JPanel();
	private static final JPanel panel_alteracao2 = new JPanel();
	private static final JPanel panel_exclusao2 = new JPanel();

	private static final JPanel panel_1 = new JPanel();
	private static final JPanel panel_1_1 = new JPanel();
	private static final ButtonGroup buttonGroup = new ButtonGroup();
	private static final JLabel lblNewLabel = new JLabel("");
	private final JLabel lblNewLabel_1 = new JLabel("");
	private final JPanel panel_exclusao = new JPanel();
	private final JLabel lblIncluso_1 = new JLabel("Exclude");
	protected static final JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("PASS");
	protected static final JRadioButton rdbtnNewRadioButton_3_2 = new JRadioButton("NOT PASS");
	private final JPanel panel_alteracao = new JPanel();
	private final JLabel lblAlterao = new JLabel("Edit");
	protected static final JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("PASS");
	protected static final JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("NOT PASS");

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 * @wbp.parser.entryPoint
	 */
	
	public void executaPainel() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		rdbtnNewRadioButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAlterao.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_alteracao.setBorder(new LineBorder(Color.GRAY));
		GroupLayout gl_panel_alteracao = new GroupLayout(panel_alteracao);
		gl_panel_alteracao.setHorizontalGroup(
			gl_panel_alteracao.createParallelGroup(Alignment.LEADING)
				.addGap(0, 183, Short.MAX_VALUE)
				.addGroup(gl_panel_alteracao.createSequentialGroup()
					.addGap(61)
					.addComponent(lblAlterao))
				.addGroup(gl_panel_alteracao.createSequentialGroup()
					.addGap(41)
					.addComponent(rdbtnNewRadioButton_2_1))
				.addGroup(gl_panel_alteracao.createSequentialGroup()
					.addGap(41)
					.addComponent(rdbtnNewRadioButton_2_2))
		);
		gl_panel_alteracao.setVerticalGroup(
			gl_panel_alteracao.createParallelGroup(Alignment.LEADING)
				.addGap(0, 256, Short.MAX_VALUE)
				.addGroup(gl_panel_alteracao.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAlterao)
					.addGap(30)
					.addComponent(rdbtnNewRadioButton_2_1)
					.addGap(8)
					.addComponent(rdbtnNewRadioButton_2_2))
		);
		panel_alteracao.setLayout(gl_panel_alteracao);
		rdbtnNewRadioButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIncluso_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_exclusao.setBorder(new LineBorder(Color.GRAY));
		GroupLayout gl_panel_exclusao = new GroupLayout(panel_exclusao);
		gl_panel_exclusao.setHorizontalGroup(
			gl_panel_exclusao.createParallelGroup(Alignment.LEADING)
				.addGap(0, 183, Short.MAX_VALUE)
				.addGroup(gl_panel_exclusao.createSequentialGroup()
					.addGap(61)
					.addComponent(lblIncluso_1))
				.addGroup(gl_panel_exclusao.createSequentialGroup()
					.addGap(41)
					.addComponent(rdbtnNewRadioButton_3_1))
				.addGroup(gl_panel_exclusao.createSequentialGroup()
					.addGap(41)
					.addComponent(rdbtnNewRadioButton_3_2))
		);
		gl_panel_exclusao.setVerticalGroup(
			gl_panel_exclusao.createParallelGroup(Alignment.LEADING)
				.addGap(0, 256, Short.MAX_VALUE)
				.addGroup(gl_panel_exclusao.createSequentialGroup()
					.addGap(10)
					.addComponent(lblIncluso_1)
					.addGap(30)
					.addComponent(rdbtnNewRadioButton_3_1)
					.addGap(8)
					.addComponent(rdbtnNewRadioButton_3_2))
		);
		panel_exclusao.setLayout(gl_panel_exclusao);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nilton.ferraz\\eclipse-workspace\\TestesAutomacaoBTG\\src\\main\\resources\\btg.png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));

//	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
//			IllegalAccessException, UnsupportedLookAndFeelException {

//		panel.setBackground(Color.red);
		panel.setLocation(10, 10);
		panel.setSize(800, 800);

		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\nilton.ferraz\\Downloads\\LOGO PEOPLEWARE AZUL CLARO COM AZUL ESCURO (1).png"));
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIncluso.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_inclusao.setBorder(new LineBorder(Color.GRAY));
		GroupLayout gl_panel_inclusao = new GroupLayout(panel_inclusao);
		gl_panel_inclusao.setHorizontalGroup(gl_panel_inclusao.createParallelGroup(Alignment.LEADING)
				.addGap(0, 183, Short.MAX_VALUE)
				.addGroup(gl_panel_inclusao.createSequentialGroup().addGap(61).addComponent(lblIncluso))
				.addGroup(gl_panel_inclusao.createSequentialGroup().addGap(41).addComponent(rdbtnNewRadioButton_1_1))
				.addGroup(gl_panel_inclusao.createSequentialGroup().addGap(41).addComponent(rdbtnNewRadioButton_1_2)));
		gl_panel_inclusao.setVerticalGroup(
				gl_panel_inclusao.createParallelGroup(Alignment.LEADING).addGap(0, 256, Short.MAX_VALUE)
						.addGroup(gl_panel_inclusao.createSequentialGroup().addGap(10).addComponent(lblIncluso)
								.addGap(30).addComponent(rdbtnNewRadioButton_1_1).addGap(8)
								.addComponent(rdbtnNewRadioButton_1_2)));
		panel_inclusao.setLayout(gl_panel_inclusao);

		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_inclusao, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_alteracao, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_exclusao, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap(11, Short.MAX_VALUE)
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_alteracao, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_exclusao, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_inclusao, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1_1.setLayout(gl_panel_1_1);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		final JFrame frm = new JFrame("Menu test");
		frm.setExtendedState(Frame.MAXIMIZED_BOTH);
		frm.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\nilton.ferraz\\eclipse-workspace\\TestesAutomacaoBTG\\src\\main\\resources\\favicon.ico"));
		frm.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		frm.setBackground(Color.LIGHT_GRAY);
		frm.setTitle("Test - TBG - v1.0");

		final JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setLayout(new GridLayout(30, 1)); // in my application I use a custom layout here
//        JMenu m1 = new VerticalMenu("First");
//        m1.setBackground(new Color(192, 192, 192));
//        m1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
//        m1.setText("CyberEngine");
//        menuBar.add(m1);

		// Here we create a hand shaped cursor!
//        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
//        frm.setCursor(cursor);
//        frm.setVisible(true);

//		mntmNewMenuItem_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

//        m1.add(mntmNewMenuItem_3_1);
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));

//        m1.add(mntmNewMenuItem_2);
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));

//        m1.add(mntmNewMenuItem_3);
		frm.getContentPane().add(menuBar, BorderLayout.WEST);
//        mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));

//        menuBar.add(mnNewMenu_2);

//        mnNewMenu_2.add(mntmNewMenuItem);

//        mnNewMenu_2.add(mntmNewMenuItem_1);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);

		menuBar.add(btnNewButton);
		btnNewButton_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));

		menuBar.add(btnNewButton_1_2);
		btnListaValores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Entry().main(null);
			
				// Esses códigos são para a Versão2 
				String dir = "Values";
				String runner = "ReadFile";
				new Entry2();
				Entry2.entrar(dir, runner);
				
				
				
//				try {
//					new Runners().testListaValores();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		});
		btnListaValores.setHorizontalAlignment(SwingConstants.LEFT);
		btnListaValores.setFont(new Font("Tahoma", Font.PLAIN, 13));

		menuBar.add(btnListaValores);
		btnCyberagency.setHorizontalAlignment(SwingConstants.LEFT);
		btnCyberagency.setForeground(Color.BLACK);
		btnCyberagency.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnCyberagency.setBackground(SystemColor.activeCaption);

		menuBar.add(btnCyberagency);
		btnCatalAgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new Runners().testCatalAgencias();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCatalAgen.setHorizontalAlignment(SwingConstants.LEFT);
		btnCatalAgen.setFont(new Font("Tahoma", Font.PLAIN, 13));

		menuBar.add(btnCatalAgen);
		btnExtratorweb.setHorizontalAlignment(SwingConstants.LEFT);
		btnExtratorweb.setForeground(Color.BLACK);
		btnExtratorweb.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnExtratorweb.setBackground(SystemColor.activeCaption);

//		menuBar.add(btnExtratorweb);
//		btnExtratorWeb.setHorizontalAlignment(SwingConstants.LEFT);
//		btnExtratorWeb.setFont(new Font("Tahoma", Font.PLAIN, 13));
//
//		menuBar.add(btnExtratorWeb);

		JTextArea textArea = new JTextArea(20, 80);
		textArea.setTabSize(9);

		JScrollPane scrollPane = new JScrollPane(panel);
		frm.getContentPane().add(scrollPane);

		scrollPane.setRowHeaderView(panel);

		frm.pack();
		frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frm.setVisible(true);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(btnNewButton_1_2);

		ButtonGroup bg2 = new ButtonGroup();

		ButtonGroup bg3 = new ButtonGroup();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 606, Short.MAX_VALUE));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGap(0, 240, Short.MAX_VALUE));
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(797)
							.addComponent(lblNewLabel_1)
							.addGap(80)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(2459, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(16)
							.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addGap(96))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(136))))
		);
		panel.setLayout(gl_panel);

	}

	private static class VerticalMenu extends JMenu {
		public VerticalMenu(String aText) {
			super(aText);
		}

	}

	// inativado
	public void testRadio1(boolean test) {
		if (test == true) {
			rdbtnNewRadioButton_1_1.setSelected(true);
			System.out.println("hellllllllllllllllllllllllllllllllllooooooooooooo");
//			return test;
			boolean resultTeste = test;
		}
		rdbtnNewRadioButton_1_2.setSelected(true);
		System.out.println("fallllllllllllllllllllllsssssssssseeeeeeeeeee");
//		return test;
		boolean resultTeste = test;
	}
	
	public void desativaRadio() {
		rdbtnNewRadioButton_1_1.setSelected(false);
		rdbtnNewRadioButton_1_2.setSelected(false);
		rdbtnNewRadioButton_2_1.setSelected(false);
		rdbtnNewRadioButton_2_2.setSelected(false);
		rdbtnNewRadioButton_3_1.setSelected(false);
		rdbtnNewRadioButton_3_2.setSelected(false);
	}
}
