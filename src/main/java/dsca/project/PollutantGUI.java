package dsca.project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class PollutantGUI {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		final JTable table = new JTable();

		Object[] columns = { "ID", "Pollutant", "Amount", "Date" };
		final DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);

		table.setModel(model);

		table.setBackground(Color.LIGHT_GRAY);
		table.setForeground(Color.black);
		Font font = new Font("", 1, 22);
		table.setFont(font);
		table.setRowHeight(30);

		final JTextField textID = new JTextField();
		final JTextField textPollutant = new JTextField();
		final JTextField textAmount = new JTextField();
		final JTextField textDate = new JTextField();

		JButton btnAdd = new JButton("Add");
		JButton btnDelete = new JButton("Delete");
		JButton btnUpdate = new JButton("Update");

		textID.setBounds(166, 220, 100, 25);
		textPollutant.setBounds(166, 251, 100, 25);
		textAmount.setBounds(166, 286, 100, 25);
		textDate.setBounds(166, 317, 100, 25);

		btnAdd.setBounds(290, 220, 100, 25);
		btnUpdate.setBounds(290, 265, 100, 25);
		btnDelete.setBounds(290, 310, 100, 25);

		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 0, 880, 200);

		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(pane);

		frame.getContentPane().add(textID);
		frame.getContentPane().add(textPollutant);
		frame.getContentPane().add(textAmount);
		frame.getContentPane().add(textDate);

		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btnDelete);
		frame.getContentPane().add(btnUpdate);

		JLabel lblNewLabel = new JLabel("Pollutant ID:");
		lblNewLabel.setBounds(21, 226, 135, 13);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Pollutant Name:");
		lblNewLabel_1.setBounds(21, 257, 135, 13);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Pollutant Amount:");
		lblNewLabel_2.setBounds(21, 292, 135, 13);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Date:");
		lblNewLabel_3.setBounds(21, 323, 135, 13);
		frame.getContentPane().add(lblNewLabel_3);

		final Object[] row = new Object[4];

		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				row[0] = textID.getText();
				row[1] = textPollutant.getText();
				row[2] = textAmount.getText();
				row[3] = textDate.getText();

				model.addRow(row);
			}
		});

		btnDelete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int i = table.getSelectedRow();
				if (i >= 0) {
					model.removeRow(i);
				} else {
					System.out.println("Delete Error");
				}
			}
		});
		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				int i = table.getSelectedRow();

				textID.setText(model.getValueAt(i, 0).toString());
				textPollutant.setText(model.getValueAt(i, 1).toString());
				textAmount.setText(model.getValueAt(i, 2).toString());
				textDate.setText(model.getValueAt(i, 3).toString());
			}
		});

		btnUpdate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				int i = table.getSelectedRow();

				if (i >= 0) {
					model.setValueAt(textID.getText(), i, 0);
					model.setValueAt(textPollutant.getText(), i, 1);
					model.setValueAt(textAmount.getText(), i, 2);
					model.setValueAt(textDate.getText(), i, 3);
				} else {
					System.out.println("Update Error");
				}
			}
		});

		frame.setSize(900, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
