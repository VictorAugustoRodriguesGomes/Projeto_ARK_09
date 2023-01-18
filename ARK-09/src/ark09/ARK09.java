package ark09;

import javax.swing.JOptionPane;

public class ARK09 {

    public static void main(String[] args) {
        int soma;
        int mutiplicação;
        int numero1;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo número: "));
        int numero3;
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe um terceiro número: "));
        if (numero1 >= numero2 && numero2 >= numero3) {
            soma = numero1 + numero2;
            System.out.println("A soma dos dois maiores é: " + soma);
        }
        if (numero1 >= numero3 && numero3 >= numero2) {
            soma = numero1 + numero3;
            System.out.println("A soma dos dois maiores é: " + soma);
        }
        if (numero2 >= numero1 && numero1 >= numero3) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é: " + soma);
        }
        if (numero3 >= numero2 && numero2 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é: " + soma);
        }
        if (numero3 >= numero1 && numero1 >= numero3) {
            soma = numero3 + numero1;
            System.out.println("A soma dos dois maiores é: " + soma);
        }
        if (numero2 >= numero3 && numero3 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é: " + soma);
        }

        if (numero1 <= numero2 && numero2 <= numero3) {
            mutiplicação = numero1 * numero2;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
        if (numero1 <= numero3 && numero3 <= numero2) {
            mutiplicação = numero1 * numero3;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
        if (numero2 <= numero1 && numero1 <= numero3) {
            mutiplicação = numero2 * numero1;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
        if (numero2 <= numero3 && numero3 <= numero1) {
            mutiplicação = numero2 * numero3;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
        if (numero3 <= numero1 && numero1 <= numero2) {
            mutiplicação = numero3 * numero1;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
        if (numero3 <= numero2 && numero2 <= numero1) {
            mutiplicação = numero3 * numero2;
            System.out.println("A mutiplicação dos dois numeros menor é: " + mutiplicação);
        }
    }
}
