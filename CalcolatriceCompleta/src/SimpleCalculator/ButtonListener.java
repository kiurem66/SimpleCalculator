package SimpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(GraphicInterface.getState())
        {
            if(ae.getActionCommand().equals("."))
            {
                String tmp[] = GraphicInterface.getText().split("[-+x/]");
                String num = null;
                try
                {
                    int n = tmp.length - 1;
                    num = tmp[n];
                }
                catch(Exception e)
                {
                    num = GraphicInterface.getText();
                }
                if(num.equals(""))
                    GraphicInterface.setText(GraphicInterface.getText() + "0");
                if(num.contains("."))
                    return;
            }
            GraphicInterface.setText(GraphicInterface.getText() + ae.getActionCommand());
        }
        else   
        {
            if(ae.getActionCommand().equals("."))
            {
                GraphicInterface.setText(GraphicInterface.getText() + ae.getActionCommand());
                return;
            }
            GraphicInterface.setText(ae.getActionCommand());
            GraphicInterface.setState(true);
        }
    }
    
}
