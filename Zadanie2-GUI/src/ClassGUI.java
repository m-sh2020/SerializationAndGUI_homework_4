
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassGUI implements ActionListener {
	JTextField textfield;

	ClassGUI() {

		JFrame frame = new JFrame("Простое приложение с кнопкой");
		frame.setSize(350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JLabel label = new JLabel("Вывод случайного вещественного числа от 0 до 100:");
		JButton button = new JButton("Сгенерировать число");
		textfield = new JTextField(" ", 20);

		frame.add(panel);
		panel.add(label);
		panel.add(button);
		panel.add(textfield);

		button.addActionListener(this);
		textfield.setEditable(false);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		textfield.setText(Double.toString((Math.random() * 101)));
	}
}
