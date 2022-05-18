/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ark09;

import javax.swing.JOptionPane;

/**
 *
 * @author Anigos2
 */
public class ARK09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma;
        int mutiplicação;
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 1"));
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 2"));
        int numero3;
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 3"));
        if (numero1 >= numero2 && numero2 >= numero3) {
            soma = numero1 + numero2;
            System.out.println("A soma dos dois maiores é:" + soma);
        }
        if (numero1 >= numero3 && numero3 >= numero2) {
            soma = numero1 + numero3;
            System.out.println("A soma dos dois maiores é:" + soma);
        }
        if (numero2 >= numero1 && numero1 >= numero3) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é:" + soma);
        }
        if (numero3 >= numero2 && numero2 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é:" + soma);
        }
        if (numero3 >= numero1 && numero1 >= numero3) {
            soma = numero3 + numero1;
            System.out.println("A soma dos dois maiores é:" + soma);
        }
        if (numero2 >= numero3 && numero3 >= numero1) {
            soma = numero2 + numero3;
            System.out.println("A soma dos dois maiores é:" + soma);
        }

        if (numero1 <= numero2 && numero2 <= numero3) {
            mutiplicação = numero1 * numero2;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }
        if (numero1 <= numero3 && numero3 <= numero2) {
            mutiplicação = numero1 * numero3;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }
        if (numero2 <= numero1 && numero1 <= numero3) {
            mutiplicação = numero2 * numero1;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }
        if (numero2 <= numero3 && numero3 <= numero1) {
            mutiplicação = numero2 * numero3;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }
        if (numero3 <= numero1 && numero1 <= numero2) {
            mutiplicação = numero3 * numero1;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }
        if (numero3 <= numero2 && numero2 <= numero1) {
            mutiplicação = numero3 * numero2;
            System.out.println("A mutiplicação dos dois numeros menor é:" + mutiplicação);
        }

    }

}
