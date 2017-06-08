import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.future.future
import kotlinx.coroutines.experimental.runBlocking
import org.jooby.AsyncMapper
import org.jooby.run
import java.util.concurrent.TimeUnit

fun main(args:Array<String>) {
    run(*args) {

        map(AsyncMapper())
        get("/coroutineDelay") {
            future(CommonPool) {
                delay(1, TimeUnit.SECONDS)
                "Hello World!"
            }
        }
        get("/threadSleep") {
            Thread.sleep(1000)
            "Hello World!"
        }
        get("/coroutineBlocking") {
            runBlocking(CommonPool) {
                delay(1, TimeUnit.SECONDS)
                "Hello World!"
            }
        }
    }
}