package App;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VistaApp extends JPanel {
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

	
	public VistaApp() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 228, 181));
		setLayout(null);
		
		JLabel lblChapaPintura = new JLabel("CHAPA & PINTURA");
		lblChapaPintura.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChapaPintura.setBounds(10, 11, 126, 22);
		add(lblChapaPintura);
		
		JLabel lblMecnica = new JLabel("MEC\u00C1NICA");
		lblMecnica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMecnica.setBounds(290, 15, 72, 14);
		add(lblMecnica);
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVentas.setBounds(565, 15, 53, 14);
		add(lblVentas);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 44, 22, 14);
		add(lblId);
		
		textField = new JTextField();
		textField.setBounds(68, 44, 96, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(10, 86, 48, 14);
		add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 83, 96, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(68, 130, 96, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setBounds(10, 133, 59, 14);
		add(lblApellido);
		
		JLabel lblTelfono = new JLabel("TEL\u00C9FONO:");
		lblTelfono.setBounds(10, 171, 59, 14);
		add(lblTelfono);
		
		textField_3 = new JTextField();
		textField_3.setBounds(68, 168, 96, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton añadirCP = new JButton("A\u00D1ADIR");
		añadirCP.setBackground(new Color(0, 0, 0));
		añadirCP.setForeground(new Color(255, 165, 0));
		añadirCP.setBounds(47, 224, 89, 23);
		add(añadirCP);
		
		JButton buscarCP = new JButton("BUSCAR");
		buscarCP.setBackground(new Color(0, 0, 0));
		buscarCP.setForeground(new Color(255, 140, 0));
		buscarCP.setBounds(47, 265, 89, 23);
		add(buscarCP);
		
		JButton borrarCP = new JButton("BORRAR");
		borrarCP.setBackground(new Color(0, 0, 0));
		borrarCP.setForeground(new Color(255, 69, 0));
		borrarCP.setBounds(47, 309, 89, 23);
		add(borrarCP);
		
		JLabel label = new JLabel("ID:");
		label.setBounds(245, 44, 22, 14);
		add(label);
		
		JLabel label_1 = new JLabel("NOMBRE:");
		label_1.setBounds(245, 86, 48, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("APELLIDO:");
		label_2.setBounds(245, 133, 59, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("TEL\u00C9FONO:");
		label_3.setBounds(245, 171, 59, 14);
		add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 40, 96, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(300, 83, 96, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(300, 130, 96, 20);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(300, 165, 96, 20);
		add(textField_7);
		
		JLabel label_4 = new JLabel("ID:");
		label_4.setBounds(507, 44, 22, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("NOMBRE:");
		label_5.setBounds(507, 86, 48, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("APELLIDO:");
		label_6.setBounds(507, 133, 59, 14);
		add(label_6);
		
		JLabel label_7 = new JLabel("TEL\u00C9FONO:");
		label_7.setBounds(507, 171, 59, 14);
		add(label_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(565, 41, 96, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(565, 83, 96, 20);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(565, 130, 96, 20);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(565, 168, 96, 20);
		add(textField_11);
		
		JButton añadriM = new JButton("A\u00D1ADIR");
		añadriM.setBackground(new Color(0, 0, 0));
		añadriM.setForeground(new Color(255, 165, 0));
		añadriM.setBounds(290, 224, 89, 23);
		add(añadriM);
		
		JButton añadirV = new JButton("A\u00D1ADIR");
		añadirV.setBackground(new Color(0, 0, 0));
		añadirV.setForeground(new Color(255, 165, 0));
		añadirV.setBounds(546, 224, 89, 23);
		add(añadirV);
		
		JButton buscarM = new JButton("BUSCAR");
		buscarM.setBackground(new Color(0, 0, 0));
		buscarM.setForeground(new Color(255, 140, 0));
		buscarM.setBounds(290, 265, 89, 23);
		add(buscarM);
		
		JButton buscarV = new JButton("BUSCAR");
		buscarV.setBackground(new Color(0, 0, 0));
		buscarV.setForeground(new Color(255, 140, 0));
		buscarV.setBounds(546, 265, 89, 23);
		add(buscarV);
		
		JButton borrarM = new JButton("BORRAR");
		borrarM.setBackground(new Color(0, 0, 0));
		borrarM.setForeground(new Color(255, 69, 0));
		borrarM.setBounds(290, 309, 89, 23);
		add(borrarM);
		
		JButton borrarV = new JButton("BORRAR");
		borrarV.setBackground(new Color(0, 0, 0));
		borrarV.setForeground(new Color(255, 69, 0));
		borrarV.setBounds(546, 309, 89, 23);
		add(borrarV);

	}
}
