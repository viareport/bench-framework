import org.jooby.run

fun main(args:Array<String>) {
    run(*args) {
        get {
            Thread.sleep(1000)
            "Hello World!"
        }
    }
}