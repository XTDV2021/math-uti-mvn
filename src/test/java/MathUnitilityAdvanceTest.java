/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.Thu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author buiva
 */
public class MathUnitilityAdvanceTest {
    public static Object [][] initTestData(){
        Object testData [][] = {{0,1}, 
                                {1,1}, 
                                {2,2}, 
                                {4,24},
                                {6,720}};
        return testData;
    }
@ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
  
    // DDT là phần mở rộng thêm cho TDD tức là giúp cho code test (Unit Test)
    // có nhiều cột, các cột chính là data đưa vào và expected
    // và ta cần có nhiều dòng như thế , ứng với các tét case
    // và mang 2 chiều này fill/ đồ từ từ vào trong hàm assertequals()
    // 
    // 
}
