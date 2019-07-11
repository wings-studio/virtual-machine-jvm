class wolClass {
    var type: ClassType = ClassType.DEFAULT
    var security: SecurityModifer = SecurityModifer.PRIATE
    var methods: Map<String, wolFunction> = emptyMap()
    var fields: Map<String, wolValue> = emptyMap()
}