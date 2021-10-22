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
    // testes ex 9
    @Test
    void crescenteTeste1() {
        boolean expected = true;
        boolean result = Bloco2.crescente(345);
        assertEquals(expected, result);
    }
    @Test
    void crescenteTeste2() {
        boolean expected = false;
        boolean result = Bloco2.crescente(546);
        assertEquals(expected, result);
    }
    @Test
    void crescenteTeste3() {
        boolean expected = false;
        boolean result = Bloco2.crescente(231);
        assertEquals(expected, result);
    }
    @Test
    void crescenteTeste4() {
        boolean expected = false;
        boolean result = Bloco2.crescente(759);
        assertEquals(expected, result);
    }
    @Test
    void crescenteTeste5() {
        boolean expected = false;
        boolean result = Bloco2.crescente(8975);
        assertEquals(expected, result);
    }
    // testes ex 10
    @Test
    void descontoPrecoTeste1() {
        int expected = 60;
        int result = Bloco2.descontoPreco(200.1);
        assertEquals(expected, result, 0.1);
    }
    @Test
    void descontoPrecoTeste2() {
        int expected = 40;
        int result = Bloco2.descontoPreco(200);
        assertEquals(expected, result, 0.1);
    }
    @Test
    void descontoPrecoTeste3() {
        int expected = 30;
        int result = Bloco2.descontoPreco(100);
        assertEquals(expected, result, 0.1);
    }
    @Test
    void descontoPrecoTeste4() {
        int expected = 20;
        int result = Bloco2.descontoPreco(50);
        assertEquals(expected, result, 0.1);
    }
    @Test
    void descontoPrecoTeste5() {
        int expected = 40;
        int result = Bloco2.descontoPreco(100.1);
        assertEquals(expected, result, 0.1);
    }
    // testes ex 11 : d). Não funcionam com as alterações feita em e)
   /* @Test
    void classificaTurmaTeste1() {
        String expected = "Turma Má";
        String result = Bloco2.classificaTurma(0.1);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste2() {
        String expected = "Turma Fraca";
        String result = Bloco2.classificaTurma(0.2);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste3() {
        String expected = "Turma Razoável";
        String result = Bloco2.classificaTurma(0.6);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste4() {
        String expected = "Turma Boa";
        String result = Bloco2.classificaTurma(0.8);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste5() {
        String expected = "Turma Excelente";
        String result = Bloco2.classificaTurma(0.95);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste6() {
        String expected = "Valor Inválido";
        String result = Bloco2.classificaTurma(1.1);
        assertEquals(expected, result);
    }
    @Test
    void classificaTurmaTeste7() {
        String expected = "Valor Inválido";
        String result = Bloco2.classificaTurma(-0.1);
        assertEquals(expected, result);
    }*/
    // testes ex 11 : e)
    @Test
    void classificaTurmaTeste1() {
        String expected = "Turma Fraca";
        String result = Bloco2.classificaTurma(0.4,0.2,0.5,0.7,0.9);
        assertEquals(expected, result);
    }
    // testes ex 12
    @Test
    void indicePoluicaoTeste1() {
        String expected = "Valor inválido";
        String result = Bloco2.indicePoluicao(-0.1);
        assertEquals(expected, result);
    }
    @Test
    void indicePoluicaoTeste2() {
        String expected = "Valor OK";
        String result = Bloco2.indicePoluicao(0.3);
        assertEquals(expected, result);
    }
    @Test
    void indicePoluicaoTeste3() {
        String expected = "Grupo empresas 1 suspendem actividade";
        String result = Bloco2.indicePoluicao(0.4);
        assertEquals(expected, result);
    }
    @Test
    void indicePoluicaoTeste4() {
        String expected = "Grupo empresas 1 e 2 suspendem actividade";
        String result = Bloco2.indicePoluicao(0.5);
        assertEquals(expected, result);
    }
    @Test
    void indicePoluicaoTeste5() {
        String expected = "Grupo empresas 1, 2 e 3 suspendem actividade";
        String result = Bloco2.indicePoluicao(0.6);
        assertEquals(expected, result);
    }
    // testes ex 13
    @Test
    void horasJardimTeste1() {
        double expected = 10.6;
        double result = Bloco2.horasJardim(100,10,5);
        assertEquals(expected, result,0.1);
    }
    @Test
    void custoJardimTeste1() {
        double expected = 1380.6;
        double result = Bloco2.custoJardim(100,10,5);
        assertEquals(expected, result,0.1);
    }
    // testes ex 14
    @Test
    void mediaKmDistanciaTeste1() {
        double expected = 3.2;
        double result = Bloco2.mediaKmDistancia(2,2,2,2,2);
        assertEquals(expected, result,0.1);
    }
    // testes ex 15
    @Test
    void classificaTrianguloTeste1() {
        String expected = "Medidas inválidas";
        String result = Bloco2.classificaTriangulo(30,5,5);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloTeste2() {
        String expected = "Medidas inválidas";
        String result = Bloco2.classificaTriangulo(5,56,2);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloTeste3() {
        String expected = "Medidas inválidas";
        String result = Bloco2.classificaTriangulo(5,10,16);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloTeste4() {
        String expected = "Escaleno";
        String result = Bloco2.classificaTriangulo(5,10,6);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloTeste5() {
        String expected = "Equilátero";
        String result = Bloco2.classificaTriangulo(5,5,5);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloTeste6() {
        String expected = "Isósceles";
        String result = Bloco2.classificaTriangulo(5,5,2);
        assertEquals(expected, result);
    }
    // testes ex 16
    @Test
    void classificaTrianguloAngulosTeste1() {
        String expected = "Medidas inválidas";
        String result = Bloco2.classificaTrianguloAngulos(90,90,30);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloAngulosTeste2() {
        String expected = "Medidas inválidas";
        String result = Bloco2.classificaTrianguloAngulos(90,62,30);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloAngulosTeste3() {
        String expected = "Retângulo";
        String result = Bloco2.classificaTrianguloAngulos(90,45,45);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloAngulosTeste4() {
        String expected = "Obtusângulo";
        String result = Bloco2.classificaTrianguloAngulos(100,40,40);
        assertEquals(expected, result);
    }
    @Test
    void classificaTrianguloAngulosTeste5() {
        String expected = "Acutângulo";
        String result = Bloco2.classificaTrianguloAngulos(60,60,60);
        assertEquals(expected, result);
    }
    // testes ex 17
    @Test
    void tempoChegadaCPTeste1() {
        String expected = "18:15, Data: Próprio dia"; // msg = horasChegada + ":" + minutosChegada + ", Data: " + diaChegada;
        String result = Bloco2.tempoChegadaCP(17,05,1,10);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste2() {
        String expected = "19:49, Data: Próprio dia";
        String result = Bloco2.tempoChegadaCP(17,59,1,50);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste3() {
        String expected = "1:0, Data: Dia seguinte";
        String result = Bloco2.tempoChegadaCP(20,0,5,0);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste4() {
        String expected = "3:0, Data: Dia seguinte";
        String result = Bloco2.tempoChegadaCP(22,0,5,0);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste5() {
        String expected = "0:0, Data: Dia seguinte";
        String result = Bloco2.tempoChegadaCP(20,0,4,0);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste6() {
        String expected = "0:10, Data: Dia seguinte";
        String result = Bloco2.tempoChegadaCP(20,10,4,0);
        assertEquals(expected, result);
    }
    @Test
    void tempoChegadaCPTeste7() {
        String expected = "1:0, Data: Dia seguinte";
        String result = Bloco2.tempoChegadaCP(20,60,4,0);
        assertEquals(expected, result);
    }
    // testes ex 18
    @Test
    void processamentoTarefaTeste1() {
        String expected = "8:15:5"; // msg = horasFim + ":" + minutosFim + ":" + segundosFim;
        String result = Bloco2.processamentoTarefa(7,15,5,3600);
        assertEquals(expected, result);
    }
    @Test
    void processamentoTarefaTeste2() {
        String expected = "10:17:59";
        String result = Bloco2.processamentoTarefa(5,17,59,18000);
        assertEquals(expected, result);
    }
    @Test
    void processamentoTarefaTeste3() {
        String expected = "1:59:59";
        String result = Bloco2.processamentoTarefa(20,59,59,18000);
        assertEquals(expected, result);
    }
    @Test
    void processamentoTarefaTeste4() {
        String expected = "21:59:59";
        String result = Bloco2.processamentoTarefa(20,59,59,90000);
        assertEquals(expected, result);
    }
    // testes ex 19
    @Test
    void salarioSemanalTeste1() {
        double expected = 270;
        double result = Bloco2.salarioSemanal(36);
        assertEquals(expected, result,0.01);
    }
    @Test
    void salarioSemanalTeste2() {
        double expected = 280;
        double result = Bloco2.salarioSemanal(37);
        assertEquals(expected, result,0.01);
    }
    @Test
    void salarioSemanalTeste3() {
        double expected = 335;
        double result = Bloco2.salarioSemanal(42);
        assertEquals(expected, result,0.01);
    }
    @Test
    void salarioSemanalTeste4() {
        double expected = 380;
        double result = Bloco2.salarioSemanal(45);
        assertEquals(expected, result,0.01);
    }
    @Test
    void salarioSemanalTeste5() {
        double expected = 0;
        double result = Bloco2.salarioSemanal(0);
        assertEquals(expected, result,0.01);
    }
    @Test
    void salarioSemanalTeste6() {
        double expected = 0;
        double result = Bloco2.salarioSemanal(-10);
        assertEquals(expected, result,0.01);
    }
    // testes ex 20
    @Test
    void valorAluguerTeste1() {
        double expected = 60;
        double result = Bloco2.valorAluguer(1,"A",10,false);
        assertEquals(expected, result,0.01);
    }
    @Test
    void valorAluguerTeste2() {
        double expected = 50;
        double result = Bloco2.valorAluguer(2,"A",10,false);
        assertEquals(expected, result,0.01);
    }
    @Test
    void valorAluguerTeste3() {
        double expected = 120;
        double result = Bloco2.valorAluguer(2,"C",10,false);
        assertEquals(expected, result,0.01);
    }
    @Test
    void valorAluguerTeste4() {
        double expected = 70;
        double result = Bloco2.valorAluguer(2,"B",10,false);
        assertEquals(expected, result,0.01);
    }
    @Test
    void valorAluguerTeste5() {
        double expected = 50;
        double result = Bloco2.valorAluguer(2,"A",5,true);
        assertEquals(expected, result,0.01);
    }
}