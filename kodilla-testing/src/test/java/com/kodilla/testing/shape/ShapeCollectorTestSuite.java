package com.kodilla.testing.shape;

    import org.junit.jupiter.api.*;

@DisplayName("ShapeCollector test suite")
public class ShapeCollectorTestSuite {


    @BeforeAll
    public static void beforeAllTests() {
        ShapeCollector collector = new ShapeCollector();
    }

    @Nested
    @DisplayName("ShapeCollector class tests")
    class TestShapeCollector {

        @Test
        @DisplayName("When you add shape to the ShapeCollector List, " +
                "than List should return, that it contains shape")
        void testCaseAddFigure() {
            Shape triangle = new Triangle();
            ShapeCollector collector1 = new ShapeCollector();
            collector1.addFigure(triangle);

            Object o = collector1.getFigure(0);
            System.out.println(o);
            Assertions.assertTrue(o instanceof Triangle);
        }

        @Test
        @DisplayName("When you remove shape to the ShapeCollector List, " +
                "than List should return, that it contains shape")
        void testCaseRemoveFigure() {
            Shape triangle = new Triangle();
            ShapeCollector collector2 = new ShapeCollector();
            collector2.addFigure(triangle);

            collector2.removeFigure(triangle);

            Assertions.assertNull(collector2.getFigure(0));
        }

        @Test
        @DisplayName("When you get shape from the ShapeCollector List by index, " +
                "than List should return shape")
        void testGetFigure() {
            Shape triangle = new Triangle();
            ShapeCollector collector3 = new ShapeCollector();
            collector3.addFigure(triangle);

            Shape s = collector3.getFigure(0);
            Assertions.assertEquals(triangle, s);
        }

        @Test
        @DisplayName("Concatenation of shapes in the List")
        void testShowFigures() {
            Shape triangle = new Triangle();
            ShapeCollector collector4 = new ShapeCollector();
            collector4.addFigure(triangle);

            String concatenation = collector4.showFigures();
            Assertions.assertEquals("Triangle", concatenation);
        }
    }
}
