import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardGUI extends JLabel {
	
	private static final long serialVersionUID = 1L;
	private Card card;
	private Rectangle rectField;
	private JPanel panel;
	private JLabel incomeText;
	
	public Card Card(){
		return this.card;
	}
	
	public Rectangle RectField(){
		return this.rectField;
	}
	
	public JPanel Panel(){
		return this.panel;
	}

	public CardGUI(Card card, JPanel panel, int x, int y) {
		this.card = card;
		if(card instanceof StructureCard){
			StructureCard structureCard = (StructureCard) card;
			if(structureCard.Rotation() == StructureCard.Rotation.UP || structureCard.Rotation() == StructureCard.Rotation.DOWN){
				this.setBounds(new Rectangle(x, y, 150, 90));
			}else{
				this.setBounds(new Rectangle(x, y, 90, 150));
			}
		}else{
			this.setBounds(new Rectangle(x, y, 150, 90));
		}
		
		this.panel = panel;
		
		setImage(card.ImagePath());
		
		if(card instanceof StructureCard){
			updateMoney();
		}
	}
	
	public CardGUI(Card card, JPanel panel){
		this(card, panel, 0, 0);
	}
	
	public CardGUI(Card card){
		this(card, null, 0, 0);
	}
	
	public CardGUI(Card card, int x, int y) {
		this(card, null, x, y);
	}
	
	public void setImage(String newImgPath){
		BufferedImage image = null;
		try{
			image = ImageIO.read(new File(newImgPath));
		}catch(Exception e){
			System.out.println("Error loading image");
		}
		if(image != null){
			if(card instanceof StructureCard){
				StructureCard structureCard = (StructureCard) card;
				if(structureCard.Rotation() == StructureCard.Rotation.RIGHT){
					image = rotate(image, 90);
				}else if(structureCard.Rotation() == StructureCard.Rotation.DOWN){
					image = rotate(image, 180);
				}else if(structureCard.Rotation() == StructureCard.Rotation.LEFT){
					image = rotate(image, 270);
				}
			}

			ImageIcon imageIcon = new ImageIcon((Image) image);
			Image scaledImage = imageIcon.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
			this.setIcon(new ImageIcon(scaledImage));
		}
		
	}
	
	public BufferedImage rotate(BufferedImage image, double angle) {
		angle = Math.toRadians(angle);
	    double sin = Math.abs(Math.sin(angle)), cos = Math.abs(Math.cos(angle));
	    int w = image.getWidth(), h = image.getHeight();
	    int newW = (int)Math.floor(w*cos+h*sin), newH = (int) Math.floor(h * cos + w * sin);
	    GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	    BufferedImage result = gc.createCompatibleImage(newW, newH, Transparency.TRANSLUCENT);
	    Graphics2D g = result.createGraphics();
	    g.translate((newW - w) / 2, (newH - h) / 2);
	    g.rotate(angle, w / 2, h / 2);
	    g.drawRenderedImage(image, null);
	    g.dispose();
	    return result;
	}
	
	public void updateMoney(){
		if(incomeText != null){
			this.remove(incomeText);
		}
		
		Integer money = new Integer(((StructureCard) card).CurrentMoney());
		incomeText = new JLabel(money.toString());
		incomeText.setBounds(5, 5, 30, 15);
		incomeText.setFont(incomeText.getFont().deriveFont(16.0f));
		incomeText.setForeground(new Color(255, 255, 255));
		incomeText.setBackground(new Color(255, 255, 255));
		this.add(incomeText);
		
		this.revalidate();
		this.repaint();
	}

	@Override
	public String toString() {
		return "CardGUI [card=" + card + ", rectField=" + rectField + ", panel=" + panel + ", incomeText=" + incomeText
				+ "]";
	}
	
	//Places the card on FieldGUI, based on center point P
	/*public void setOnField(Point p){
		//Add checks so it remains in field
		rectField = new Rectangle(p.x - 2, p.y - 1, 5, 3);
	}*/

}
