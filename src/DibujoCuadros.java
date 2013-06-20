
	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.geom.Arc2D;
	import java.awt.geom.Ellipse2D;
	import java.awt.geom.Line2D;
	import java.awt.geom.Rectangle2D;

	import javax.swing.JFrame;

	public class DibujoCuadros extends JFrame {

		final static Color BG = Color.blue;
		final static Color FG = Color.black;
		
		public void init()
		{
			this.setBackground(BG);
			this.setForeground(FG);
		}
		
		DibujoCuadros()
		{
			this.init();
			this.setSize(1300, 750);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("Ventanita Pro");
		}
				
		
		public void paint(Graphics g)
		{
			int x=300;
			int y=-30;
			Graphics2D g2 = (Graphics2D)g;
		/*	
			//-------------- CUADRO 1 \\-------------------
			g2.draw(new Line2D.Double(263,97,59,212));
			g2.draw(new Line2D.Double(263,97,335,137));
			g2.draw(new Line2D.Double(335,137,335,176));
			g2.draw(new Line2D.Double(335,176,368,195));
			g2.draw(new Line2D.Double(59,212,107,243));
			
			g2.draw(new Line2D.Double(58,212,58,254));
			g2.draw(new Line2D.Double(58,254,73,264));
			g2.draw(new Line2D.Double(107,243,5,303));
			g2.draw(new Line2D.Double(5,303,39,323));
			
			g2.draw(new Line2D.Double(39,323,145,265));
			g2.draw(new Line2D.Double(145,265,195,292));
			g2.draw(new Line2D.Double(145,265,145,305));
			g2.draw(new Line2D.Double(195,292,195,334));
			
			g2.draw(new Line2D.Double(145,305,195,334));
			g2.draw(new Line2D.Double(195,334,367,238));
			g2.draw(new Line2D.Double(195,292,368,195));
			
			g2.draw(new Line2D.Double(194,250,262,213));
			g2.draw(new Line2D.Double(262,213,196,175));
			g2.draw(new Line2D.Double(196,175,128,212));
			g2.draw(new Line2D.Double(128,212,194,250));
			g2.draw(new Line2D.Double(196,175,196,214));
			g2.draw(new Line2D.Double(196,214,162,233));
			g2.draw(new Line2D.Double(196,214,228,232));
			
			//--------- CUADRO 2 \\	--------------------------
			g2.draw(new Line2D.Double(39,558,95,530));
			g2.draw(new Line2D.Double(95,530,95,490));
			g2.draw(new Line2D.Double(95,490,74,500));
			g2.draw(new Line2D.Double(74,500,74,422));
			
			g2.draw(new Line2D.Double(74,500,74,422));
			g2.draw(new Line2D.Double(74,422,142,384));
			g2.draw(new Line2D.Double(142,384,142,461));
			g2.draw(new Line2D.Double(142,461,108,442));
			g2.draw(new Line2D.Double(108,442,74,460));
			
			g2.draw(new Line2D.Double(108,442,108,402));
			g2.draw(new Line2D.Double(178,480,160,490));
			g2.draw(new Line2D.Double(126,470,298,570));
			
			g2.draw(new Line2D.Double(126,470,141,461));
			g2.draw(new Line2D.Double(5,303,5,538));
			g2.draw(new Line2D.Double(39,323,39,558));
			g2.draw(new Line2D.Double(5,538,39,558));
			g2.draw(new Line2D.Double(178,324,178,480));
			
			//--------- CUADRO 3 \\	--------------------------
			g2.draw(new Line2D.Double(95,490,264,589));
			g2.draw(new Line2D.Double(56,549,56,628));
			g2.draw(new Line2D.Double(56,628,264,748));
			g2.draw(new Line2D.Double(264,589,298,570));
			g2.draw(new Line2D.Double(264,589,264,650));
			
			g2.draw(new Line2D.Double(228,688,228,611));
			g2.draw(new Line2D.Double(228,688,160,645));
			g2.draw(new Line2D.Double(160,645,160,572));
			g2.draw(new Line2D.Double(160,572,228,611));
			
			g2.draw(new Line2D.Double(195,630,195,592));
			g2.draw(new Line2D.Double(195,630,228,648));
			g2.draw(new Line2D.Double(195,630,160,648));
			g2.draw(new Line2D.Double(264,748,264,690));
			g2.draw(new Line2D.Double(264,748,298,730));
			g2.draw(new Line2D.Double(298,730,298,710));
			
			g2.draw(new Line2D.Double(264,690,368,749));
			g2.draw(new Line2D.Double(264,650,368,710));
			g2.draw(new Line2D.Double(368,710,368,749));
			g2.draw(new Line2D.Double(264,650,298,630));
			
			g2.draw(new Line2D.Double(298,630,298,570));
			
			
			//--------- CUADRO 4 \\	--------------------------
			g2.draw(new Line2D.Double(368,710,574,592));
			g2.draw(new Line2D.Double(368,749,574,633));
			g2.draw(new Line2D.Double(574,633,574,592));
			g2.draw(new Line2D.Double(559,583,574,592));
			
			g2.draw(new Line2D.Double(298,590,437,512));
			g2.draw(new Line2D.Double(437,512,454,522));
			
			g2.draw(new Line2D.Double(489,582,506,592));
			g2.draw(new Line2D.Double(506,592,438,631));
			
			g2.draw(new Line2D.Double(438,631,370,592));
			g2.draw(new Line2D.Double(370,592,438,552));
			g2.draw(new Line2D.Double(438,552,454,561));
			g2.draw(new Line2D.Double(454,561,454,522));
			
			g2.draw(new Line2D.Double(438,552,438,591));
			g2.draw(new Line2D.Double(438,591,472,612));
			g2.draw(new Line2D.Double(438,591,403,611));
			
			//--------- CUADRO 5 \\	--------------------------
			g2.draw(new Line2D.Double(542,237,542,355));
			g2.draw(new Line2D.Double(576,218,576,334));
			g2.draw(new Line2D.Double(576,334,626,307));
			
			g2.draw(new Line2D.Double(542,355,489,384));
			g2.draw(new Line2D.Double(489,384,455,364));
			g2.draw(new Line2D.Double(454,364,470,354));
			
			g2.draw(new Line2D.Double(577,295,592,286));
			g2.draw(new Line2D.Double(592,286,626,307));
			
			g2.draw(new Line2D.Double(454,364,454,531));
			g2.draw(new Line2D.Double(489,384,489,582));
			
			g2.draw(new Line2D.Double(626,307,626,544));
			g2.draw(new Line2D.Double(626,544,559,583));
			g2.draw(new Line2D.Double(559,583,524,564));
			g2.draw(new Line2D.Double(524,564,489,582));
			
			g2.draw(new Line2D.Double(524,404,524,483));
			g2.draw(new Line2D.Double(524,483,594,445));
			g2.draw(new Line2D.Double(594,445,594,366));
			g2.draw(new Line2D.Double(594,366,524,404));
			
			g2.draw(new Line2D.Double(594,445,560,425));
			g2.draw(new Line2D.Double(560,425,560,384));
			g2.draw(new Line2D.Double(560,425,524,446));
			
		
			//--------- CUADRO 6 \\	--------------------------
			g2.draw(new Line2D.Double(335,176,335,118));
			g2.draw(new Line2D.Double(335,118,370,100));
			g2.draw(new Line2D.Double(335,118,542,237));
			g2.draw(new Line2D.Double(370,100,576,218));
			
			g2.draw(new Line2D.Double(542,237,576,218));
			g2.draw(new Line2D.Double(334,256,334,276));
			g2.draw(new Line2D.Double(334,276,470,354));
			
			g2.draw(new Line2D.Double(368,195,368,180));
			g2.draw(new Line2D.Double(368,180,437,218));
			g2.draw(new Line2D.Double(437,218,437,293));
			g2.draw(new Line2D.Double(437,293,367,254));
			g2.draw(new Line2D.Double(368,255,368,238));
			g2.draw(new Line2D.Double(368,255,404,234));
			g2.draw(new Line2D.Double(404,234,437,254));
			g2.draw(new Line2D.Double(404,234,404,199));
		
			g2.draw(new Line2D.Double(470,354,506,336));
			g2.draw(new Line2D.Double(506,336,541,355));
			*/
			
			g2.setPaint(Color.green);
			//-------------- CUADRO 1 \\-------------------
			g2.draw(new Line2D.Double(x+263,y+97,x+59,y+212));
			g2.draw(new Line2D.Double(x+263,y+97,x+335,y+137));
			g2.draw(new Line2D.Double(x+335,y+137,x+335,y+176));
			g2.draw(new Line2D.Double(x+335,y+176,x+368,y+195));
			g2.draw(new Line2D.Double(x+59,y+212,x+107,y+243));
			
			g2.draw(new Line2D.Double(x+58,y+212,x+58,y+254));
			g2.draw(new Line2D.Double(x+58,y+254,x+73,y+264));
			g2.draw(new Line2D.Double(x+107,y+243,x+5,y+303));
			g2.draw(new Line2D.Double(x+5,y+303,x+39,y+323));
			
			g2.draw(new Line2D.Double(x+39,y+323,x+145,y+265));
			g2.draw(new Line2D.Double(x+145,y+265,x+195,y+292));
			g2.draw(new Line2D.Double(x+145,y+265,x+145,y+305));
			g2.draw(new Line2D.Double(x+195,y+292,x+195,y+334));
			
			g2.draw(new Line2D.Double(x+145,y+305,x+195,y+334));
			g2.draw(new Line2D.Double(x+195,y+334,x+367,y+238));
			g2.draw(new Line2D.Double(x+195,y+292,x+368,y+195));
			
			g2.draw(new Line2D.Double(x+194,y+250,x+262,y+213));
			g2.draw(new Line2D.Double(x+262,y+213,x+196,y+175));
			g2.draw(new Line2D.Double(x+196,y+175,x+128,y+212));
			g2.draw(new Line2D.Double(x+128,y+212,x+194,y+250));
			g2.draw(new Line2D.Double(x+196,y+175,x+196,y+214));
			g2.draw(new Line2D.Double(x+196,y+214,x+162,y+233));
			g2.draw(new Line2D.Double(x+196,y+214,x+228,y+232));
			
			g2.setPaint(Color.blue);
			//--------- CUADRO 2 \\	--------------------------
			g2.draw(new Line2D.Double(x+39,y+558,x+95,y+530));
			g2.draw(new Line2D.Double(x+95,y+530,x+95,y+490));
			g2.draw(new Line2D.Double(x+95,y+490,x+74,y+500));
			g2.draw(new Line2D.Double(x+74,y+500,x+74,y+422));
			
			g2.draw(new Line2D.Double(x+74,y+500,x+74,y+422));
			g2.draw(new Line2D.Double(x+74,y+422,x+142,y+384));
			g2.draw(new Line2D.Double(x+142,y+384,x+142,y+461));
			g2.draw(new Line2D.Double(x+142,y+461,x+108,y+442));
			g2.draw(new Line2D.Double(x+108,y+442,x+74,y+460));
			
			g2.draw(new Line2D.Double(x+108,y+442,x+108,y+402));
			g2.draw(new Line2D.Double(x+178,y+480,x+160,y+490));
			g2.draw(new Line2D.Double(x+126,y+470,x+298,y+570));
			
			g2.draw(new Line2D.Double(x+126,y+470,x+141,y+461));
			g2.draw(new Line2D.Double(x+5,y+303,x+5,y+538));
			g2.draw(new Line2D.Double(x+39,y+323,x+39,y+558));
			g2.draw(new Line2D.Double(x+5,y+538,x+39,y+558));
			g2.draw(new Line2D.Double(x+178,y+324,x+178,y+480));
			
			g2.setPaint(Color.pink);
			//--------- CUADRO 3 \\	--------------------------
			g2.draw(new Line2D.Double(x+95,y+490,x+264,y+589));
			g2.draw(new Line2D.Double(x+56,y+549,x+56,y+628));
			g2.draw(new Line2D.Double(x+56,y+628,x+264,y+748));
			g2.draw(new Line2D.Double(x+264,y+589,x+298,y+570));
			g2.draw(new Line2D.Double(x+264,y+589,x+264,y+650));
			
			g2.draw(new Line2D.Double(x+228,y+688,x+228,y+611));
			g2.draw(new Line2D.Double(x+228,y+688,x+160,y+645));
			g2.draw(new Line2D.Double(x+160,y+645,x+160,y+572));
			g2.draw(new Line2D.Double(x+160,y+572,x+228,y+611));
			
			g2.draw(new Line2D.Double(x+195,y+630,x+195,y+592));
			g2.draw(new Line2D.Double(x+195,y+630,x+228,y+648));
			g2.draw(new Line2D.Double(x+195,y+630,x+160,y+648));
			g2.draw(new Line2D.Double(x+264,y+748,x+264,y+690));
			g2.draw(new Line2D.Double(x+264,y+748,x+298,y+730));
			g2.draw(new Line2D.Double(x+298,y+730,x+298,y+710));
			
			g2.draw(new Line2D.Double(x+264,y+690,x+368,y+749));
			g2.draw(new Line2D.Double(x+264,y+650,x+368,y+710));
			g2.draw(new Line2D.Double(x+368,y+710,x+368,y+749));
			g2.draw(new Line2D.Double(x+264,y+650,x+298,y+630));
			
			g2.draw(new Line2D.Double(x+298,y+630,x+298,y+570));
			
			g2.setPaint(Color.red);
			//--------- CUADRO 4 \\	--------------------------
			g2.draw(new Line2D.Double(x+368,y+710,x+574,y+592));
			g2.draw(new Line2D.Double(x+368,y+749,x+574,y+633));
			g2.draw(new Line2D.Double(x+574,y+633,x+574,y+592));
			g2.draw(new Line2D.Double(x+559,y+583,x+574,y+592));
			
			g2.draw(new Line2D.Double(x+298,y+590,x+437,y+512));
			g2.draw(new Line2D.Double(x+437,y+512,x+454,y+522));
			
			g2.draw(new Line2D.Double(x+489,y+582,x+506,y+592));
			g2.draw(new Line2D.Double(x+506,y+592,x+438,y+631));
			
			g2.draw(new Line2D.Double(x+438,y+631,x+370,y+592));
			g2.draw(new Line2D.Double(x+370,y+592,x+438,y+552));
			g2.draw(new Line2D.Double(x+438,y+552,x+454,y+561));
			g2.draw(new Line2D.Double(x+454,y+561,x+454,y+522));
			
			g2.draw(new Line2D.Double(x+438,y+552,x+438,y+591));
			g2.draw(new Line2D.Double(x+438,y+591,x+472,y+612));
			g2.draw(new Line2D.Double(x+438,y+591,x+403,y+611));
			
			g2.setPaint(Color.yellow);
			//--------- CUADRO 5 \\	--------------------------
			g2.draw(new Line2D.Double(x+542,y+237,x+542,y+355));
			g2.draw(new Line2D.Double(x+576,y+218,x+576,y+334));
			g2.draw(new Line2D.Double(x+576,y+334,x+626,y+307));
			
			g2.draw(new Line2D.Double(x+542,y+355,x+489,y+384));
			g2.draw(new Line2D.Double(x+489,y+384,x+455,y+364));
			g2.draw(new Line2D.Double(x+454,y+364,x+470,y+354));
			
			g2.draw(new Line2D.Double(x+577,y+295,x+592,y+286));
			g2.draw(new Line2D.Double(x+592,y+286,x+626,y+307));
			
			g2.draw(new Line2D.Double(x+454,y+364,x+454,y+531));
			g2.draw(new Line2D.Double(x+489,y+384,x+489,y+582));
			
			g2.draw(new Line2D.Double(x+626,y+307,x+626,y+544));
			g2.draw(new Line2D.Double(x+626,y+544,x+559,y+583));
			g2.draw(new Line2D.Double(x+559,y+583,x+524,y+564));
			g2.draw(new Line2D.Double(x+524,y+564,x+489,y+582));
			
			g2.draw(new Line2D.Double(x+524,y+404,x+524,y+483));
			g2.draw(new Line2D.Double(x+524,y+483,x+594,y+445));
			g2.draw(new Line2D.Double(x+594,y+445,x+594,y+366));
			g2.draw(new Line2D.Double(x+594,y+366,x+524,y+404));
			
			g2.draw(new Line2D.Double(x+594,y+445,x+560,y+425));
			g2.draw(new Line2D.Double(x+560,y+425,x+560,y+384));
			g2.draw(new Line2D.Double(x+560,y+425,x+524,y+446));
			
			g2.setPaint(Color.gray);
			//--------- CUADRO 6 \\	--------------------------
			g2.draw(new Line2D.Double(x+335,y+176,x+335,y+118));
			g2.draw(new Line2D.Double(x+335,y+118,x+370,y+100));
			g2.draw(new Line2D.Double(x+335,y+118,x+542,y+237));
			g2.draw(new Line2D.Double(x+370,y+100,x+576,y+218));
			
			g2.draw(new Line2D.Double(x+542,y+237,x+576,y+218));
			g2.draw(new Line2D.Double(x+334,y+256,x+334,y+276));
			g2.draw(new Line2D.Double(x+334,y+276,x+470,y+354));
			
			g2.draw(new Line2D.Double(x+368,y+195,x+368,y+180));
			g2.draw(new Line2D.Double(x+368,y+180,x+437,y+218));
			g2.draw(new Line2D.Double(x+437,y+218,x+437,y+293));
			g2.draw(new Line2D.Double(x+437,y+293,x+367,y+254));
			g2.draw(new Line2D.Double(x+368,y+255,x+368,y+238));
			g2.draw(new Line2D.Double(x+368,y+255,x+404,y+234));
			g2.draw(new Line2D.Double(x+404,y+234,x+437,y+254));
			g2.draw(new Line2D.Double(x+404,y+234,x+404,y+199));
		
			g2.draw(new Line2D.Double(x+470,y+354,x+506,y+336));
			g2.draw(new Line2D.Double(x+506,y+336,x+541,y+355));
			
			
		}
	}

