package org.Iteracion4.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.Iteracion4.dao.DriverDao;

import java.awt.event.ActionListener;
import java.sql.Driver;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTable MiTabla;
	private JTextArea taFilaSeleccionada;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(33, 52, 362, 65);
				panel.add(scrollPane);
				{
					MiTabla = new JTable();
					scrollPane.setColumnHeaderView(MiTabla);
					MiTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					modeloTabla modeloTabla =new modeloTabla();
					MiTabla.setRowHeight(40);

					MiTabla.setModel(modeloTabla);
					Object[] fila1= {1,"pepe","tragon","13456654"};
					Object[] fila2= {2,"pepite","ttataon","1365454"};
					modeloTabla.aniadeFila(fila1);
					modeloTabla.aniadeFila(fila2);
					
					ListSelectionModel rowSM = MiTabla.getSelectionModel();
					rowSM.addListSelectionListener(new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent e) {
								ListSelectionModel lsm = (ListSelectionModel) e.getSource();
								if (!lsm.isSelectionEmpty()) {
										//int filaSeleccionada = lsm.getMinSelectionIndex() + 1;
										//taFilaSeleccionada.setText("Fila "+filaSeleccionada+" seleccionada");
										modeloTabla modeloTabla = (modeloTabla) MiTabla.getModel();
										int n= MiTabla.getSelectedRow();
										if (n != -1)
												{
												String contenido = "id: "+modeloTabla.getValueAt(n, 0)+"\n"+"nombre: "+modeloTabla.getValueAt(n, 1)+"\n"+"apellido: "+modeloTabla.getValueAt(n, 2)+"\n"+"Dni: "+modeloTabla.getValueAt(n, 3)+"\n"; //$NON-NLS-1$ //$NON-NLS-2$
												taFilaSeleccionada.setText(contenido);
												
												}
								}
								
								}
					});
				}
			}
			{
				btnNewButton = new JButton("Detener Radar");
				btnNewButton.addActionListener(new BtnNewButtonActionListener());
				btnNewButton.setEnabled(false);
				btnNewButton.setBounds(256, 11, 118, 23);
				panel.add(btnNewButton);
			}
			{
				btnNewButton_1 = new JButton("Arrancar Radar");
				btnNewButton_1.addActionListener(new BtnNewButton_1ActionListener());
				btnNewButton_1.setBounds(67, 11, 118, 23);
				panel.add(btnNewButton_1);
			}
			{
				btnNewButton_2 = new JButton("Cambiar Propietario");
				btnNewButton_2.addActionListener(new BtnNewButton_2ActionListener());
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.setBounds(33, 205, 118, 23);
				panel.add(btnNewButton_2);
			}
			{
				btnNewButton_3 = new JButton("Salir");
				btnNewButton_3.addActionListener(new BtnNewButton_3ActionListener());
				btnNewButton_3.setBounds(294, 205, 118, 23);
				panel.add(btnNewButton_3);
			}
			{
				taFilaSeleccionada = new JTextArea();
				taFilaSeleccionada.setBounds(33, 128, 362, 65);
				panel.add(taFilaSeleccionada);
			}
			{
				btnNewButton_4 = new JButton("Pagar");
				btnNewButton_4.setEnabled(false);
				btnNewButton_4.addActionListener(new BtnNewButton_4ActionListener());
				btnNewButton_4.setBounds(181, 205, 89, 23);
				panel.add(btnNewButton_4);
			}
		}
	}
	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			btnNewButton.setEnabled(true);
			btnNewButton_2.setEnabled(true);
			btnNewButton_1.setEnabled(false);
			btnNewButton_4.setEnabled(true);
		}
	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnNewButton_1.setEnabled(true);
			btnNewButton_2.setEnabled(false);
			btnNewButton.setEnabled(false);
			btnNewButton_4.setEnabled(false);
		}
	}
	private class BtnNewButton_2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
	private class BtnNewButton_4ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
	private class BtnNewButton_3ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}
}
