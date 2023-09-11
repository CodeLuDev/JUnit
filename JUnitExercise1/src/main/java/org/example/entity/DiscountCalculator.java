package org.example.entity;
/*
Español:
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).

English:
Discount Calculator:
Create a DiscountCalculator class that calculates the discount applied to a product.
Write unit tests to verify that the discount calculation is successful
for different scenarios (for example, 10% discount, maximum discount, no discount, etc.).
 */
public class DiscountCalculator {

    public double calculateDiscount(double price, int discountPercentage) {
        return price - (price * discountPercentage) / 100;
    }
}

