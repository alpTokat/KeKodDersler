import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class OverviewKtTest {

    @Test
    fun testCreateNameReturnString() {
        val result =createName()
        assertTrue(result is String,"Fonksiyon string türünde bir değer döndürmeli",)
    }
    @Test
    fun testCreateNameReturnNonEmptyString(){
        val result =createName()
        assertTrue(result.isNotEmpty(),"Fonksiyonun değeri boş olmamalıdır.")
    }
}