import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;         //creates a theoretical ball (***helps you draw the circle)
	 //components must have an x and y component so it can be moved
	//don't need to make the x and y coordinate for the ball a field b/c JComponent already has these methods -> this class inherits them
   
	public Ball()
	{
		ball = new Ellipse2D.Double(20,20,10,10);    //this ellipse has a location at (20,20), horizontal radius = 10, vertical radius = 10
		//(20,20) is based on where (0,0) of the JComponent
	}

	public void paintCoponent(Graphics g)   //this parameter is always a graphics2D object -> any time you see the paintComponent method overwritten, use 1st line below
	{
		Graphics2D g2 = (Graphics2D) g;    //casts g as a Graphics2D object so you don't have to do it every time
		g2.draw(ball);
	}

}
