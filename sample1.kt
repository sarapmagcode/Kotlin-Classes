class Agent(name: String) {
    var name: String = name // property initialization
    var skill: String = ""
    
    constructor(name: String, skill: String): this(name) {
        this.name = name
        this.skill = skill
    }
}

fun main() {
    var a = Agent("Cypher", "Camera") // secondary constructor
    println(a.name)
    println(a.skill)
    
    var b = Agent("Killjoy") // primary constructor
    println(b.name)
    println(b.skill)
}