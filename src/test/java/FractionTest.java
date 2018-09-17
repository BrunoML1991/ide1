import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(1,2);
    }

    @Test
    void testdecimal (){
             assertEquals(0.5,this.fraction.decimal(),10e-5);
    }
}

