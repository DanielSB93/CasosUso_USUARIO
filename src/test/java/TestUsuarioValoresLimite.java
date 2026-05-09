import modelo.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestUsuarioValoresLimite {

    Usuario usuario;

// ==========================================
    // CASOS DE PRUEBA POSITIVOS (TRUE)
    // ==========================================

    @Test
    void TL1_VL2_VL8_CE13_VL14(){
        usuario = new Usuario("12", "aB34", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL2_VL2_VL9_CE13_VL14(){
        usuario = new Usuario("12", "aB345", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL3_VL2_VL10_CE13_VL14(){
        usuario = new Usuario("12", "aB3456", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL4_VL2_VL11_CE13_VL14(){
        usuario = new Usuario("12", "aB34567", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL5_VL3_VL8_CE13_VL15(){
        usuario = new Usuario("123", "aB34", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL6_VL3_VL9_CE13_VL15(){
        usuario = new Usuario("123", "aB345", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL7_VL3_VL10_CE13_VL15(){
        usuario = new Usuario("123", "aB3456", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL8_VL3_VL11_CE13_VL15(){
        usuario = new Usuario("123", "aB34567", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL9_VL4_VL8_CE13_VL14(){
        usuario = new Usuario("1234", "aB34", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL10_VL4_VL9_CE13_VL14(){
        usuario = new Usuario("1234", "aB345", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL11_VL4_VL10_CE13_VL14(){
        usuario = new Usuario("1234", "aB3456", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL12_VL4_VL11_CE13_VL14(){
        usuario = new Usuario("1234", "aB34567", 18, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL13_VL5_VL8_CE13_VL15(){
        usuario = new Usuario("12345", "aB34", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL14_VL5_VL9_CE13_VL15(){
        usuario = new Usuario("12345", "aB345", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL15_VL5_VL10_CE13_VL15(){
        usuario = new Usuario("12345", "aB3456", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    @Test
    void TL16_VL5_VL11_CE13_VL15(){
        usuario = new Usuario("12345", "aB34567", 19, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    // ==========================================
    // CASOS DE PRUEBA NEGATIVOS (FALSE)
    // ==========================================

    @Test
    void TL17_VL1_VL8_CE13_VL14(){
        usuario = new Usuario("1", "aB34", 18, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TL18_VL6_VL8_CE13_VL14(){
        usuario = new Usuario("123456", "aB34", 18, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TL19_VL2_VL7_CE13_VL14(){
        usuario = new Usuario("12", "aB3", 18, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TL20_VL2_VL12_CE13_VL14(){
        usuario = new Usuario("12", "aB345678", 18, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TL21_VL2_VL8_CE13_VL13(){
        usuario = new Usuario("12", "aB34", 17, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }
}
