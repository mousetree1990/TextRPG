

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
   JButton[] cButtons = new JButton[4];
   JButton choiceButton1, choiceButton2, choiceButton3, choiceButton4;
   
   ImageIcon storyImage1, storyImage2;
   JLabel storyImageLabel1, storyImageLabel2;

   JPanel[] panels = new JPanel[5];
   JPanel storyPanel, storyChoicePanel, storyAreaImagePanel, statsPanel, equipPanel;
   
   JTextArea[] textAreas = new JTextArea[17];
   JTextArea mainTextArea, choiceArea1, choiceArea2, choiceArea3, choiceArea4, atkStat, defStat, hpStat, goldStat;
   JTextArea helmetTextArea, weaponTextArea, chestTextArea, legsTextArea, cloakTextArea, bootsTextArea, glovesTextArea , amuletTextArea;
    
 public Window(){

     logic = new gameLogic();
     
      //panels
      storyPanel = new JPanel();
      storyPanel.setBounds(20, 20, 370, 250);
     
      storyChoicePanel = new JPanel();
      storyChoicePanel.setBounds(20, 275, 420, 130);
      
      storyAreaImagePanel = new JPanel();
      storyAreaImagePanel.setBounds(400, 20, 370, 250);
      storyAreaImagePanel.setBorder(BorderFactory.createEtchedBorder());

      statsPanel = new JPanel();
      statsPanel.setBounds(430, 710, 370, 30);
     
      equipPanel = new JPanel();
      equipPanel.setBounds(10, 500, 160, 245);

      panels[0] = storyPanel;
      panels[1] = storyChoicePanel;
      panels[2] = storyAreaImagePanel;
      panels[3] = statsPanel;
      panels[4] = equipPanel;

      for(int i = 0; i < 5; i++){
        panels[i].setBackground(Color.BLACK);
        panels[i].setLayout(null);
      }

      //text area
      mainTextArea = new JTextArea();
      mainTextArea.setBounds(10, 10, 350, 230);
      mainTextArea.setText("Belmare!\nWoe to the coward!\n Woe to the thief!\n Woe to the lying varlet underneath!");

      choiceArea1 = new JTextArea();
      choiceArea1.setBounds(130, 6, 320, 30);
      choiceArea1.setText("Continue");

      choiceArea2 = new JTextArea();
      choiceArea2.setBounds(130, 36, 320, 30);
      choiceArea2.setText("");

      choiceArea3 = new JTextArea();
      choiceArea3.setBounds(130, 66, 320, 30);
      choiceArea3.setText("");

      choiceArea4 = new JTextArea();
      choiceArea4.setBounds(130, 96, 320, 30);
      choiceArea4.setText("");
     

      atkStat = new JTextArea();
      atkStat.setBounds(25, 0, 70, 25);
      atkStat.setText("ATK:");

      defStat = new JTextArea();
      defStat.setBounds(105, 0, 70, 25);
      defStat.setText("DEF:");
      
      hpStat = new JTextArea();
      hpStat.setBounds(185, 0, 70, 25);
      hpStat.setText("HP:");

      goldStat = new JTextArea();
      goldStat.setBounds(265, 0, 70, 25);
      goldStat.setText("Gold:");

      helmetTextArea = new JTextArea();
      helmetTextArea.setBounds(5, 0, 150, 25);
      helmetTextArea.setText("Helmet:");
      
      chestTextArea = new JTextArea();
      chestTextArea.setBounds(5, 30, 150, 25);
      chestTextArea.setText("Chest:");

      legsTextArea = new JTextArea();
      legsTextArea.setBounds(5, 60, 150, 25);
      legsTextArea.setText("Legs:");

      bootsTextArea = new JTextArea();
      bootsTextArea.setBounds(5, 90, 150, 25);
      bootsTextArea.setText("Boots:");

      glovesTextArea = new JTextArea();
      glovesTextArea.setBounds(5, 120, 150, 25);
      glovesTextArea.setText("Gloves:");

      cloakTextArea = new JTextArea();
      cloakTextArea.setBounds(5, 150, 150, 25);
      cloakTextArea.setText("Cloak:");
     
      amuletTextArea = new JTextArea();
      amuletTextArea.setBounds(5, 180, 150, 25);
      amuletTextArea.setText("Amulet:");
      
      weaponTextArea = new JTextArea();
      weaponTextArea.setBounds(5, 210, 150, 25);
      weaponTextArea.setText("Weapon:");
     

      textAreas[0] = mainTextArea;
      textAreas[1] = choiceArea1;
      textAreas[2] = choiceArea2;
      textAreas[3] = choiceArea3;
      textAreas[4] = choiceArea4;
      textAreas[5] = atkStat;
      textAreas[6] = defStat;
      textAreas[7] = hpStat;
      textAreas[8] = goldStat;
      textAreas[9] = helmetTextArea;
      textAreas[10] = chestTextArea;
      textAreas[11] = legsTextArea;
      textAreas[12] = bootsTextArea;
      textAreas[13] = glovesTextArea;
      textAreas[14] = cloakTextArea;
      textAreas[15] = amuletTextArea;
      textAreas[16] = weaponTextArea;

      for(int i = 0; i < 17; i++){
        textAreas[i].setBackground(Color.BLACK);
        textAreas[i].setForeground(Color.white);
        textAreas[i].setEditable(false);
        textAreas[i].setFont(new Font("Serif",Font.PLAIN,20));
        textAreas[i].setLineWrap(true);
        
      }
      
      //Buttons
     

      choiceButton1 = new JButton();
      choiceButton1.setBounds(15, 5, 100, 25);
      
      choiceButton2 = new JButton();
      choiceButton2.setBounds(15, 35, 100, 25);
      choiceButton2.setVisible(false);

      choiceButton3 = new JButton();
      choiceButton3.setBounds(15, 65, 100, 25);
      choiceButton3.setVisible(false);

      choiceButton4 = new JButton();
      choiceButton4.setBounds(15, 95, 100, 25);
      choiceButton4.setVisible(false);

      cButtons[0] = choiceButton1;
      cButtons[1] = choiceButton2;
      cButtons[2] = choiceButton3;
      cButtons[3] = choiceButton4;
       
      for(int i = 0; i < 4; i++){
        cButtons[i].addActionListener(this);
        cButtons[i].setFocusable(false);
        cButtons[i].setText("Select");
        cButtons[i].setFont(new Font("Serif",Font.PLAIN,20));
      }

     
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
      
     


     
    




           
           
            
        
    
  
    

 