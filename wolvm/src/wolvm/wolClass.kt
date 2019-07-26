package wolvm

class wolClass {
    var type: ClassType = ClassType.DEFAULT
    var security: SecurityModifer = SecurityModifer.PRIATE
    var methods: MutableMap<String, wolFunction> = mutableMapOf()
    var fields: MutableMap<String, wolValue> = mutableMapOf()
}