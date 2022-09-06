import component.CoffeeMaker
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CoffeeApplication : KoinComponent {
    private val maker: CoffeeMaker by inject()

    fun run(){
        maker.brew()
    }
}