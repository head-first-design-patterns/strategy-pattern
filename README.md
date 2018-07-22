## Strategy Pattern

This is an implementation of Strategy Pattern.

It should be used when clients want to implement different types of algorithms in an encapsulated way; and the flexibility to change algorithms at runtime.

When above use case is valid, define an `IS-A`, `HAS-A` and `IMPLEMENTS` relationship between the entities and strategy pattern will be followed!

### Key principles:

- Separate what remains same from what varies. Encapsulate whatever varies
- Design to interfaces, not implementations
- Favour composition over inheritance


### Understanding the code

- This is a simulation of ducks
- A duck `HAS-A` fly behavior, quack behavior.
- FlyWithWings, FlyNoWay, FlyRocketPowered all `Implement` the FlyBehavior
- An abstract definition of a Duck is defined.
- MallardDuck, RubberDuck `IS-A` Duck.
- MallardDuck and RubberDuck both are composed of behaviors. These behaviors are encapsulated and can be changed at runtime.

- WeatherData is the subject/publisher.
- All displays subscribe to/observer/listen for changes in state of weather.
- As soon as weather changes, WeatherData updates all its subscribers/listeners/observers that some state has changed.
- All observers on being updated of state change, `pull` the data they need from the publisher/subject

### Running the code

```
cd src/main/java
javac DuckSimulator.java
java DuckSimulator

```
