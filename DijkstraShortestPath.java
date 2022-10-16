import java.util.*;

public class DijkstraShortestPath {

    public void computeShortestPaths(Node sourceNode) {

// sets the distance for the source node to zero instead of infinity, as is standard
        sourceNode.setDistance(0);

// creates a priority queue and adds the source to it
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceNode);

// sets the source as visited already
        sourceNode.setVisited(true);

// while loop for when priority queue is not empty
        while ( !priorityQueue.isEmpty() ) {

// declares node as the topmost node in the priority queue without removing it
            Node actualNode = priorityQueue.poll();

// for loop for all adjacent nodes
            for (Hall hall : actualNode.getAdjacentList()) {

// declares a node as the destination
                Node n = hall.getDestinationNode();

// if statement for when the destination has not been visited
                if ( !n.isVisited()) {

// declares a new distance as the weight of the halls weight plus the nodes distance
                    int newDistance = actualNode.getDistance() + hall.getWeight();

// if statement for when the new distance is less that the destinations distance
                    if ( newDistance < n.getDistance() ) {

// removes n from the queue
                        priorityQueue.remove(n);

// sets the distance on the n node to the newly found distance
                        n.setDistance(newDistance);

// sets teh predecessor for node n as the node being looked at
                        n.setPredecessor(actualNode);

// adds n back to the priority queue
                        priorityQueue.add(n);
                    }
                }
            }

// sets the value of the node as to visited
            actualNode.setVisited(true);
        }
    }

// method to get the shortest path to a certain node from the start node
    public List<Node> getShortestPathTo(Node targetNode) {

// creates list of nodes named bath
        List<Node> path = new ArrayList<>();

// for loop that backwards searches from the target, adding nodes, until it gets to the start
        for (Node node = targetNode; node != null; node=node.getPredecessor()) {
            path.add(node);
        }

// reverses the list so that it is start to end
        Collections.reverse(path);
        return path;
    }
}