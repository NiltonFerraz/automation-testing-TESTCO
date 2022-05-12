package tests.gui;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

import agency.catalagency.TestIncludeAgency;
import agency.catalagency.TestSelectIncludeAgency;
import en.values.TestIncludeValues;

public class Runners extends Panel {

	public void testCatalAgencias() throws InterruptedException {
		new Panel().desativaRadio();
		try {
			new TestIncludeAgency().includeAgency();
			new TestSelectIncludeAgency().initialize();
			rdbtnNewRadioButton_1_1.setSelected(true);
			try {
				Thread.sleep(15000);
//				new TestAlterarAgencia().alterarAgencia(arq);
//				new TestSelectAlterarAgencia().inicializa();
//				rdbtnNewRadioButton_2_1.setSelected(true);
				try {
					Thread.sleep(15000);
//					new TestExcluirAgencia().excluirAgencia(arq);
//					new TestSelectExcluirAgencia().inicializa();
//					rdbtnNewRadioButton_3_1.setSelected(true);
				} catch (Exception e) {
					e.printStackTrace();
					rdbtnNewRadioButton_3_2.setSelected(true);
					JOptionPane.showMessageDialog(null, "Verifique o problema");
				}
			} catch (Exception e) {
				e.printStackTrace();
				rdbtnNewRadioButton_2_2.setSelected(true);
				JOptionPane.showMessageDialog(null, "Verifique o problema");
			}
		} catch (Exception e) {
			e.printStackTrace();
			rdbtnNewRadioButton_1_2.setSelected(true);
			JOptionPane.showMessageDialog(null, "Verifique o problema");
		}
	}

	public void testListaValores(String arq) throws InterruptedException {
		new Panel().desativaRadio();
		try {
			new TestIncludeValues().includeValues(arq);
//			new TestSelectIncluirListaValores().inicializa();
			rdbtnNewRadioButton_1_1.setSelected(true);
			try {
				Thread.sleep(15000);
//				new TestAlterarListaValores().alterarValores(arq);
//				new TestSelectAlterarListaValores().inicializa();
//				rdbtnNewRadioButton_2_1.setSelected(true);
				try {
					Thread.sleep(15000);
//					new TestExcluirListaValores().excluirValores(arq);
//					new TestSelectExcluirListaValores().inicializa();
//					rdbtnNewRadioButton_3_1.setSelected(true);
				} catch (Exception e) {
					e.printStackTrace();
					rdbtnNewRadioButton_3_2.setSelected(true);
					JOptionPane.showMessageDialog(null, "Verifique o problema");
				}
			} catch (Exception e) {
				e.printStackTrace();
				rdbtnNewRadioButton_2_2.setSelected(true);
				JOptionPane.showMessageDialog(null, "Verifique o problema");
			}
		} catch (Exception e) {
			e.printStackTrace();
			rdbtnNewRadioButton_1_2.setSelected(true);
			JOptionPane.showMessageDialog(null, "Verifique o problema");
		}
	}

}
