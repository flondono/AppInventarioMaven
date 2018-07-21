package co.com.poli.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor

public class Producto {

    @NonNull private String codigo;
    @EqualsAndHashCode.Exclude private String nombre;
    @EqualsAndHashCode.Exclude private double stock;
    @EqualsAndHashCode.Exclude private double cantidad;
}
