
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import modelo.*;

class TestUsuarioCasosUso {

    Usuario usuario;

    // ==========================================
    // CASO VÁLIDO (Todas las celdas en verde)
    // ==========================================
    @Test
    void TC1_CE1_CE5_CE13_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "a@b.c");
        assertTrue(usuario.validarRegistro());
    }

    // ==========================================
    // TESTS PARA EL CAMPO 'USUARIO' (Celdas rojas CE2, CE3, CE4)
    // ==========================================
    @Test
    void TC2_CE2_CE5_CE13_CE20(){
        usuario = new Usuario(null, "aB345", 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC3_CE3_CE5_CE13_CE20(){
        usuario = new Usuario("", "aB345", 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC4_CE4_CE5_CE13_CE20(){
        usuario = new Usuario("12345678", "aB345", 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    // ==========================================
    // TESTS PARA EL CAMPO 'CONTRASEÑA' (Celdas rojas CE6 al CE12)
    // ==========================================
    @Test
    void TC5_CE1_CE6_CE13_CE20(){
        usuario = new Usuario("1234", null, 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC6_CE1_CE7_CE13_CE20(){
        usuario = new Usuario("1234", "aB3", 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC7_CE1_CE8_CE13_CE20(){
        usuario = new Usuario("1234", "aB34567890", 27, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC8_CE1_CE9_CE13_CE20(){
        usuario = new Usuario("1234", "B3456", 27, "a@b.c"); // Falta minúscula
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC9_CE1_CE10_CE13_CE20(){
        usuario = new Usuario("1234", "a3456", 27, "a@b.c"); // Falta mayúscula
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC10_CE1_CE11_CE13_CE20(){
        usuario = new Usuario("1234", "aBcde", 27, "a@b.c"); // Faltan números
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC11_CE1_CE12_CE13_CE20(){
        usuario = new Usuario("1234", "aB3?5", 27, "a@b.c"); // Carácter especial no permitido
        assertFalse(usuario.validarRegistro());
    }

    // ==========================================
    // TESTS PARA EL CAMPO 'CORREO' (Celdas rojas CE14 al CE19)
    // ==========================================
    @Test
    void TC12_CE1_CE5_CE14_CE20(){
        usuario = new Usuario("1234", "aB345", 27, null);
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC13_CE1_CE5_CE15_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "@b.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC14_CE1_CE5_CE16_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "ab.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC15_CE1_CE5_CE17_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "a@.c");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC16_CE1_CE5_CE18_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "a@bc");
        assertFalse(usuario.validarRegistro());
    }

    @Test
    void TC17_CE1_CE5_CE19_CE20(){
        usuario = new Usuario("1234", "aB345", 27, "a@b.");
        assertFalse(usuario.validarRegistro());
    }

    // ==========================================
    // TESTS PARA EL CAMPO 'EDAD' (Celda roja CE21)
    // ==========================================
    @Test
    void TC18_CE1_CE5_CE13_CE21(){
        usuario = new Usuario("1234", "aB345", 5, "a@b.c");
        assertFalse(usuario.validarRegistro());
    }
}
