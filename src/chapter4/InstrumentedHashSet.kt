package chapter4

class InstrumentedHashSet<E>(initCap: Int, loadFactor: Float) : HashSet<E>(initCap, loadFactor) {

    var addCount = 0

    override fun add(element: E): Boolean {
        addCount += 1
        return super.add(element)
    }

    override fun addAll(elements: Collection<E>): Boolean {
        addCount += elements.size
        return super.addAll(elements)
    }
}