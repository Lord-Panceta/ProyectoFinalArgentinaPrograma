import com.example.comparar2.MainActivity
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class ProbarJunit {
    @Mock
    private lateinit var mockMainActivity: MainActivity

    @Test
    fun testComparar_WhenStringsAreEqual() {
        // Se simula el retorno de valores identicos ($%$$/&786!!!)
        Mockito.`when`(mockMainActivity.form1EditText.text.toString()).thenReturn("Hello")
        Mockito.`when`(mockMainActivity.form2EditText.text.toString()).thenReturn("Hello")

        // Llamada al metodo comparar()
        mockMainActivity.comparar()

        // Assertar: textView2 se ve
        Mockito.verify(mockMainActivity.textView2).text = "Las cadenas son iguales."
    }

    @Test
    fun testComparar_WhenStringsAreDifferent() {
        // Probando si detecta diferencias
        Mockito.`when`(mockMainActivity.form1EditText.text.toString()).thenReturn("Hello")
        Mockito.`when`(mockMainActivity.form2EditText.text.toString()).thenReturn("World")

        // Llamada comparar()
        mockMainActivity.comparar()

        // Probar textView2
        Mockito.verify(mockMainActivity.textView2).text = "Las cadenas son distintas."
    }
    }
