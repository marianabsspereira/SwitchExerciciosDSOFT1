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
        //exercicio 11, bloco 2: c). Tb não funciona com alterações feitas em e)
        /*System.out.println("Introduzir aprovados ]0,1[");
        double aprovados = sc.nextDouble();
        System.out.println(Bloco2.classificaTurma(aprovados));*/

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
    //exercicio 9, bloco 2
    public static boolean crescente (int numero){
        int digito3 = numero % 10;
        int digito2 = (numero / 10) % 10;
        int digito1 = (numero / 100);
        boolean resultado;

        if (numero<100 || numero>999){
            resultado = false; //se numero nao tem 3 digitos devolve false
        }
        if (digito3>digito2 && digito3>digito1){
            if (digito2>digito1){
                resultado = true;
            } else {
                resultado = false;
            }
        } else {
            resultado = false;
        }
        return resultado;
    }
    //exercicio 10, bloco 2
    public static int descontoPreco (double preco){
        int desconto;
        if (preco > 200){
            desconto = 60;
        } else if (preco > 100 && preco <= 200) {
            desconto = 40;
        } else if (preco > 50 && preco <= 100) {
            desconto = 30;
        } else {
            desconto = 20;
        }
        return desconto;
    }
    //exercicio 11, bloco 2: a) classifica a turma com base na % de alunos aprovados
   public static String classificaTurma (double aprovados, double lim1, double lim2, double lim3, double lim4){
        String resultado;

        if (aprovados<0 || aprovados>1){
            resultado = "Valor Inválido";
        } else if (aprovados < lim1){ // b) (aprovados < 0.2)
            resultado = "Turma Má";
        } else if (aprovados < lim2){ // b) (aprovados < 0.5)
            resultado = "Turma Fraca";
        } else if (aprovados < lim3){ // b) (aprovados < 0.7)
            resultado = "Turma Razoável";
        } else if (aprovados < lim4){ // b) (aprovados < 0.9)
            resultado = "Turma Boa";
        } else {
            resultado = "Turma Excelente";
        }

        return resultado;
   }
   //exercicio 12, bloco 2
    public static String indicePoluicao (double indiceReal) {
        String msg;

        if (indiceReal < 0){
            msg = "Valor inválido";
        } else if (indiceReal >= 0 && indiceReal <= 0.3){
            msg = "Valor OK";
        } else if (indiceReal > 0.3 && indiceReal <= 0.4 ){
            msg = "Grupo empresas 1 suspendem actividade";
        } else if (indiceReal > 0.4 && indiceReal <= 0.5){
            msg = "Grupo empresas 1 e 2 suspendem actividade";
        } else {
            msg = "Grupo empresas 1, 2 e 3 suspendem actividade";
        }

        return msg;
    }
    //exercicio 13, bloco 2
    public static double horasJardim (double area, int nArvores, int nArbustos){
        double nHoras;
        int gramaTempo = 300;
        int arvoresTempo = 600;
        int arbustosTempo = 400;

        if (area < 0 || nArvores < 0 || nArbustos < 0){
            nHoras = Double.NaN;
        }
        nHoras = (area * gramaTempo + arvoresTempo * nArvores + arbustosTempo * nArbustos) / 60 / 60;

        return nHoras;
    }
    public static double custoJardim (double area, int nArvores, int nArbustos){
        double custo;
        int gramaCusto = 10;
        int arvoresCusto = 20;
        int arbustosCusto = 15;
        int custoHora = 10;

        if (area < 0 || nArvores < 0 || nArbustos < 0){
           custo = Double.NaN;
        }
        custo = (area * gramaCusto + arvoresCusto * nArvores + arbustosCusto * nArbustos) +
                Bloco2.horasJardim(area,nArvores,nArbustos) * custoHora ;

        return custo;
    }
    //exercicio 14, bloco 2
    public static double mediaKmDistancia (double milhasDia1,double milhasDia2,double milhasDia3,double milhasDia4,
                                           double milhasDia5)    {
        double media;

        if (milhasDia1<0 || milhasDia2<0 || milhasDia3<0 || milhasDia4<0 || milhasDia5<0){
            media = Double.NaN;
        }

        media = ((milhasDia1 + milhasDia2 + milhasDia3 + milhasDia4 + milhasDia5)/5) * 1.609;

        return media;
    }
    //exercicio 15, bloco 2
    public static String classificaTriangulo (double lado1, double lado2, double lado3){
        String resultado;
        if (lado1 < 0 || lado2 < 0 || lado3 < 0){
            resultado = "Medidas inválidas";
        } else if (lado1 >= lado2 + lado3 || lado2 >= lado3 + lado1 || lado3 >= lado2 + lado1 ){
            resultado = "Medidas inválidas";
        } else {
            if (lado1 == lado2 && lado1 == lado3){
                resultado = "Equilátero";
            } else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                resultado = "Escaleno";
            } else {
                resultado = "Isósceles";
            }
        }

        return resultado;
    }
    //exercicio 16, bloco 2
    public static String classificaTrianguloAngulos (double angulo1, double angulo2, double angulo3){
        String resultado;
        if (angulo1 < 0 || angulo2 < 0 || angulo3 < 0){
            resultado = "Medidas inválidas";
        } else if (angulo1 + angulo2 + angulo3 != 180){
            resultado = "Medidas inválidas";
        } else {
            if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90){
                resultado = "Retângulo";
            } else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
                resultado = "Obtusângulo";
            } else {
                resultado = "Acutângulo";
            }
        }

        return resultado;
    }
    //exercicio 17, bloco 2
    public static String tempoChegadaCP (int horaPartida, int minutosPartida, int duracaoHoras, int duracaoMinutos){
        int minutosChegada;
        int horasChegada = 0;
        String diaChegada;
        String msg;

        minutosChegada = minutosPartida + duracaoMinutos;
        if (minutosChegada >= 60){
            horasChegada = (int) (minutosChegada / 60);
            minutosChegada = (minutosPartida + duracaoMinutos) % 60;
        }
        horasChegada =  horasChegada + horaPartida + duracaoHoras;

        if (horasChegada >= 24){
            diaChegada = "Dia seguinte";
            horasChegada = horasChegada - 24;
        } else {
            diaChegada = "Próprio dia";
        }

        msg = horasChegada + ":" + minutosChegada + ", Data: " + diaChegada;

        return msg;
    }
    //exercicio 18, bloco 2 // assumindo que no tempo de inicio, horas <=24 e minutos e segundos < 60
    public static String processamentoTarefa (int horasInicio, int minutosInicio, int segundosInicio,
                                              int duracaoSegundos){
        String msg;
        int horasFim;
        int minutosFim;
        int segundosFim;
        int inicioEmSegundos = (horasInicio * 60 * 60) + (minutosInicio * 60) + segundosInicio;
        int fimEmSegundos = inicioEmSegundos + duracaoSegundos;

        horasFim = (fimEmSegundos / (60*60));
        minutosFim = (fimEmSegundos % (60*60)) / 60;
        segundosFim = fimEmSegundos - horasFim*60*60 - minutosFim*60;

        if (horasFim>=24) {
            horasFim = horasFim - 24;
        }

        msg = horasFim + ":" + minutosFim + ":" + segundosFim;

        return msg;
    }
    //exercicio 19, bloco 2
    public static double salarioSemanal (double horasSemanais){
        double horasSemanaisNormais = 36; //double so pq pode mudar ex: 36,5
        double valorHoraNormal = 7.5;
        double valorHoraExtra1 = 10;
        int valorLimite1 = 5;
        double valorHoraExtra2 = 15;
        double resultado;

        if (horasSemanais <= 0){
           return resultado = 0; // return para terminar a funçao caso valor seja 0 ou negativo
        }

        if (horasSemanais <= horasSemanaisNormais) {
            resultado =  horasSemanais * valorHoraNormal;
        } else if (horasSemanais > horasSemanaisNormais && horasSemanais <= (horasSemanaisNormais + valorLimite1)){
            resultado = horasSemanaisNormais * valorHoraNormal + (horasSemanais - horasSemanaisNormais)*valorHoraExtra1;
        } else {
            resultado = horasSemanaisNormais * valorHoraNormal + valorLimite1 * valorHoraExtra1
            + (horasSemanais - horasSemanaisNormais - valorLimite1) * valorHoraExtra2;
        }

        return resultado;
    }
    //exercicio 20, bloco 2 // Não tem protecção para valores inválidos
    public static double valorAluguer (int diaSemana, String tipoKit, double distanciaKm, boolean feriadoSimOuNao){
        double custoKitA = 30;
        double custoKitB = 50;
        double custoKitC = 100;
        double custoKitAExtra = 40;
        double custoKitBExtra = 70;
        double custoKitCExtra = 140;
        double precoKm = 2;
        double custoTotal;

        if (feriadoSimOuNao == false){
            if (diaSemana==2 || diaSemana==3 || diaSemana==4 || diaSemana==5 || diaSemana==6){
                if (tipoKit == "A"){
                    custoTotal = custoKitA + distanciaKm * precoKm;
                } else if (tipoKit == "B"){
                    custoTotal = custoKitB + distanciaKm * precoKm;
                } else {
                    custoTotal = custoKitC + distanciaKm * precoKm;
                }
            } else {
                if (tipoKit == "A"){
                    custoTotal = custoKitAExtra + distanciaKm * precoKm;
                } else if (tipoKit == "B"){
                    custoTotal = custoKitBExtra + distanciaKm * precoKm;
                } else {
                    custoTotal = custoKitCExtra + distanciaKm * precoKm;
                }
            }
        } else {
            if (tipoKit == "A"){
                custoTotal = custoKitAExtra + distanciaKm * precoKm;
            } else if (tipoKit == "B"){
                custoTotal = custoKitBExtra + distanciaKm * precoKm;
            } else {
                custoTotal = custoKitCExtra + distanciaKm * precoKm;
            }
        }

        return custoTotal;
    }
}
