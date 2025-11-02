package Assignment9;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyEvent; 
import javax.swing.AbstractButton; 
import javax.swing.Icon; 
import javax.swing.JCheckBoxMenuItem; 
import javax.swing.JFrame; 
import javax.swing.JMenu; 
import javax.swing.JMenuBar; 
import javax.swing.JMenuItem;
import javax.swing.JOptionPane; 
 
public class JCheckBoxMenuItem1
{ 
 public static void main(final String args[])
 { 
 JFrame frame = new JFrame("Jmenu Example"); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JMenuBar menuBar = new JMenuBar(); 
 // File Menu, F - Mnemonic 
 JMenu snacksMenu = new JMenu("snacks"); 
 snacksMenu.setMnemonic(KeyEvent.VK_F); 
 menuBar.add(snacksMenu); 
 JMenu DessertMenu = new JMenu("Dessert"); 
 DessertMenu.setMnemonic(KeyEvent.VK_F); 
 menuBar.add(DessertMenu); 
 JMenu DrinksMenu = new JMenu("Drinks"); 
 DrinksMenu.setMnemonic(KeyEvent.VK_F); 
 menuBar.add(DrinksMenu); 
 JMenu HotDrinksMenu = new JMenu("HotDrinks"); 
 HotDrinksMenu.setMnemonic(KeyEvent.VK_F); 
 menuBar.add(HotDrinksMenu); 
 // File->New, N - Mnemonic 
 JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Maggie @ 40"); 
 JCheckBoxMenuItem caseMenuItem0 = new JCheckBoxMenuItem("Pizza @ 120"); 
 JCheckBoxMenuItem caseMenuItem1 = new JCheckBoxMenuItem("Burger @ 50"); 
 JCheckBoxMenuItem caseMenuItem2 = new JCheckBoxMenuItem("Sandwich @ 50"); 
 JCheckBoxMenuItem caseMenuItem3 = new JCheckBoxMenuItem("FrenchFries @ 70"); 
 caseMenuItem.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem0.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem1.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem2.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem3.setMnemonic(KeyEvent.VK_C); 
 snacksMenu.add(caseMenuItem); 
 snacksMenu.add(caseMenuItem0); 
 snacksMenu.add(caseMenuItem1); 
 snacksMenu.add(caseMenuItem2); 
 snacksMenu.add(caseMenuItem3); 
 JCheckBoxMenuItem caseMenuItem4 = new JCheckBoxMenuItem("ChocoLavaCake @ 100"); 
 JCheckBoxMenuItem caseMenuItem5 = new JCheckBoxMenuItem("IceCream @ 35"); 
 JCheckBoxMenuItem caseMenuItem6 = new JCheckBoxMenuItem("Pastry @ 45"); 
 JCheckBoxMenuItem caseMenuItem7 = new JCheckBoxMenuItem("FruitCustard @ 50"); 
 caseMenuItem4.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem5.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem6.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem7.setMnemonic(KeyEvent.VK_C); 
 DessertMenu.add(caseMenuItem4); 
 DessertMenu.add(caseMenuItem5); 
 DessertMenu.add(caseMenuItem6); 
 DessertMenu.add(caseMenuItem7); 
 JCheckBoxMenuItem caseMenuItem8 = new JCheckBoxMenuItem("Cold Drink @ 30"); 
 JCheckBoxMenuItem caseMenuItem9 = new JCheckBoxMenuItem("MilkShake @ 30"); 
 JCheckBoxMenuItem caseMenuItem10 = new JCheckBoxMenuItem("Cold Coffee @ 90"); 
 JCheckBoxMenuItem caseMenuItem11 = new JCheckBoxMenuItem("Lemon IceTea @ 25"); 
 caseMenuItem8.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem9.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem10.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem11.setMnemonic(KeyEvent.VK_C); 
 DrinksMenu.add(caseMenuItem8); 
 DrinksMenu.add(caseMenuItem9); 
 DrinksMenu.add(caseMenuItem10); 
 DrinksMenu.add(caseMenuItem11); 
 JCheckBoxMenuItem caseMenuItem12 = new JCheckBoxMenuItem("Tea @ 10"); 
 JCheckBoxMenuItem caseMenuItem13 = new JCheckBoxMenuItem("Coffee @ 20"); 
 JCheckBoxMenuItem caseMenuItem14 = new JCheckBoxMenuItem("Cappuccino @ 40"); 
 JCheckBoxMenuItem caseMenuItem15 = new JCheckBoxMenuItem("Masala Tea @ 15"); 
 caseMenuItem12.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem13.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem14.setMnemonic(KeyEvent.VK_C); 
 caseMenuItem15.setMnemonic(KeyEvent.VK_C); 
 HotDrinksMenu.add(caseMenuItem12); 
 HotDrinksMenu.add(caseMenuItem13); 
 HotDrinksMenu.add(caseMenuItem14); 
 HotDrinksMenu.add(caseMenuItem15); 
 
 ActionListener aListener = new ActionListener()
 { 
 public void actionPerformed(ActionEvent event) 
 { 
 AbstractButton aButton = (AbstractButton) event.getSource(); 
 boolean selected = aButton.getModel().isSelected(); 
 float amount = 0;
 String msg = ""; 
 Icon newIcon; 
 if (selected) 
 { 
 amount +=40;
 msg = "maggie : 40\n";
 } 
 if(selected)
 { 
	 amount +=120;
		msg+="pizza :120\n";
 } 
 msg+="------------";
	//JOptionPane.showMessageDialog(this,msg+"total :"+amount);


 aButton.setText(msg); 
 } 
 }; 
 caseMenuItem.addActionListener(aListener); 
 caseMenuItem1.addActionListener(aListener); 
 caseMenuItem2.addActionListener(aListener); 
 frame.setJMenuBar(menuBar); 
 frame.setSize(400, 300); 
 frame.setVisible(true); 
 } 
 }