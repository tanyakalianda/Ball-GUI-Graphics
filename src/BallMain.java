import javax.swing.JFrame;

public class BallMain 
{

	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(100,100,600,600);

		Ball myBall = new Ball();
		myBall.setBounds(30,30,100,100);		 //Ball class inherits LOTS of methods through extending JComponent
		myBall.add(myBall);
		
		
		myFrame.setVisible(true);;
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
