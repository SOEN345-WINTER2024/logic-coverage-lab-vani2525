import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckItTest {


    // Predicate Coverage
    @Test
    public void testPTrue() {
        boolean a = true;
        boolean b = true;
        boolean c = true;

        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void testPFalse() {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        boolean p = a || (b && c);
        assertFalse(p);
    }

    // ----------------------------------------
    // Clause Coverage
    @Test
    public void test_aT_bcF() {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test_aF_bcT() {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    // ----------------------------------------
    //Combinatorinal Coverage
    @Test
    public void test1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test2() {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test3() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test4() {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test5() {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test6() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        boolean p = a || (b && c);
        assertFalse(p);
    }

    @Test
    public void test7() {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test8() {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean p = a || (b && c);
        assertFalse(p);
    }

    //------------------------------------------

    // Restricted Active Clause Coverage
    @Test
    public void test_aT() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test_aF_bcTr() {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test_aF_bF_cT() {
        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    // Test where clause 'a' is false and 'b' is true, 'c' is false
    @Test
    public void test_a_F_b_T_c_F() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        boolean p = a || (b && c);
        assertTrue(p);
    }

    @Test
    public void test_a_F_b_F_c_F() {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean p = a || (b && c);
        assertFalse(p);
    }

}