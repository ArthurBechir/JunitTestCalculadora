package Classes;

/**
 * Esta classe representa uma calculadora simples que realiza operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Realiza a operação de soma entre dois números inteiros.
     * @param a O primeiro número a ser somado.
     * @param b O segundo número a ser somado.
     * @return O resultado da soma dos números.
     */
    public float somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números inteiros.
     * @param a O número do qual o outro número será subtraído.
     * @param b O número a ser subtraído do primeiro número.
     * @return O resultado da subtração dos números.
     */
    public float subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números inteiros.
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return O resultado da multiplicação dos números.
     */
    public float vezes(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     * @param a O número que será dividido.
     * @param b O número pelo qual a divisão será realizada.
     * @return O resultado da divisão dos números.
     */
    public float dividir(int a, int b) {
        if (b == 0) {
            // Tratamento de erro para divisão por zero
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (float) a / b;
    }
}
