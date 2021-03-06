// KT-7857: when exhaustiveness does not take previous nullability checks into account
enum class X { A, B }
fun foo(arg: X?): Int {
    if (arg == null) {
        return 0
    }
    return when (arg) {
        X.A -> 1
        X.B -> 2
        // else or null branch should not be required here!
    }
}