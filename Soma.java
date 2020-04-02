import javax.swing.JOptionPane;

public class Soma {

public static void main (String args[]) {
String primeiroNumero = JOptionPane.showInputDialog("Entre com o primeiro número: ");
String segundoNumero  = JOptionPane.showInputDialog("Entre com o segundo número: ");

try {
int numero1 = Integer.parseInt(primeiroNumero);
int numero2 = Integer.parseInt(segundoNumero);
if (JOptionPane .showConfirmDialog(null, "Somar " + primeiroNumero + " + " + segundoNumero + "?",
"Alerta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
int soma = numero1 + numero2;

JOptionPane.showMessageDialog(null, "A soma é " + soma, "Soma", JOptionPane.INFORMATION_MESSAGE);	
}
else {
JOptionPane.showMessageDialog(null, "Soma não realizada", "Soma", JOptionPane.ERROR_MESSAGE);
}
}
catch(NumberFormatException e){
JOptionPane.showMessageDialog(null, "Informe apenas números","Erro", JOptionPane.ERROR_MESSAGE);
}
}
}
