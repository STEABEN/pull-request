import org.junit.*;

import static org.junit.Assert.assertEquals;

// 测试用例设计的总体原则：
// 1. 等价类划分原则：将输入分为有效和无效的等价类，并为每个等价类设计测试用例。
// 2. 边界值分析：特别关注版本号的边界情况，如长度不同、包含前导零等。
// 3. 正向测试和负向测试：包括正常情况和异常情况的测试。
// 4. 测试覆盖：确保所有代码路径都被覆盖。
public class L2022212004_15_Test {


    //测试版本号相等且带有前导0的情况
    //输入：version1=“1.01”， version2=“1.001”
    //输出：0
    @Test
    public void testEqual() {
        Solution15 Solution15 = new Solution15();
        String version1 = "1.01";
        String version2 = "1.001";
        int expected = 0;
        int actual = Solution15.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }


    //测试版本号长度不同的情况
    //输入：version1=“1.0”， version2=“1.0.0.0”
    //输出：0
    @Test
    public void testWithDifferentLengths() {
        Solution15 Solution15 = new Solution15();
        String version1 = "1.0";
        String version2 = "1.0.0.0";
        int expected = 0;
        int actual = Solution15.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    //测试version1 大于 version2的情况
    //输入：version1=“1.0.5”， version2=“1.0.2”
    //输出：1
    @Test
    public void testGreaterThan() {
        Solution15 Solution15 = new Solution15();
        String version1 = "1.0.5";
        String version2 = "1.0.2";
        int expected = 1;
        int actual = Solution15.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    //测试version1 小于 version2的情况
    //输入：version1=“01”， version2=“10.0”
    //输出：-1
    @Test
    public void testLessThan() {
        Solution15 Solution15 = new Solution15();
        String version1 = "01";
        String version2 = "10.0";
        int expected = -1;
        int actual = Solution15.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }

    //测试版本号带有前导0的情况
    //输入：version1=“01”， version2=“1”
    //输出：0
    @Test
    public void testWithLeadingZeros() {
        Solution15 Solution15 = new Solution15();
        String version1 = "01";
        String version2 = "1";
        int expected = 0;
        int actual = Solution15.compareVersion(version1, version2);
        assertEquals(expected, actual);
    }



    //测试版本号为空的情况
    //输入：version1=NULL， version2=“1.0”
    //输出：NullPointerException异常
    @Test(expected =NullPointerException.class)
    public void testWithNull() {
        Solution15 Solution15 = new Solution15();
        String version1 = null;
        String version2 = "1.0";
        Solution15.compareVersion(version1, version2);

    }
}
