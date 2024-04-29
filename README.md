# School-Building-Map

## About the Project
The School-Building-Map application utilizes Java to implement Dijkstra's algorithm for navigating a complex school layout. It models the school's infrastructure as a graph where halls and rooms are nodes, allowing users to input start and end locations to receive the shortest path for navigation.

## Features
- **Dynamic Pathfinding**: Implements Dijkstra's shortest path algorithm to navigate between any two points.
- **User Interaction**: Users can enter their current location and destination via the console to receive navigation directions.
- **Expandable Map Structure**: The node and hall structure can be modified to adapt to different school layouts or expansions.

## Getting Started

### Prerequisites
- Java SE Development Kit (JDK) 8 or newer.

### Setup and Execution

1. **Clone the repository**
   ```bash
   git clone https://github.com/kculbreth36/School-Building-Map.git
Compile the Java Program
Navigate to the project directory and compile the Java files.
bash
Copy code
cd School-Building-Map
javac DijkstraMain.java
Run the Application
Execute the compiled Java program.
bash
Copy code
java DijkstraMain
Usage

Follow the console prompts to input your starting point and destination within the school. The program will calculate and display the shortest path step by step.

Contributing

Feel free to fork the project and contribute by extending the map, optimizing the algorithm, or improving the user interface. Submit pull requests with your proposed changes.

License

Distributed under the MIT License. See LICENSE for more information.
