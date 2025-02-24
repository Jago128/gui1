package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSecundaria extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JButton btnNewButton;



	/**
	 * Create the dialog.
	 */
	public VentanaSecundaria(JFrame parent) {
		super(parent,true);
		setTitle("Segunda Ventana");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(157, 73, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(168, 135, 85, 21);
		getContentPane().add(btnNewButton);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnNewButton.addActionListener(this);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton) {
			String texto= textField.getText();
			try {
				VentanaTres dialog = new VentanaTres(VentanaSecundaria.this,texto);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dispose();
				dialog.setVisible(true);
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
}
