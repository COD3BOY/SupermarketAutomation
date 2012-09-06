/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SupermarketAutomation;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;




/**
 *
 * @author sanjay
 */
public class SupermarketAutomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

          for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
             UIManager.setLookAndFeel(info.getClassName());
                        System.out.println("CHOSEN THIS");
              break;
         }
         else{
                    UIManager.setLookAndFeel  ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
          }
        }

        } catch (Exception e) {
        }
       
          
        MainPage man = new MainPage();
        
//       try{
//        BufferedImage myimage = ImageIO.read(new File("background.jpg"));
//        man.setContentPane(new ImagePanel(myimage));
//        
//        man.getContentPane().add(new ImagePanel(myimage));
//        }
//        catch(Exception ex)
//        {
//            
//        }
        
        man.setVisible(true);
        // TODO code application logic here
    }
}
