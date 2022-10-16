import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DijkstraMain {

    public static void main(String[] args) {

// creates all nodes that will be used in the map
        Node node1 = new Node("The Entrance");
        Node node2 = new Node("Hall A");
        Node node3 = new Node("Hall B");

        Node node4 = new Node("Hall BL");

        Node node5 = new Node("Hall BR");

        Node node6 = new Node("Hall C");

        Node node7 = new Node("Hall D");

        Node node8 = new Node("Room B8");
        Node node9 = new Node("Room B9");
        Node node10 = new Node("Room B10");
        Node node11 = new Node("Room B11");

        Node node12 = new Node("Room B12");
        Node node13 = new Node("Room B13");
        Node node14 = new Node("Room B14");
        Node node15 = new Node("Room B15");

        Node node16 = new Node("Room C16");
        Node node17 = new Node("Room C17");

        Node node18 = new Node("Room D18");
        Node node19 = new Node("Room d19");

// creates list of all nodes to use when taking an input
        List<Node> directory = Arrays.asList(node1, node2, node4, node4, node5, node6, node7, node8, node9, node10,
                node11, node12, node13, node14, node16, node16, node17, node18, node19);

// creates connections between the nodes so that you can go between them
        node1.addNeighbour(new Hall(5, node1, node2));
        node1.addNeighbour(new Hall(5, node2, node1));

        node2.addNeighbour(new Hall(5, node2, node3));
        node3.addNeighbour(new Hall(5, node3, node2));

        node3.addNeighbour(new Hall(10,node3, node4));
        node4.addNeighbour(new Hall(10, node4, node3));

        node3.addNeighbour(new Hall(10, node3, node5));
        node5.addNeighbour(new Hall(10, node5, node3));

        node3.addNeighbour(new Hall(3, node3, node8));
        node8.addNeighbour(new Hall(3, node8, node3));

        node3.addNeighbour(new Hall(4, node3, node11));
        node11.addNeighbour(new Hall(4, node11, node3));

        node3.addNeighbour(new Hall(2, node3, node12));
        node12.addNeighbour(new Hall(2, node12, node3));

        node3.addNeighbour(new Hall(3, node3, node14));
        node14.addNeighbour(new Hall(3, node14, node3));

        node4.addNeighbour(new Hall(5, node4, node9));
        node9.addNeighbour(new Hall(5, node9, node4));

        node4.addNeighbour(new Hall(6, node4, node10));
        node10.addNeighbour(new Hall(6, node10, node4));

        node5.addNeighbour(new Hall(3, node5, node13));
        node13.addNeighbour(new Hall(3, node13, node5));

        node5.addNeighbour(new Hall(4, node5, node15));
        node15.addNeighbour(new Hall(4, node15, node5));

        node4.addNeighbour(new Hall(8, node4, node6));
        node6.addNeighbour(new Hall(8, node6, node4));

        node6.addNeighbour(new Hall(1, node6, node16));
        node16.addNeighbour(new Hall(1, node16, node6));

        node6.addNeighbour(new Hall(1, node6, node17));
        node17.addNeighbour(new Hall(1, node17, node6));

        node5.addNeighbour(new Hall(8, node5, node7));
        node7.addNeighbour(new Hall(8, node7, node5));

        node7.addNeighbour(new Hall(1, node7, node18));
        node18.addNeighbour(new Hall(1, node18, node7));

        node7.addNeighbour(new Hall(1, node7, node19));
        node19.addNeighbour(new Hall(1, node19, node7));

// creates object of DijkstraShortestPath class
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();

// input for start and end
        Scanner scan = new Scanner(System.in);

        System.out.println("Where are you starting: ");
        String start = scan.nextLine();

        System.out.println("Where are you going: ");
        String end = scan.nextLine();

// for loop to find the start based on the input in the directory of all nodes
        Node startNode = null;
        OUTER: for (Node s: directory) {
            if (s.getName().equals(start)) {
                startNode = s;
                break OUTER;
            }
        }

// for loop to find the destination based on the input in the directory of all nodes
        Node endNode = null;
        OUTER: for (Node s: directory) {
            if (s.getName().equals(end)) {
                endNode = s;
                break OUTER;
            }
        }


// calls the function from the dijkstraShortestPath class to get the shortest distances to every node from the starting node
        shortestPath.computeShortestPaths(startNode);

// for loop to display the directions to get to the destination from the startpoint
        System.out.print("To get there,");
        for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {
            if (i == 0) {
                System.out.print(" go to ");
            } else {
                System.out.print(" then go to ");
            }
            System.out.print(shortestPath.getShortestPathTo(endNode).get(i));
        }

    }
}