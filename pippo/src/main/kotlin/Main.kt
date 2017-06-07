import ro.pippo.core.Pippo

fun main(args: Array<String>) {
    val pippo = Pippo()
    pippo.GET("/", { routeContext ->
        Thread.sleep(1000)
        routeContext.send("Hello World!")
    })
    pippo.start()
}
