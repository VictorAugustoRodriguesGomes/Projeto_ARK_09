package ark09;

import javax.swing.JOptionPane;

public class ARK09 {

    public static void main(String[] args) {
        int soma;
        int mutiplica��o;
        int numero1;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo n�mero: "));
        int numero3;
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe um terceiro n�mero: "));
        if (numero1 >= numero2 && numero2 >= numero3) {
            soma = numero1 + numero2;
            System.out.println("A soma dos dois maiores �: " + soma);
        }
        if (numero1 >= numero3 && numero3 >= numero2) {
            soma = numero1 + numero3;
            System.out.println("A soma dos dois maiores �: " + soma);
        }
        if (numero2 >= numero1 && numero1 >= numero3) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores �: " + soma);
        }
        if (numero3 >= numero2 && numero2 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores �: " + soma);
        }
        if (numero3 >= numero1 && numero1 >= numero3) {
            soma = numero3 + numero1;
            System.out.println("A soma dos dois maiores �: " + soma);
        }
        if (numero2 >= numero3 && numero3 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores �: " + soma);
        }

        if (numero1 <= numero2 && numero2 <= numero3) {
            mutiplica��o = numero1 * numero2;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
        if (numero1 <= numero3 && numero3 <= numero2) {
            mutiplica��o = numero1 * numero3;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
        if (numero2 <= numero1 && numero1 <= numero3) {
            mutiplica��o = numero2 * numero1;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
        if (numero2 <= numero3 && numero3 <= numero1) {
            mutiplica��o = numero2 * numero3;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
        if (numero3 <= numero1 && numero1 <= numero2) {
            mutiplica��o = numero3 * numero1;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
        if (numero3 <= numero2 && numero2 <= numero1) {
            mutiplica��o = numero3 * numero2;
            System.out.println("A mutiplica��o dos dois numeros menor �: " + mutiplica��o);
        }
    }
}
