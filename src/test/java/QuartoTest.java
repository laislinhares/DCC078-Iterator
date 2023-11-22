import org.example.Controle;
import org.example.Hotel;
import org.example.Quarto;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuartoTest {

    @Test
    public void deveContarAlunosAtivosCurso() {
        Hotel hotel = new Hotel(
                new Quarto(1, true),
                new Quarto(2, true),
                new Quarto(3, false),
                new Quarto(4, true)
        );
        assertEquals(3, Controle.contarQuartosDisponiveis(hotel));
    }
}
