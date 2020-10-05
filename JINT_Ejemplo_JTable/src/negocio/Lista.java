/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author a2
 */
public class Lista {
    private String presidente;
    private String vice;
    private int votos;

    public Lista(String presidente, String vice, int votos) {
        this.presidente = presidente;
        this.vice = vice;
        this.votos = votos;
    }

    public String getPresidente() {
        return presidente;
    }

    public String getVice() {
        return vice;
    }

    public int getVotos() {
        return votos;
    }

    @Override
    public String toString() {
        return "Lista{" + "presidente=" + presidente + ", vice=" + vice + ", votos=" + votos + '}';
    }
    
    
        
}
