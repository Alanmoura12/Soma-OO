    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alanm
 */
public class Soma {
    //atributos (boa partica deixar os atributos privados)
    private double v1;
    private double v2;
    private double total;
    
    
    //Metodos Getters e Setters (da para fazer clicando com o botão direito e indo em insert code)

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getTotal() {
        return total;
    }

    
    
    //metodos (geralmente é publico)
    public void calcularSoma(){
        total = v1 + v2;
    }
    
    
}
