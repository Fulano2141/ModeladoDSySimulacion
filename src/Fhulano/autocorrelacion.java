package Fhulano;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class autocorrelacion {
    public static void main(String args[]) throws IOException {
        int n;
        // int k;
        boolean imprimir = true;
        // double a1p, a2p, a3p;
        // double ttablas, varianza;
        // double SRC;
        // double STC, SEC;
        double[][] b;
        // double[] varBeta;
        // double[][] matC, matVar, d, ya;
        double[][] y, x;
        // double r = 0.0;
        System.out.println("---------------------------------------------------------- AR simple");
        y = cargarDatos.datosARSimpleYT3();
        x = cargarDatos.datosARSimpleXT3();
        // n = x.length;
        // // double ftablas = 2.1098;
        b = Betas.HallarBetas(x, y, false);
        // SRC = 0.0;
        // STC = 0.0;
        // SEC = 0.0;
        // k = x[0].length;
        // System.out.println(k);
        // // t de tablas con 95% de confianza
        // // ttablas = 2.1448;
        // // t de tablas con 90% de confianza
        // ttablas = 1.7613;
        // // Y aproximadas

        yuleWalker asWalker = new yuleWalker(b[0][0], b[1][0], b[2][0]);
        System.out.println(asWalker.toString());
        double[][] gamass = asWalker.gAmas(!imprimir);
        for (int i = 0; i < gamass.length; i++) {
            for (int j = 0; j < gamass[0].length; j++) {
                System.out.println("G[" + i + "]:" + Operaciones.redondearNum(gamass[i][j]));
            }
        }
        // ya = pruebaT.YAproximadas(b, x, y[0].length, k, !imprimir);
        // d = pruebaT.ObtenerSRCMat(y, ya);
        // System.out.println(pruebaT.YPromedio(y));
        // SRC = pruebaT.SumatoriaSRCMat(d, !imprimir);
        // STC = pruebaT.HallarSTC(y);
        // SEC = STC - SRC;
        // // SEC = pruebaT.HallarSEC(y);
        // pruebaT.srcstcsec(SRC, STC, SEC, true);
        // r = 1 - (SRC / STC);
        // // r = SEC / STC;
        // varianza = SRC / (n - k);
        // matC = pruebaT.ObtenerMatC(x);
        // matVar = pruebaT.ObtenerMatdevarianzas(matC, varianza, !imprimir);
        // varBeta = pruebaT.varianzaDeBetas(matVar, varianza);
        // System.out.println("Coeficiente de Determinacion: R^2 = " + r + "\t R = " +
        // Math.sqrt(r));
        // System.out.println("GL T-Student: " + "(" + n + "-" + b.length + ") = " + (n
        // - k));
        // pruebaT.significanciaIndividual(varBeta, varianza, matC, ttablas, imprimir);

        // System.out.println("----------------------------------------------------------
        // AR parcial");
        // imprimir = false;
        // y = cargarDatos.datosDYParaDT_1();
        // x = cargarDatos.datosDT_1();
        // betas = Betas.HallarBetas(x, y, imprimir);
        // a1p = betas[0];

        // y = cargarDatos.datosDYParaDT_2();
        // x = cargarDatos.datosDT_2();
        // betas = Betas.HallarBetas(x, y, imprimir);
        // a2p = betas[0];

        // y = cargarDatos.datosDYParaDT_3();
        // x = cargarDatos.datosDT_3();
        // betas = Betas.HallarBetas(x, y, imprimir);
        // a3p = betas[0];

        // yuleWalker aWalker = new yuleWalker(a1p, a2p, a3p);
        // System.out.println(aWalker.toString());

        // double[][] gamas = aWalker.gAmas(false);
        // for (int i = 0; i < gamas.length; i++) {
        // for (int j = 0; j < gamas[0].length; j++) {
        // System.out.println("G[" + i + "]: " + Operaciones.redondearNum(gamas[i][j]));
        // }
        // }
        double[][] ypro = new double[50][1];
        n = y.length;
        ypro[0][0] = gamass[0][0] * y[n - 1][0] + gamass[1][0] * y[n - 2][0] + gamass[2][0] * y[n - 3][0];
        ypro[1][0] = gamass[0][0] * ypro[0][0] + gamass[1][0] * y[n - 1][0] + gamass[2][0] * y[n - 2][0];
        ypro[2][0] = gamass[0][0] * ypro[1][0] + gamass[1][0] * ypro[0][0] + gamass[2][0] * y[n - 1][0];
        ypro[3][0] = gamass[0][0] * ypro[2][0] + gamass[1][0] * ypro[1][0] + gamass[2][0] * ypro[1][0];
        for (int i = 4; i < ypro.length; i++) {
            ypro[i][0] = gamass[0][0] * ypro[i - 1][0] + gamass[1][0] * ypro[i - 2][0] + gamass[2][0] * ypro[i - 3][0];
        }

        ArrayList<Double> y1 = new ArrayList<Double>();

        double[][] y1w = { { 1085.91 }, { 1246.99 }, { 1401.94 }, };
        for (int i = 0; i < y1w.length; i++) {
            y1.add(y1w[i][0]);
        }

        // ypro[0][0] = y[y.length-1][0] +y[];
        for (int i = 0; i < ypro.length; i++) {
            // try {
            y1.add(ypro[i][0] + y1.get(y1.size() - 1));
            // System.out.println(y1.get(i));

            // System.out.println(ypro[i][0]);
            // } catch (Exception e) {
            // // TOD handle exception
            // }
        }
        File file = new File("archivo.xls");
        FileWriter salida = new FileWriter(file);
        for (int i = 0; i < y1.size(); i++) {
            System.out.println(y1.get(i));
            salida.write((i + 1) + "");
            salida.write("\t");
            salida.write(Operaciones.redondearNum(y1.get(i)) + "");
            try {
                salida.write("\t");
                salida.write(Operaciones.redondearNum(ypro[i][0]) + "");
            } catch (Exception e) {

            }
            salida.write("\n");
        }

        salida.close();
    }

}