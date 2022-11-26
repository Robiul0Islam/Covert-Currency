import javax.swing.JOptionPane;

public class Currency{
    public static void main(String[] args) {
    
        String a= JOptionPane.showInputDialog(null, "Enter the currency rate from USD to BDT","Currency rate",JOptionPane.INFORMATION_MESSAGE);
        float rate=Float.parseFloat(a);
        a=JOptionPane.showInputDialog(null,"Choice 0 to convert BDT to USD or choice 1 to convert USD to BDT","Choice",JOptionPane.QUESTION_MESSAGE);
        int choice=Integer.parseInt(a);
        if(choice==0){
            a=JOptionPane.showInputDialog(null,"Eneter the BDT currency","BDT",JOptionPane.INFORMATION_MESSAGE);
            float bdt=Float.parseFloat(a);
            float bdtToUsd=bdt/rate;
            JOptionPane.showMessageDialog(null, "After conversion the currency in USD is: "+bdtToUsd,"BDT to USD",JOptionPane.INFORMATION_MESSAGE);

        }
        else {
            a=JOptionPane.showInputDialog(null,"Enter the USD Currency","USD",JOptionPane.INFORMATION_MESSAGE);
            float usd=Float.parseFloat(a);
            float UsdToBdt=rate*usd;
            JOptionPane.showMessageDialog(null,"After conversion USD: "+UsdToBdt, "USD to BDT",JOptionPane.INFORMATION_MESSAGE);
        }
    }
 }
 // Robiul Islam
 