/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appserviciospublicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carolina Maria Camacho Zambrano
 */
public class AppServiciosPublicos {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int estrato, opcion = 1, consumo = 0;
        double Gas_Natural = 5234, Agua = 9256, Luz = 6200, Total = 0;
        double costo_total = 0, descuento_sobrecosto = 0, impuesto = 0;

        while (opcion >= 1 && opcion <= 4) {
            System.out.print("");
            System.out.println("PAGO DE SERVICIOS PÚBLICOS");
            System.out.println("Seleccione el servicio público: ");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");
            System.out.println("Opción: ");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Pago de Servicio de Energia");
                    System.out.println("Estrato del inmueble: ");
                    estrato = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble: ");
                    consumo = Integer.parseInt(leer.readLine());
                    Luz objluz = new Luz();
                    objluz.setConsumo(consumo);
                    objluz.setLuz(Luz);
                    objluz.setEstrato(estrato);
                    objluz.setCosto_total(costo_total);
                    objluz.setDescuento_sobrecosto(descuento_sobrecosto);
                    objluz.setImpuesto(impuesto);
                    objluz.setTotal(Total);
                    System.out.println("El consumo fue: " + objluz.getConsumo());
                    System.out.println("Valor unidad: " + objluz.getLuz());
                    System.out.println("Estrato del inmueble: " + objluz.getEstrato());
                    System.out.println("Costo total: " + objluz.calcular_costo_total());
                    System.out.println("Descuento o sobrecosto: -" + objluz.valor_descuento_sobrecosto());
                    System.out.println("Impuesto por infraestructura: " + objluz.valor_impuesto());
                    System.out.println("TOTAL A PAGAR: " + objluz.valor_total_pagar());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Pago de Servicio de Acueducto");
                    System.out.println("Estrato del inmueble: ");
                    estrato = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble: ");
                    consumo = Integer.parseInt(leer.readLine());
                    Agua objAgua = new Agua();
                    objAgua.setConsumo(consumo);
                    objAgua.setAgua(Agua);
                    objAgua.setEstrato(estrato);
                    objAgua.setCosto_total(costo_total);
                    objAgua.setDescuento_sobrecosto(descuento_sobrecosto);
                    objAgua.setImpuesto(impuesto);
                    objAgua.setTotal(Total);
                    System.out.println("El consumo fue: " + objAgua.getConsumo());
                    System.out.println("Valor unidad: " + objAgua.getAgua());
                    System.out.println("Estrato del inmueble: " + objAgua.getEstrato());
                    System.out.println("Costo total: " + objAgua.calcular_costo_total());
                    System.out.println("Descuento o sobrecosto: -" + objAgua.valor_descuento_sobrecosto());
                    System.out.println("Impuesto por infraestructura: " + objAgua.valor_impuesto());
                    System.out.println("TOTAL A PAGAR: " + objAgua.valor_total_pagar());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Pago de Servicio de Gas Natural");
                    System.out.println("Estrato del inmueble: ");
                    estrato = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble: ");
                    consumo = Integer.parseInt(leer.readLine());
                    Gas_Natural objGas_natural = new Gas_Natural();
                    objGas_natural.setConsumo(consumo);
                    objGas_natural.setGas_Natural(Gas_Natural);
                    objGas_natural.setEstrato(estrato);
                    objGas_natural.setCosto_total(costo_total);
                    objGas_natural.setDescuento_sobrecosto(descuento_sobrecosto);
                    objGas_natural.setImpuesto(impuesto);
                    objGas_natural.setTotal(Total);
                    System.out.println("El consumo fue: " + objGas_natural.getConsumo());
                    System.out.println("Valor unidad: " + objGas_natural.getGas_Natural());
                    System.out.println("Estrato del inmueble: " + objGas_natural.getEstrato());
                    System.out.println("Costo total: " + objGas_natural.calcular_costo_total());
                    System.out.println("Descuento o sobrecosto:" + objGas_natural.valor_descuento_sobrecosto());
                    System.out.println("Impuesto por infraestructura: " + objGas_natural.valor_impuesto());
                    System.out.println("TOTAL A PAGAR: " + objGas_natural.valor_total_pagar());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
