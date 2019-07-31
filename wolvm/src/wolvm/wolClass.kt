package wolvm

open class wolClass (strtype: String) {
    open var type: ClassType = ClassType.DEFAULT
    var security: SecurityModifer = SecurityModifer.PRIATE
    var methods: MutableMap<String, wolFunction> = mutableMapOf()
    var fields: MutableMap<String, wolValue> = mutableMapOf()
    var strtype: String = strtype
}