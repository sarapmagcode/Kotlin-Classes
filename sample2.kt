// import kotlin.properties.Delegates

open class Agent {
    var name: String = "" //by Delegates.notNull()
    var skill: String = "" //by Delegates.notNull()
    open val speed = 12
    
    init {
	    this.name = name // property initialization
    	println("...init...base...")
    }
    
    constructor(name: String) {
        this.name = name
    }
    
    constructor(name: String, skill: String) {
        this.skill = skill
        this.name = name
    }
    
    open fun tagLine() { // okay to be overriden
        println("Hello world!")
    }
}

class Sentinel: Agent {
    override var speed = 10
    
    init {
        println("===== init derived ====")
    }
    
    constructor(name: String): super(name) { }
    constructor(name: String, skill: String): super(name, skill) { }
    
    override fun tagLine() { // overriding superclass function
        println("Hello I am sentinel")
        println("...I used to say ")
        super.tagLine()
    }
}

fun main() {
    var kj = Sentinel("Killjoy")
    println(kj.name)
    kj.tagLine()
    println(kj.speed)
    
    var cypher = Sentinel("Cypher", "Camera")
    println(cypher.name)
    println(cypher.skill)
    
}