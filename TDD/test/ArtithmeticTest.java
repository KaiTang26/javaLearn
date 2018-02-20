import org.junit.*;

public class ArtithmeticTest {
    private static Artithmetic artithmetic;

    @BeforeClass
    public static void setup(){
        artithmetic = new Artithmetic();
        System.out.println("Setting up the test class");

    }


    @Before
    public void beforeTest(){

        System.out.println("before test");
    }

    @Test
    public void testAdd(){
        int result = artithmetic.add(15,5);
        Assert.assertEquals(20,result);
    }



    @After
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("after class");
    }

}