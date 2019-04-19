import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class sentence extends JFrame implements ActionListener {
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
				sentence frame =new sentence();
				frame.setSize(700,1000);
				frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JTextArea textField;
	private JTextArea textField_1;
	public sentence() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 682, 953);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("\uBD84\uD560");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					String text =textField.getText();
					
					int start =0;
					int end =50;;
					int j=1;
					for(int i=50; end<text.length(); i+=50) {
						String sentence =text.substring(start,end);
						String sentence2 =sentence.substring(sentence.lastIndexOf("/")+1);
						String sentence3 =sentence.replace(sentence2, "");
						System.out.println(sentence3.length());
						textField_1.append(j+"¹øÂ° °ª:"+sentence3+"\n");
						j++;
						start +=sentence3.length();
						end +=sentence3.length();
					} 
				
					
					
					
//					for(int i=0; i<4; i++) {
//						String result =text.substring(first,end);
//						
//						String result2 =result.substring(result.lastIndexOf("/")+1);
//						
//						String lastresult =result.replace(result2,""); 
//						textField_1.setText(lastresult+"\n"+lastresult.length());
//						first =first+50;
//						end =end+50;
//					}
					
					
					
					
					
//					String result =text.substring(first,end);
//					
//					String lastresult =result.replace(result2,""); 
//					textField_1.setText(lastresult);
//					
//					System.out.println(text.length());
//					first =first+50;
//					end =end+50;
					
			}
		});
		btn1.setBounds(14, 0, 250, 60);
		panel.add(btn1);
		
		JButton btn2 = new JButton("\uC0C8\uB85C\uACE0\uCE68");
		btn2.setBounds(358, 0, 287, 60);
		panel.add(btn2);
		
		textField = new JTextArea(); 
		textField.setLineWrap(true);
//		JScrollPane scroll = new JScrollPane(textField);
//		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(textField);
		textField.setBounds(14, 84, 654, 261);
		textField.setColumns(10);
		
		textField_1 = new JTextArea();
		textField_1.setBounds(14, 399, 654, 526);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC785\uB825");
		lblNewLabel.setBounds(37, 95, 62, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD9C\uB825");
		lblNewLabel_1.setBounds(316, 369, 62, 18);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uC785\uB825");
		label.setBounds(304, 59, 62, 18);
		panel.add(label);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
