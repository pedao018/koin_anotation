import di.CoffeeAppModule
import org.koin.core.context.startKoin
import org.koin.ksp.generated.*

fun main(args: Array<String>) {
    println("Hello World!")
    startKoin {
        // load our module
        modules(CoffeeAppModule().module)
    }
    CoffeeApplication().run()
}