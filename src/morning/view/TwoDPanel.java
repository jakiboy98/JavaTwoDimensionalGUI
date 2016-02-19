package morning.view;

import java.awt.Color;
import javax.swing.*;
import morning.controller.TwoDController;
import javax.swing.table.DefaultTableModel;
public class TwoDPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentWatchLabel;
	private JTextField editField;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable watchTable;
	
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		columnField = new JTextField(5);
		editField = new JTextField(20);
		currentWatchLabel = new JLabel("The current Watch");
		changeButton = new JButton("Change the indicated watch");
		displayButton = new JButton("Display the indicated watch");
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListener();
	}
	
	/**
	 * helper method to load information from the model into the GUI as a 2d array.
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2" };
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyWatches(), columnHeaders);
		watchTable = new JTable(tableModel);
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		this.setLayout(baseLayout);
		this.add(watchTable);
		this.add(currentWatchLabel);
		this.add(columnField);
		this.add(rowField);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		this.setBackground(Color.BLACK);
	}
	
	private void setupListeners()
	{
		
	}
}
