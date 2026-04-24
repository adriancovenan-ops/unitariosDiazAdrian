import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTest{

    @Test
    void testEsPerfecto() {

        assertTrue(FuncionesEval.esPerfecto(6));
        assertTrue(FuncionesEval.esPerfecto(28));

        assertFalse(FuncionesEval.esPerfecto(65149561));
        assertFalse(FuncionesEval.esPerfecto(3));
    }

    @Test
    void testGetTipoClima() {
        assertEquals("FRIO", FuncionesEval.getTipoClima(10));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(20));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(30));
        assertEquals("TROPICAL", FuncionesEval.getTipoClima(31));
    }

    @Test
    void testInvertirArray() {
        int[] sinInvertir = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] invertido = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(invertido, FuncionesEval.invertirArray(sinInvertir));

    }

/*@Test
void contarApariciones() {
    assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
    assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
    assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
}

@Test
void testEncontrarMayor() {
    int[] array1 = {1, 3, 2, 5, 4};
    assertEquals(5, FuncionesEval.encontrarMayor(array1));

    int[] array2 = {-1, -2, -3, -4};
    assertEquals(-1, FuncionesEval.encontrarMayor(array2));

    int[] array3 = {10};
    assertEquals(10, FuncionesEval.encontrarMayor(array3));

    int[] array4 = {};
    assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

    int[] array5 = null;
    assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
}
*/

}