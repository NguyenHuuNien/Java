package userInterface;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI extends JFrame{
	
	public UI() {
		SetUI();
		Open();
	}
	private void SetUI() {
        this.setTitle("Nguyen Huu Nien - 22010504");
		JPanel pnWindows = new JPanel(new GridLayout(3,1));
		
		JPanel pnRow1 = new JPanel(new FlowLayout());
		pnRow1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		pnRow1.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		
		JLabel titleProgram = new JLabel("Quản lý trung tâm ngoại ngữ HyuNie");
		titleProgram.setForeground(Color.BLUE);
		titleProgram.setFont(new Font("Arial", Font.BOLD,20));
		pnRow1.add(titleProgram);
		pnRow1.setBackground(Color.CYAN);
		
		pnWindows.add(pnRow1);
		this.add(pnWindows);
	}
	private void Open() {
		this.setSize(800, 1000);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
	}
}
