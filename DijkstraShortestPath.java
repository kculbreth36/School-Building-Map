import java.util.*;

public class DijkstraShortestPath {

    public void computeShortestPaths(Node sourceNode) {

// sets the distance for the source node to zero instead of infinity, as is standard
        sourceNode.setDistance(0);

// creates a priority queue of the node typing
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
// sets the node given in the method parameter as the node with the priority inside the queue, thereby giving order to it
        priorityQueue.add(sourceNode);

// sets the source as visited already, to not have repeats
        sourceNode.setVisited(true);

// while loop for when priority queue is not empty
        while ( !priorityQueue.isEmpty() ) {

// declares actualNode as the node with priority in the queue, then removes it
            Node actualNode = priorityQueue.poll();

// for loop to go by each hall attached to the actualNode as the starting point
            for (Hall hall : actualNode.getAdjacentList()) {

// declares n as the node that is the end point(DestinationNode) of the hall
                Node n = hall.getDestinationNode();

// if statement for when the destination has not been visited
                if ( !n.isVisited()) {

// declares a new distance as the weight of the hall plus the nodes distance
                    int newDistance = actualNode.getDistance() + hall.getWeight();

// if statement for when the new distance is less that the destinations distance
                    if ( newDistance < n.getDistance() ) {

// removes n from the queue
                        priorityQueue.remove(n);

// sets the distance on the n node to the newly found distance
                        n.setDistance(newDistance);

// sets the predecessor for node n as the node being looked at
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

// creates list of nodes named path
        List<Node> path = new ArrayList<>();

// for loop that backwards searches from the target, adding nodes, until it gets to the start
        for (Node node = targetNode; node != null; node = node.getPredecessor()) {
            path.add(node);
        }

// reverses the list so that it is start to end
        Collections.reverse(path);
        return path;
    }
}

/*

// NOTE ON PRIORITY QUEUE
    every node object is inside the heap after their declaration
    when creating the priority queue, you can have the object type specified
    added automatically from the heap
    you go in order based on the chosen priority
    you cannot edit objects inside the queue, thus you must remove them
//

computeShortestPath(Node startNode)
    SourceNode = startNode

    PriorityQueue<Node> pq = new PriorityQueue();
    pq.add(startNode)

    startNode.setVisited(true)

    while (pq is not empty)
        Node actualNode = pq.poll()

        for (all halls in the actualNode adjacentList)
            Node n = destination node of current hall

            if (if n has not been visited)
                int nd = actualNode's Distance + current hall's weight

                if (nd < n's distance)
                    remove n from queue

                    update n's distance as nd
                    set n's predecessor node as actualNode

                    add n back to queue

    set actualNode as visited

getShortestPath(Node targetNode)
    List<Node> path  = new ArrayList

    for (start at target node, then increment by going to predecessor node until predecessor node is null AKA the initial point)
        path.add(current node)

    reverse the path
    return the path

 */
