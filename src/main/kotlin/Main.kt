fun main() {
    var car=Car("subaru","legacy","blue",55)
    car.carry(34)
    car.carry(66)
    car.identity()
    println(car.calculateParkingFees(10))

    var bus=Bus("prado", "unique", "black",33)
    bus.maxTripFare(78.5)
    bus.calculateParkingFees(12)




}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
open class Car(var make:String,var model:String, var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people-capacity
        if (people<=capacity) println("Carrying $people passangers")
        else{
            println("Over capacity by $x people")

    }
        }
    fun identity(){
        println("Iam $color $make $model")
    }
    open fun calculateParkingFees(hours: Int):Int{
        var parking = hours*20
        return parking
    }




}

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        println(fare*capacity)
        return (fare*capacity)
    }

    override fun calculateParkingFees(hours: Int): Int {
        println(hours*capacity)
        return (hours*capacity)
    }
}
