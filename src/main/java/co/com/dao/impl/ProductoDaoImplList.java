package co.com.dao.impl;

import co.com.dao.IProductoDao;
import co.com.poli.data.ProductoData;
import co.com.poli.model.Producto;
import java.util.List;

/**
 *
 * @author Usuario
 */

public class ProductoDaoImplList implements IProductoDao{

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        Producto buscar = new Producto(codigo);
        return listado.get(listado.indexOf(buscar));
    }

    @Override
    public void crearProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListado();
        listado.add(producto);
        ProductoData.setListado(listado);
    }

    @Override
    public void eliminarProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        listado.remove(new Producto (codigo));
        ProductoData.setListado(listado);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
