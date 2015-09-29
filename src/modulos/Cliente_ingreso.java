package modulos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Cliente_ingreso extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					Cliente_ingreso frame = new Cliente_ingreso();
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
	public Cliente_ingreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(21, 21, 390, 220);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	
	void listado (Cliente c){
		imprimir("Código: "+c.getCodigo());
		imprimir("Apellido: "+c.getApellido());
		imprimir("Nombre: "+c.getNombre());
		imprimir("Edad: "+c.getEdad());
		imprimir("Turno: "+c.getTurno());
		imprimir("Estado: "+c.getEstado());
	}
//  Métodos tipo void con parámetros
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
}
