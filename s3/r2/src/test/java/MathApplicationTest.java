import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {


        @Mock
        CalculadoraService calService;

        @InjectMocks
        MathApplication mathApp;

    @Test
    public void testAdd() {

        when(calService.add(10.0, 20.0)).thenReturn(30.00);

        assertEquals(mathApp.add(10.0, 20.0), 30.0, 0);

        verify(calService).add(20.0, 30.0);
    }


}