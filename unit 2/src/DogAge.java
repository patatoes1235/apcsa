import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;

public class DogAge extends JFrame implements ActionListener {
	public int convertToHumanAge(int dogAge) {
		return (int)((16.0/3) * (dogAge-1) + 13);
	}
	JTextField inputDogAge, displayHumanAge;

	public DogAge() {
		super("BMI Calculator");
		JLabel labelDogAge = new JLabel("Dog Age", SwingConstants.RIGHT);
		inputDogAge = new JTextField(5);
		JLabel labelHumanAge = new JLabel("Human Age = ", SwingConstants.RIGHT);
		displayHumanAge = new JTextField(5);
		displayHumanAge.setEditable(false);
		JButton go = new JButton("Compute");
		go.addActionListener(this);

		Container c = getContentPane();
		c.setBackground(Color.white);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5));
		p.add(labelDogAge);
		p.add(inputDogAge);
		p.add(labelHumanAge);
		p.add(displayHumanAge);
		c.add(p, BorderLayout.CENTER);
		c.add(go, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		int dogAge = Integer.parseInt(inputDogAge.getText());
		double humanConversion = convertToHumanAge(dogAge);
		DecimalFormat df = new DecimalFormat("00");
		displayHumanAge.setText(df.format(humanConversion));
	}
	public static void main(String[] args) {
		DogAge w = new DogAge();
		w.setBounds(300, 300, 300, 160);
		w.setDefaultCloseOperation(EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}
