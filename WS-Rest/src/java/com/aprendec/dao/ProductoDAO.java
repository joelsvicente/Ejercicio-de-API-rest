/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aprendec.dao;
 
import com.aprendec.dao.beans.ProductoDTO;
import java.util.List;
 
public interface ProductoDAO {
 
    public String obtenerCodProd();
 
    public ProductoDTO obtenerProducto(String codigo);
 
    public List<ProductoDTO> listarProductos(String nombre);
 
    public int registrarProducto(ProductoDTO productoDTO);
 
    public int actualizarProducto(ProductoDTO productoDTO);
 
    public int eliminarProducto(String codigo);
 
}