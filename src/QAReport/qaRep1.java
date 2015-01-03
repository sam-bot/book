package QAReport;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.swing.*;

public class qaRep1 extends JFrame {
	/*
	 * Name: Sam Renick Date: 7/29/12 CSCI-3232-01F (Systems Software) Final
	 * Project Program incorporates Java GUI components, including text fields,
	 * combo boxes, buttons, and drop down menus. Utilizes action listeners to
	 * record data entered into GUI objects and outputs to a text file in an
	 * ordered manner.
	 */

	// text fields used to enter data
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/* Main Method */
	public static void main(String[] args) throws FileNotFoundException {

		// initializes GUI object
		qaRep1 b1 = new qaRep1();
		b1.setSize(675, 500);
		b1.setLocationRelativeTo(null);
		b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.setTitle("QA and Documentation Audit");
		b1.setVisible(true);

	}

	// no arg constructor
	public qaRep1() throws FileNotFoundException {

		// file used for data output
		File file = new File("QA Report.txt");
		final PrintWriter output = new PrintWriter(file);

		getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 709, 67);
		getContentPane().add(panel_1);
		// label for header
		JLabel lblQualityAndDocumentation = new JLabel(
				"Quality and Documentation Audit");
		lblQualityAndDocumentation
				.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualityAndDocumentation.setFont(new Font("Tahoma", Font.BOLD, 33));
		panel_1.add(lblQualityAndDocumentation);

		JPanel panel = new JPanel();
		panel.setBounds(0, 63, 121, 35);
		getContentPane().add(panel);
		// GUI components are created
		JLabel lblShift = new JLabel("Shift");
		panel.add(lblShift);
		// combo box for shift selection
		String[] shifts = { "", "A", "B", "C", "D" };
		// listener populates crew based on shift selection
		final JComboBox comboBox = new JComboBox(shifts);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("A")) {
					textField.setText("M Passley");
					textField_1.setText("R Simpson Sr");
					textField_2.setText("J Wilkey");
					textField_3.setText("D Ward");
					textField_4.setText("R Turner");
					textField_5.setText("A Jones");
					textField_6.setText("B Curtis");
					textField_7.setText("R Sartin");
					textField_8.setText("J Patterson");
					textField_9.setText("R Curtis, T Patterson");
				}

				else if (comboBox.getSelectedItem().equals("B")) {
					textField.setText("K Bray");
					textField_1.setText("J Young");
					textField_2.setText("S Grady");
					textField_3.setText("T Evans");
					textField_4.setText("D Waliczek");
					textField_5.setText("G Haulk");
					textField_6.setText("M Bennett");
					textField_7.setText("A Young");
					textField_9.setText("R Conaway, J Jones");
				}

				else if (comboBox.getSelectedItem().equals("C")) {
					textField.setText("M Ray");
					textField_1.setText("C Preavtte");
					textField_2.setText("T Wyatt");
					textField_3.setText("J Davis");
					textField_4.setText("M Greeson");
					textField_5.setText("R Dean");
					textField_6.setText("N Luna");
					textField_7.setText("R Simpson Jr");
					textField_9.setText("B Preavette, C Thompson");
				}

				else if (comboBox.getSelectedItem().equals("D")) {
					textField.setText("B Bryant");
					textField_1.setText("M Ross");
					textField_2.setText("M Floyd");
					textField_3.setText("R Griffin");
					textField_4.setText("J Adams");
					textField_5.setText("S Jones");
					textField_6.setText("C Fields");
					textField_7.setText("G Smith");
					textField_8.setText("D Davis");
					textField_9.setText("T Adams, P Cameron");
				}
			}
		});
		panel.add(comboBox);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 111, 699, 363);
		getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 86, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lblLineNumber = new JLabel("Line Number");
		lblLineNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblLineNumber = new GridBagConstraints();
		gbc_lblLineNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblLineNumber.anchor = GridBagConstraints.NORTH;
		gbc_lblLineNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLineNumber.gridx = 0;
		gbc_lblLineNumber.gridy = 0;
		panel_2.add(lblLineNumber, gbc_lblLineNumber);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblOperator = new GridBagConstraints();
		gbc_lblOperator.insets = new Insets(0, 0, 5, 5);
		gbc_lblOperator.gridx = 2;
		gbc_lblOperator.gridy = 0;
		panel_2.add(lblOperator, gbc_lblOperator);

		JLabel lblQaReport = new JLabel("QA Report");
		lblQaReport.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblQaReport = new GridBagConstraints();
		gbc_lblQaReport.insets = new Insets(0, 0, 5, 5);
		gbc_lblQaReport.gridx = 4;
		gbc_lblQaReport.gridy = 0;
		panel_2.add(lblQaReport, gbc_lblQaReport);

		JLabel lblCleaningChecklist = new JLabel("Housekeeping");
		lblCleaningChecklist.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblCleaningChecklist = new GridBagConstraints();
		gbc_lblCleaningChecklist.insets = new Insets(0, 0, 5, 5);
		gbc_lblCleaningChecklist.gridx = 6;
		gbc_lblCleaningChecklist.gridy = 0;
		panel_2.add(lblCleaningChecklist, gbc_lblCleaningChecklist);

		JLabel lblSetWeights = new JLabel("Set Weights");
		lblSetWeights.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblSetWeights = new GridBagConstraints();
		gbc_lblSetWeights.insets = new Insets(0, 0, 5, 0);
		gbc_lblSetWeights.gridx = 8;
		gbc_lblSetWeights.gridy = 0;
		panel_2.add(lblSetWeights, gbc_lblSetWeights);

		JLabel label = new JLabel("21");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_2.add(label, gbc_label);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		textField.setColumns(10);

		String[] complete = { "", "Complete", "Not Turned In", "Not Signed",
				"Partially Complete" };
		final JComboBox comboBox_1 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 1;
		panel_2.add(comboBox_1, gbc_comboBox_1);

		final JComboBox comboBox_12 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_12 = new GridBagConstraints();
		gbc_comboBox_12.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_12.gridx = 6;
		gbc_comboBox_12.gridy = 1;
		panel_2.add(comboBox_12, gbc_comboBox_12);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 0);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 8;
		gbc_textField_10.gridy = 1;
		panel_2.add(textField_10, gbc_textField_10);

		JLabel label_1 = new JLabel("22");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		panel_2.add(label_1, gbc_label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		panel_2.add(textField_1, gbc_textField_1);

		final JComboBox comboBox_2 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 4;
		gbc_comboBox_2.gridy = 2;
		panel_2.add(comboBox_2, gbc_comboBox_2);

		final JComboBox comboBox_11 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_11 = new GridBagConstraints();
		gbc_comboBox_11.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_11.gridx = 6;
		gbc_comboBox_11.gridy = 2;
		panel_2.add(comboBox_11, gbc_comboBox_11);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 0);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 8;
		gbc_textField_11.gridy = 2;
		panel_2.add(textField_11, gbc_textField_11);

		JLabel label_2 = new JLabel("23");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		panel_2.add(label_2, gbc_label_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panel_2.add(textField_2, gbc_textField_2);

		final JComboBox comboBox_3 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 4;
		gbc_comboBox_3.gridy = 3;
		panel_2.add(comboBox_3, gbc_comboBox_3);

		final JComboBox comboBox_13 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_13 = new GridBagConstraints();
		gbc_comboBox_13.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_13.gridx = 6;
		gbc_comboBox_13.gridy = 3;
		panel_2.add(comboBox_13, gbc_comboBox_13);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 0);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 8;
		gbc_textField_12.gridy = 3;
		panel_2.add(textField_12, gbc_textField_12);

		JLabel label_3 = new JLabel("24");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 4;
		panel_2.add(label_3, gbc_label_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		panel_2.add(textField_3, gbc_textField_3);

		final JComboBox comboBox_4 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 4;
		gbc_comboBox_4.gridy = 4;
		panel_2.add(comboBox_4, gbc_comboBox_4);

		final JComboBox comboBox_14 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_14 = new GridBagConstraints();
		gbc_comboBox_14.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_14.gridx = 6;
		gbc_comboBox_14.gridy = 4;
		panel_2.add(comboBox_14, gbc_comboBox_14);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 8;
		gbc_textField_13.gridy = 4;
		panel_2.add(textField_13, gbc_textField_13);

		JLabel label_4 = new JLabel("25");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 5;
		panel_2.add(label_4, gbc_label_4);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		panel_2.add(textField_4, gbc_textField_4);

		final JComboBox comboBox_5 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 4;
		gbc_comboBox_5.gridy = 5;
		panel_2.add(comboBox_5, gbc_comboBox_5);

		final JComboBox comboBox_15 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_15 = new GridBagConstraints();
		gbc_comboBox_15.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_15.gridx = 6;
		gbc_comboBox_15.gridy = 5;
		panel_2.add(comboBox_15, gbc_comboBox_15);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 0);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 8;
		gbc_textField_14.gridy = 5;
		panel_2.add(textField_14, gbc_textField_14);

		JLabel lblP = new JLabel("P1");
		lblP.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblP = new GridBagConstraints();
		gbc_lblP.insets = new Insets(0, 0, 5, 5);
		gbc_lblP.gridx = 0;
		gbc_lblP.gridy = 6;
		panel_2.add(lblP, gbc_lblP);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		panel_2.add(textField_5, gbc_textField_5);

		final JComboBox comboBox_6 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_6 = new GridBagConstraints();
		gbc_comboBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_6.gridx = 4;
		gbc_comboBox_6.gridy = 6;
		panel_2.add(comboBox_6, gbc_comboBox_6);

		final JComboBox comboBox_16 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_16 = new GridBagConstraints();
		gbc_comboBox_16.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_16.gridx = 6;
		gbc_comboBox_16.gridy = 6;
		panel_2.add(comboBox_16, gbc_comboBox_16);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 0);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 8;
		gbc_textField_15.gridy = 6;
		panel_2.add(textField_15, gbc_textField_15);

		JLabel lblP_1 = new JLabel("P2");
		lblP_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblP_1 = new GridBagConstraints();
		gbc_lblP_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblP_1.gridx = 0;
		gbc_lblP_1.gridy = 7;
		panel_2.add(lblP_1, gbc_lblP_1);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 7;
		panel_2.add(textField_6, gbc_textField_6);

		final JComboBox comboBox_7 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_7 = new GridBagConstraints();
		gbc_comboBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_7.gridx = 4;
		gbc_comboBox_7.gridy = 7;
		panel_2.add(comboBox_7, gbc_comboBox_7);

		final JComboBox comboBox_17 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_17 = new GridBagConstraints();
		gbc_comboBox_17.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_17.gridx = 6;
		gbc_comboBox_17.gridy = 7;
		panel_2.add(comboBox_17, gbc_comboBox_17);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 0);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 8;
		gbc_textField_16.gridy = 7;
		panel_2.add(textField_16, gbc_textField_16);

		JLabel lblPerforator = new JLabel("Perforator");
		lblPerforator.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblPerforator = new GridBagConstraints();
		gbc_lblPerforator.insets = new Insets(0, 0, 5, 5);
		gbc_lblPerforator.gridx = 0;
		gbc_lblPerforator.gridy = 8;
		panel_2.add(lblPerforator, gbc_lblPerforator);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 8;
		panel_2.add(textField_7, gbc_textField_7);

		final JComboBox comboBox_8 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_8 = new GridBagConstraints();
		gbc_comboBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_8.gridx = 4;
		gbc_comboBox_8.gridy = 8;
		panel_2.add(comboBox_8, gbc_comboBox_8);

		final JComboBox comboBox_18 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_18 = new GridBagConstraints();
		gbc_comboBox_18.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_18.gridx = 6;
		gbc_comboBox_18.gridy = 8;
		panel_2.add(comboBox_18, gbc_comboBox_18);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 0);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 8;
		gbc_textField_17.gridy = 8;
		panel_2.add(textField_17, gbc_textField_17);

		JLabel lblCutterBox = new JLabel("Cutter Box");
		lblCutterBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblCutterBox = new GridBagConstraints();
		gbc_lblCutterBox.insets = new Insets(0, 0, 5, 5);
		gbc_lblCutterBox.gridx = 0;
		gbc_lblCutterBox.gridy = 9;
		panel_2.add(lblCutterBox, gbc_lblCutterBox);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 2;
		gbc_textField_8.gridy = 9;
		panel_2.add(textField_8, gbc_textField_8);

		final JComboBox comboBox_9 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_9 = new GridBagConstraints();
		gbc_comboBox_9.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_9.gridx = 4;
		gbc_comboBox_9.gridy = 9;
		panel_2.add(comboBox_9, gbc_comboBox_9);

		final JComboBox comboBox_19 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_19 = new GridBagConstraints();
		gbc_comboBox_19.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_19.gridx = 6;
		gbc_comboBox_19.gridy = 9;
		panel_2.add(comboBox_19, gbc_comboBox_19);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 0);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 8;
		gbc_textField_18.gridy = 9;
		panel_2.add(textField_18, gbc_textField_18);

		JLabel lblHelpers = new JLabel("Helpers");
		lblHelpers.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblHelpers = new GridBagConstraints();
		gbc_lblHelpers.insets = new Insets(0, 0, 5, 5);
		gbc_lblHelpers.gridx = 0;
		gbc_lblHelpers.gridy = 10;
		panel_2.add(lblHelpers, gbc_lblHelpers);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 2;
		gbc_textField_9.gridy = 10;
		panel_2.add(textField_9, gbc_textField_9);

		final JComboBox comboBox_10 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_10 = new GridBagConstraints();
		gbc_comboBox_10.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_10.gridx = 4;
		gbc_comboBox_10.gridy = 10;
		panel_2.add(comboBox_10, gbc_comboBox_10);

		final JComboBox comboBox_20 = new JComboBox(complete);
		GridBagConstraints gbc_comboBox_20 = new GridBagConstraints();
		gbc_comboBox_20.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_20.gridx = 6;
		gbc_comboBox_20.gridy = 10;
		panel_2.add(comboBox_20, gbc_comboBox_20);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 0);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 8;
		gbc_textField_19.gridy = 10;
		panel_2.add(textField_19, gbc_textField_19);
		// Submit button triggers listener which outputs data to file
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DATE, -1);
				java.sql.Date yesterday = new java.sql.Date(cal
						.getTimeInMillis());
				output.print(yesterday);
				output.println();
				output.print("Quality and Housekeeping Audit");
				output.println();
				output.print("Shift: ");
				output.print(comboBox.getSelectedItem());
				output.println();
				output.println();
				output.print(textField.getText());
				output.println();
				output.print(textField_1.getText());
				output.println();
				output.print(textField_2.getText());
				output.println();
				output.print(textField_3.getText());
				output.println();
				output.print(textField_4.getText());
				output.println();
				output.print(textField_5.getText());
				output.println();
				output.print(textField_6.getText());
				output.println();
				output.print(textField_7.getText());
				output.println();
				output.print(textField_8.getText());
				output.println();
				output.print(textField_9.getText());
				output.println();
				output.print(textField_10.getText());
				output.println();
				output.print("          ");
				output.print(comboBox_3.getSelectedItem());
				output.print("          ");
				output.print(comboBox_13.getSelectedItem());
				output.print("          ");
				output.print(textField_12.getText());
				output.println();
				output.print(comboBox_4.getSelectedItem());
				output.print("          ");
				output.print(comboBox_14.getSelectedItem());
				output.print("          ");
				output.print(textField_13.getText());
				output.println();
				output.print("25");
				output.print("          ");
				output.print("          ");
				output.print(comboBox_5.getSelectedItem());
				output.print("          ");
				output.print(comboBox_15.getSelectedItem());
				output.print("          ");
				output.print(textField_14.getText());
				output.println();
				output.print("P1");
				output.print("          ");
				output.print(comboBox_6.getSelectedItem());
				output.print("          ");
				output.print(comboBox_16.getSelectedItem());
				output.print("          ");
				output.print(textField_15.getText());
				output.println();
				output.print("P2");
				output.print("          ");
				output.print(textField_6.getText());
				output.print("          ");
				output.print(comboBox_7.getSelectedItem());
				output.print("          ");
				output.print(comboBox_17.getSelectedItem());
				output.print("          ");
				output.print(textField_16.getText());
				output.println();
				output.print("Perforator");
				output.print("          ");
				output.print(textField_7.getText());
				output.print("          ");
				output.print(comboBox_8.getSelectedItem());
				output.print("          ");
				output.print(comboBox_18.getSelectedItem());
				output.print("          ");
				output.print(textField_17.getText());
				output.println();
				output.print("Cutter Box");
				output.print("          ");
				output.print(textField_8.getText());
				output.print("          ");
				output.print(comboBox_9.getSelectedItem());
				output.print("          ");
				output.print(comboBox_19.getSelectedItem());
				output.print("          ");
				output.print(textField_18.getText());
				output.println();
				output.print("Helpers");
				output.print("          ");
				output.print(textField_9.getText());
				output.print("          ");
				output.print(comboBox_10.getSelectedItem());
				output.print("          ");
				output.print(comboBox_20.getSelectedItem());
				output.print("          ");
				output.print(textField_19.getText());
				output.println();
				output.close();
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_btnSubmit = new GridBagConstraints();
		gbc_btnSubmit.gridx = 8;
		gbc_btnSubmit.gridy = 12;
		panel_2.add(btnSubmit, gbc_btnSubmit);

	}
}