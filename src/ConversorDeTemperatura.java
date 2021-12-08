import javax.swing.JOptionPane;

public class ConversorDeTemperatura {

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Porgrama de conversão de temperaturas.");

        int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para converter de Celsius para Fahrenheit," +
                " ou, " +
                "digite 2 para obter o resultado inverso."));

        if(temperatura == 1){

            double celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));
            double fahrenheit = (celsius * 1.8 + 32);
            JOptionPane.showMessageDialog(null, "temperatuta em fahrenheit: " + fahrenheit);

        } else if(temperatura == 2){
            double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em fahrenheit: "));
            double celsius = (fahrenheit - 32) / 1.8;
            JOptionPane.showMessageDialog(null, "temperatuta em Celsius: " + celsius);

        }else {
            JOptionPane.showMessageDialog(null, "Opção Inválida");
        }

    }

}
