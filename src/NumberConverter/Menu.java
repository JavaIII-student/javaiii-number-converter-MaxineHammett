package NumberConverter;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.awt.Dialog.ModalityType;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Menu{

	protected Shell shlNumberConversionTool;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Menu window = new Menu();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlNumberConversionTool.open();
		shlNumberConversionTool.layout();
		while (!shlNumberConversionTool.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlNumberConversionTool = new Shell();
		shlNumberConversionTool.setSize(852, 300);
		shlNumberConversionTool.setText("Number Conversion Tool");
		
		Button btnBinToDec = new Button(shlNumberConversionTool, SWT.NONE);
		btnBinToDec.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
			    try {    // prompt the user for a number
		    JFrame frame = new JFrame("InputDialog Example #1");
			        String convNo = JOptionPane.showInputDialog(frame, "Input a number then select a button?");

			        // get the user's input. note that if they press Cancel, 'name' will be null
			        System.out.printf("You selected '%s'.\n", convNo);
			        System.exit(0);
			    } catch (Exception ex) {
			        ex.printStackTrace();
			    }
			}
		});
		btnBinToDec.setBounds(10, 10, 143, 41);
		btnBinToDec.setText("Bin to Dec");
		
		Button btnBinToHex = new Button(shlNumberConversionTool, SWT.NONE);
		btnBinToHex.setBounds(161, 10, 128, 41);
		btnBinToHex.setText("Bin to Hex");
		
		Button btnDecToBin = new Button(shlNumberConversionTool, SWT.NONE);
		btnDecToBin.setBounds(295, 10, 135, 41);
		btnDecToBin.setText("Dec to Bin");
		
		Button btnDecToHex = new Button(shlNumberConversionTool, SWT.NONE);
		btnDecToHex.setBounds(439, 10, 121, 41);
		btnDecToHex.setText("Dec to Hex");
		
		Button btnHexToBin = new Button(shlNumberConversionTool, SWT.NONE);
		btnHexToBin.setBounds(569, 10, 121, 41);
		btnHexToBin.setText("Hex to Bin");
		
		Button btnHexToDec = new Button(shlNumberConversionTool, SWT.NONE);
		btnHexToDec.setBounds(696, 10, 114, 41);
		btnHexToDec.setText("Hex to Dec");
		
		Label lblLbloutput = new Label(shlNumberConversionTool, SWT.BORDER);
		lblLbloutput.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblLbloutput.setBounds(202, 112, 411, 117);
		
		Label lblConvertedNumber = new Label(shlNumberConversionTool, SWT.NONE);
		lblConvertedNumber.setBounds(161, 81, 143, 25);
		lblConvertedNumber.setText("Converted number:");

	}
}
