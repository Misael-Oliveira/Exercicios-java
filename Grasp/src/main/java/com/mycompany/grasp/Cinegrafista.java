
package com.mycompany.grasp;

public class Cinegrafista {
    private Camera camera;
    
    public Cinegrafista(Camera camera){
        this.camera = camera;
    }
    
    public void iniciarGravacao() {
        System.out.println("O cinegrafista esta se preparando para gravar...");
        camera.gravar();
    }
    
    public void trocarCamera(Camera novaCamera) {
        this.camera = novaCamera;
        System.out.println("A camera foi trocada.");
    }
    
    public void pararGravacao(){
        
    }
}
