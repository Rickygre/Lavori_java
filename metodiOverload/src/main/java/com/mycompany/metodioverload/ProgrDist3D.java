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

    }

}
