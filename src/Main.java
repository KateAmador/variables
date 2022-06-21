import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Ejemplos de variables
        int edad=20;
        long a=4000000;
        double b=4.5, c=4.5;
        String nombre = "Abraham";

        System.out.println(edad);
        System.out.println("Mi nombre es: " + nombre);

        //Reglas variables
        int edad1 = 7;
        int Edad = 9;
        System.out.println(edad1);
        System.out.println(Edad);
        double indiceMasaCorporal = 22;
        double PI = 3.14159;
        System.out.println(indiceMasaCorporal);
        System.out.println(PI);

        //Numericos enteros
        int a1=10;
        long b1=20;
        byte c1=25;

        System.out.println("La suma de los tres es: " + (a1+b1+c1));

        //Numericos de punto flotante
        float variable = 2.5e2f;
        double variable2 = 2.67;

        System.out.println(variable);
        System.out.println(variable2);

        //Primitivo caracter o char

        //UNICODE
        char simbolo3 = '\u0026';
        System.out.println(simbolo3);

        //ASCII
        char simbolo2 = 38;
        System.out.println(simbolo2);

        //CAR
        char simbolo = '&';
        System.out.println(simbolo);

        char SaltoDeLinea='\n';
        char retroceso='\b';
        char tabulador='\t';
        char pricipioDeLinea='\r';
        char nuevaPagina='\f';
        char comillas='\"';
        char comillaSimples='\'';
        char barraInversa='\\';

        //Sistemas numericos
        int numero = 45;

        System.out.println("Nuestro numero es: " + numero);

        String numeroBinario = Integer.toBinaryString(numero);
        System.out.println("Numero en binario: " + numeroBinario);

        //0b prefijo para binario

        System.out.println("Numero en binario escrito en java: " + 0b111000010);
        System.out.println("Numero en hexadecimal: " + Integer.toHexString(numero));

        //0x prefijo para hexadecimal

        System.out.println("Numero hexadecimal escrito en java: " + 0x1c2);

        //0 prefijo para Octal

        System.out.println("Numero en octal: " + Integer.toOctalString(numero));
        System.out.println("Numero octal escrito en java: " + 0702);

        //Ventanas de dialogo
        String numero1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int numeroReal = Integer.parseInt(numero1);
        System.out.println("Nuestro numero es " + numeroReal);

        String numeroBinario1 = Integer.toBinaryString(numeroReal);
        System.out.println("Numero en binario " + numeroBinario1);
        System.out.println("Numero hexadecimal " + Integer.toHexString(numeroReal));
        System.out.println("Numero en octal " + Integer.toOctalString(numeroReal));

        String resultado = "Nuestro numero es " + numeroReal + "\nNumero en hexadecimal " + Integer.toHexString(numeroReal) + "\nNumero en binario " + numeroBinario1 + "\nNumero en octal " + Integer.toOctalString(numeroReal);

        JOptionPane.showMessageDialog(null, resultado);

        //Conversion de cadenas a primitivos
        String booleano = "true";
        boolean booleanoConvertido = Boolean.parseBoolean(booleano);
        System.out.println(booleanoConvertido);

        String decimales = "2.56";
        double decimalesConvertidos = Double.parseDouble(decimales);
        System.out.println(decimalesConvertidos);

        String entero = "395";
        int enteroConvertido = Integer.parseInt(entero);
        System.out.println(enteroConvertido);

        String flotante = "2.56e2f";
        float flotanteConvertido = Float.parseFloat(flotante);
        System.out.println(flotanteConvertido);

        //Primitivos a cadenas
        boolean cierto = true;
        String ciertoConvertido = Boolean.toString(cierto);

        int entero2 = 5687;
        String enteroConvertido2 = Integer.toString(entero2);

        float flotante2 = 2.56e2f;
        String flotanteConvertido2 = Float.toString(flotante2);

        double decimal2 = 23.678;
        String decimalConvertido2 = Double.toString(decimal2);

        String mensaje = ciertoConvertido + "\n" + enteroConvertido2 + "\n" + flotanteConvertido2 + "\n" + decimalConvertido2;
        System.out.println(mensaje);

        //Conversion entre primitivos
        int i = 400;
        short s = (short)i;
        System.out.println(s);

        long l = i;
        System.out.println(l);

        char c2 = (char)i;
        System.out.println(c2);
    }
}