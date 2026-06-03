/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grasp;

/**
 *
 * @author misael.oliveira
 */
public class Grasp {

    public static void main(String[] args) {
        Camera dslr = new CameraDSLR ();
        Camera actionCam = new CameraAction();
        
        Cinegrafista cinegrafista = new Cinegrafista(dslr);
        cinegrafista.iniciarGravacao();
        
        cinegrafista.trocarCamera(actionCam);
        cinegrafista.iniciarGravacao();
    }
}
