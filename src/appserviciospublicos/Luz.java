/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appserviciospublicos;

/**
 *
 * @author Carolina Maria Camacho Zambrano
 */
public class Luz {
    private int estrato;
    private int consumo;
    private double Luz;
    private double costo_total;
    private double descuento_sobrecosto;
    private double impuesto;
    private double Total;

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getLuz() {
        return Luz;
    }

    public void setLuz(double Luz) {
        this.Luz = Luz;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public double getDescuento_sobrecosto() {
        return descuento_sobrecosto;
    }

    public void setDescuento_sobrecosto(double descuento_sobrecosto) {
        this.descuento_sobrecosto = descuento_sobrecosto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        this.Total = total;
    }

    public double calcular_costo_total() {
        costo_total = (consumo * Luz);
        return costo_total;
    }

    public double valor_descuento_sobrecosto() {
        if (estrato >= 1 && estrato <= 2) {
            descuento_sobrecosto = (costo_total * 0.5);
        } else if (estrato >= 3 && estrato <= 4) {
            descuento_sobrecosto = (costo_total * 0.1);
        } else if (estrato >= 5 && estrato <= 6) {
            descuento_sobrecosto = (costo_total * 0.25);
        }
        return descuento_sobrecosto;
    }

    public double valor_impuesto() {
        impuesto = (costo_total * 0.01);
        return impuesto;
    }

    public double valor_total_pagar() {
        if (estrato >= 1 && estrato <= 2) {
            Total = (consumo * Luz) - (consumo * Luz * 0.5) + (consumo * Luz * 0.01);
        } else if (estrato >= 3 && estrato <= 4) {
            Total = (consumo * Luz) - (consumo * Luz * 0.1) + (consumo * Luz * 0.01);
        } else if (estrato >= 5 && estrato <= 6) {
            Total = (consumo * Luz) + (consumo * Luz * 0.25) + (consumo * Luz * 0.01);
        } else {
            System.out.println("Error en estrato");
        }
        return Total;
    }
}
