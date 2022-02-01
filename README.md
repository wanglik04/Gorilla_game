# Gorilla_game
Data structure of Gorilla game in Java

Description
In my point of view, The gorilla game that I've designed is a PC game, which means it's a
single-player game and the user can only fight with AI rather than other players.

Game.java
It is the main file of the whole game. First, the game has a database which saves all the players
archives, including the score, name,.etc.
If you start the game as a new player, system will generate a new player in database.
You can throw banana, and after you threw once, the AI will automatically throw. So repeatedly until
 one has zero health points.

User.java
This file helps to find the player's information from the database.

Maps.java
Before you start playing, the player must choose the map they want to play and the map will pass to
the generateMap method in Game.java to loading a map.

Building.java
It saves all the info of a building. The setter and getter method are made for generateMap() method
because it needs every building's value when loading the map.

Gorilla.java
After loaded the map. You can select your gorilla's born place, if you don't, the gorilla will born
in a default place. So there will be a Overload in constructor.

Banana.java
The Banana will generated once the game started, and the throw() and hit() method were override in
Game.java

Cheater.java
As a result to implement overriding, I wrote a cheater.java which can also start the
 game but in a 'different' way. In cheater mode, user will always make a hit. You can set whatever
 score you want.

About Overload and Override
The Overload are written in Gorilla.java. The Override are written in Cheater.java which inherited
banana.java
At first I may want using Overload and Override in Gorilla.java and it will inherit player.java but
It turns out that it may seems unnecessary to do that.


