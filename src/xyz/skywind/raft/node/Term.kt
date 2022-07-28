package xyz.skywind.raft.node

data class Term(val num: Long) {

    init {
        if (num < 0)
            throw IllegalArgumentException("Illegal term: $num")
    }

    operator fun compareTo(term: Term): Int {
        return num.compareTo(term.num)
    }

    fun incr(): Term {
        return Term(num + 1)
    }

    fun decr(): Term {
        return Term(num - 1)
    }
}