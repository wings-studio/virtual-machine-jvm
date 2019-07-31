package wolvm

open class wolClass (strtype: String, sec: SecurityModifer = SecurityModifer.PUBLIC) {
    open var type: ClassType = ClassType.DEFAULT
    var security: SecurityModifer = sec
    var methods: MutableMap<String, wolFunction> = mutableMapOf()
    var fields: MutableMap<String, wolValue> = mutableMapOf()
    var strtype: String = strtype
}