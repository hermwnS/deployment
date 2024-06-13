/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author HP
 */
public class KalkulatorTest {
    @Test
    public void testPenjumlahan(){
        assertEquals(10, Kalkulator.hitung(5, 5, '+'), 0.001);
    }
    
    @Test
    public void testPengurangan(){
        assertEquals(2, Kalkulator.hitung(7, 5, '-'), 0.001);
    }
    
    @Test
    public void testPerkalian(){
        assertEquals(25, Kalkulator.hitung(5, 5, '*'), 0.001);
    }
    
    @Test
    public void testPembagian(){
        assertEquals(2, Kalkulator.hitung(10, 5, '/'), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPembagianDenganNol(){
        Kalkulator.hitung(10, 0, '/');
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testOperatorTidakValid(){
        Kalkulator.hitung(10, 5, '%');
    }
}
