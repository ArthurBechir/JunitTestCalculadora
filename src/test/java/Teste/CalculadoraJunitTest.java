package Teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.Calculadora;

public class CalculadoraJunitTest {    
    // Criando variáveis calculadora
    Calculadora calculos = new Calculadora();
    
    // Somas
    @Test
    public void PositivoMaisPositivo(){
        calculos.somar(8, 8);
    }
    @Test
    public void PositivoMaisNegativo(){
        calculos.somar(8, -8);
    }
    @Test
    public void PositivoMaisZero(){
        calculos.somar(8, 0);
    }
    @Test
    public void NegativoMaisPositivo(){
        calculos.somar(-8, 8);
    }
    @Test
    public void NegativoMaisNegativo(){
        calculos.somar(-8, -8);
    }
    @Test
    public void NegativoMaisZero(){
        calculos.somar(-8, 0);
    }
    @Test
    public void ZeroMaisPositivo(){
        calculos.somar(0, 8);
    }
    @Test
    public void ZeroMaisNegativo(){
        calculos.somar(0, -8);
    }
    @Test
    public void ZeroMaisZero(){
        calculos.somar(0, 0);
    }
    
    // Subtrações
    @Test
    public void PositivoMenosPositivo(){
        calculos.subtrair(8, 8);
    }
    @Test
    public void PositivoMenosNegativo(){
        calculos.subtrair(8, -8);
    }
    @Test
    public void PositivoMenosZero(){
        calculos.subtrair(8, 0);
    }
    @Test
    public void NegativoMenosPositivo(){
        calculos.subtrair(-8, 8);
    }
    @Test
    public void NegativoMenosNegativo(){
        calculos.subtrair(-8, -8);
    }
    @Test
    public void NegativoMenosZero(){
        calculos.subtrair(-8, 0);
    }
    @Test
    public void ZeroMenosPositivo(){
        calculos.subtrair(0, 8);
    }
    @Test
    public void ZeroMenosNegativo(){
        calculos.subtrair(0, -8);
    }
    @Test
    public void ZeroMenosZero(){
        calculos.subtrair(0, 0);
    }
    
    // Multiplicações
    @Test
    public void PositivoVezesPositivo(){
        calculos.vezes(8, 8);
    }
    @Test
    public void PositivoVezesNegativo(){
        calculos.vezes(8, -8);
    }
    @Test
    public void PositivoVezesZero(){
        calculos.vezes(8, 0);
    }
    @Test
    public void NegativoVezesPositivo(){
        calculos.vezes(-8, 8);
    }
    @Test
    public void NegativoVezesNegativo(){
        calculos.vezes(-8, -8);
    }
    @Test
    public void NegativoVezesZero(){
        calculos.vezes(-8, 0);
    }
    @Test
    public void ZeroVezesPositivo(){
        calculos.vezes(0, 8);
    }
    @Test
    public void ZeroVezesNegativo(){
        calculos.vezes(0, -8);
    }
    @Test
    public void ZeroVezesZero(){
        calculos.vezes(0, 0);
    }
    
    // Divisões
    @Test
    public void PositivoDividePositivo(){
        calculos.dividir(8, 8);
    }
    @Test
    public void PositivoDivideNegativo(){
        calculos.dividir(8, -8);
    }
    @Test
    public void NegativoDividePositivo(){
        calculos.dividir(-8, 8);
    }
    @Test
    public void NegativoDivideNegativo(){
        calculos.dividir(-8, -8);
    }
    @Test
    public void ZeroDividePositivo(){
        calculos.dividir(0, 8);
    }
    @Test
    public void ZeroDivideNegativo(){
        calculos.dividir(0, -8);
    }
}
