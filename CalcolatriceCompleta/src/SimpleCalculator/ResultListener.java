package SimpleCalculator;

import java.awt.event.*;

public class ResultListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(!GraphicInterface.getState())
        {
            return;
        }
        Polynomial pol = new Polynomial(GraphicInterface.getText());
        double a = pol.result();
        GraphicInterface.setText("" + a);
        GraphicInterface.setState(false);
    }
}
