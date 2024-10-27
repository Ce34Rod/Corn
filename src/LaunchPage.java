import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaunchPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton button = new JButton("Start");

	public LaunchPage(){
		JLabel label = new JLabel("Hello");
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		frame.add(label);
	button.setBounds(100,160,200,40);
	button.setFocusable(false);
	button.addActionListener(this);
	frame.add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,400);
	frame.setLayout(null);
	frame.setVisible(true);

	};

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			frame.dispose();

		}
	}



}

