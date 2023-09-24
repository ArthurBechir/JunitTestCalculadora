package Classes;
public class Testes {
    public static void main(String[] args) {
        // Definindo variáveis
        Calculadora calculo = new Calculadora();
        float resultado;
        // Cenários 
        // Testes com Soma
        resultado = calculo.somar(5, 5);
        System.out.println("Positivo + Positivo: "+resultado);
        
        resultado = calculo.somar(5, -5);
        System.out.println("Positivo + Negativo: "+resultado);
        
        resultado = calculo.somar(5, 0);
        System.out.println("Positivo + Zero: "+resultado);
        
        resultado = calculo.somar(-5, 5);
        System.out.println("Negativo + Positivo: "+resultado);
        
        resultado = calculo.somar(-5, -5);
        System.out.println("Negativo + Negativo: "+resultado);
        
        resultado = calculo.somar(-5, 0);
        System.out.println("Negativo + Zero: "+resultado);
        
        resultado = calculo.somar(0, 5);
        System.out.println("Zero + Positivo: "+resultado);
        
        resultado = calculo.somar(0, -5);
        System.out.println("Zero + Negativo: "+resultado);
        
        resultado = calculo.somar(0, 0);
        System.out.println("Zero + Zero: "+resultado);
        
        // Testes com Subtração
        resultado = calculo.subtrair(5, 5);
        System.out.println("Positivo - Positivo: "+resultado);
        
        resultado = calculo.subtrair(5, -5);
        System.out.println("Positivo - Negativo: "+resultado);
        
        resultado = calculo.subtrair(5, 0);
        System.out.println("Positivo - Zero: "+resultado);
        
        resultado = calculo.subtrair(-5, 5);
        System.out.println("Negativo - Positivo: "+resultado);
        
        resultado = calculo.subtrair(-5, -5);
        System.out.println("Negativo - Negativo: "+resultado);
        
        resultado = calculo.subtrair(-5, 0);
        System.out.println("Negativo - Zero: "+resultado);
        
        resultado = calculo.subtrair(0, 5);
        System.out.println("Zero - Positivo: "+resultado);
        
        resultado = calculo.subtrair(0, -5);
        System.out.println("Zero - Negativo: "+resultado);
        
        resultado = calculo.subtrair(0, 0);
        System.out.println("Zero - Zero: "+resultado);
        
        // Testes com Multiplicação
        resultado = calculo.vezes(5, 5);
        System.out.println("Positivo x Positivo: "+resultado);
        
        resultado = calculo.vezes(5, -5);
        System.out.println("Positivo x Negativo: "+resultado);
        
        resultado = calculo.vezes(5, 0);
        System.out.println("Positivo x Zero: "+resultado);
        
        resultado = calculo.vezes(-5, 5);
        System.out.println("Negativo x Positivo: "+resultado);
        
        resultado = calculo.vezes(-5, -5);
        System.out.println("Negativo x Negativo: "+resultado);
        
        resultado = calculo.vezes(-5, 0);
        System.out.println("Negativo x Zero: "+resultado);
        
        resultado = calculo.vezes(0, 5);
        System.out.println("Zero x Positivo: "+resultado);
        
        resultado = calculo.vezes(0, -5);
        System.out.println("Zero x Negativo: "+resultado);
        
        resultado = calculo.vezes(0, 0);
        System.out.println("Zero x Zero: "+resultado);
        
        // Testes com Divisão
        resultado = calculo.dividir(5, 5);
        System.out.println("Positivo / Positivo: "+resultado);
        
        resultado = calculo.dividir(5, -5);
        System.out.println("Positivo / Negativo: "+resultado);
        
        resultado = calculo.dividir(-5, 5);
        System.out.println("Negativo / Positivo: "+resultado);
        
        resultado = calculo.dividir(-5, -5);
        System.out.println("Negativo / Negativo: "+resultado);
        
        resultado = calculo.dividir(0, 5);
        System.out.println("Zero / Positivo: "+resultado);
        
        resultado = calculo.dividir(0, -5);
        System.out.println("Zero / Negativo: "+resultado);
        
    }
}
