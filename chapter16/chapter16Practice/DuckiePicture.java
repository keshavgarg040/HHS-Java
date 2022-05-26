package chapter16Practice;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class DuckiePicture extends JPanel {

    private static final long serialVersionUID = 1L;
    static JFrame f1;
    static DuckiePicture duckiePanel;
    static Toolkit tk;

    JLabel coordLabel = new JLabel();
    static int frameWidth = 1030, frameHeight = 550;
    static BufferedImage bImage;
    BufferedImage unicornImage, unicorn1Image, rainbowImage;
    int x, y;
    Font coordFont = new Font("HoboSTD", Font.BOLD, 12);

    public DuckiePicture() {
	setBackground(new Color(127, 70, 240));
	coordLabel.setFont(coordFont);
	coordLabel.setForeground(Color.WHITE);
	add(coordLabel);

	// add a mouse motion listener to update x/y coordinates as the mouse moves
	addMouseMotionListener(new MouseMotionAdapter() {
	    public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		coordLabel.setText(x + ", " + y);
		coordLabel.repaint();
	    }
	});

	// make the cursor a crosshari shape
	// this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }

    public GeneralPath drawHeart(double adjustSize, double adjustX, double adjustY) {
	double y;
	GeneralPath heartPath = new GeneralPath();

	for (double i = -2; i <= 2; i += .001) {
	    y = -Math.sqrt(1 - Math.pow((Math.abs(i) - 1), 2));
	    if (i == -2) {
		heartPath.moveTo(((i * adjustSize + 250) * .1) + adjustX, ((y * adjustSize + 200) * .1) + adjustY);
	    }
	    heartPath.lineTo(((i * adjustSize + 250) * .1) + adjustX, ((y * adjustSize + 200) * .1) + adjustY);
	}

	for (double i = -2; i <= 2; i += .001) {
	    y = 3 * (Math.sqrt(1 - ((Math.sqrt(Math.abs(i)) / Math.sqrt(2)))));
	    if (i == -2) {
		heartPath.moveTo(((i * adjustSize + 250) * .1) + adjustX, ((y * adjustSize + 200) * .1) + adjustY);
	    }
	    heartPath.lineTo(((i * adjustSize + 250) * .1) + adjustX, ((y * adjustSize + 200) * .1) + adjustY);
	}
	return heartPath;
    }

    public void drawStar(int scaleFactor, int xMove, int yMove) {
	int[] xStarPoints = { (xMove + 74) * scaleFactor, (xMove + 84) * scaleFactor, (xMove + 124) * scaleFactor,
		(xMove + 90) * scaleFactor, (xMove + 104) * scaleFactor, (xMove + 74) * scaleFactor,
		(xMove + 43) * scaleFactor, (xMove + 58) * scaleFactor, (xMove + 25) * scaleFactor,
		(xMove + 64) * scaleFactor };
	int[] yStarPoints = { (yMove + 24) * scaleFactor, (yMove + 64) * scaleFactor, (yMove + 64) * scaleFactor,
		(yMove + 85) * scaleFactor, (yMove + 124) * scaleFactor, (yMove + 99) * scaleFactor,
		(yMove + 125) * scaleFactor, (yMove + 84) * scaleFactor, (yMove + 64) * scaleFactor,
		(yMove + 65) * scaleFactor };

	Graphics g = getGraphics();
	Graphics2D gr2D = (Graphics2D) (g);

	try {
	    rainbowImage = ImageIO.read(new FileInputStream(
		    "U:\\Computer Science\\Java\\Java Workspace\\chapter16\\src\\chapter16Practice\\rainbowtexture.png"));
	} catch (IOException ex) {
	    JOptionPane.showMessageDialog(null, ex);
	}
	int randFill = (int) (Math.random() * 2);
	if (randFill == 0) {
	    gr2D.setPaint(new GradientPaint(447, 236, Color.RED, 482, 236, Color.YELLOW, true));
	} else {
	    Rectangle r = new Rectangle(0, 0, 5, 5);
	    gr2D.setPaint(new TexturePaint(rainbowImage, r));
	}
	gr2D.fillPolygon(xStarPoints, yStarPoints, xStarPoints.length);
    }

    public void paintComponent(Graphics gr) {
	super.paintComponent(gr);
	Graphics2D gr2D = (Graphics2D) (gr);

	GeneralPath duckiePath = new GeneralPath();
	GeneralPath duckBillPath = new GeneralPath();
	int x = 300;
	int[] xPoints = { 143 + x, 162 + x, 162 + x, 170 + x, 174 + x, 173 + x, 172 + x, 190 + x, 191 + x, 196 + x,
		195 + x, 199 + x, 200 + x, 202 + x, 199 + x, 193 + x, 191 + x, 197 + x, 227 + x, 243 + x, 277 + x,
		299 + x, 313 + x, 324 + x, 339 + x, 352 + x, 360 + x, 347 + x, 386 + x, 364 + x, 397 + x, 373 + x,
		383 + x, 382 + x, 381 + x, 371 + x, 353 + x, 339 + x, 321 + x, 307 + x, 283 + x, 268 + x, 199 + x,
		142 + x, 121 + x, 107 + x, 95 + x, 87 + x, 80 + x, 83 + x, 91 + x, 73 + x, 69 + x, 70 + x, 78 + x,
		84 + x, 100 + x, 130 + x, 144 + x, 143 + x };
	int[] yPoints = { 3, 19, 27, 13, 25, 23, 35, 23, 37, 55, 81, 95, 102, 116, 133, 156, 171, 172, 168, 166, 168,
		174, 182, 188, 161, 144, 137, 181, 146, 188, 176, 211, 263, 292, 295, 327, 349, 362, 372, 379, 381, 381,
		381, 381, 370, 355, 340, 322, 295, 255, 212, 129, 92, 88, 67, 60, 46, 33, 19, 3 };

	int[] xBillPoints = { 74 + x, 83 + x, 86 + x, 104 + x, 112 + x, 128 + x, 131 + x, 140 + x, 155 + x, 160 + x,
		165 + x, 169 + x, 158 + x, 144 + x, 115 + x, 90 + x, 72 + x, 48 + x, 56 + x, 58 + x, 41 + x, 19 + x,
		8 + x, 6 + x, 9 + x, 12 + x, 27 + x, 36 + x, 51 + x, 66 + x, 74 + x };
	int[] yBillPoints = { 130, 120, 108, 109, 113, 127, 135, 136, 141, 148, 157, 160, 180, 193, 205, 209, 208, 204,
		196, 190, 185, 173, 161, 150, 149, 150, 152, 151, 145, 137, 130 };

	// creates the border using gradient
	gr2D.setPaint(new GradientPaint(10, 10, Color.RED, 397, 381, new Color(42, 161, 250), true));
	gr2D.fillRect(0, 0, frameWidth, 20);
	gr2D.fill(new Rectangle(0, frameHeight - 57, frameWidth, 20));
	gr2D.fillRect(0, 0, 20, frameHeight);
	gr2D.fill(new Rectangle(frameWidth - 35, 0, 23, frameHeight));

	// draws the duck
	gr2D.setColor(new Color(255, 153, 0));
	BasicStroke aStroke = new BasicStroke(5.0f);
	gr2D.setStroke(aStroke);
	duckiePath.moveTo(xPoints[0], yPoints[0]);
	for (int i = 1; i < xPoints.length; ++i) {
	    duckiePath.lineTo(xPoints[i], yPoints[i]);
	}
	duckiePath.closePath();
	gr2D.draw(duckiePath);
	gr2D.setPaint(new GradientPaint(10, 10, new Color(255, 255, 153), 397, 381, new Color(255, 140, 1), true));
	gr2D.fill(duckiePath);

	// draws the duck's bill
	gr2D.setColor(new Color(255, 153, 0));
	aStroke = new BasicStroke(10.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
	gr2D.setStroke(aStroke);
	duckBillPath.moveTo(xBillPoints[0], yBillPoints[0]);
	for (int i = 1; i < xBillPoints.length; ++i) {
	    duckBillPath.lineTo(xBillPoints[i], yBillPoints[i]);
	}
	duckBillPath.closePath();
	gr2D.draw(duckBillPath);
	gr2D.setPaint(new GradientPaint(0, 144, new Color(250, 101, 0), 167, 158, new Color(255, 153, 0), true));
	gr2D.fill(duckBillPath);

	// Eyes - black part
	gr2D.setColor(Color.BLACK);
	gr2D.fillOval(70 + x, 79, 15, 35);
	gr2D.fillOval(130 + x, 79, 20, 40);

	// Eyes - red part
	gr2D.setColor(Color.RED);
	gr2D.fillOval(73 + x, 94, 8, 12);
	gr2D.fillOval(135 + x, 97, 8, 12);

	// Draws the heart
	aStroke = new BasicStroke(0.0f);
	gr2D.setStroke(aStroke);
	gr2D.setPaint(new GradientPaint(447, 236, new Color(255, 205, 225), 482, 236, new Color(255, 0, 102), true));
	GeneralPath heart = drawHeart(100, 240 + x, 215);
	gr2D.draw(heart);
	gr2D.fill(heart);

	try {
	    int unicornY = 25;
	    unicornImage = ImageIO.read(new FileInputStream(
		    "U:\\Computer Science\\Java\\Java Workspace\\chapter16\\src\\chapter16Practice\\unicorn.png"));
	    unicorn1Image = ImageIO.read(new FileInputStream(
		    "U:\\Computer Science\\Java\\Java Workspace\\chapter16\\src\\chapter16Practice\\unicorn1.png"));
	    rainbowImage = ImageIO.read(new FileInputStream(
		    "U:\\Computer Science\\Java\\Java Workspace\\chapter16\\src\\chapter16Practice\\uni.png"));
	    gr2D.drawImage(unicornImage, 25, unicornY, 50, 50, duckiePanel);
	    for (int i = 0; i < 7; ++i) {
		gr2D.copyArea(25, unicornY, 50, 50, 0, 50);
		unicornY += 50;
	    }

	    unicornY = 25;
	    AffineTransform tx = new AffineTransform();
	    tx.translate(950, unicornY);
	    tx.scale(.4, .4);
	    tx.rotate(Math.toRadians(40));
	} catch (IOException ex) {
	    JOptionPane.showMessageDialog(null, ex);
	}

	// Draws the text
	gr2D.setPaint(new GradientPaint(10, 10, Color.YELLOW, 740, 406, Color.MAGENTA, false));
	gr2D.setFont(new Font("HoboSTD", Font.BOLD, 100));
	gr2D.drawString("CRAZY DUCK LADY", 30, 488);

	drawStar(2, 35, 50);
	drawStar(1, 100, 0);
	drawStar(1, 700, 250);
	drawStar(1, 775, 110);
	drawStar(1, 525, 30);
    }

    public static void saveImage() {
	bImage = new BufferedImage(frameWidth - 15, frameHeight - 37, BufferedImage.TYPE_INT_RGB);
	Graphics2D g2 = bImage.createGraphics();
	duckiePanel.paint(g2);

	JFileChooser fileChooser = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
	fileChooser.setFileFilter(filter);
	int result = fileChooser.showSaveDialog(duckiePanel);
	if (result == JFileChooser.APPROVE_OPTION) {
	    File saveFile = fileChooser.getSelectedFile();
	    try {
		ImageIO.write(bImage, "jpg", saveFile);
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
    }

    public static void main(String[] args) {
	duckiePanel = new DuckiePicture();
	tk = Toolkit.getDefaultToolkit();
	Dimension screen = tk.getScreenSize();
	int screenWidth = screen.width;
	int screenHeight = screen.height;
	int frameX = (screenWidth - frameWidth) / 2;
	int frameY = (screenHeight - frameHeight) / 2;

	f1 = new JFrame();
	f1.setTitle("DUCKIE");
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f1.setResizable(false);
	f1.setBounds(frameX, frameY, frameWidth, frameHeight);
	f1.setVisible(true);
	f1.add(duckiePanel);

	// Set JFrame icon
	Image icon = tk.getImage("duck.png");
	f1.setIconImage(icon);

	saveImage();
    }
}
