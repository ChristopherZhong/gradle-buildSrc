import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.declaredMembers

internal class GradleTest {

    @Test
    fun `all dependencies`() {
        println("declaredmembers")
        Gradle::class.declaredMembers.forEach(::println)
        println("declaredMemberProperties")
        Gradle::class.declaredMemberProperties.forEach(::println)
        println("declaredMemberExtensionProperties")
        Gradle::class.declaredMemberExtensionProperties.forEach(::println)
        assertAll(
                        { Assertions.assertThat(`assertj-core`).isNotNull().isNotBlank()}
        )
        println(`assertj-core`)
        println(`aws-java-sdk-bom`)
    }
}