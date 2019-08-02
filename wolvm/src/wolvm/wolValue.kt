package wolvm

class wolValue (type: wolClass) {
    var security: SecurityModifer = SecurityModifer.PRIVATE
    var type: wolClass = type
    var getter: wolFunction = wolFunction()
    var setter: wolFunction = wolFunction()
}