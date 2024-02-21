package projeto;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
    public class LabelFrame extends JFrame{
        private JLabel label1;
        private JLabel label2;
       
        public LabelFrame (){
            super( "testing Jlabel");
            setLayout(new FlowLayout() );
            label1= new JLabel ("");
        
            add(label1);
            
            Icon bug = new ImageIcon ( getClass ().getResource ("logoifmt.png"));
            label2= new JLabel(" INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO. " , bug,SwingConstants.LEFT);
          
            add (label2);
          
            
        }
    }