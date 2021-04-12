import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Menu {

	protected Shell shlNumberConversionTool;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Menu obj = new Menu();
			obj.open();
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
		shlNumberConversionTool.setSize(724, 300);
		shlNumberConversionTool.setText("Number Conversion Tool");

		Button btnBinToDec = new Button(shlNumberConversionTool, SWT.NONE);
		btnBinToDec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String inputNo = JOptionPane.showInputDialog("What number would you like to convert?");
				int inputedNo = Integer.parseInt(inputNo);
				Binary ob = new Binary();
				int btod = ob.binaryToDec(inputedNo);

				String msgBintoDec = "Binary number : " + inputedNo + "\nConverted to Decimal: " + btod;
				// returning the decimal number
				JOptionPane.showMessageDialog(null, msgBintoDec);
			}
		});
		btnBinToDec.setBounds(10, 10, 128, 44);
		btnBinToDec.setText("Bin to Dec");

		Button btnBinToHex = new Button(shlNumberConversionTool, SWT.NONE);
		btnBinToHex.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String inputNo = JOptionPane.showInputDialog("What number would you like to convert?");
				int inputedNo = Integer.parseInt(inputNo);
				Binary ob = new Binary();
				String btoH = ob.binToHex(inputedNo);

				String msgBintoDec = "Binary number : " + inputedNo + "\nConverted to Hexidecimal: " + btoH;
				// returning the decimal number
				JOptionPane.showMessageDialog(null, msgBintoDec);
			}

		});
		btnBinToHex.setBounds(144, 10, 106, 44);
		btnBinToHex.setText("Bin to Hex");

		Button btnDecToBin = new Button(shlNumberConversionTool, SWT.NONE);
		btnDecToBin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String inputNo = JOptionPane.showInputDialog("What number would you like to convert?");
				int inputedNo = Integer.parseInt(inputNo);

				Decimal decTobin = new Decimal();
				StringBuilder btD = decTobin.decToBinary(inputedNo);

				String msgBintoDec = "Decimal number : " + inputedNo + "\nConverted to binary: " + btD;
				JOptionPane.showMessageDialog(null, msgBintoDec);
			}
		});
		btnDecToBin.setBounds(257, 10, 100, 44);
		btnDecToBin.setText("Dec to Bin");

		Button btnDecToHex = new Button(shlNumberConversionTool, SWT.NONE);
		btnDecToHex.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String inputNo = JOptionPane.showInputDialog("What number would you like to convert?");
				int inputedNo = Integer.parseInt(inputNo);

				Decimal decTohex = new Decimal();
				StringBuilder btH = decTohex.decToBinary(inputedNo);

				String msgBintoDec = "Decimal number : " + inputedNo + "\nConverted to Hexidecimal: " + btH;
				JOptionPane.showMessageDialog(null, msgBintoDec);
			}
		});
		btnDecToHex.setBounds(363, 10, 100, 44);
		btnDecToHex.setText("Dec to Hex");

		Button btnHexToBin = new Button(shlNumberConversionTool, SWT.NONE);
		btnHexToBin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String hex = JOptionPane.showInputDialog("What number would you like to convert?");
				Hexadecimal hextodec = new Hexadecimal();

				// hexToBinary() function
				String hTd = hextodec.hexToBinary(hex);
				String msgHexToBin = "Hexidecimal number : " + hex + "\nConverted to binary: " + hTd;
				JOptionPane.showMessageDialog(null, msgHexToBin);
			}
		});
		btnHexToBin.setBounds(469, 10, 113, 44);
		btnHexToBin.setText("Hex to Bin");

		Button btnHexToDec = new Button(shlNumberConversionTool, SWT.NONE);
		btnHexToDec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String hex = JOptionPane.showInputDialog("What number would you like to convert?");
				Hexadecimal hextodec = new Hexadecimal();

				// hexToDec() function
				int hTd = hextodec.hexToDec(hex);
				String msgHexToBin = "Hexidecimal number : " + hex + "\nConverted to Decimal : " + hTd;
				JOptionPane.showMessageDialog(null, msgHexToBin);

			}
		});
		btnHexToDec.setBounds(588, 10, 113, 44);
		btnHexToDec.setText("Hex to Dec");

	}

}
