/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soporte;

import negocio.Lista;

/**
 *
 * @author a2
 */
public class Arreglo {

    private Object v[];
    private int count = 0;

    public Arreglo() {
        v = new Object[1];
    }

    public void generar() {
        String presidentes[] = {"Macri", "Scioli", "Massa", "Stolbizer", "De La Sota", "Menem","Batman","Tom"};
        String vices[] = {"Michetti", "Zanini", "Saenz", "Olaviaga", "Rucci", "Cavallo","Robin","Jerry"};
        v = new Object[presidentes.length];
        for (int i = 0; i < v.length; i++) {
            int votos = (int) (20000 * Math.random());
            v[i] = new Lista(presidentes[i], vices[i], votos);
            count++;
        }
    }

    public int getSize() {
        return count;
    }

    public Object getItem(int pos) {
        if (pos >= 0 && pos < v.length) {
            return v[pos];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            str = str + "\nv[" + i + "]:" + v[i];
        }
        return str;
    }

}
