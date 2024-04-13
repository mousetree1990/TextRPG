

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
    
 int Gate1 = 0;
 int Gate2 = 0;
 int Gate3 = 0;
 int Gate4 = 0;

   gameLogic logic;
   JFrame frame;
   JButton choiceButton1, choiceButton2, choiceButton3, choiceButton4;
   ImageIcon storyImage1, storyImage2;
   JLabel storyImageLabel1, storyImageLabel2;
   JPanel storyPanel, storyChoicePanel, storyAreaImagePanel, statsPanel, equipPanel;
   JTextArea mainTextArea, choiceArea1, choiceArea2, choiceArea3, choiceArea4, atkStat, defStat, hpStat, goldStat;
   JTextArea helmetTextArea, weaponTextArea, chestTextArea, legsTextArea, cloakTextArea, bootsTextArea, glovesTextArea , amuletTextArea;
    
 public Window(){

     logic = new gameLogic();
      
      //panels
      storyPanel = new JPanel();
      storyPanel.setBounds(20, 20, 370, 250);
      storyPanel.setBackground(Color.BLACK);
      storyPanel.setLayout(null);

      storyChoicePanel = new JPanel();
      storyChoicePanel.setLayout(null);
      storyChoicePanel.setBounds(20, 275, 370, 130);
      storyChoicePanel.setBackground(Color.BLACK);
      
      storyAreaImagePanel = new JPanel();
      storyAreaImagePanel.setBounds(400, 20, 370, 250);
      storyAreaImagePanel.setBackground(Color.BLACK);
      storyAreaImagePanel.setLayout(null);
      storyAreaImagePanel.setBorder(BorderFactory.createEtchedBorder());

      statsPanel = new JPanel();
      statsPanel.setBounds(430, 710, 370, 30);
      statsPanel.setBackground(Color.BLACK);
      statsPanel.setLayout(null);

      equipPanel = new JPanel();
      equipPanel.setBounds(10, 500, 160, 245);
      equipPanel.setBackground(Color.BLACK);
      equipPanel.setLayout(null);

      //text area
      mainTextArea = new JTextArea();
      mainTextArea.setBounds(10, 10, 350, 230);
      mainTextArea.setBackground(Color.BLACK);
      mainTextArea.setLineWrap(true);
      mainTextArea.setText("Belmare!\nWoe to the coward!\n Woe to the thief!\n Woe to the lying varlet underneath!");
      
      mainTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      mainTextArea.setForeground(Color.WHITE);
      mainTextArea.setEditable(false);

      choiceArea1 = new JTextArea();
      choiceArea1.setBounds(130, 6, 230, 20);
      choiceArea1.setBackground(Color.BLACK);
      choiceArea1.setLineWrap(true);
      choiceArea1.setText("Continue");
      choiceArea1.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea1.setForeground(Color.WHITE);
      choiceArea1.setEditable(false);

      choiceArea2 = new JTextArea();
      choiceArea2.setBounds(130, 36, 230, 20);
      choiceArea2.setBackground(Color.BLACK);
      choiceArea2.setLineWrap(true);
      choiceArea2.setText("");
      choiceArea2.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea2.setForeground(Color.WHITE);
      choiceArea2.setEditable(false);

      choiceArea3 = new JTextArea();
      choiceArea3.setBounds(130, 66, 230, 20);
      choiceArea3.setBackground(Color.BLACK);
      choiceArea3.setLineWrap(true);
      choiceArea3.setText("");
      choiceArea3.setFont(new Font("Serif",Font.PLAIN,16));
      choiceArea3.setForeground(Color.WHITE);
      choiceArea3.setEditable(false);

      choiceArea4 = new JTextArea();
      choiceArea4.setBounds(130, 96, 230, 20);
      choiceArea4.setBackground(Color.BLACK);
      choiceArea4.setLineWrap(true);
      choiceArea4.setText("");
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
      helmetTextArea.setBounds(5, 0, 150, 25);
      helmetTextArea.setBackground(Color.BLACK);
      helmetTextArea.setLineWrap(true);
      helmetTextArea.setText("Helmet:");
      helmetTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      helmetTextArea.setForeground(Color.WHITE);
      helmetTextArea.setEditable(false);
      
      chestTextArea = new JTextArea();
      chestTextArea.setBounds(5, 30, 150, 25);
      chestTextArea.setBackground(Color.BLACK);
      chestTextArea.setLineWrap(true);
      chestTextArea.setText("Chest:");
      chestTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      chestTextArea.setForeground(Color.WHITE);
      chestTextArea.setEditable(false);

      legsTextArea = new JTextArea();
      legsTextArea.setBounds(5, 60, 150, 25);
      legsTextArea.setBackground(Color.BLACK);
      legsTextArea.setLineWrap(true);
      legsTextArea.setText("Legs:");
      legsTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      legsTextArea.setForeground(Color.WHITE);
      legsTextArea.setEditable(false);

      bootsTextArea = new JTextArea();
      bootsTextArea.setBounds(5, 90, 150, 25);
      bootsTextArea.setBackground(Color.BLACK);
      bootsTextArea.setLineWrap(true);
      bootsTextArea.setText("Boots:");
      bootsTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      bootsTextArea.setForeground(Color.WHITE);
      bootsTextArea.setEditable(false);

      glovesTextArea = new JTextArea();
      glovesTextArea.setBounds(5, 120, 150, 25);
      glovesTextArea.setBackground(Color.BLACK);
      glovesTextArea.setLineWrap(true);
      glovesTextArea.setText("Gloves:");
      glovesTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      glovesTextArea.setForeground(Color.WHITE);
      glovesTextArea.setEditable(false);

      cloakTextArea = new JTextArea();
      cloakTextArea.setBounds(5, 150, 150, 25);
      cloakTextArea.setBackground(Color.BLACK);
      cloakTextArea.setLineWrap(true);
      cloakTextArea.setText("Cloak:");
      cloakTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      cloakTextArea.setForeground(Color.WHITE);
      cloakTextArea.setEditable(false);

      amuletTextArea = new JTextArea();
      amuletTextArea.setBounds(5, 180, 150, 25);
      amuletTextArea.setBackground(Color.BLACK);
      amuletTextArea.setLineWrap(true);
      amuletTextArea.setText("Amulet:");
      amuletTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      amuletTextArea.setForeground(Color.WHITE);
      amuletTextArea.setEditable(false);

      weaponTextArea = new JTextArea();
      weaponTextArea.setBounds(5, 210, 150, 25);
      weaponTextArea.setBackground(Color.BLACK);
      weaponTextArea.setLineWrap(true);
      weaponTextArea.setText("Weapon:");
      weaponTextArea.setFont(new Font("Serif",Font.PLAIN,20));
      weaponTextArea.setForeground(Color.WHITE);
      weaponTextArea.setEditable(false);
      
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
      choiceButton2.setVisible(false);

      choiceButton3 = new JButton();
      choiceButton3.setBounds(15, 65, 100, 25);
      choiceButton3.addActionListener(this);
      choiceButton3.setText("Select");
      choiceButton3.setFocusable(false);
      choiceButton3.setVisible(false);

      choiceButton4 = new JButton();
      choiceButton4.setBounds(15, 95, 100, 25);
      choiceButton4.addActionListener(this);
      choiceButton4.setText("Select");
      choiceButton4.setFocusable(false);
      choiceButton4.setVisible(false);

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
      equipPanel.add(legsTextArea);
      equipPanel.add(bootsTextArea);
      equipPanel.add(glovesTextArea);
      equipPanel.add(cloakTextArea);
      equipPanel.add(amuletTextArea);
      equipPanel.add(weaponTextArea);

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
         mainTextArea.setText("test1");
         Gate1++;

         switch(Gate1){
          case 1:
          mainTextArea.setText("These words do seem to hail from \nall corners of the map and yet,\nthey spring forth from the ether with no\nfixed origin.");
          System.out.println( Gate1 + "gate1");
          break;
  
          case 2:
          mainTextArea.setText("Thou shouldst find thy way out of yon forest and fetch aid. Which path wilt thou take?");
          choiceButton2.setVisible(true);
          choiceButton3.setVisible(true);
          choiceButton4.setVisible(true);
          choiceArea1.setText("NORTH");
          choiceArea2.setText("SOUTH");
          choiceArea3.setText("EAST");
          choiceArea4.setText("WEST");
          System.out.println( Gate1 + "gate1");
          break;

          case 3:
          if(Gate2 == 1){
          mainTextArea.setText("The mist doth weigh heavily in the air.\nThou spyest a faint light, akin to a campfire.\n Mayhap someone is yonder. Perchance they can divulge thy whereabouts.");
          System.out.println( Gate1 + "gate1");
          }else {
            mainTextArea.setText("headed north");
            System.out.println( Gate1 + "gate1");
          }
          break;

          case 4:
          mainTextArea.setText("Thou dost approach the light with caution, \nas though wary of what lieth beyond.\nAs thou drawest nearer, the dulcet tones of a woman's voice, weaving a melody through the air, doth grace thine ears, like the gentle whisper of a woodland sprite's song.");
          choiceArea1.setText("Attend to the sound with greater care.");
          choiceArea2.setText("Retrace thy steps whence thou came");
          choiceArea3.setText("Seek to make thy presence known");
          choiceArea4.setText("Press onward toward the light");
          choiceButton2.setVisible(true);
          choiceButton3.setVisible(true);
          choiceButton4.setVisible(true);

          System.out.println( Gate1 + "gate1");
          break;

          case 5:
          mainTextArea.setText("Back at the starting point in the heart of\nthe forest, thou dost spy a peculiar sight:\na pair of trousers suspended from a nearby\n tree, a curious addition to the woodland\nscene that had eluded thy notice afore.");
          choiceArea1.setText("Grab the pants.");
          choiceArea2.setText("Leave the pants where they hang.");
          choiceButton2.setVisible(true);
          System.out.println( Gate1 + "gate1");
          break;

          case 6:
          mainTextArea.setText("Switch 6 test");
          System.out.println( Gate1 + "gate1");
          break;

          case 7:
          mainTextArea.setText("Switch 7 test");
          System.out.println( Gate1 + "gate1");
          break;

          case 8:
          mainTextArea.setText("Switch 8 test");
          System.out.println( Gate1 + "gate1");
          break;
        }

       }
      
       //cbtn2

       if(e.getSource()==choiceButton2){
        mainTextArea.setText("er");
        Gate2++;

        switch(Gate2){
         case 1:
         mainTextArea.setText("As thou wandereth along, reckonin' thou art headin' southward, thou comest to a stark\n realization thou art completely in the buff\n And thou hast no inkling how thou hast\n come to this wood.");
         choiceButton2.setVisible(false);
         choiceButton3.setVisible(false);
         choiceButton4.setVisible(false);
         choiceArea1.setText("Continue");
         choiceArea2.setText("");
         choiceArea3.setText("");
         choiceArea4.setText("");
         System.out.println( Gate2 + "gate2");
         
         break;
 
         case 2:
         mainTextArea.setText("With uncertainty clouding thy path and the\n nature of thy surroundings unknown, thou\n optest to silently retreat northward,\n treading softly as a shadow in the night.");
         choiceArea1.setText("Continue");
         choiceArea2.setText("");
         choiceArea3.setText("");
         choiceArea4.setText("");
         choiceButton2.setVisible(false);
         choiceButton3.setVisible(false);
         choiceButton4.setVisible(false);
         System.out.println( Gate2 + "gate2");
         
         break;

         case 3:
         mainTextArea.setText("Switch 3 test");
         System.out.println( Gate2 + "gate2");
         break;

         case 4:
         mainTextArea.setText("Switch 4 test");
         System.out.println( Gate2 + "gate2");
         break;

         case 5:
         mainTextArea.setText("Switch 5 test");
         System.out.println( Gate2 + "gate2");
         break;

         case 6:
         mainTextArea.setText("Switch 6 test");
         System.out.println( Gate2 + "gate2");
         break;

         case 7:
         mainTextArea.setText("Switch 7 test");
         System.out.println( Gate2 + "gate2");
         break;

         case 8:
         mainTextArea.setText("Switch 8 test");
         System.out.println( Gate2 + "gate2");
         break;
       }

     }
       //cbtn2 end
       //cbtn3
       if(e.getSource()==choiceButton3){
        mainTextArea.setText("3 working");
        Gate3++;
       switch(Gate3){
        case 1:
        mainTextArea.setText("switch 3 working");
        break;

        case 2:

        break;

        case 3:

        break;

        case 4:

        break;

        case 5:

        break;

        case 6:

        break;

        case 7:

        break;

        case 8:

        break;

        case 9:

        break;

        case 10:

        break;
       }
       }
       //cbtb3 end
       //cbtn4
       if(e.getSource()==choiceButton4){
        mainTextArea.setText("4 working");
        Gate4++;
        switch(Gate4){
          case 1:
          mainTextArea.setText("Gate 4 switch working");
          break;

          case 2:

          break;

          case 3:

          break;

          case 4:

          break;

          case 5:

          break;

          case 6:

          break;

          case 7:

          break;

          case 8:

          break;

          case 9:

          break;

          case 10:

          break;
        }
       }
      }
    }
      
     


     
    




           
           
            
        
    
  
    

 