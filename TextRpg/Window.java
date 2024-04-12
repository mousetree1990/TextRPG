
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener{
    
    
    JFrame frame;
    JButton choiceButton1, choiceButton2, choiceButton3, choiceButton4;
    ImageIcon storyImage1, storyImage2;
    JLabel storyImageLabel1, storyImageLabel2;
    JPanel storyPanel, storyChoicePanel, storyAreaImagePanel, statsPanel, equipPanel;
    JTextArea mainTextArea, choiceArea1, choiceArea2, choiceArea3, choiceArea4, atkStat, defStat, hpStat, goldStat;
    JTextArea helmetTextArea, weaponTextArea, chestTextArea, legsTextArea, cloakTextArea, bootsTextArea, glovesTextArea , amuletTextArea;
    
    

    public Window(){

      
      
      //panels
      storyPanel = new JPanel();
      storyPanel.setBounds(20, 20, 370, 250);
      storyPanel.setBackground(Color.lightGray);
      storyPanel.setLayout(null);

      storyChoicePanel = new JPanel();
      storyChoicePanel.setLayout(null);
      storyChoicePanel.setBounds(20, 275, 370, 130);
      storyChoicePanel.setBackground(Color.lightGray);

      storyAreaImagePanel = new JPanel();
      storyAreaImagePanel.setBounds(400, 20, 370, 250);
      storyAreaImagePanel.setBackground(Color.lightGray);
      storyAreaImagePanel.setLayout(null);
      storyAreaImagePanel.setBorder(BorderFactory.createEtchedBorder());

      statsPanel = new JPanel();
      statsPanel.setBounds(400, 275, 370, 30);
      statsPanel.setBackground(Color.BLACK);
      statsPanel.setLayout(null);

      equipPanel = new JPanel();
      equipPanel.setBounds(400, 325, 370, 80);
      equipPanel.setBackground(Color.DARK_GRAY);
      equipPanel.setLayout(null);



      //text area
      mainTextArea = new JTextArea();
      mainTextArea.setBounds(10, 10, 350, 230);
      mainTextArea.setBackground(Color.DARK_GRAY);
      mainTextArea.setLineWrap(true);
      mainTextArea.setText("  This is a test to see if the action listener is   working.");
      mainTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      mainTextArea.setForeground(Color.WHITE);
      mainTextArea.setEditable(false);

      choiceArea1 = new JTextArea();
      choiceArea1.setBounds(130, 6, 230, 20);
      choiceArea1.setBackground(Color.DARK_GRAY);
      choiceArea1.setLineWrap(true);
      choiceArea1.setText("test");
      choiceArea1.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea1.setForeground(Color.WHITE);
      choiceArea1.setEditable(false);

      choiceArea2 = new JTextArea();
      choiceArea2.setBounds(130, 36, 230, 20);
      choiceArea2.setBackground(Color.DARK_GRAY);
      choiceArea2.setLineWrap(true);
      choiceArea2.setText("test");
      choiceArea2.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea2.setForeground(Color.WHITE);
      choiceArea2.setEditable(false);

      choiceArea3 = new JTextArea();
      choiceArea3.setBounds(130, 66, 230, 20);
      choiceArea3.setBackground(Color.DARK_GRAY);
      choiceArea3.setLineWrap(true);
      choiceArea3.setText("test");
      choiceArea3.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea3.setForeground(Color.WHITE);
      choiceArea3.setEditable(false);

      choiceArea4 = new JTextArea();
      choiceArea4.setBounds(130, 96, 230, 20);
      choiceArea4.setBackground(Color.DARK_GRAY);
      choiceArea4.setLineWrap(true);
      choiceArea4.setText("test");
      choiceArea4.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea4.setForeground(Color.WHITE);
      choiceArea4.setEditable(false);

      atkStat = new JTextArea();
      atkStat.setBounds(25, 0, 70, 25);
      atkStat.setBackground(Color.BLACK);
      atkStat.setLineWrap(true);
      atkStat.setText("ATK:");
      atkStat.setFont(new Font("Serif",Font.PLAIN,20));
      atkStat.setForeground(Color.WHITE);
      atkStat.setEditable(false);

      defStat = new JTextArea();
      defStat.setBounds(105, 0, 70, 25);
      defStat.setBackground(Color.BLACK);
      defStat.setLineWrap(true);
      defStat.setText("DEF:");
      defStat.setFont(new Font("Serif",Font.PLAIN,20));
      defStat.setForeground(Color.WHITE);
      defStat.setEditable(false);

      hpStat = new JTextArea();
      hpStat.setBounds(185, 0, 70, 25);
      hpStat.setBackground(Color.BLACK);
      hpStat.setLineWrap(true);
      hpStat.setText("HP:");
      hpStat.setFont(new Font("Serif",Font.PLAIN,20));
      hpStat.setForeground(Color.WHITE);
      hpStat.setEditable(false);

      goldStat = new JTextArea();
      goldStat.setBounds(265, 0, 70, 25);
      goldStat.setBackground(Color.BLACK);
      goldStat.setLineWrap(true);
      goldStat.setText("Gold:");
      goldStat.setFont(new Font("Serif",Font.PLAIN,20));
      goldStat.setForeground(Color.WHITE);
      goldStat.setEditable(false);

      helmetTextArea = new JTextArea();
      helmetTextArea.setBounds(5, 0, 70, 25);
      helmetTextArea.setBackground(Color.PINK);
      helmetTextArea.setLineWrap(true);
      helmetTextArea.setText("Helmet:");
      helmetTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      helmetTextArea.setForeground(Color.WHITE);
      helmetTextArea.setEditable(false);
      
      chestTextArea = new JTextArea();
      chestTextArea.setBounds(115, 0, 70, 25);
      chestTextArea.setBackground(Color.PINK);
      chestTextArea.setLineWrap(true);
      chestTextArea.setText("Chest:");
      chestTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      chestTextArea.setForeground(Color.WHITE);
      chestTextArea.setEditable(false);
      
      
      
      
      //Buttons
      choiceButton1 = new JButton();
      choiceButton1.setBounds(15, 5, 100, 25);
      choiceButton1.addActionListener(this);
      choiceButton1.setText("Select");
      choiceButton1.setFocusable(false);

      choiceButton2 = new JButton();
      choiceButton2.setBounds(15, 35, 100, 25);
      choiceButton2.addActionListener(this);
      choiceButton2.setText("Select");
      choiceButton2.setFocusable(false);

      choiceButton3 = new JButton();
      choiceButton3.setBounds(15, 65, 100, 25);
      choiceButton3.addActionListener(this);
      choiceButton3.setText("Select");
      choiceButton3.setFocusable(false);

      choiceButton4 = new JButton();
      choiceButton4.setBounds(15, 95, 100, 25);
      choiceButton4.addActionListener(this);
      choiceButton4.setText("Select");
      choiceButton4.setFocusable(false);


      
      
      //labels
      storyImageLabel1 =  new JLabel();
      storyImageLabel1.setBackground(Color.BLACK);
      storyImageLabel1.setBounds(80, 20, 208, 200);
      storyImage1 = new ImageIcon("forest.jpg");
      storyImageLabel1.setIcon(storyImage1);
      storyImageLabel1.setBorder(BorderFactory.createEtchedBorder());

      storyImageLabel2 =  new JLabel();
      storyImageLabel2.setBackground(Color.BLACK);
      storyImageLabel2.setBounds(80, 20, 208, 200);
      storyImage2 = new ImageIcon("town.jpg");
      storyImageLabel2.setIcon(storyImage2);
      storyImageLabel2.setBorder(BorderFactory.createEtchedBorder());
      storyImageLabel2.setVisible(false);
      
      
    
      
      
      

     
      //frames
      frame = new JFrame();
      storyAreaImagePanel.add(storyImageLabel1);
      storyAreaImagePanel.add(storyImageLabel2);
      storyChoicePanel.add(choiceButton1);
      storyChoicePanel.add(choiceButton2);
      storyChoicePanel.add(choiceButton3);
      storyChoicePanel.add(choiceButton4);
      storyChoicePanel.add(choiceArea1);
      storyChoicePanel.add(choiceArea2);
      storyChoicePanel.add(choiceArea3);
      storyChoicePanel.add(choiceArea4);

      storyPanel.add(mainTextArea);
      statsPanel.add(atkStat);
      statsPanel.add(defStat);
      statsPanel.add(hpStat);
      statsPanel.add(goldStat);
      equipPanel.add(helmetTextArea);
      equipPanel.add(chestTextArea);

      frame.setSize(800, 800);
      frame.getContentPane().setBackground(Color.BLACK);
      frame.setResizable(false);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(storyPanel);
      frame.add(storyChoicePanel);
      frame.add(storyAreaImagePanel);
      frame.add(statsPanel);
      frame.add(equipPanel);
      
      frame.setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==choiceButton1){
            System.out.println("Test");
            storyImageLabel1.setVisible(false);
            storyImageLabel2.setVisible(true);
            mainTextArea.setText("  If you are seeing this text then it worked!");
            

            
        
    }

    
}
}