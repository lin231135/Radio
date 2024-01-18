import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import java.awt.Button;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class RadioView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioController controller = new RadioController();
					RadioView frame = new RadioView();
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
	public RadioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750 , 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(182, 183, 164));
		panel.setBounds(250, 186, 220, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel EmisoraLabel = new JLabel("81.9 FM");
		EmisoraLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 23));
		EmisoraLabel.setBounds(61, 11, 134, 49);
		panel.add(EmisoraLabel);

		JSlider SliderAM = new JSlider();
		SliderAM.setEnabled(false);
		SliderAM.setPaintTicks(true);
		SliderAM.setMajorTickSpacing(10); // Establece el intervalo de los ticks en 10
		SliderAM.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        int sliderValue = SliderAM.getValue();
		        int emisora = (sliderValue / 10) * 10 + 530; // Mueve de 10 en 10 en el rango de 530 a 1610
		        EmisoraLabel.setText(String.format("%d AM", emisora));
		    }
		});

		SliderAM.setBackground(new Color(33, 20, 17));
		SliderAM.setBounds(176, 277, 369, 26);
		contentPane.add(SliderAM);

		JSlider SliderFM = new JSlider();
		SliderFM.setEnabled(false);
		SliderFM.setPaintTicks(true);
		SliderFM.setMajorTickSpacing(2); // Establece el intervalo de los ticks en 2 (0.2 * 10)
		SliderFM.addChangeListener(new ChangeListener() {
		    public void stateChanged(ChangeEvent e) {
		        double fmValue = SliderFM.getValue() / 10.0;
		        EmisoraLabel.setText(String.format("%.1f FM", fmValue));
		    }
		});

		SliderFM.setForeground(new Color(255, 255, 255));
		SliderFM.setBackground(new Color(33, 20, 17));
		SliderFM.setBounds(176, 335, 369, 26);
		contentPane.add(SliderFM);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBounds(270, 437, 180, 50);
		contentPane.add(menuBar);
		
		Button Btn1 = new Button();
		Btn1.setEnabled(false);
		Btn1.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn1);
		
		Button Btn2 = new Button();
		Btn2.setEnabled(false);
		Btn2.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn2);
		
		Button Btn3 = new Button();
		Btn3.setEnabled(false);
		Btn3.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn3);
		
		Button Btn4 = new Button();
		Btn4.setEnabled(false);
		Btn4.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn4);
		
		Button Btn5 = new Button();
		Btn5.setEnabled(false);
		Btn5.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn5);
		
		Button Btn6 = new Button();
		Btn6.setEnabled(false);
		Btn6.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn6);
		
		Button Btn7 = new Button();
		Btn7.setEnabled(false);
		Btn7.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn7);
		
		Button Btn8 = new Button();
		Btn8.setEnabled(false);
		Btn8.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn8);
		
		Button Btn9 = new Button();
		Btn9.setEnabled(false);
		Btn9.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn9);
		
		Button Btn10 = new Button();
		Btn10.setEnabled(false);
		Btn10.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn10);
		
		Button Btn11 = new Button();
		Btn11.setEnabled(false);
		Btn11.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn11);
		
		Button Btn12 = new Button();
		Btn12.setEnabled(false);
		Btn12.setBackground(new Color(253, 215, 165));
		menuBar.add(Btn12);
		
		JLabel MarcaLabel = new JLabel("Marca");
		MarcaLabel.setFont(new Font("Magneto", Font.PLAIN, 24));
		MarcaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MarcaLabel.setBounds(58, 45, 119, 35);
		contentPane.add(MarcaLabel);
		
		RadioController controller = new RadioController();
		
		Button BtnBajarVol = new Button("-");
		BtnBajarVol.setEnabled(false);
		BtnBajarVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controller.getVolumen() == 1){
					EmisoraLabel.setText("Vol Min");
				}else{
				controller.setVolumen(controller.getVolumen() - 1);
				EmisoraLabel.setText("Vol. " + controller.getVolumen());
				}
			}
		});
		BtnBajarVol.setBackground(new Color(253, 215, 165));
		BtnBajarVol.setFont(new Font("Magneto", Font.PLAIN, 32));
		BtnBajarVol.setBounds(632, 335, 40, 20);
		contentPane.add(BtnBajarVol);
		
		Button BtnSubirVol = new Button("+");
		BtnSubirVol.setEnabled(false);
		BtnSubirVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controller.getVolumen() == 30){
					EmisoraLabel.setText("Vol Max");
				}else{
					controller.setVolumen(controller.getVolumen() + 1);
					EmisoraLabel.setText("Vol. " + controller.getVolumen());
				}
			}
		});
		BtnSubirVol.setBackground(new Color(253, 215, 165));
		BtnSubirVol.setFont(new Font("Magneto", Font.PLAIN, 32));
		BtnSubirVol.setBounds(632, 309, 40, 20);
		contentPane.add(BtnSubirVol);
		
		JToggleButton AMToggleButton = new JToggleButton("");
		AMToggleButton.setEnabled(false);
		AMToggleButton.setBackground(new Color(253, 215, 165));
		AMToggleButton.setBounds(550, 280, 40, 23);
		contentPane.add(AMToggleButton);
		
		JToggleButton FMToggleButton = new JToggleButton("");
		FMToggleButton.setEnabled(false);
		FMToggleButton.setBackground(new Color(253, 215, 165));
		FMToggleButton.setBounds(550, 338, 40, 23);
		contentPane.add(FMToggleButton);
		
		AMToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
                if (AMToggleButton.isSelected()) {
                    FMToggleButton.setSelected(false);
                    SliderAM.setEnabled(true);
                    SliderFM.setEnabled(false);
                    
                    int sliderValue = SliderAM.getValue();
    		        int emisora = (sliderValue / 1) + 550;
    		        EmisoraLabel.setText(String.format("%d AM", emisora));
                }
            }
		});
		
		FMToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
                if (FMToggleButton.isSelected()) {
                    AMToggleButton.setSelected(false);
                    SliderFM.setEnabled(true);
                    SliderAM.setEnabled(false);
                    
                    EmisoraLabel.setText(String.format("%.1f FM", SliderFM.getValue() / 10.0));
                }
            }
		});
		
		JToggleButton PowerToggleButton = new JToggleButton("");
		PowerToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				RadioController controller = new RadioController();
				if (PowerToggleButton.isSelected()) {
					EmisoraLabel.setText("ON");
					EmisoraLabel.setEnabled(true);
					SliderAM.setEnabled(true);
					SliderFM.setEnabled(true);
					menuBar.setEnabled(true);
					Btn1.setEnabled(true);
					Btn2.setEnabled(true);
					Btn3.setEnabled(true);
					Btn4.setEnabled(true);
					Btn5.setEnabled(true);
					Btn6.setEnabled(true);
					Btn7.setEnabled(true);
					Btn8.setEnabled(true);
					Btn9.setEnabled(true);
					Btn10.setEnabled(true);
					Btn11.setEnabled(true);
					Btn12.setEnabled(true);
					BtnSubirVol.setEnabled(true);
					BtnBajarVol.setEnabled(true);
					AMToggleButton.setEnabled(true);
					FMToggleButton.setEnabled(true);
					controller.setEncendido(true);
				}else{
					EmisoraLabel.setText("OFF");
					EmisoraLabel.setEnabled(false);
					SliderAM.setEnabled(false);
					SliderFM.setEnabled(false);
					menuBar.setEnabled(false);
					Btn1.setEnabled(false);
					Btn2.setEnabled(false);
					Btn3.setEnabled(false);
					Btn4.setEnabled(false);
					Btn5.setEnabled(false);
					Btn6.setEnabled(false);
					Btn7.setEnabled(false);
					Btn8.setEnabled(false);
					Btn9.setEnabled(false);
					Btn10.setEnabled(false);
					Btn11.setEnabled(false);
					Btn12.setEnabled(false);
					BtnSubirVol.setEnabled(false);
					BtnBajarVol.setEnabled(false);
					AMToggleButton.setEnabled(false);
					FMToggleButton.setEnabled(false);
					controller.setEncendido(false);
				}
			}
		});
		
		PowerToggleButton.setBackground(new Color(253, 215, 165));
		PowerToggleButton.setBounds(64, 316, 47, 26);
		contentPane.add(PowerToggleButton);
		
		JLabel FondoTablero = new JLabel("");
		FondoTablero.setBackground(Color.WHITE);
		FondoTablero.setIcon(new ImageIcon("tablero.png"));
		FondoTablero.setBounds(0, 0, 734 , 487);
		contentPane.add(FondoTablero);
	}
}