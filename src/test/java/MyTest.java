import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MyTest {

    private Changer ch;

    @Before
    public void setUp() throws Exception {
        ch = new Changer();

    }

    @Test
    public void Fot1ShouldBeI() throws Exception {
            assertThat(ch.change(1)).isEqualTo("I");
    }

    @Test
    public void Fot2ShouldBeII() throws Exception {
        assertThat(ch.change(2)).isEqualTo("II");
    }

    @Test
    public void Fot4ShouldBeIV() throws Exception {
        assertThat(ch.change(4)).isEqualTo("IV");
    }

    @Test
    public void Fot5ShouldBeV() throws Exception {
        assertThat(ch.change(5)).isEqualTo("V");
    }

    @Test
    public void Fot6ShouldBeVI() throws Exception {
        assertThat(ch.change(6)).isEqualTo("VI");
    }

    @Test
    public void Fot9ShouldBeIX() throws Exception {
        assertThat(ch.change(9)).isEqualTo("IX");
    }

    @Test
    public void Fot9ShouldBeX() throws Exception {
        assertThat(ch.change(10)).isEqualTo("X");
    }

    @Test
    public void Fot11ShouldBeXI() throws Exception {
        assertThat(ch.change(11)).isEqualTo("XI");
    }

    @Test
    public void Fot14ShouldBeXIV() throws Exception {
        assertThat(ch.change(14)).isEqualTo("XIV");
    }
    @Test
    public void Fot15ShouldBeXV() throws Exception {
        assertThat(ch.change(15)).isEqualTo("XV");
    }

    @Test
    public void Fot28ShouldBeXXVIII() throws Exception {
        assertThat(ch.change(28)).isEqualTo("XXVIII");
    }

    @Test
    public void Fot39ShouldBeXXXIX() throws Exception {
        assertThat(ch.change(39)).isEqualTo("XXXIX");
    }

    @Test
    public void Fot40ShouldBeXL() throws Exception {
        assertThat(ch.change(40)).isEqualTo("XL");
    }

    @Test
    public void Fot41ShouldBeXLI() throws Exception {
        assertThat(ch.change(41)).isEqualTo("XLI");
    }

    @Test
    public void Fot49ShouldBeXLIX() throws Exception {
        assertThat(ch.change(49)).isEqualTo("XLIX");
    }

    @Test
    public void Fot50ShouldBeL() throws Exception {
        assertThat(ch.change(50)).isEqualTo("L");
    }

    @Test
    public void Fot79ShouldBeLXXIX() throws Exception {
        assertThat(ch.change(79)).isEqualTo("LXXIX");
    }

    @Test
    public void Fot90ShouldBeXC() throws Exception {
        assertThat(ch.change(90)).isEqualTo("XC");
    }

    @Test
    public void Fot94ShouldBeXCIV() throws Exception {
        assertThat(ch.change(94)).isEqualTo("XCIV");
    }

    @Test
    public void Fot194ShouldBeCXCIV() throws Exception {
        assertThat(ch.change(194)).isEqualTo("CXCIV");
    }

    @Test
    public void Fot376ShouldBeCCCLXXVI() throws Exception {
        assertThat(ch.change(376)).isEqualTo("CCCLXXVI");
    }

    @Test
    public void Fot3683ShouldBeMMMDCLXXXIII() throws Exception {
        assertThat(ch.change(3683)).isEqualTo("MMMDCLXXXIII");
    }

}
