import java.util.Scanner;

public class Bloco2 {

    public static void main(String[] args) {
        //exercicio 1, bloco 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzir notas");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        System.out.println("Introduzir pesos");
        double peso1 = sc.nextDouble();
        double peso2 = sc.nextDouble();
        double peso3 = sc.nextDouble();

        double mediaPesada = mediaPonderada(nota1,nota2,nota3,peso1,peso2,peso3);

        if (mediaPesada>=8.0){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno nao aprovado");
        }
    }
    //exercicio 1, bloco 2
    public static double mediaPonderada (double nota1, double nota2, double nota3, double peso1,
                                         double peso2, double peso3) {
        if (nota1<0 || nota2<0 || nota3<0 || peso1<0 || peso2<0 || peso3<0){
            return -1;
        } else {
            double mediaPesada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
            return mediaPesada;
        }
    }
    //exercicio 2, bloco 2
    public static String digitos (int numero){
        if (numero <100 || numero >999){
            return "Número não tem 3 dígitos";
        } else {
            int digito3 = numero % 10;
            int digito2 = (numero / 10) % 10;
            int digito1 = (numero / 100) % 10;
            return digito1 + " " + digito2 + " " + digito3 ;
        }
    }
    //exercicio 3, bloco 2
    public static double distancia2Pontos (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    //exercicio 4, bloco 2
    public static double funcaoX (double x){
        double auxiliar;
        if (x<=0){
            auxiliar = x;
        } else {
            auxiliar = Math.pow(x,2) - 2 * x;
        }
        return auxiliar;
    }
    //exercicio 5, bloco 2
    public static double areaVolume (double area){
        double aresta;
        double volume;

        if (area>0){
            aresta = Math.sqrt(area/6);
            volume = Math.pow(aresta,3);
        } else {
            volume = -1;
        }
        return volume;
    }
    public static String classificaCubo (double volume){
        String msg;
        if (volume == -1){
           msg = "Valor de área incorreto";
        } else if (volume/1000 <= 1 && volume != -1){
            msg = "Pequeno";
        } else if ((volume/1000 > 1) && (volume/1000 <= 2)){
            msg = "Médio";
        } else {
            msg = "Grande";
        }
        return msg;
    }
    //exercicio 6, bloco 2
    public static String horasMinutosSegundos (double tempoSegundos){
        String msg;
        if (tempoSegundos<0){
            msg = "Erro, tempo tem de ser positivo";
        } else if (tempoSegundos>86400){
            msg = "Erro, tempo tem de ser inferior a 24h";
        }

        int horas = (int) tempoSegundos / (60*60);
        int minutos = (int) ((tempoSegundos % 3600) / 60);
        int segundos = (int) (tempoSegundos - minutos * 60 - horas * 60 *60);
        msg = horas + ":" + minutos + ":" + segundos;

        if (tempoSegundos>=21600 && tempoSegundos < 43201){
            msg = "Bom dia" + "," + msg;
        } else if (tempoSegundos>=43201 && tempoSegundos < 72001){
            msg = "Boa tarde" + "," + msg;
        } else {
            msg = "Boa noite" + "," + msg;
        }
        return msg;
    }
    //exercicio 7, bloco 2
    public static double custoPintura (String tipoCusto, double areaEdificio, double custoLTinta,
                                       double areaPorLitroTinta, double salarioPintor){
        int numeroPintores;
        int rendimentoPintor = 2; //m2/hora
        double custoTinta;
        double custoMO;
        double custoTotal;
        double custoPretendido;

        if (areaEdificio>=0 && areaEdificio < 100){
            numeroPintores = 1;
        } else if (areaEdificio>=100 && areaEdificio < 300){
            numeroPintores = 2;
        } else if (areaEdificio>=300 && areaEdificio < 1000){
            numeroPintores = 3;
        } else if (areaEdificio>=1000) {
            numeroPintores = 4;
        } else {
            numeroPintores = 1;
        }

        if (areaEdificio<0 || custoLTinta <0 || areaPorLitroTinta<0 ||salarioPintor<0 ){
            custoTinta = 0;
            custoMO = 0;
            custoTotal = 0;
        } else {
            custoTinta = areaEdificio / areaPorLitroTinta * custoLTinta;
            custoMO = ((areaEdificio / (rendimentoPintor * numeroPintores))/8) * salarioPintor;
            custoTotal = custoTinta + custoMO;
        }

        if (tipoCusto == "Tinta"){
            custoPretendido = custoTinta;
        } else if (tipoCusto == "MO"){
            custoPretendido = custoMO;
        } else {
            custoPretendido = custoTotal;
        }

        return custoPretendido;
    }
    //exercicio 8, bloco 2
    public static String multiplos (int num1, int num2){
        String msg;
        if (num1 % num2 == 0){
            msg = num1 + " é múltiplo de " + num2;
        } else if (num2 % num1 == 0){
            msg = num2 + " é múltiplo de " + num1;
        } else {
            msg = num1 + " e " + num2 + " não são múltiplos";
        }
        return msg;
    }
}
