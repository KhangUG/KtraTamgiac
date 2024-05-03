import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.TriangleType;

public class TriangleTypeTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều", TriangleType.getTriangleType(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", TriangleType.getTriangleType(3, 3, 5));
        assertEquals("Tam giác cân", TriangleType.getTriangleType(3, 5, 3));
        assertEquals("Tam giác cân", TriangleType.getTriangleType(5, 3, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Tam giác vuông", TriangleType.getTriangleType(3, 4, 5));
        assertEquals("Tam giác vuông", TriangleType.getTriangleType(5, 3, 4));
        assertEquals("Tam giác vuông", TriangleType.getTriangleType(4, 5, 3));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Không là tam giác", TriangleType.getTriangleType(0, 5, 5));
        assertEquals("Không là tam giác", TriangleType.getTriangleType(1, 2, 3));
        assertEquals("Tam giác cân", TriangleType.getTriangleType(5, 5, 12));
    }
}
