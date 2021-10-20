import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco2Test {
    // testes ex1
    @org.junit.jupiter.api.Test
    void mediaPonderadaTeste1() {
        double expected = 10;
        double result;
        result = Bloco2.mediaPonderada(10,10,10,1,1,1);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void mediaPonderadaTeste2() {
        double expected = -1;
        double result;
        result = Bloco2.mediaPonderada(-10,10,10,1,1,1);
        assertEquals(expected, result,0.01);
    }
    // testes ex2
    @org.junit.jupiter.api.Test
    void digitosTeste1() {
        String expected = "1 0 0";
        String result;
        result = Bloco2.digitos(100);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void digitosTeste2() {
        String expected = "9 8 7";
        String result;
        result = Bloco2.digitos(987);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void digitosTeste3() {
        String expected = "Número não tem 3 dígitos";
        String result;
        result = Bloco2.digitos(10);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void digitosTeste4() {
        String expected = "Número não tem 3 dígitos";
        String result;
        result = Bloco2.digitos(1020);
        assertEquals(expected, result);
    }
    // testes ex3
    @org.junit.jupiter.api.Test
    void distancia2PontosTeste1() {
        double expected = 5.00;
        double result;
        result = Bloco2.distancia2Pontos(10,5,5,5);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void distancia2PontosTeste2() {
        double expected = 22.36;
        double result = Bloco2.distancia2Pontos(10, 5, -10, -5);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void distancia2PontosTeste3() {
        double expected = 0.00;
        double result = Bloco2.distancia2Pontos(3, 2, 3, 2);
        assertEquals(expected, result,0.01);
    }
    // testes ex4
    @org.junit.jupiter.api.Test
    void funcaoXTeste1() {
        double expected = -3;
        double result = Bloco2.funcaoX(-3);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void funcaoXTeste2() {
        double expected = 0;
        double result = Bloco2.funcaoX(0);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void funcaoXTeste3() {
        double expected = 0;
        double result = Bloco2.funcaoX(2);
        assertEquals(expected, result,0.01);
    }
    @org.junit.jupiter.api.Test
    void funcaoXTeste4() {
        double expected = 80;
        double result = Bloco2.funcaoX(10);
        assertEquals(expected, result,0.01);
    }
    // testes ex 5
    @Test
    void classificaCuboTeste1() {
        String expected = "Grande";
        String result = Bloco2.classificaCubo(Bloco2.areaVolume(1000));
        assertEquals(expected, result);
    }
    @Test
    void classificaCuboTeste2() {
        String expected = "Pequeno";
        String result = Bloco2.classificaCubo(Bloco2.areaVolume(100));
        assertEquals(expected, result);
    }
    @Test
    void classificaCuboTeste3() {
        String expected = "Médio";
        String result = Bloco2.classificaCubo(Bloco2.areaVolume(800));
        assertEquals(expected, result);
    }
    @Test
    void classificaCuboTeste4() {
        String expected = "Valor de área incorreto";
        String result = Bloco2.classificaCubo(Bloco2.areaVolume(-100));
        assertEquals(expected, result);
    }
    // testes ex 6
    @Test
    void horasMinutosSegundosTeste1() {
        String expected = "Boa noite,2:30:10";
        String result = Bloco2.horasMinutosSegundos(9010);
        assertEquals(expected, result);
    }
    @Test
    void horasMinutosSegundosTeste2() {
        String expected = "Boa noite,5:35:50";
        String result = Bloco2.horasMinutosSegundos(20150);
        assertEquals(expected, result);
    }
    @Test
    void horasMinutosSegundosTeste3() {
        String expected = "Bom dia,6:35:50";
        String result = Bloco2.horasMinutosSegundos(23750);
        assertEquals(expected, result);
    }
    @Test
    void horasMinutosSegundosTeste4() {
        String expected = "Boa tarde,12:35:50";
        String result = Bloco2.horasMinutosSegundos(45350);
        assertEquals(expected, result);
    }
    // testes ex 7
    @Test
    void custoPinturaTeste1() {
        double expected = 4;
        double result = Bloco2.custoPintura("Tinta",100,2,50,50);
        assertEquals(expected, result,0.01);
    }
    @Test
    void custoPinturaTeste2() {
        double expected = 156.25;
        double result = Bloco2.custoPintura("MO",100,2,50,50);
        assertEquals(expected, result,0.1);
    }
    @Test
    void custoPinturaTeste3() {
        double expected = 160.25;
        double result = Bloco2.custoPintura("",100,2,50,50);
        assertEquals(expected, result,0.1);
    }
    @Test
    void custoPinturaTeste4() {
        double expected = 160.25;
        double result = Bloco2.custoPintura("testeTeste",100,2,50,50);
        assertEquals(expected, result,0.1);
    }
    @Test
    void custoPinturaTeste5() {
        double expected = 0;
        double result = Bloco2.custoPintura("MO",-100,2,50,50);
        assertEquals(expected, result,0.1);
    }
    @Test
    void custoPinturaTeste6() {
        double expected = 0;
        double result = Bloco2.custoPintura("MO",100,2,-50,50);
        assertEquals(expected, result,0.1);
    }
    // testes ex 8
    @Test
    void multiplosTeste1() {
        String expected = "6 é múltiplo de 3"; //msg = num1 + "é múltiplo de " + num2;
        String result = Bloco2.multiplos(6,3);
        assertEquals(expected, result);
    }
    @Test
    void multiplosTeste2() {
        String expected = "6 é múltiplo de 3"; //msg = num2 + " é múltiplo de " + num1;
        String result = Bloco2.multiplos(3,6);
        assertEquals(expected, result);
    }
    @Test
    void multiplosTeste3() {
        String expected = "3 e 7 não são múltiplos"; //msg = num1 + " e " + num2 + " não são múltiplos";
        String result = Bloco2.multiplos(3,7);
        assertEquals(expected, result);
    }
}