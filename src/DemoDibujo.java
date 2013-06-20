import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class DemoDibujo extends JFrame {

	final static Color BG = Color.blue;
	final static Color FG = Color.GREEN;
	
	public void init()
	{
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	DemoDibujo()
	{
		this.init();
		this.setSize(800, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ventanita Pro");
	}
	
	
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
	
		Ellipse2D.Double elip1 = new Ellipse2D.Double(200, 200, 100, 100);
		Ellipse2D.Double elip2 = new Ellipse2D.Double(225, 225, 50, 50);
		//g2.draw(new Ellipse2D.Double(200, 200, 100, 100));
		g2.setPaint(Color.red);
		g2.fill(elip1);
		g2.setPaint(Color.black);
		g2.draw(elip1);
		//g2.draw(new Ellipse2D.Double(225, 225, 50, 50));
		g2.setPaint(Color.black);
		g2.fill(elip2);
		g2.setPaint(Color.black);
		g2.draw(elip2);
		
		g2.draw(new Arc2D.Double(150, 200, 200, 150, 0, 190,Arc2D.OPEN));
		g2.draw(new Arc2D.Double(150, 180, 200, 120, 180, 190,Arc2D.OPEN));
		
		Ellipse2D.Double elip3 = new Ellipse2D.Double(500, 200, 100, 100);
		Ellipse2D.Double elip4 = new Ellipse2D.Double(525, 225, 50, 50);
		g2.setPaint(Color.yellow);
		g2.fill(elip3);
		g2.setPaint(Color.black);
		g2.draw(elip3);
		
		g2.setPaint(Color.black);
		g2.fill(elip4);
		g2.setPaint(Color.black);
		g2.draw(elip4);
		
		g2.draw(new Arc2D.Double(450, 200, 200, 150, 0, 190,Arc2D.OPEN));
		g2.draw(new Arc2D.Double(450, 180, 200, 120, 180, 190,Arc2D.OPEN));
		/*Rectangle2D.Double rect1 = new Rectangle2D.Double(50, 50, 100, 150);
		Rectangle2D.Double rect2 = new Rectangle2D.Double(200,100,100, 150);
		//g2.draw(new Rectangle2D.Double(50, 50, 100, 150));
		g2.setPaint(Color.red);
		g2.fill(rect1);
		g2.setPaint(Color.black);
		g2.draw(rect1);
		
		g2.draw(new Line2D.Double(50,50,200,100));
		
		g2.draw(new Line2D.Double(50,200,200,250));
		
		g2.draw(new Line2D.Double(150,50,300,100));
		
		g2.draw(new Line2D.Double(150,200,300,250));
		
		//g2.draw(new Rectangle2D.Double(200,100, 100, 150));
		g2.setPaint(Color.blue);
		g2.fill(rect2);
		g2.setPaint(Color.black);
		g2.draw(rect2);
	
		for(int i=0;i< 500;i+=3)
		{
			g2.draw(new Line2D.Double(50,50,50,200));
			
			g2.draw(new Line2D.Double(50,50+i,199,199));
			
			g2.draw(new Rectangle2D.Double(50, 50+i, 400, 100));
			
		}
		*/
		
		
	}
}
	