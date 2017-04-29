package viewGui;

import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.TransferHandler;

import model.AccessoireBureau;

public class mainGui extends JFrame {
	
	public static boolean actifGenerate = true;
	public static File image1 = new File(System.getProperty("user.dir") + "\\src\\viewGui\\250px-Pikachu-RFVF.png");
	public static File image2 = new File(System.getProperty("user.dir") +  "\\images\\gobelet.png");
	ImageIcon icon = new ImageIcon(System.getProperty("user.dir") +  "\\images\\gobelet.png");
	
	public mainGui(){
		super();
		
		maFenetre();
	}
	
	public void maFenetre(){

		JFrame f = new JFrame("Mon Jframe");
		f.setSize(1080, 720);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(SystemColor.inactiveCaption);
		f.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(SystemColor.control);
		verticalBox.setBounds(12, 13, 100, 647);
		f.getContentPane().add(verticalBox);
		
		Panel panel = new Panel();
		verticalBox.add(panel);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(154, 88, 851, 460);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Destination du drag");
		lblNewLabel.setBounds(0, 196, 298, 0);
		panel_1.add(lblNewLabel);
		
		JTextField dest = new JTextField();
		dest.setBounds(88, 52, 128, 73);
		dest.setDragEnabled(true);
		panel_1.add(dest);
		
		JLabel lblNewLabel_1 = new JLabel("A deplacer");
		lblNewLabel_1.setBounds(434, 55, 181, 66);
		lblNewLabel_1.setIcon(icon);
	    lblNewLabel_1.setTransferHandler(new TransferHandler("text"));
	    lblNewLabel_1.addMouseListener(new MouseAdapter(){
	    	public void mousePressed(MouseEvent e){          
	        JComponent lab = (JComponent)e.getSource();
	        TransferHandler handle = lab.getTransferHandler();
	        handle.exportAsDrag(lab, e, TransferHandler.COPY);
	      }
	    });
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("G\u00E9n\u00E9rer");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				/** panel_1.removeAll();
				panel_1.add(new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\src\\viewGui\\250px-Pikachu-RFVF.png")));
				panel_1.revalidate(); **/
				panel_1.removeAll();
				try {
					BufferedImage img1 = ImageIO.read(image1);
					BufferedImage img2 = ImageIO.read(image2);
					panel_1.add(new JLabel(new ImageIcon(addImage(img1, img2))));
					panel_1.revalidate();
				} catch (IOException exc) {
					exc.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(129, 635, 97, 25);
		f.getContentPane().add(btnNewButton);
		
		
		/**
		 * DONC A CHAQUE OBJET, IL FAUT LUI ASSIGNER UN BOUTON ICI.
		 * DONC RAMENER LE TABLEAU D'OBJETS ET CREER UN CHECKBOX POUR CHAQUE 
		 * OBJET.
		 */
		for (AccessoireBureau accessoireBureau : Main.maListeObjets) {
			JCheckBox chckbxMonTest = new JCheckBox(accessoireBureau.getNom());
			chckbxMonTest.addFocusListener(new FocusAdapter() {
				
				/**
				 * Ajoute la photo sur le bureau
				 */
				@Override
				public void focusGained(FocusEvent arg0) {
					chckbxMonTest.setText("Selected");
				}		
				
				/**
				 * Supprime la photo du bureau
				 */
				@Override
				public void focusLost(FocusEvent arg0) {
					chckbxMonTest.setText("Deselected");
				}
			});
			panel.add(chckbxMonTest);
			chckbxMonTest.setBackground(SystemColor.control);
		}
		
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
}
