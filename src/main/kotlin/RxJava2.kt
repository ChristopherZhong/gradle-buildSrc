object RxJava2 {
    const val GROUP = "io.reactivex.rxjava2"
    const val VERSION = "2.2.4"

    internal object Dependencies {
        const val RXJAVA = "rxjava"
    }
}

const val rxjava = "${RxJava2.GROUP}:${RxJava2.Dependencies.RXJAVA}:${RxJava2.VERSION}"
