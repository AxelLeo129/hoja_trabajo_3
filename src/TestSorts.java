import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;


public class TestSorts extends TestCase{
	private Ordenador ordenador;
	private ArrayList< Integer > desordenados = new ArrayList<Integer>();
    private ArrayList< Integer > ordenados = new ArrayList<Integer>();
	
	public void escenario() {
		ordenador = new Ordenador();
        desordenados.add(6);
        desordenados.add(8);
        desordenados.add(12);
        desordenados.add(4);
        desordenados.add(2);

        ordenados.add(2);
        ordenados.add(4);
        ordenados.add(6);
        ordenados.add(8);
        ordenados.add(12);
	}
	
	/** 
	 * Testeo de GnomeSort
	 */
	@Test
	public void testGnome() {
		escenario();
		assertEquals(ordenador.gnomeSort(desordenados, 5), ordenados);
	}
	
	/** 
	 * Testeo de MergeSort
	 */
	@Test
	public void testMerge() {
		escenario();
		assertEquals(ordenador.mergeSort(desordenados), ordenados);
	}
	
	/** 
	 * Testeo de QuickSort
	 */
	@Test
	public void testQuick() {
		escenario();
		assertEquals(ordenador.quickSort(desordenados, 0, 4), ordenados);
	}
	
	/** 
	 * Testeo de RadixSort
	 */
	@Test
	public void testRadix() {
		escenario();
		assertEquals(ordenador.radixSort(desordenados), ordenados);
	}
	
	/** 
	 * Testeo de BubbleSort
	 */
	@Test
	public void testSelectionSort() {
		escenario();
		assertEquals(ordenador.selectionSort(desordenados), ordenados);
	}
	
	
}