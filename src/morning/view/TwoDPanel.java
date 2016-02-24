package morning.view;

import java.awt.Color;
import javax.swing.*;
import morning.controller.TwoDController;
import javax.swing.table.DefaultTableModel;
public class TwoDPanel extends JPanel
{
	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JLabel currentWatchLabel;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable watchTable;
	
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		rowField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 10, SpringLayout.WEST, this);
		columnField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.EAST, rowField, 0, SpringLayout.EAST, columnField);
		baseLayout.putConstraint(SpringLayout.WEST, columnField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, columnField, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, columnField, 389, SpringLayout.WEST, this);
		currentWatchLabel = new JLabel("The current Watch");
		baseLayout.putConstraint(SpringLayout.SOUTH, currentWatchLabel, -250, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 18, SpringLayout.SOUTH, currentWatchLabel);
		baseLayout.putConstraint(SpringLayout.WEST, currentWatchLabel, 10, SpringLayout.WEST, this);
		changeButton = new JButton("Change the indicated watch");
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -2, SpringLayout.NORTH, columnField);
		displayButton = new JButton("Display the indicated watch");
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -5, SpringLayout.NORTH, changeButton);
		
		setupTable();
		setupPanel();
		setupLayout();
	}
	
	/**
	 * helper method to load information from the model into the GUI as a 2d array.
	 */
	private void setupTable()
	{
		String [] columnHeaders = {"Column 0", "Column 1", "Column 2" };
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyWatches(), columnHeaders);
		watchTable = new JTable(tableModel);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, watchTable);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, 0, SpringLayout.EAST, watchTable);
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
		this.add(changeButton);
		this.add(displayButton);
		this.setBackground(Color.MAGENTA);
	}
	
	private void setupListeners()
	{
		
	}
}
