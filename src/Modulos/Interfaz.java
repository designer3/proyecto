package Modulos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import ch.randelshofer.quaqua.QuaquaLookAndFeel;

public class Interfaz extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmCliente;
	private JMenuItem mntmCajero;
	private JMenuItem mntmPlato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		System.setProperty("Quaqua.tabLayoutPolicy", "wrap");
		System.setProperty("Quaqua.design","tiger");
		try {
			UIManager.setLookAndFeel(new QuaquaLookAndFeel());
		} catch (Exception e) {
			System.err.println(e);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public  Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 376);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(this);
		mnMantenimiento.add(mntmCliente);
		
		mntmPlato = new JMenuItem("Plato");
		mntmPlato.addActionListener(this);
		mnMantenimiento.add(mntmPlato);
		
		mntmCajero = new JMenuItem("Cajero");
		mntmCajero.addActionListener(this);
		mnMantenimiento.add(mntmCajero);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmPlato) {
			actionPerformedMntmPlato(arg0);
		}
		if (arg0.getSource() == mntmCajero) {
			actionPerformedMntmCajero(arg0);
		}
		if (arg0.getSource() == mntmCliente) {
			actionPerformedMntmCliente(arg0);
		}
	}
	
	protected void actionPerformedMntmCliente(ActionEvent arg0) {
		Modulocliente cl;
		cl=new Modulocliente();
		cl.setLocationRelativeTo(this);
		cl.setVisible(true);
	}
	
	
	protected void actionPerformedMntmCajero(ActionEvent arg0) {
		Modulocajero cj;
		cj=new Modulocajero();
		cj.setLocationRelativeTo(this);
		cj.setVisible(true);
	}
	
	
	protected void actionPerformedMntmPlato(ActionEvent arg0) {
		Moduloplato pl;
		pl=new Moduloplato();
		pl.setLocationRelativeTo(this);
		pl.setVisible(true);
	}
}
