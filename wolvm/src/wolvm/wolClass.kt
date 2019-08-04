package wolvm

open class wolClass (strtype: String, sec: SecurityModifer = SecurityModifer.PUBLIC) {
    open var type: ClassType = ClassType.DEFAULT
    open var security: SecurityModifer = sec
    open var methods: MutableMap<String, wolFunction> = mutableMapOf()
    open var fields: MutableMap<String, wolValue> = mutableMapOf()
    open val strtype: String = strtype
    open var constants: MutableMap<String, wolValue> = mutableMapOf()
}