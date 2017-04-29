package viewGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainGui extends JFrame {
	
	private Component target;
	
	public static boolean actifGenerate = true;
	public static ImageIcon logo, logo5, logo6, logo7, logo8, imagedeux, logoFile;
	public static File image1 = new File(System.getProperty("user.dir") + "\\images\\table0.jpg");
	public static File image2 = new File(System.getProperty("user.dir") +  "\\images\\BUREAU_EXEMPLE_V3.png");
	
	
	public mainGui(){
		super();
		
		maFenetre();
	}
	
	public void maFenetre(){		
		
		JFrame f = new JFrame("SmartDesk");
		f.setSize(1442, 1081);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		f.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(SystemColor.control);
		verticalBox.setBounds(10, 200, 179, 794);
		f.getContentPane().add(verticalBox);
		
		Panel panel = new Panel();
		verticalBox.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(242, 203, 1080, 720);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("G\u00E9n\u00E9rer");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel_1.removeAll();
				try {
					BufferedImage img1 = ImageIO.read(image1);
					BufferedImage img2 = ImageIO.read(image2);
					Image img2D = img2.getScaledInstance(panel_1.getWidth(), panel_1.getHeight(),
					        Image.SCALE_SMOOTH);
					panel_1.add(new JLabel(new ImageIcon(addImageBuffImg(img1, img2D))));
					panel_1.revalidate();
				} catch (IOException exc) {
					exc.printStackTrace();
				}
			} 
		});
		btnNewButton.setBounds(242, 958, 121, 36);
		f.getContentPane().add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 433, 175);
		panel_3.setLayout(new BorderLayout(0, 0));
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\SMARTDESIGNV2_reduced.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		int wdth = panel_3.getWidth();
		int hght = panel_3.getHeight();
		Image dimg = img.getScaledInstance(wdth, hght,
		        Image.SCALE_SMOOTH);
		logo = new ImageIcon(dimg);
		panel_3.setOpaque(false);
		panel_3.add(new JLabel(logo));
		f.getContentPane().add(panel_3);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBackground(Color.WHITE);
		horizontalBox.setBounds(450, 13, 872, 165);
		f.getContentPane().add(horizontalBox);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.inactiveCaption);
		horizontalBox.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				panel_1.add(new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\images\\Background\\table0.jpg")));
				image1 = new File(System.getProperty("user.dir") + "\\images\\Background\\table0.jpg");
				panel_1.revalidate();
			}
		});
		BufferedImage img5 = null;
		try {
		    img5 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\table0.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		int wdth5 = (horizontalBox.getWidth()/4);
		int hght5 = horizontalBox.getHeight();
		Image dimg5 = img5.getScaledInstance(wdth5, hght5,
		        Image.SCALE_SMOOTH);
		logo5 = new ImageIcon(dimg5);
		panel_4.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.inactiveCaption);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				BufferedImage img6 = null;
				try {
					img6 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bg-bois.jpg"));
				} catch (IOException exc) {
					exc.printStackTrace();
				}
				Image dimg6 = img6.getScaledInstance(panel_1.getWidth(), panel_1.getHeight(),
				        Image.SCALE_SMOOTH);
				logo6 = new ImageIcon(dimg6);
				panel_1.add(new JLabel(logo6));
				image1 = new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bg-bois.jpg");
				panel_1.revalidate();
			}
		});
		BufferedImage img6 = null;
		try {
			img6 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bg-bois.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg6 = img6.getScaledInstance(wdth5, hght5,
		        Image.SCALE_SMOOTH);
		logo6 = new ImageIcon(dimg6);
		panel_4.add(panel_6);
		JLabel label_1 = new JLabel(logo6);
		panel_6.add(label_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.inactiveCaption);
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				BufferedImage img7 = null;
				try {
				    img7 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\bambou.jpg"));
				} catch (IOException exc) {
				    exc.printStackTrace();
				}
				Image dimg7 = img7.getScaledInstance(panel_1.getWidth(), panel_1.getHeight(),
				        Image.SCALE_SMOOTH);
				logo7 = new ImageIcon(dimg7);
				panel_1.add(new JLabel(logo7));
				image1 = new File(System.getProperty("user.dir") + "\\images\\Background\\bambou.jpg");
				panel_1.revalidate();
			}
		});
		BufferedImage img7 = null;
		try {
		    img7 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\bambou.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg7 = img7.getScaledInstance(wdth5, hght5,
		        Image.SCALE_SMOOTH);
		logo7 = new ImageIcon(dimg7);
		panel_4.add(panel_7);
		JLabel label_2 = new JLabel(logo7);
		panel_7.add(label_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(SystemColor.inactiveCaption);
		panel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1.removeAll();
				BufferedImage img8 = null;
				try {
				    img8 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bois-brunFoncé.jpg"));
				} catch (IOException exc) {
				    exc.printStackTrace();
				}
				Image dimg8 = img8.getScaledInstance(panel_1.getWidth(), panel_1.getHeight(),
				        Image.SCALE_SMOOTH);
				logo8 = new ImageIcon(dimg8);
				panel_1.add(new JLabel(logo8));
				image1 = new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bois-brunFoncé.jpg");
				panel_1.revalidate();
			}
		});
		BufferedImage img8 = null;
		try {
		    img8 = ImageIO.read(new File(System.getProperty("user.dir") + "\\images\\Background\\texture-bois-brunFoncé.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg8 = img8.getScaledInstance(wdth5, hght5,
		        Image.SCALE_SMOOTH);
		logo8 = new ImageIcon(dimg8);
		JLabel label = new JLabel(logo5);
		label.setBackground(SystemColor.control);
		panel_5.add(label);
		panel_4.add(panel_8);
		JLabel label_3 = new JLabel(logo8);
		panel_8.add(label_3);
		
		/**
		 * DONC A CHAQUE OBJET, IL FAUT LUI ASSIGNER UN BOUTON ICI.
		 * DONC RAMENER LE TABLEAU D'OBJETS ET CREER UN CHECKBOX POUR CHAQUE 
		 * OBJET.
		 */
		
		File rep = new File(System.getProperty("user.dir") + "\\images\\");
		File[] fichierImg = rep.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".png");
			}
		});
		
		ArrayList<JLabel> mesJlabels = new ArrayList<JLabel>();
		int monX = 0;
		int monY = 0;
		
		for (File file : fichierImg) {
			JLabel chckbxMonTest = new JLabel();
			chckbxMonTest.setBounds(monX, monY, 50, 50);
			monX += 60;
			BufferedImage imgFile = null;
			try {
			    imgFile = ImageIO.read(new File(file.toString()));
			    System.out.println(file.toString());
			} catch (IOException exc) {
			    exc.printStackTrace();
			}
			Image dimgFile = imgFile.getScaledInstance(50, 50,
			        Image.SCALE_SMOOTH);
			logoFile = new ImageIcon(dimgFile);
			//chckbxMonTest.add(new JLabel(logoFile));
			panel.add(chckbxMonTest);
			chckbxMonTest.setBackground(SystemColor.control);
			mesJlabels.add(chckbxMonTest);
		}		
		
		for (JLabel jLabel : mesJlabels) {
			System.out.println(jLabel.toString());
		}
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		f.setVisible(true);
	}	
	
	public static BufferedImage addImage(BufferedImage image1, BufferedImage image2){ 
		Graphics2D g2d = image1.createGraphics(); 
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
		                RenderingHints.VALUE_ANTIALIAS_ON); 
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, 
		                RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY); 
		
		g2d.drawImage(image2, 0, 0, null); 
		
		g2d.dispose(); 
	  
		try {
			ImageIO.write(image1, "PNG", new File(System.getProperty("user.dir") + "\\src\\viewGui\\filename.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return image1; 
	}
	
	public static BufferedImage addImageBuffImg(BufferedImage image1, Image image2){ 
		Graphics2D g2d = image1.createGraphics(); 
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
		                RenderingHints.VALUE_ANTIALIAS_ON); 
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, 
		                RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY); 
		
		g2d.drawImage(image2, 200, 100, null); 
		
		g2d.dispose(); 
	  
		try {
			ImageIO.write(image1, "PNG", new File(System.getProperty("user.dir") + "\\src\\viewGui\\filename.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return image1; 
	}
}
