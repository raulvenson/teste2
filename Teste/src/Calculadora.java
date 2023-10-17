public class Calculadora {

    double calcularMedia(double primeiroNumero, double segundoNumero, double... numerosAdicionais) {

        double soma = primeiroNumero + segundoNumero;
        for (double numero : numerosAdicionais) {
            soma += numero;
        }
        return soma / (numerosAdicionais.length + 2);
    }
}
