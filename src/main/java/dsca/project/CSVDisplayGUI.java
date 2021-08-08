package dsca.project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class CSVDisplayGUI extends JPanel {
	private final JTable table;

	public CSVDisplayGUI() {
		super(new BorderLayout(3, 3));
		this.table = new JTable(new MyModel());
		this.table.setPreferredScrollableViewportSize(new Dimension(600, 200));
		this.table.setFillsViewportHeight(true);
		JPanel ButtonOpen = new JPanel(new FlowLayout(FlowLayout.CENTER));
		add(ButtonOpen, BorderLayout.SOUTH);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		CSVFile Rd = new CSVFile();
		MyModel NewModel = new MyModel();
		this.table.setModel(NewModel);
		File DataFile = new File("src\\main\\resources\\Pollutant_Data.csv");
		ArrayList<String[]> Ps2 = Rd.ReadCSVfile(DataFile);
		NewModel.AddCSVData(Ps2);
		System.out.println("Rows: " + NewModel.getRowCount());
		System.out.println("Cols: " + NewModel.getColumnCount());
	}

	public class CSVFile {
		private final ArrayList<String[]> Ps = new ArrayList<String[]>();
		private String[] OneRow;

		public ArrayList<String[]> ReadCSVfile(File DataFile) {
			try {
				@SuppressWarnings("resource")
				BufferedReader brd = new BufferedReader(new FileReader(DataFile));
				while (brd.ready()) {
					String st = brd.readLine();
					OneRow = st.split(",");
					Ps.add(OneRow);
					System.out.println(Arrays.toString(OneRow));
				}
			} catch (Exception e) {
				String errmsg = e.getMessage();
				System.out.println("File not found:" + errmsg);
			}
			return Ps;
		}
	}

	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Pollution Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CSVDisplayGUI newContentPane = new CSVDisplayGUI();
		frame.setContentPane(newContentPane);
		frame.pack();
		frame.setVisible(true);
	}

	class MyModel extends AbstractTableModel {
		private final String[] columnNames = { "ID", "Pollutant", "Amount", "Date" };
		private ArrayList<String[]> Data = new ArrayList<String[]>();

		public void AddCSVData(ArrayList<String[]> DataIn) {
			this.Data = DataIn;
			this.fireTableDataChanged();
		}

		public int getColumnCount() {
			return columnNames.length;// length;
		}

		public int getRowCount() {
			return Data.size();
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			return Data.get(row)[col];
		}
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
