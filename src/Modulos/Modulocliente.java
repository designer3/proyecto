package Modulos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Modulos.Cliente;

public class Modulocliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCodigo;
	private JTextField txtEdad;
	private JButton btnIngreso;
	private JButton btnEliminacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulocliente frame = new Modulocliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Modulocliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 21, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(103, 18, 123, 25);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(22, 58, 46, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(103, 55, 123, 25);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(22, 95, 46, 14);
		contentPane.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(103, 92, 123, 25);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(22, 130, 46, 14);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(103, 128, 123, 25);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(22, 169, 46, 14);
		contentPane.add(lblTurno);
		
		JComboBox cboTurno = new JComboBox();
		cboTurno.setModel(new DefaultComboBoxModel(new String[] {"D\u00EDa", "Noche"}));
		cboTurno.setBounds(103, 166, 86, 25);
		contentPane.add(cboTurno);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(22, 205, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No disponible"}));
		cboEstado.setBounds(103, 202, 123, 25);
		contentPane.add(cboEstado);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.addActionListener(this);
		btnIngreso.setBounds(295, 17, 111, 23);
		contentPane.add(btnIngreso);
		
		JButton btnModificacion = new JButton("Modificacion");
		btnModificacion.setBounds(295, 54, 111, 23);
		contentPane.add(btnModificacion);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(295, 91, 111, 23);
		contentPane.add(btnConsulta);
		
		btnEliminacion = new JButton("Eliminacion");
		btnEliminacion.addActionListener(this);
		btnEliminacion.setBounds(295, 125, 111, 25);
		contentPane.add(btnEliminacion);
		
		JButton btnListado = new JButton("Listado");
		btnListado.setBounds(295, 165, 111, 23);
		contentPane.add(btnListado);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminacion) {
			actionPerformedBtnEliminacion(arg0);
		}
		if (arg0.getSource() == btnIngreso) {
			actionPerformedBtnIngreso(arg0);
		}
	}
	
	protected void actionPerformedBtnIngreso(ActionEvent arg0) {
		
		
		
	}
	
	protected void actionPerformedBtnEliminacion(ActionEvent arg0) {
	}
	
	
	//void listado (Cliente c){
	//	imprimir("Código: "+c.getCodigo());
	//	imprimir("Apellido: "+c.getApellido());
	//	imprimir("Nombre: "+c.getNombre());
	//	imprimir("Edad: "+c.getEdad());
	//	imprimir("Turno: "+c.getTurno());
	//	imprimir("Estado: "+c.getEstado());
//	}
//  Métodos tipo void con parámetros
	//void imprimir(String s) {
	//	txtS.append(s + "\n");
//	}
}
