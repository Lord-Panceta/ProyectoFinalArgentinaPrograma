
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.example.comparar2.R
import org.junit.Test

@Test
fun testButtonClick() {
    // inyectar click)
    Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click())

    // ver salida
    Espresso.onView(ViewMatchers.withId(R.id.textView2))
        .check(ViewAssertions.matches(ViewMatchers.withText("Las cadenas son iguales.")))
}