package com.mycompany.metodioverload;

import javax.swing.JOptionPane;

public class ProgrDist3D {

    public static void main(String[] args) {
        float x, y, z;

        x = Tool.insNumero("dimmi x: ");
        y = Tool.insNumero("dimmi y: ");
        z = Tool.insNumero("dimmi z: ");
        float distanza = Tool.dist3D(x, y, z);
        System.out.println("x: :" + x);
        System.out.println("y: :" + y);
        System.out.println("z: :" + z);
        System.out.println("distanza" + distanza);

        //creo le dimensioni degli array
        int dim1 = (int) Tool.insNumero("dimmi dim 1:");
        int dim2 = (int) Tool.insNumero("dimmi dim 2:");

        //creo array con cui lavorare
        int ar1[] = new int[2000];
        int ar2[] = new int[dim2];
        int arOk[] = new int[dim1 + dim2];
        ar1 = Tool.loadDataInt(ar1, 500);
        ar2 = Tool.loadDataInt(ar2, 5);
        arOk = Tool.concatArrays(ar1, ar2);
        /*System.out.println("primo elemento" + ar1[0]);
        System.out.println("concatenzione array" + Tool.concatArrays(ar1, ar2));*/

        int[] file = {123, 234, 354, 456, 354, 234, 123, 234};
        file = Tool.concatArrays(ar1, file);
        //definisco virus
        int[] virus = {3, 3, 3};
        int posvirus = Tool.cercaVirus(file, virus);

    }

}
